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
        cosmeticos.add(new Cosmetico(2, "Condicionador", 24.00, "https://media.istockphoto.com/id/1173084169/pt/vetorial/hand-drawn-texture-shampoo-conditioner-design.jpg?s=1024x1024&w=is&k=20&c=sPuFZ1Xg3YLFHgcAq6P6QBo8lNXCEAGoxY9v4SZv_cY="));
        cosmeticos.add(new Cosmetico(3, "Sabonete Liquido", 19.00, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2PVpJEIIlN2nDUtUnh7GfZnPPX8-4Ab-QRQ&usqp=CAU"));
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