import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ApplyForNewLoanComponent } from './apply-for-new-loan/apply-for-new-loan.component';
import { ViewApprovedEnquiryComponent } from './view-approved-enquiry/view-approved-enquiry.component';
import { ViewEnquiryComponent } from './view-enquiry/view-enquiry.component';
import { ViewSanctionLoanComponent } from './view-sanction-loan/view-sanction-loan.component';

const routes: Routes = [
  {
    path:'viewenquiry', component:ViewEnquiryComponent
  },
  {
    path:'approvedenquiry',component:ViewApprovedEnquiryComponent
  },
  {
    path:'applyforloan',component:ApplyForNewLoanComponent
  },
  {
    path:'viewsanctionloan',component:ViewSanctionLoanComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class RelationshipExecutiveRoutingModule { }
