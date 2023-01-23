import { Component, OnInit } from '@angular/core';
import { ItemsService } from 'src/app/services/items.service';

@Component({
  selector: 'app-comment',
  templateUrl: './comment.component.html',
  styleUrls: ['./comment.component.css']
})
export class CommentComponent implements OnInit{
  
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
