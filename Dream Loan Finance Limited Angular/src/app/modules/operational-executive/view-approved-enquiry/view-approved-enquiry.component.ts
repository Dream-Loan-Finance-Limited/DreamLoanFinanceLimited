import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { CibilScoreAPIService } from 'src/app/services/cibil-score-api.service';
import { EnquiryServiceService } from 'src/app/services/enquiry-service.service';

@Component({
  selector: 'app-view-approved-enquiry',
  templateUrl: './view-approved-enquiry.component.html',
  styleUrls: ['./view-approved-enquiry.component.css']
})
export class ViewApprovedEnquiryComponent implements OnInit{
  constructor(private enquiryservice:EnquiryServiceService,private cibilenquiry:CibilScoreAPIService,private fb:FormBuilder){}


  enquiry:any[];
  cibil:any;
  showTable: boolean = false;
  cibilForm:FormGroup;
  ngOnInit(): void {

    this.toggleShowTable();
    
  }

  toggleShowTable(): void 
  {
    this.showTable = !this.showTable;
    this.enquiryservice.getEnquiryByStatusCibil().subscribe((enquiry:any[])=>
    {
      
      this.enquiry=enquiry;
    })
  }

  inCibilApi()
  {
    this.cibilForm=this.fb.group({

      cibilScoreId:[],
      firstName:[],
      lastName:[],
      panNumber:[],
      cibilScore:[],
      status:[]


    })

  }


  oncheckCibil(enq:any)
  {
    alert("CIBIL Score will be Updated")

    this.cibilenquiry.getCibilScore(enq).subscribe((cibil:any)=>
    {

      this.cibil=cibil;
    
    })
    window.location.reload();

  }



}
