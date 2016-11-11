package com.example.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

/**
 * Created by DAM on 20/10/16.
 */
@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombreequipo;
    private String localidad;
    private LocalDate fechacreacion;

    public Equipo() {
    }

    public Equipo(String nombreequipo, String localidad, LocalDate fechacreacion) {
        this.nombreequipo = nombreequipo;
        this.localidad = localidad;
        this.fechacreacion = LocalDate.of(1992,10,21);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreequipo() {
        return nombreequipo;
    }

    public void setNombreequipo(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(LocalDate fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombreequipo='" + nombreequipo + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fechacreacion=" + fechacreacion +
                '}'+System.lineSeparator();
    }
}
