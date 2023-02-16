import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { OperationalExecutiveRoutingModule } from './operational-executive-routing.module';
import { ViewApprovedEnquiryComponent } from './view-approved-enquiry/view-approved-enquiry.component';
import { VerifyCustomerComponent } from './verify-customer/verify-customer.component';


@NgModule({
  declarations: [
    ViewApprovedEnquiryComponent,
    VerifyCustomerComponent
  ],
  imports: [
    CommonModule,
    OperationalExecutiveRoutingModule
  ]
})
export class OperationalExecutiveModule { }
