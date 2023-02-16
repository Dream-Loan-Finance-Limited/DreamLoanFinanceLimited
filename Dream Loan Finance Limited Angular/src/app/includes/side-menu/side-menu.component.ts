import { Component, OnInit } from '@angular/core';
import { Menu } from 'src/app/model/menu';

@Component({
  selector: 'app-side-menu',
  templateUrl: './side-menu.component.html',
  styleUrls: ['./side-menu.component.css']
})
export class SideMenuComponent implements OnInit {
  
  userType:string;
  menus:Array<any>;
  viewUserType:string;
  ngOnInit(): void {
    this.userType=localStorage.getItem('userType')
    if(this.userType=='RelationshipExecutive')
    {
      this.viewUserType='Relationship Executive'
    }
    else if(this.userType=='OperationalExecutive')
    {
this.viewUserType='Operational Executive'
    }
    this.menus=Menu.menus;
  }



}
