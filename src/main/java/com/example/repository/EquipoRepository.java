package com.example.repository;

import com.example.domain.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by DAM on 20/10/16.
 */
public interface EquipoRepository extends JpaRepository<Equipo , Long> {
    List<Equipo> findBylocalidadContaining (String localidad);
}
