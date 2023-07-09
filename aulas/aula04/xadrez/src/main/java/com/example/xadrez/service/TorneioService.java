package com.example.xadrez.service;

import com.example.xadrez.model.Torneio;
import com.example.xadrez.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TorneioService {

    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Torneio> getAll(){
        return bancoDeDados.findAll();
    }

    public Torneio getById(int id){
        List<Torneio> torneios = bancoDeDados.findAll();

        for(Torneio torneio : torneios){
            if(torneio.getId() == id){
                return torneio;
            }
        }

        return null;
    }

}
