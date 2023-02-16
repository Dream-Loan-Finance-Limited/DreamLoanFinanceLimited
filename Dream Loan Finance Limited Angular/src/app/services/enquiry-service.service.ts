import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class EnquiryServiceService {

  constructor(private http:HttpClient) { }


  saveEnquiry(enquirydata:FormGroup)
  {
   return this.http.post("http://localhost:9090/saveEnquiry",enquirydata);
  }

  getEnquiry()
  {
    return this.http.get<any[]>("http://localhost:9090/getAllEnquiryDatails");
    
  }

}
