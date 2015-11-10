package com.example.Repository;

import com.example.Model.Jugador;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {

    //Ejercicio 1
    public List<Jugador>findByNombreLike(String nombre);
    public List<Jugador>findByCanastasTotalesGreaterThanEqual(int canastas);
    public List<Jugador>findByAsistenciasTotalesBetween(int asistenciaMin, int asistenciaMax);
    public List<Jugador>findByPosicionCampoIs(String posicionCampo);
    public List<Jugador>findByFechaNacimiento(Date fecha);
    public List<Jugador>findByCanastasTotalesGreaterThanEqualAndFechaNacimientoLessThan(int canasta, Date fecha);

    //Ejercicio 2
    public List<Jugador> findByEquipoNombre(String equipoNombre);

    public List<Jugador> findByEquipoNombreAndPosicionCampo(String equipoNombre, String posicionCampo);

    public List<Jugador> findTopByOrderByCanastasTotalesDesc();

    public List<Jugador> findFirst5ByOrderByAsistenciasTotalesDesc();

    @Query("Select j from Jugador j where j.equipo.nombre = :equipoNombre ORDER BY j.canastasTotales DESC")
    List<Jugador> findByEquipoNombreAndTopCanastasTotales(@Param("equipoNombre") String equipoNombre, Pageable pageable);
}
