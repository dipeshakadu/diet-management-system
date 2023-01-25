import { Component, OnInit } from '@angular/core';
import { ItemsService } from 'src/app/services/items.service';

@Component({
  selector: 'app-wlplan',
  templateUrl: './wlplan.component.html',
  styleUrls: ['./wlplan.component.css']
})
export class WLplanComponent implements OnInit{
  weightLossItem=[
    {
      foodName: '',
      kcal: '',
      fats:'' ,
      quantity:'',
      timing:''
    }
    ];
    constructor(private itemsService: ItemsService ) { }
  
    ngOnInit(): void{
      this.itemsService.weightLossItem().subscribe(
        (data:any)=>{
          this.weightLossItem=data;
          console.log(this.weightLossItem);
        },
        (error)=>{
          console.log(error);
        }
      )
    }

}
