package com.vegan.cosmetico.repository;

import com.vegan.cosmetico.model.Cosmetico;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    List<Cosmetico> cosmeticos = new ArrayList<>();

    public BancoDeDados(){
        cosmeticos.add(new Cosmetico(1, "Shampoo", 29.00, "https://img.freepik.com/vetores-premium/shampoo-natural-organic-skin-care-products-shampoo-natural-para-cabelos-cosmeticos-com-ervas-para-o-corpo-ilustracoes-modernas-de-desenhos-animados-vetoriais-isoladas-em-um-fundo-branco_501069-1963.jpg"));
        cosmeticos.add(new Cosmetico(2, "Condicionador", 24.00, "https://cdn-icons-png.flaticon.com/512/1234/1234274.png"));
        cosmeticos.add(new Cosmetico(3, "Sabonete Liquido", 19.00, "https://cdn-icons-png.flaticon.com/512/1900/1900946.png"));
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