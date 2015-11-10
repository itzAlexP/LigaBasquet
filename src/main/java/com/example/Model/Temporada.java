package com.example.Model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private int anyo;

    @ManyToMany
    private Set<Equipo> equipos = new HashSet<>();

    @ManyToOne
    private Liga liga;

    public Temporada() {
    }

    public Temporada(int anyo) {

        this.anyo = anyo;

    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", anyo=" + anyo +
                ", equipos=" + equipos +
                '}';
    }
}
