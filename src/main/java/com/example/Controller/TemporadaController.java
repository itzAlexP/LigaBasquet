package com.example.Controller;


import com.example.Exception.TemporadaException;
import com.example.Model.Temporada;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by poo2 on 29/06/2015.
 */
@RestController //SIRVE PARA SABER QUE ES UN CONTROLADOR
@RequestMapping("/temporadas")  //URL RELATIVA PARA ACCEDER AL CONTROLADOR
public class TemporadaController {

    @Autowired
    private TemporadaRepository temporadaRepository;


    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Temporada save(@RequestBody Temporada temporada) {
        return temporadaRepository.save(temporada);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Temporada> findAll() {
        List<Temporada> temporadas = new ArrayList<Temporada>();
        Iterator<Temporada> iterator = temporadaRepository.findAll().iterator(); //Si peta es porque falta crearlo en temporadaRepository

        while (iterator.hasNext()) {
            temporadas.add(iterator.next());
        }

        return temporadas;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Temporada temporada = temporadaRepository.findOne(id);

        if (temporada == null) {
            throw new TemporadaException(id);
        }

        temporadaRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Temporada updateById(@PathVariable Long id, @RequestBody Temporada temporada) {
        Temporada tm = temporadaRepository.findOne(id);

        if (tm == null) {
            throw new TemporadaException(id);
        }

        return temporadaRepository.save(temporada);
    }
}