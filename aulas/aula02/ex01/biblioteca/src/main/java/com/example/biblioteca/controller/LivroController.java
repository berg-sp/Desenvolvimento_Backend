package com.example.biblioteca.controller;

import com.example.biblioteca.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    private List<Livro> livros = new ArrayList<>();

    public LivroController(){
        livros.add(new Livro(1, "Ensaio da cegueira"));
        livros.add(new Livro(2, "Dom Casmurro"));
        livros.add(new Livro(3, "O Pequeno principe"));
        livros.add(new Livro(4, "Brida"));
        livros.add(new Livro(5, "Biblia sagrada"));
        livros.add(new Livro(6, "A menina que roubava livros"));
        livros.add(new Livro(7, "Percy jackson e o Ladrão de raios"));
        livros.add(new Livro(8, "Manifesto do partido comunista"));
        livros.add(new Livro(9, "O capital"));
    }
    @GetMapping
    public List<Livro> getAlll(){
        return livros;
    }
    @GetMapping("/{id}")
    public String deletar(@PathVariable int id){
        for(Livro livro : livros){
            if(livro.getId() == id){
                String mensagem = "O livro " + livro.getNome() + " foi removido com sucesso!";
                livros.remove(livro);
                return mensagem;
            }
        }
        return null;
    }
    @GetMapping("/livro")
    public Livro getByNome(@RequestParam (name = "nome") String nome){
        for(Livro livro : livros){
            if(livro.getNome().equalsIgnoreCase(nome)){
                return livro;
            }
        }
        return null;
    }
    @PostMapping
    public String salvar(@RequestBody Livro livro){
        for(Livro livroAtual : livros){
            if(livroAtual.getId() == livro.getId()){
                return "O livro já existe na lista";
            }
        }
        livros.add(livro);
        return "Livro " + livro.getNome() + " foi incluido no acervo";
    }
    @PutMapping
    public String atualizar(@RequestBody Livro livro){
        for(Livro livroDaLista : livros){
            if(livroDaLista.getId() == livro.getId()){
                livroDaLista.setNome(livro.getNome());
                return "O livro de id: " + livro.getId() + " teve o nome alterado para: " + livro.getNome();
            }
        }
        return "O livro informado não existe";
    }
}
