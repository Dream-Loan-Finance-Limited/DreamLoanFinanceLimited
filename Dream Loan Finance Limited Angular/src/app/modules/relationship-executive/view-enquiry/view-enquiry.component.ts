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
<<<<<<< HEAD
}
deleteEnquiry(enq)
{
this.enquiryservice.deleteEnquiry(enq).subscribe();
alert("Delete Data Successfully");
window.location.reload();
}
onAprove(enquiry:any)
{
  enquiry.enquiryStatus="Aproved"
  console.log(enquiry)
  this.enquiryservice.updateenquiry(enquiry).subscribe();


}
=======
  }

>>>>>>> 5cd6be6c417416ffc8ef8dd1dec8cadde93e4ca2


}
