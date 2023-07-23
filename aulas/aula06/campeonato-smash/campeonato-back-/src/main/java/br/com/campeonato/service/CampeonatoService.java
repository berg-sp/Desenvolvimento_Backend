package br.com.campeonato.service;

import br.com.campeonato.model.Campeonato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.campeonato.repository.BancoDeDados;

import java.util.List;

@Service

public class CampeonatoService {

    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Campeonato> getAll() {
        return bancoDeDados.findAll();
    }
}
