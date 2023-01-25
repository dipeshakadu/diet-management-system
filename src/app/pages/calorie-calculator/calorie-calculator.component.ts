import { Component ,OnInit} from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Calculate } from 'src/app/calculate';
import { CalculateService } from 'src/app/services/calculate.service';


@Component({
  selector: 'app-calorie-calculator',
  templateUrl: './calorie-calculator.component.html',
  styleUrls: ['./calorie-calculator.component.css']
})
export class CalorieCalculatorComponent {
  result: any;
  alert:boolean=false
  calculate: Calculate =new Calculate();

  constructor(private calculateService:CalculateService){}
  

  ngOnInit(): void{

  }
  calculateData(){
    console.log(this.calculate);
    this.calculateService.calculateItem(this.calculate).subscribe(data=>{
      this.alert=true
    },
    error=>alert("sorry not calculated"));
    }

    total(){
      this.calculateService.calculateItem(this.calculate).subscribe((data)=>{
        console.log(data);
        this.result=data;
      },
      (error)=>{
        console.log(error);
      })
    }
  
  
registerForm= new FormGroup({
  weight: new FormControl("",[Validators.required,Validators.pattern("[0-9]*")]),
  height: new FormControl("",[Validators.required,Validators.pattern("[0-9]*")]),
  age: new FormControl("",[Validators.required,Validators.pattern("[0-9]*")]),  
});


get weight(): FormControl{
  return this.registerForm.get("weight") as FormControl;
}

get height(): FormControl{
  return this.registerForm.get("height") as FormControl;
}

get age(): FormControl{
  return this.registerForm.get("age") as FormControl;
}


}
 
