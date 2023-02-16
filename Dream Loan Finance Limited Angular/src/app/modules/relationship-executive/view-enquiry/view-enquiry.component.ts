import { Component, OnInit } from '@angular/core';
import { EnquiryServiceService } from 'src/app/services/enquiry-service.service';

@Component({
  selector: 'app-view-enquiry',
  templateUrl: './view-enquiry.component.html',
  styleUrls: ['./view-enquiry.component.css']
})
export class ViewEnquiryComponent implements OnInit {
  constructor(private enquiryservice:EnquiryServiceService){}

  enquiry:any[];
  ngOnInit(): void {
   
    this.enquiryservice.getEnquiry().subscribe((enq:any[])=>{


      this.enquiry=enq;
    })
  }



}
