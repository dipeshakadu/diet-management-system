import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { CalorieCalculatorComponent } from './pages/calorie-calculator/calorie-calculator.component';
import { AboutComponent } from './pages/about/about.component';
import { DetoxplanComponent } from './pages/detoxplan/detoxplan.component';
import { DiabetesplanComponent } from './pages/diabetesplan/diabetesplan.component';
import { WLplanComponent } from './pages/wlplan/wlplan.component';


const routes: Routes = [
  {
    path:'',
    component:HomeComponent,
    pathMatch:'full',
  },
  {
      path:'calorieCalculator',
      component: CalorieCalculatorComponent,
  },
  {
      path:'about',
      component: AboutComponent
  },
  {
      path:'weightlossplan',
      component: WLplanComponent
   },
   {
      path:'diabetesplan',
      component: DiabetesplanComponent
   },
   {
    path:'detoxplan',
    component: DetoxplanComponent
 }, 
 
    
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
