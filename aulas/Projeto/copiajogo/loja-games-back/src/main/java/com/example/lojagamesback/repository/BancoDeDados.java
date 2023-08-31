package com.example.lojagamesback.repository;

import com.example.lojagamesback.model.Jogo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    private List<Jogo> jogos = new ArrayList<>();

    public BancoDeDados() {
        jogos.add(new Jogo(1, "Fire emblem Rekka no ken", "RPG Tático", "https://bdjogos.com.br/capas/3932-Fire-Emblem-Game-Boy%20Advance-capa-1.jpg",
                60.00, false));

        jogos.add(new Jogo(2, "Fire emblem Sealed swords", "RPG Tático",
                "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/06d00e39-6967-4b99-8ef6-01659928cbb6/dau557l-64722fd9-939e-4546-bd45-4d1169f29873.png/v1/fill/w_1024,h_1023,q_80,strp/fire_emblem_sword_of_seals_by_art0017_dau557l-fullview.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTAyMyIsInBhdGgiOiJcL2ZcLzA2ZDAwZTM5LTY5NjctNGI5OS04ZWY2LTAxNjU5OTI4Y2JiNlwvZGF1NTU3bC02NDcyMmZkOS05MzllLTQ1NDYtYmQ0NS00ZDExNjlmMjk4NzMucG5nIiwid2lkdGgiOiI8PTEwMjQifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.wAcQR2P33o8Rx02OsbU8g0DuRuVeMnewrdtIu2sCzZ8", 60.00, false));

        jogos.add(new Jogo(3, "Fire emblem Sacred stones", "RPG Tático",
                "https://amostagreeablepastime.files.wordpress.com/2016/12/fire-emblem-sacred-stones-cover-art-gba.jpg", 60.00, false));
    }

    public List<Jogo> findAll() {
        return jogos;
    }

    public Jogo save(Jogo jogo){
        for (Jogo jogoNaLista : jogos){
            if (jogo.getId() == jogoNaLista.getId()) {
                return null;
            }
        }
        jogos.add(jogo);
        return jogo;
    }
}