import { Component, OnInit } from '@angular/core';
import { ItemsService } from 'src/app/services/items.service';

@Component({
  selector: 'app-detoxplan',
  templateUrl: './detoxplan.component.html',
  styleUrls: ['./detoxplan.component.css']
})
export class DetoxplanComponent implements OnInit{


  DetoxDietPlan=[
    {
      itemName:'',
      cal:'',
      fatNo:'',
      amount:'',
      time:''
    }
  ]
  constructor(private itemsService: ItemsService ) { }
    
  ngOnInit(): void {
    this.itemsService.DetoxDietPlan().subscribe(
      (data:any)=>{
      this.DetoxDietPlan=data;
      console.log(this.DetoxDietPlan);
    },
    (error)=>{
      console.log(error);
    }
    );
  }
}
