package com.example.Service;

import com.example.Model.Liga;
import com.example.Repository.LigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class LigaService {

    @Autowired
    LigaRepository ligaRepository;

    public void testLiga() {


        Liga liga1 = new Liga("NBA");
        ligaRepository.save(liga1);


    }

}
