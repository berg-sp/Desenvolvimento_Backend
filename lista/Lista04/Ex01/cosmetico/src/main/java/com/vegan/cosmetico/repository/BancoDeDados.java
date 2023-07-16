package com.vegan.cosmetico.repository;

import com.vegan.cosmetico.model.Cosmetico;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    List<Cosmetico> cosmeticos = new ArrayList<>();

    public BancoDeDados(){
        cosmeticos.add(new Cosmetico(1, "Shampoo", 29.00));
        cosmeticos.add(new Cosmetico(2, "Condicionador", 24.00));
        cosmeticos.add(new Cosmetico(3, "Sabonete Liquido", 19.00));
    }

    public List<Cosmetico> findAll(){
        return cosmeticos;
    }

    public boolean save(Cosmetico cosmetico) {
        return this.cosmeticos.add(cosmetico);
    }

    public String delete(int id) {
        for(Cosmetico cosmetico : cosmeticos) {
            if(cosmetico.getId() == id) {
                String mensagem = "O cosmetico " + cosmetico.getNome() + " foi removido com sucesso!";
                cosmeticos.remove(cosmetico);
                return mensagem;
            }
        }
        return "Esse cosmético não existe...";
    }

}