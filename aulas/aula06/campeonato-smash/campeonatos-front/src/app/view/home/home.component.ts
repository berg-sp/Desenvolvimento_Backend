import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Campeonato } from 'src/app/model/campeonato';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{

  campeonatos!: Campeonato[];

  constructor(private httpClient: HttpClient) { }

  ngOnInit() {
    this.getCampeonatos();
  }

  getCampeonatos() {
    this.httpClient.get<Campeonato[]>("http://localhost:8080/campeonatos").subscribe(resposta => {
      this.campeonatos = resposta;
    })
  }

}
