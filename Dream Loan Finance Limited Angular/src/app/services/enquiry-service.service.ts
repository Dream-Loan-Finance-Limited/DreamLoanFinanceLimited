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
<<<<<<< HEAD
     
=======
>>>>>>> 5cd6be6c417416ffc8ef8dd1dec8cadde93e4ca2
  }

  getEnquiry()
  {
    return this.http.get<any[]>("http://localhost:9090/getAllEnquiryDatails");
    
  }
<<<<<<< HEAD
  deleteEnquiry(enquiry:any)
  {
     return this.http.delete("http://localhost:9090/deleteenquiry/"+enquiry.enquiryId);
  }

updateenquiry(enquiry:any)
  {
    return this.http.put("http://localhost:9090/update",enquiry);
    console.log(enquiry)
  }
=======

>>>>>>> 5cd6be6c417416ffc8ef8dd1dec8cadde93e4ca2
}
