package com.example.jogos.repository;

import com.example.jogos.model.Jogo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    private List<Jogo> jogos = new ArrayList<>();

    public BancoDeDados() {
        this.jogos.add(new Jogo(1,
                "Beyond good and evil",
                "bla bla bla bla bla",
                "https://store-images.s-microsoft.com/image/apps.32083.65312701678947267.b7220fde-dbc5-4a79-8911-453705a102c2.2083b5c6-8cdf-48bc-87d6-f5223bd79e3d?q=90&w=480&h=270",
                35.00,
                false));
        this.jogos.add(new Jogo(2,
                "Super smash bros ultimate",
                "bla bla bla bla bla",
                "https://http2.mlstatic.com/D_NQ_NP_735568-MLB69890498906_062023-O.webp",
                60.00,
                false));
        this.jogos.add(new Jogo(3,
                "Fire emblem",
                "bla bla bla bla bla",
                "https://fs-prod-cdn.nintendo-europe.com/media/images/11_square_images/games_18/nintendo_switch_5/1x1_NSwitch_FireEmblemEngage_EU_image500w.jpg",
                60.00,
                false));
    }

    public List<Jogo> findAll() {
        return jogos;
    }

    public Jogo save(Jogo jogo){
        for(Jogo jogoNaLista : jogos) {
            if(jogo.getId() == jogoNaLista.getId()) {
                return null;
            }
        }
        jogos.add(jogo);
        return jogo;
    }
}
