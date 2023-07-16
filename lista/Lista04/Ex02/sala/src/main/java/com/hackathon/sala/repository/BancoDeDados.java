package com.hackathon.sala.repository;

import com.hackathon.sala.model.Sala;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    private ArrayList<Sala> salas = new ArrayList<>();

    public BancoDeDados(){
        salas.add(new Sala(1, true, "Abraão"));
        salas.add(new Sala(2, true, "Caim"));
        salas.add(new Sala(3, true, "Efésios"));
        salas.add(new Sala(4, true, "Gabriel"));
        salas.add(new Sala(5, true, "Isaias"));
        salas.add(new Sala(6, true, "Lucas"));
        salas.add(new Sala(7, true, "Noel"));
        salas.add(new Sala(8, true, "Paulo"));
    }

    public List<Sala> findAll(){
        return salas;
    }

    public boolean save(Sala sala) {
        return this.salas.add(sala);
    }

    public Sala atualizar(int id, Sala salaAlterada) {
        for (Sala sala : salas ) {
            if (id == sala.getId()) {
                sala.setNomeLocatario(salaAlterada.getNomeLocatario());
                return sala;
            }
        }
        return null;
    }
}
