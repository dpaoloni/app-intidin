import { Component,OnInit,Input, Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-botones',
  templateUrl: './botones.component.html',
  styleUrls: ['./botones.component.css']
})
export class BotonesComponent implements OnInit {
  @Input() text: string="Tengo interés en";
  @Input() color: string = "";
  @Output()btnClick =new EventEmitter

  constructor() { }
  ngOnInit(): void {
  }
    onclick(){
      this.btnClick.emit();
    
  }
}
