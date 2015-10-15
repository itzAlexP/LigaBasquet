package com.example.Repository;

import com.example.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;


import java.util.Date;
import java.util.List;

public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {


    public List<Jugador>findByNombreLike(String nombre);
    public List<Jugador>findByCanastasTotalesGreaterThanEqual(int canastas);
    public List<Jugador>findByAsistenciasTotalesBetween(int asistenciaMin, int asistenciaMax);
    public List<Jugador>findByPosicionCampoIs(String posicionCampo);
    public List<Jugador>findByFechaNacimiento(Date fecha);
    public List<Jugador>findByCanastasTotalesGreaterThanEqualAndFechaNacimientoLessThan(int canasta, Date fecha);



}
