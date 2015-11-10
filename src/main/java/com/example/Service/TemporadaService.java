package com.example.Service;


import com.example.Model.Temporada;
import com.example.Repository.EquipoRepository;
import com.example.Repository.LigaRepository;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TemporadaService {


    @Autowired
    TemporadaRepository temporadaRepository;

    @Autowired
    EquipoRepository equipoRepository;

    @Autowired
    LigaRepository ligaRepository;

    public void testTemporada() {


        Temporada temporada1 = new Temporada(2050);
        temporada1.setLiga(ligaRepository.findByNombre("NBA"));
        // temporada1.getEquipos().add(equipoRepository.findOne(1L));
        temporada1.getEquipos().add(equipoRepository.findOne(1L));
        temporada1.getEquipos().add(equipoRepository.findOne(2L));
        temporadaRepository.save(temporada1);

        Temporada temporada2 = new Temporada(2049);
        temporada2.setLiga(ligaRepository.findByNombre("NBA"));
        temporada2.getEquipos().add(equipoRepository.findOne(1L));
        temporada2.getEquipos().add(equipoRepository.findOne(2L));
        temporadaRepository.save(temporada2);


    }

}
