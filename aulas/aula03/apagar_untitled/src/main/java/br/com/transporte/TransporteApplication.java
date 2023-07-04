package br.com.transporte;

import br.com.transporte.model.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransporteApplication {
    public static void main(String[] args) {
        SpringApplication.run(TransporteApplication.class, args);
    }

    public String realizarEnvio(Produto produto) {
    }
}
