package com.example.Repository;

import com.example.Model.Equipo;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long> {

    public List<Equipo> findByNombreLike(String nombre);

    //Ejercicio 2

    public List<Equipo> findByLocalidadLike(String localidad);

}