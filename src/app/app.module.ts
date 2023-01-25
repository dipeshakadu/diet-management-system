import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FooterComponent } from './components/footer/footer.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { HomeComponent } from './pages/home/home.component';
import { CalorieCalculatorComponent } from './pages/calorie-calculator/calorie-calculator.component';
import { AboutComponent } from './pages/about/about.component';
import { ToolbarComponent } from './components/toolbar/toolbar.component';
import { DetoxplanComponent } from './pages/detoxplan/detoxplan.component';
import { DiabetesplanComponent } from './pages/diabetesplan/diabetesplan.component';
import { WLplanComponent } from './pages/wlplan/wlplan.component';





@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HomeComponent,
    CalorieCalculatorComponent,
    AboutComponent,
    ToolbarComponent,
    DetoxplanComponent,
    DiabetesplanComponent,
    WLplanComponent
   
       
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
