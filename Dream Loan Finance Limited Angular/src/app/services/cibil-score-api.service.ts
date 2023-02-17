import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { EnquiryServiceService } from './enquiry-service.service';

@Injectable({
  providedIn: 'root'
})
export class CibilScoreAPIService {

  constructor(private http:HttpClient) { }

  getCibilScore(enquiry:any)
  {
    console.log("in CIBIL SERVICE")
   
    
    return this.http.get<any>("http://localhost:9090/consumeCibilScore/"+enquiry.panNumber);

  }



}

