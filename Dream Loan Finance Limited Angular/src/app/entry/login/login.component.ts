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
    
      if(this.loginForm.controls['userName'].value=='RE' && this.loginForm.controls['password'].value=="RE")
    {
      
      localStorage.setItem('userType','RelationshipExecutive');
      this.router.navigateByUrl("/dashboard/RelationshipExecutive")
   }
   else if(this.loginForm.controls['userName'].value=='OE' && this.loginForm.controls['password'].value=="OE")
   {
       localStorage.setItem('userType','OperationalExecutive');
       this.router.navigateByUrl("/dashboard/OperationalExecutive")
   }
    
    else if(this.loginForm.controls['userName'].value!='OE','RE' && this.loginForm.controls['password'].value=="OE",'RE')
    {
      
      alert("Access Denied")
      
    }
    

  }

 

}
