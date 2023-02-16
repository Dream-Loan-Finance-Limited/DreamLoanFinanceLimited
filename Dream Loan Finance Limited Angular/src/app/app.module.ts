import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './entry/login/login.component';
import { DashBoardComponent } from './entry/dash-board/dash-board.component';
import { HomeComponent } from './entry/home/home.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { SideMenuComponent } from './includes/side-menu/side-menu.component';
import { HeaderComponent } from './includes/header/header.component';
import { FooterComponent } from './includes/footer/footer.component';
import { EmiCalculatorComponent } from './entry/emi-calculator/emi-calculator.component';
import { EnquryComponent } from './entry/enqury/enqury.component';
import { HttpClientModule } from '@angular/common/http';
import { AboutUsComponent } from './entry/about-us/about-us.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    DashBoardComponent,
    HomeComponent,
    SideMenuComponent,
    HeaderComponent,
    FooterComponent,
    EmiCalculatorComponent,
    EnquryComponent,
    AboutUsComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,ReactiveFormsModule,FormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
