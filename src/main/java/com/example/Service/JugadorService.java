package com.example.Service;

import com.example.Model.Equipo;
import com.example.Model.Jugador;
import com.example.Repository.EquipoRepository;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.GregorianCalendar;


@Service
@Transactional

public class JugadorService {

    @Autowired
    JugadorRepository jugadorRepository;
    @Autowired
    EquipoRepository equipoRepository;

    public void testJugador(){
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(1999, Calendar.JANUARY ,1);

        Equipo equipo;
        equipo = equipoRepository.findByNombreLike("Ocelote").get(0);
        Jugador jugador1 = new Jugador("Ocelote1", calendar.getTime(), 1, 2, 0, "Banquillo derecho", equipo);
        jugadorRepository.save(jugador1);

        calendar.set(1994, Calendar.JUNE, 3);
        Jugador jugador2 = new Jugador("Ocelote2", calendar.getTime(), 90, 60, 120, "Base", equipo);
        jugadorRepository.save(jugador2);

        calendar.set(1993, Calendar.OCTOBER, 4);
        Jugador jugador3 = new Jugador("Ocelote3", calendar.getTime(), 56, 23, 40, "Banquillo Izquierdo", equipo);
        jugadorRepository.save(jugador3);

        calendar.set(1996, Calendar.FEBRUARY, 10);
        Jugador jugador4 = new Jugador("Ocelote4", calendar.getTime(), 5, 30, 20, "Lolero", equipo);
        jugadorRepository.save(jugador4);

        calendar.set(1993, Calendar.APRIL, 7);
        Jugador jugador5 = new Jugador("Ocelote5", calendar.getTime(), 20, 6, 25, "Computer Manager", equipo);
        jugadorRepository.save(jugador5);

        calendar.set(1993, Calendar.APRIL, 7);
        Jugador jugador6 = new Jugador("Ocelote6", calendar.getTime(), 21, 7, 26, "Computer Manager", equipo);
        jugadorRepository.save(jugador6);

        calendar.set(1993, Calendar.APRIL, 7);
        Jugador jugador7 = new Jugador("Ocelote7", calendar.getTime(), 22, 8, 27, "Computer Manager", equipo);
        jugadorRepository.save(jugador7);

        calendar.set(1993, Calendar.APRIL, 7);
        Jugador jugador8 = new Jugador("Ocelote8", calendar.getTime(), 23, 9, 28, "Computer Manager", equipo);
        jugadorRepository.save(jugador8);

        calendar.set(1993, Calendar.APRIL, 7);
        Jugador jugador9 = new Jugador("Ocelote9", calendar.getTime(), 24, 10, 29, "Computer Manager", equipo);
        jugadorRepository.save(jugador9);

        calendar.set(1993, Calendar.APRIL, 7);
        Jugador jugador10 = new Jugador("Ocelote10", calendar.getTime(), 25, 11, 30, "Computer Manager", equipo);
        jugadorRepository.save(jugador10);


        equipo = equipoRepository.findByNombreLike("Fnatic").get(0);
        Jugador jugador11 = new Jugador("Fnatic1", calendar.getTime(), 1, 2, 0, "Banquillo derecho", equipo);
        jugadorRepository.save(jugador11);

        calendar.set(1994, Calendar.JUNE, 3);
        Jugador jugador12 = new Jugador("Fnatic2", calendar.getTime(), 90, 60, 120, "Base", equipo);
        jugadorRepository.save(jugador12);

        calendar.set(1993, Calendar.OCTOBER, 4);
        Jugador jugador13 = new Jugador("Fnatic3", calendar.getTime(), 56, 23, 40, "Banquillo Izquierdo", equipo);
        jugadorRepository.save(jugador13);

        calendar.set(1996, Calendar.FEBRUARY, 10);
        Jugador jugador14 = new Jugador("Fnatic4", calendar.getTime(), 5, 30, 20, "Lolero", equipo);
        jugadorRepository.save(jugador14);

        calendar.set(1993, Calendar.APRIL, 7);
        Jugador jugador15 = new Jugador("Fnatic5", calendar.getTime(), 20, 6, 25, "Computer Manager", equipo);
        jugadorRepository.save(jugador15);

        calendar.set(1993, Calendar.APRIL, 7);
        Jugador jugador16 = new Jugador("Fnatic6", calendar.getTime(), 21, 7, 26, "Computer Manager", equipo);
        jugadorRepository.save(jugador16);

        calendar.set(1993, Calendar.APRIL, 7);
        Jugador jugador17 = new Jugador("Fnatic7", calendar.getTime(), 22, 8, 27, "Computer Manager", equipo);
        jugadorRepository.save(jugador17);

        calendar.set(1993, Calendar.APRIL, 7);
        Jugador jugador18 = new Jugador("Fnatic8", calendar.getTime(), 23, 9, 28, "Computer Manager", equipo);
        jugadorRepository.save(jugador18);

        calendar.set(1993, Calendar.APRIL, 7);
        Jugador jugador19 = new Jugador("Fnatic9", calendar.getTime(), 24, 10, 29, "Computer Manager", equipo);
        jugadorRepository.save(jugador19);

        calendar.set(1993, Calendar.APRIL, 7);
        Jugador jugador20 = new Jugador("Fnatic10", calendar.getTime(), 25, 11, 30, "Computer Manager", equipo);
        jugadorRepository.save(jugador20);


//Ejercicio 1
        /*System.out.println(jugadorRepository.findByNombreLike("Eric"));
        System.out.println(jugadorRepository.findByPosicionCampoIs("Base"));
        calendar.set(1996, Calendar.OCTOBER, 4);
        System.out.println(jugadorRepository.findByFechaNacimiento(calendar.getTime()));
        System.out.println(jugadorRepository.findByAsistenciasTotalesBetween(0, 50));
        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqualAndFechaNacimientoLessThan(30, calendar.getTime()));
*/

        //Ejercicio 2

        System.out.println("Los jugadores del equipo Fnatic son: " + jugadorRepository.findByEquipoNombre("Fnatic"));
        System.out.println("Los jugadores Banquillo Izquierdo de Fnatic son: " + jugadorRepository.findByEquipoNombreAndPosicionCampo("Fnatic", "Banquillo Izquierdo"));
        System.out.println("El jugador con mas canastes es: " + jugadorRepository.findTopByOrderByCanastasTotalesDesc());
        System.out.println("Los 5 jugadores con mas asistencias son: " + jugadorRepository.findFirst5ByOrderByAsistenciasTotalesDesc());
        System.out.println("El jugador que mas canastas ha realizado de Fnatic es: " + jugadorRepository.findByEquipoNombreAndTopCanastasTotales("Fnatic", new PageRequest(0, 1)));
    }
}
