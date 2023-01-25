import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs';
import { BehaviorSubject } from 'rxjs/internal/BehaviorSubject';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class ItemsService {


  constructor(private http:HttpClient) { }

  public weightLossItem(){
    return this.http.get(`${baseUrl}/wlfooditems`);
  }

  public DiabetesFoodItem(){
    return this.http.get(`${baseUrl}/diabetesplan`);
  }

  public DetoxDietPlan()
  {
    return this.http.get(`${baseUrl}/detoxdietplan`);
  }


}
