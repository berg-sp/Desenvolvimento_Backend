package com.hackathon.sala.service;

import com.hackathon.sala.model.Sala;
import com.hackathon.sala.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalaService {

    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Sala> getAll() {
        return bancoDeDados.findAll();
    }

    public Sala getById(int id) {
        List<Sala> salas = bancoDeDados.findAll();

        for(Sala sala : salas) {
            if(sala.getId() == id) {
                return sala;
            }
        }
        return null;
    }

    public boolean save(Sala sala) {
        return bancoDeDados.save(sala);
    }

    public Sala atualizar(int id, Sala salaAlterada) {
        Sala sala = bancoDeDados.atualizar(id, salaAlterada);
        return sala;
    }
}
