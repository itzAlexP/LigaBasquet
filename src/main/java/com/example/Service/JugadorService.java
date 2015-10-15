package com.example.Service;

import com.example.Model.Jugador;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.GregorianCalendar;


@Service
@Transactional

public class JugadorService {

    @Autowired
    JugadorRepository jugadorRepository;


    public void testJugador(){
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(1999, Calendar.JANUARY ,1);
        Jugador jugador1 = new Jugador("Eric", calendar.getTime(), 1, 2, 0, "Banquillo derecho");
        jugadorRepository.save(jugador1);
        calendar.set(1994, Calendar.JUNE, 3);
        Jugador jugador2 = new Jugador("Àlex", calendar.getTime(), 90, 60, 120, "Base");
        jugadorRepository.save(jugador2);
        calendar.set(1993, Calendar.OCTOBER, 4);
        Jugador jugador3 = new Jugador("Reta", calendar.getTime(), 56, 23, 40, "Banquillo Izquierdo");
        jugadorRepository.save(jugador3);
        calendar.set(1996, Calendar.FEBRUARY, 10);
        Jugador jugador4 = new Jugador("Jaime", calendar.getTime(), 5, 30, 20, "Lolero");
        jugadorRepository.save(jugador4);
        calendar.set(1993, Calendar.APRIL, 7);
        Jugador jugador5 = new Jugador("Roc", calendar.getTime(), 20, 6, 25, "Computer Manager");
        jugadorRepository.save(jugador5);



        System.out.println(jugadorRepository.findByNombreLike("Eric"));
        System.out.println(jugadorRepository.findByPosicionCampoIs("Base"));
        calendar.set(1996, Calendar.OCTOBER, 4);
        System.out.println(jugadorRepository.findByFechaNacimiento(calendar.getTime()));
        System.out.println(jugadorRepository.findByAsistenciasTotalesBetween(0, 50));
        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqualAndFechaNacimientoLessThan(30, calendar.getTime()));


    }
}
