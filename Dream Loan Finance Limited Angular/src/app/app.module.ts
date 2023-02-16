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
import { AboutusComponent } from './entry/aboutus/aboutus.component';

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
    AboutusComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,ReactiveFormsModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
