import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-apply-for-new-loan',
  templateUrl: './apply-for-new-loan.component.html',
  styleUrls: ['./apply-for-new-loan.component.css']
})
export class ApplyForNewLoanComponent implements OnInit{
  constructor(private fb:FormBuilder,private route:Router){}

  registrationForm:FormGroup;
  ngOnInit(): void {
    this.registrationForm=this.fb.group({
      



    })

   
  }


}
