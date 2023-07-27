import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Cosmetico } from 'src/app/model/cosmetico';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  cosmeticos!: Cosmetico[];

  constructor (private httpClient: HttpClient) {}

  ngOnInit(): void {
    this.getCosmeticos();
  }

  getCosmeticos(){
    this.httpClient.get<Cosmetico[]>("http://localhost:8080/cosmeticos").subscribe(resposta => {
      this.cosmeticos = resposta;
    })
  }

}
