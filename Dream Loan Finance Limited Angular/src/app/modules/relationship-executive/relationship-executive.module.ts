import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RelationshipExecutiveRoutingModule } from './relationship-executive-routing.module';
import { ViewEnquiryComponent } from './view-enquiry/view-enquiry.component';
import { ApplyForNewLoanComponent } from './apply-for-new-loan/apply-for-new-loan.component';
import { ViewApprovedEnquiryComponent } from './view-approved-enquiry/view-approved-enquiry.component';
import { ViewSanctionLoanComponent } from './view-sanction-loan/view-sanction-loan.component';


@NgModule({
  declarations: [
    ViewEnquiryComponent,
    ApplyForNewLoanComponent,
    ViewApprovedEnquiryComponent,
    ViewSanctionLoanComponent
  ],
  imports: [
    CommonModule,
    RelationshipExecutiveRoutingModule
  ]
})
export class RelationshipExecutiveModule { }
