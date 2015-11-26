package com.example.Controller;


import com.example.Exception.JugadorException;
import com.example.Model.Jugador;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController //SIRVE PARA SABER QUE ES UN CONTROLADOR
@RequestMapping("/jugadores")  //URL RELATIVA PARA ACCEDER AL CONTROLADOR
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;


    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador save(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Jugador> findAll() {
        List<Jugador> equipos = new ArrayList<Jugador>();
        Iterator<Jugador> iterator = jugadorRepository.findAll().iterator(); //Si peta es porque falta crearlo en jugadorRepository

        while (iterator.hasNext()) {
            equipos.add(iterator.next());
        }

        return equipos;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Jugador jugador = jugadorRepository.findOne(id);

        if (jugador == null) {
            throw new JugadorException(id);
        }

        jugadorRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Jugador updateById(@PathVariable Long id, @RequestBody Jugador jugador) {
        Jugador jg = jugadorRepository.findOne(id);

        if (jg == null) {
            throw new JugadorException(id);
        }

        return jugadorRepository.save(jugador);
    }


}
