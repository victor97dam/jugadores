package com.example.repository;

import com.example.domain.Jugador;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by DAM on 20/10/16.
 */
public interface JugadorRepository extends JpaRepository<Jugador , Long> {

    List<Jugador> findBynombreContaining(String nombre);

    List<Jugador> findBycanastastotalesGreaterThanEqual(int canastatotales);

    List<Jugador> findByasistenciastotalesBetween(int min, int max);

    List<Jugador> findByposicionIs(String posicion);

    List<Jugador> findByfechanacimientoBefore(LocalDate fechanacimiento);

    List<Jugador> findByEquipoNombreequipo(String nombreequipo);


    @Query("select jugador.posicion , avg(jugador.canastastotales), avg(jugador.asistenciastotales), avg(jugador.rebotestotales) from Jugador jugador group by jugador.posicion")
    List<Object[]> mediaEstadisticasJugadoresPorPosicion();

    @Query("select jugador.posicion , avg(jugador.canastastotales), min(jugador.canastastotales), max(jugador.canastastotales), avg(jugador.asistenciastotales), min(jugador.asistenciastotales), max(jugador.asistenciastotales),  avg(jugador.rebotestotales), min(jugador.rebotestotales), max(jugador.rebotestotales) from Jugador jugador group by jugador.posicion")
    List<Object[]> mediaMinMaxEstadisticasJugadoresPorPosicion();


    @Query("select jugador from Jugador jugador where jugador.equipo.nombreequipo is :nombreequipo and jugador.posicion is :posicion")
    List<Jugador> jugadoresMismaPosicionMismoEquipo(@Param("nombreequipo") String nombreequipo, @Param("posicion") String posicion);

    /* @Query("select jugador from Jugador jugador where jugador.equipo.nombreequipo is :nombreequipo and jugador.canastastotales = (select max(jugador.canastastotales) from Jugador jugador where jugador.equipo.nombreequipo is :nombreequipo)")
     List<Jugador> MVPdelEquipo(@Param("nombreequipo") String nombreequipo);*/

    @Query("SELECT  jugador " +"FROM Jugador jugador "
            +"WHERE jugador.equipo.nombreequipo=:nombreequipo "
            +"ORDER BY jugador.canastastotales DESC")
    List<Jugador> MVPdelEquipo(@Param("nombreequipo") String nombreequipo, Pageable pageable);

}
