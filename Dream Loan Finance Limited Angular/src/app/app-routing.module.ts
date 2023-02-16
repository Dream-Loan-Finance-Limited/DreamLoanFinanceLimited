import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './entry/aboutus/aboutus.component';
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
    path:'login',component:LoginComponent
  },
  {
    path:'emicalculator',component:EmiCalculatorComponent
  },
  {
    path:'dashboard',component:DashBoardComponent,
    
  },
  {
    path:'enqury',component:EnquryComponent
  },
  {
    path:'aboutus',component:AboutusComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
