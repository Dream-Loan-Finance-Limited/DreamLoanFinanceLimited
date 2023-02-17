import { Component, OnInit } from '@angular/core';
import { CibilScoreAPIService } from 'src/app/services/cibil-score-api.service';
import { EnquiryServiceService } from 'src/app/services/enquiry-service.service';

@Component({
  selector: 'app-view-approved-enquiry',
  templateUrl: './view-approved-enquiry.component.html',
  styleUrls: ['./view-approved-enquiry.component.css']
})
export class ViewApprovedEnquiryComponent implements OnInit{
  constructor(private enquiryservice:EnquiryServiceService,private cibilenquiry:CibilScoreAPIService){}


  enquiry:any[];
  cibil:any;
  showTable: boolean = false;
  ngOnInit(): void {

    this.enquiryservice.getEnquiryByStatus(this.enquiry.values).subscribe((enquiry:any[])=>
    {

      this.enquiry=enquiry;
    })
    
  }

  toggleShowTable(): void 
  {
    this.showTable = !this.showTable;
  }


  oncheckCibil()
  {

    this.cibilenquiry.getCibilScore().subscribe((cibil:any)=>
    {
      this.cibil=cibil;
    })

  }



}
