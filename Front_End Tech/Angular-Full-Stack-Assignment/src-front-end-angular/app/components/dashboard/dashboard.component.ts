import { Component } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { Vehicle } from 'src/app/model/vehicle';
import { VehicleService } from 'src/app/services/vehicle.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {

  
  data:string = '';

  constructor(private veService:VehicleService,private router:Router){}
 
    find(searchData:any){

        this.router.navigate(['/search/'+searchData.form.value.data])

        console.log("Dashboard "+searchData.form.value.data);
        

    }

}
