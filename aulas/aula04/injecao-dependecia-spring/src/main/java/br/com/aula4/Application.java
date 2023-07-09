package br.com.aula4;

import br.com.aula4.model.VideoGame;
import br.com.aula4.model.controladores.ProController;
import br.com.aula4.model.jogos.FireEmblem;
import br.com.aula4.model.jogos.TheLegendOfZelda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication
                .run (Application.class, args);

        VideoGame videoGame1 = applicationContext.getBean(VideoGame.class);
        VideoGame videoGame2 = applicationContext.getBean(VideoGame.class);
        System.out.println(videoGame1);
        System.out.println(videoGame2);

    }
}
