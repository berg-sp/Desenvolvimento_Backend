import { Component, OnInit } from '@angular/core';
import { Jogo } from './model/jogo';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'loja-games-front';

  jogos!: Jogo[];

  constructor(private httpClient: HttpClient) {
    //  this.jogos = [];
    //  this.jogos.push(new Jogo(1, "Beyond good and evil", "bla bla bla", 49.99, "https://i1.sndcdn.com/artworks-000108350739-aagm63-t500x500.jpg"), );
    //  this.jogos.push(new Jogo(1, "Undertale", "bla bla bla", 39.99, "https://lastfm.freetls.fastly.net/i/u/770x0/bef3b7367a786c6a4299894d930c7dfb.jpg"), );
    //  this.jogos.push(new Jogo(1, "Katana Zero", "bla bla bla", 29.99, "https://i1.sndcdn.com/artworks-HaFxR9Tu6Nu47KzO-0xxtiQ-t500x500.jpg"), );
  }

  ngOnInit(): void {
    this.getJogos();
  }

  getJogos() {
    this.httpClient.get<Jogo[]>("http://localhost:8080/jogos").subscribe(retorno => {
      this.jogos = retorno;
    })
  }

}
