import { Component, OnInit } from '@angular/core';
import { PorfolioService } from 'src/app/servicios/porfolio.service';

@Component({
  selector: 'app-experiencia-y-educacion',
  templateUrl: './experiencia-y-educacion.component.html',
  styleUrls: ['./experiencia-y-educacion.component.css']
})
  
export class ExperienciaYEducacionComponent implements OnInit {
  educacionLista: any;
  experienciaLista: any;

  constructor(private datosPorfolio: PorfolioService){}
  
  ngOnInit(): void {
    this.datosPorfolio.obtenerDatos().subscribe
      (data => {
        this.educacionLista = data.educacion; 
        this.experienciaLista = data.experiencia;
    })
    }

}
