import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CibilScoreAPIService {

  constructor(private http:HttpClient) { }

  getCibilScore()
  {
    return this.http.get<any>("CIBILAPIurl");
  }



}

