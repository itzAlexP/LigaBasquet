package com.example;

import com.example.Service.EquipoService;
import com.example.Service.JugadorService;
import com.example.Service.LigaService;
import com.example.Service.TemporadaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaBasquetApplication {

    private static JugadorService jugadorService;
    private static EquipoService equipoService;
    private static LigaService ligaService;
    private static TemporadaService temporadaService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LigaBasquetApplication.class, args);

        equipoService = context.getBean(EquipoService.class);
        equipoService.testEquipo();

        jugadorService = context.getBean(JugadorService.class);
        jugadorService.testJugador();

        ligaService = context.getBean(LigaService.class);
        ligaService.testLiga();

        temporadaService = context.getBean(TemporadaService.class);
        temporadaService.testTemporada();





    }
}

