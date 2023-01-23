import { Component, OnInit } from '@angular/core';
import { ItemsService } from 'src/app/services/items.service';

@Component({
  selector: 'app-diabetesplan',
  templateUrl: './diabetesplan.component.html',
  styleUrls: ['./diabetesplan.component.css']
})
export class DiabetesplanComponent implements OnInit {

  DiabetesPlan=[
    {
      foodName:'',
      kcal:'',
      fats:'',
      quantity:'',
      timing:'',
    }
  ]

  constructor(private itemsService: ItemsService ) { }

  ngOnInit(): void {
    this.itemsService.DiabetesFoodItem().subscribe(
      (data:any)=>{
        this.DiabetesPlan=data;
        console.log(this.DiabetesPlan);

      },
      (error)=>{
        console.log(error);
      }
    );
  }

}
