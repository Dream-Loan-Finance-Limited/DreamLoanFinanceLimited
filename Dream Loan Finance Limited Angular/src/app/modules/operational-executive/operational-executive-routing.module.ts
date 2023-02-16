import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { VerifyCustomerComponent } from './verify-customer/verify-customer.component';
import { ViewApprovedEnquiryComponent } from './view-approved-enquiry/view-approved-enquiry.component';

const routes: Routes = [
  {
    path:'viewapprovedenquiry',component:ViewApprovedEnquiryComponent
  },
  {
    path:'verifyapplication',component:VerifyCustomerComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class OperationalExecutiveRoutingModule { }
