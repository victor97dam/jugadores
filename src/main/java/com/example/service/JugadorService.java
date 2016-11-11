package com.example.service;

import com.example.domain.Equipo;
import com.example.domain.Jugador;
import com.example.repository.EquipoRepository;
import com.example.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by DAM on 20/10/16.
 */
@Service
public class JugadorService {


    @Autowired
    private EquipoRepository equipoRepository;


    @Autowired
    private JugadorRepository jugadorRepository;

    public void crearCosas() {

        Equipo e1 = new Equipo("Rox Tigers", "Barcelona", LocalDate.of(1800,5,5));
        Equipo e2 = new Equipo("SKT Telecom", "Murcia", LocalDate.of(1703,10,9));
        Equipo e3 = new Equipo("Giants", "Paris", LocalDate.of(1939,2,1));
        Equipo e4 = new Equipo("Shambala", "California", LocalDate.of(1958,12,12));
        Equipo e5 = new Equipo("Fanatic", "New York", LocalDate.of(1212,12,12));


        Jugador j1 = new Jugador("Roberto", LocalDate.of(1991, 1, 1), 30, 30, 10, "pivot");
        Jugador j2 = new Jugador("Marc", LocalDate.of(1992, 2, 2), 20, 20, 15, "pivot");
        Jugador j3 = new Jugador("Sergi", LocalDate.of(1993, 3, 3), 32, 67, 5, "pivot");
        Jugador j4 = new Jugador("Paul", LocalDate.of(1994, 4, 4), 10, 27, 23, "pivot");
        Jugador j5 = new Jugador("Gasol", LocalDate.of(1995, 5, 5), 67, 5, 57, "pivot");

        Jugador j6 = new Jugador("Álvaro", LocalDate.of(1990, 1, 1), 76, 65, 99, "base");
        Jugador j7 = new Jugador("Marcos", LocalDate.of(1987, 2, 2), 29, 20, 46, "base");
        Jugador j8 = new Jugador("Sergio", LocalDate.of(1999, 3, 3), 32, 67, 62, "base");
        Jugador j9 = new Jugador("Pol", LocalDate.of(1994, 4, 4), 10, 27, 13, "base");
        Jugador j10 = new Jugador("Víctor", LocalDate.of(1995, 5, 5), 12, 59, 57, "base");

        Jugador j11 = new Jugador("Sara", LocalDate.of(1990, 1, 1), 90, 80, 80, "escolta");
        Jugador j12 = new Jugador("Sheila", LocalDate.of(1998, 2, 2), 34, 20, 15, "escolta");
        Jugador j13 = new Jugador("Xavi", LocalDate.of(1989, 3, 3), 76, 67, 59, "escolta");
        Jugador j14 = new Jugador("Alfredo", LocalDate.of(1986, 4, 4), 98, 99, 80, "escolta");
        Jugador j15 = new Jugador("Miquel", LocalDate.of(1993, 5, 5), 6, 5, 5, "escolta");

        Jugador j16 = new Jugador("Paula", LocalDate.of(1990, 1, 1), 43, 64, 12, "alero");
        Jugador j17 = new Jugador("Laura", LocalDate.of(1998, 2, 2), 76, 43, 22, "alero");
        Jugador j18 = new Jugador("Lidia", LocalDate.of(1989, 3, 3), 33, 44, 88, "alero");
        Jugador j19 = new Jugador("Ana", LocalDate.of(1986, 4, 4), 34, 55, 2, "alero");
        Jugador j20 = new Jugador("Amor", LocalDate.of(1993, 5, 5), 60, 95, 55, "alero");

        Jugador j21 = new Jugador("Peña", LocalDate.of(1990, 1, 1), 12, 3, 4, "ala pivot");
        Jugador j22 = new Jugador("Pedro", LocalDate.of(1998, 2, 2), 56, 77, 43, "ala pivot");
        Jugador j23 = new Jugador("Ángel", LocalDate.of(1989, 3, 3), 82, 30, 93, "ala pivot");
        Jugador j24 = new Jugador("Mar", LocalDate.of(1986, 4, 4), 43, 68, 31, "ala pivot");
        Jugador j25 = new Jugador("Camil", LocalDate.of(1993, 5, 5), 23, 43, 76, "ala pivot");


        j1.setEquipo(e1);
        j6.setEquipo(e1);
        j11.setEquipo(e1);
        j16.setEquipo(e1);
        j21.setEquipo(e1);


        j2.setEquipo(e2);
        j7.setEquipo(e2);
        j12.setEquipo(e2);
        j17.setEquipo(e2);
        j22.setEquipo(e2);


        j3.setEquipo(e3);
        j8.setEquipo(e3);
        j13.setEquipo(e3);
        j18.setEquipo(e3);
        j23.setEquipo(e3);


        j4.setEquipo(e4);
        j9.setEquipo(e4);
        j14.setEquipo(e4);
        j19.setEquipo(e4);
        j24.setEquipo(e4);


        j5.setEquipo(e5);
        j10.setEquipo(e5);
        j15.setEquipo(e5);
        j20.setEquipo(e5);
        j25.setEquipo(e5);

        equipoRepository.save(e1);
        equipoRepository.save(e2);
        equipoRepository.save(e3);
        equipoRepository.save(e4);
        equipoRepository.save(e5);

        jugadorRepository.save(j1);
        jugadorRepository.save(j2);
        jugadorRepository.save(j3);
        jugadorRepository.save(j4);
        jugadorRepository.save(j5);
        jugadorRepository.save(j6);
        jugadorRepository.save(j7);
        jugadorRepository.save(j8);
        jugadorRepository.save(j9);
        jugadorRepository.save(j10);
        jugadorRepository.save(j11);
        jugadorRepository.save(j12);
        jugadorRepository.save(j13);
        jugadorRepository.save(j14);
        jugadorRepository.save(j15);
        jugadorRepository.save(j15);
        jugadorRepository.save(j16);
        jugadorRepository.save(j17);
        jugadorRepository.save(j18);
        jugadorRepository.save(j19);
        jugadorRepository.save(j20);
        jugadorRepository.save(j21);
        jugadorRepository.save(j22);
        jugadorRepository.save(j23);
        jugadorRepository.save(j24);
        jugadorRepository.save(j25);



        System.out.println("Buscar jugadores que contengan 'ul'");
        System.out.println(jugadorRepository.findBynombreContaining("ul"));

        System.out.println("Buscar jugadores que tengan un mínimo de 20 canastas");
        System.out.println(jugadorRepository.findBycanastastotalesGreaterThanEqual(20));

        System.out.println("Buscar jugadores que tengan un mínimo de 20 asistencias y un máximo de 50");
        System.out.println(jugadorRepository.findByasistenciastotalesBetween(20,50));

        System.out.println("Buscar jugadores que tengan la posicion pivot");
        System.out.println(jugadorRepository.findByposicionIs("pivot"));

        System.out.println("Buscar jugadores que hayan nacido antes del 1994/1/1");
        System.out.println(jugadorRepository.findByfechanacimientoBefore(LocalDate.of(1994,1,1)));

        System.out.println("Agrupar jugadores por posición y mostrar la media de sus estadísticas");
        MostrarEstadisticas(jugadorRepository.mediaEstadisticasJugadoresPorPosicion());

        System.out.println("Agrupar jugadores por posición y mostrar la media, el mínimo y el máximo de sus estadísticas");
        MostrarEstadisticasMinMax(jugadorRepository.mediaMinMaxEstadisticasJugadoresPorPosicion());

        System.out.println("Buscar equipos por localidad: Barcelona");
        System.out.println(equipoRepository.findBylocalidadContaining("barcelona"));

        System.out.println("Mostrar jugadores de un equipo: Giants");
        System.out.println(jugadorRepository.findByEquipoNombreequipo("Giants"));

        System.out.println("Jugadores de un mismo equipo (SKT Telekom) y de una misma posición (pivot)");
        System.out.println(jugadorRepository.jugadoresMismaPosicionMismoEquipo("SKT Telecom", "pivot"));

       System.out.println("Jugador con más canastas de un equipo (SKT Telecom)"+jugadorRepository.MVPdelEquipo("SKT Telecom", new PageRequest(0, 1)));


    }
    private void MostrarEstadisticas(List<Object[]> estadisticasList){
        for (Object[] estadisticas : estadisticasList){
            System.out.println("Posición: "+ estadisticas[0]);
            System.out.println("Media canastas: "+ estadisticas[1]);
            System.out.println("Media asistencias: "+ estadisticas[2]);
            System.out.println("Media rebotes: "+ estadisticas[3]);
            System.out.println();
        }
    }

    private void MostrarEstadisticasMinMax(List<Object[]> estadisticaList){
        for (Object[] estadistica : estadisticaList){
            System.out.println("Posición: "+ estadistica[0]);
            System.out.println("Media canastas: "+ estadistica[1]);
            System.out.println("Min canastas: "+ estadistica[2]);
            System.out.println("Max canastas: "+ estadistica[3]);
            System.out.println("Media asistencias: "+ estadistica[4]);
            System.out.println("Min asistencias: "+ estadistica[5]);
            System.out.println("Max asistencias: "+ estadistica[6]);
            System.out.println("Media rebotes: "+ estadistica[7]);
            System.out.println("Min rebotes: "+ estadistica[8]);
            System.out.println("Max rebotes: "+ estadistica[9]);
            System.out.println();
        }
    }

}
