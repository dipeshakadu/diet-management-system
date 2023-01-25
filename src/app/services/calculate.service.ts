import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Calculate } from '../calculate';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class CalculateService {
  // baseUrl="http://localhost:8080/register";
  constructor(private httpClient: HttpClient) {}

  calculateItem(calculate: Calculate): Observable<Object>{
    console.log(calculate);
    return this.httpClient.post(`${baseUrl}/register`,calculate);
  }
}
