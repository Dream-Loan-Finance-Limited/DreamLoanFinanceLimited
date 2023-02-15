import { Component } from '@angular/core';

@Component({
  selector: 'app-emi-calculator',
  templateUrl: './emi-calculator.component.html',
  styleUrls: ['./emi-calculator.component.css']
})
export class EmiCalculatorComponent {

  title = 'CarLoanProject';
  loanAmount: number;
  tenure: number;
  interest: number;
  emi: number;
  totalpay:number;
  calculate() 
  {
    var outstandingAmount =
      Number(this.loanAmount) +
      Number(this.loanAmount * (this.interest / 100));
    this.emi = outstandingAmount / this.tenure;
    this.totalpay=this.tenure*this.emi;
  }



}
  


