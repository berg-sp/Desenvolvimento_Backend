package br.com.ecomerce.service;

import br.com.ecomerce.model.Produto;
import br.com.ecomerce.repository.BancoDeDados;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ProdutoService {
    private BancoDeDados bancoDeDados = new BancoDeDados();
    public List<Produto> findAll(){
        return bancoDeDados.findAll();
    }

    public Produto getById(int id){
        List<Produto> produtos = bancoDeDados.findAll();

        for(Produto produto : produtos){
            if(produto.getId() == id){
                return produto;
            }
        }
        return null;
    }
    public String efetivarPedido(Produto produto) {
        String url = "http://localhost:8081/pedidos";

        RestTemplate restTemplate = new RestTemplate();
        String mensagem = restTemplate.postForObject(url, produto, String.class);
        return mensagem;
    }
}
