import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { EnquiryServiceService } from 'src/app/services/enquiry-service.service';

@Component({
  selector: 'app-enqury',
  templateUrl: './enqury.component.html',
  styleUrls: ['./enqury.component.css']
})
export class EnquryComponent implements OnInit
{
  constructor(private fb:FormBuilder,private router:Router,private enquiryService:EnquiryServiceService){}

  enquiryForm:FormGroup;
  ngOnInit(): void 
  {
    this.enquiryForm=this.fb.group({
      enquiryId:[],
      firstName:['',Validators.required],
      middleName:['',Validators.required],
      lastName:['',Validators.required],
      emailId:['',Validators.required],
      panNumber:['',Validators.required],
      contactNumber:['',Validators.required],
      age:['',Validators.required],
      gender:['',Validators.required],
      city:['',Validators.required],
      requiredLoanAmount:['',Validators.required],
      annualIncome:['',Validators.required],
      enquiryStatus:[]
    })
  }
  onSubmitForm()
    {
      alert("Enquiry Recived")

     this.enquiryService.saveEnquiry(this.enquiryForm.value).subscribe(); 
     this.enquiryForm.reset();
      
    }

}
