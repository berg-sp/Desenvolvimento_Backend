package br.com.campeonato.repository;

import br.com.campeonato.model.Campeonato;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    List<Campeonato> campeonatos = new ArrayList<>();

    public BancoDeDados(){
        campeonatos.add(new Campeonato(1, "Smash Cup", "Copa oficial Smash Bros", 1000.00));
        campeonatos.add(new Campeonato(2, "Smash Champions", "Campeonato classificatório para a Copa Smash", 1000.00));
        campeonatos.add(new Campeonato(3, "NDR Batte Week", "Maior campeonato de Guainazes", 100.0));
    }

    public List<Campeonato> findAll() {
        return campeonatos;
    }
}
