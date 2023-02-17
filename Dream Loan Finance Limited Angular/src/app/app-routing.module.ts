import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutUsComponent } from './entry/about-us/about-us.component';
import { DashBoardComponent } from './entry/dash-board/dash-board.component';
import { EmiCalculatorComponent } from './entry/emi-calculator/emi-calculator.component';
import { EnquryComponent } from './entry/enqury/enqury.component';
import { HomeComponent } from './entry/home/home.component';
import { LoginComponent } from './entry/login/login.component';

const routes: Routes = [
  {
    path:'',component:HomeComponent,pathMatch:'full',
    
    
  },
  {
    path:'home',component:HomeComponent
  },
  {
    path:'login',component:LoginComponent
  },
  {
    path:'emicalculator',component:EmiCalculatorComponent
  },
  {
    path:'aboutus',component:AboutUsComponent
  },
  {
    path:'dashboard',component:DashBoardComponent,
    children:[
      {
        path:'RelationshipExecutive',loadChildren:()=>import("src/app/modules/relationship-executive/relationship-executive.module").then(re=>re.RelationshipExecutiveModule)
      },
      {
        path:'OperationalExecutive',loadChildren:()=>import("src/app/modules/operational-executive/operational-executive.module").then(oe=>oe.OperationalExecutiveModule)
      },
      {
        path:'CreditManager',loadChildren:()=>import("src/app/modules/credit-manager/credit-manager.module").then(cm=>cm.CreditManagerModule)
      }
    ]
    
  },
  {
    path:'enqury',component:EnquryComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
