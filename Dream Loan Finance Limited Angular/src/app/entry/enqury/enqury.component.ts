import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-enqury',
  templateUrl: './enqury.component.html',
  styleUrls: ['./enqury.component.css']
})
export class EnquryComponent implements OnInit
{
  constructor(private fb:FormBuilder,private router:Router){}

  enquiryForm:FormGroup;
  ngOnInit(): void 
  {
    this.enquiryForm=this.fb.group({
      firstName:[],
      lastName:[],
      emailId:[],
      panNumber:[],

    })
  }
  onSubmitForm()
    {

      
    }

}
