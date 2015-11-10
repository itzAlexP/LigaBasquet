package com.example.Service;

import com.example.Model.Equipo;
import com.example.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.GregorianCalendar;


@Service
@Transactional

public class EquipoService {
    @Autowired
    EquipoRepository equipoRepository;


    public void testEquipo() {

        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(1980, Calendar.JUNE, 1);
        Equipo equipo1 = new Equipo("Ocelote", "Antananarivo", calendar.getTime());
        equipoRepository.save(equipo1);

        calendar.set(1970, Calendar.JUNE, 3);
        Equipo equipo2 = new Equipo("Fnatic", "Bogota", calendar.getTime());
        equipoRepository.save(equipo2);

        //Ejercicio 2

        System.out.println("Los equipos de Antananarivo son: " + equipoRepository.findByLocalidadLike("Antananarivo"));


    }

}
