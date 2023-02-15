import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  constructor(private fb:FormBuilder,private router:Router){}

  loginForm:FormGroup;




  ngOnInit(): void {
  this.loginForm=this.fb.group({
  userName:[''],
  password:[''],

})
  }

  onSubmitLogin()
  {
    console.log('in method');
    if(this.loginForm.controls['userName'].value==='RE' && this.loginForm.controls['password'].value==="RE")
    {
      alert("login");
      localStorage.setItem('userType','re');
      this.router.navigateByUrl("/dashboard")
    }
    else
    {
      alert("Failed")

    }

  }

 

}
