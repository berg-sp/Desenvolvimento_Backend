package com.example.xadrez.repository;

import com.example.xadrez.model.Torneio;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    List<Torneio> torneios = new ArrayList<>();

    public BancoDeDados(){
        torneios.add(new Torneio(1, "Title tuesday", "Chess.com", new BigDecimal(1000)));
        torneios.add(new Torneio(2, "Tata Steal", "Holanda", new BigDecimal(1000)));
        torneios.add(new Torneio(3, "Copa do mundo", "Africa do Sul", new BigDecimal(1000)));
    }

    public List<Torneio> findAll() {
        return torneios;
    }

    public boolean save(Torneio torneio){
        return this.torneios.add(torneio);
    }

}
