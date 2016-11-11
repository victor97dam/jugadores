package com.example.domain;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.*;


/**
 * Created by DAM on 20/10/16.
 */
@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String nombre;
    private LocalDate fechanacimiento;
    private int canastastotales;
    private int asistenciastotales;
    private int rebotestotales;
    private String posicion;

    @ManyToOne
    private Equipo equipo;

    public Jugador() {
    }

    public Jugador(String nombre, LocalDate fechanacimiento, int canastastotales, int asistenciastotales, int rebotestotales, String posicion) {
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.canastastotales = canastastotales;
        this.asistenciastotales = asistenciastotales;
        this.rebotestotales = rebotestotales;
        this.posicion = posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getCanastastotales() {
        return canastastotales;
    }

    public void setCanastastotales(int canastastotales) {
        this.canastastotales = canastastotales;
    }

    public int getAsistenciastotales() {
        return asistenciastotales;
    }

    public void setAsistenciastotales(int asistenciastotales) {
        this.asistenciastotales = asistenciastotales;
    }

    public int getRebotestotales() {
        return rebotestotales;
    }

    public void setRebotestotales(int rebotestotales) {
        this.rebotestotales = rebotestotales;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechanacimiento=" + fechanacimiento +
                ", canastastotales=" + canastastotales +
                ", asistenciastotales=" + asistenciastotales +
                ", rebotestotales=" + rebotestotales +
                ", posicion='" + posicion + '\'' +
                '}'+System.lineSeparator();
    }
}
