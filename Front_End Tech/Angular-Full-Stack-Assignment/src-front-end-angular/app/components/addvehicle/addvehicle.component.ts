import { Component } from '@angular/core';
import { Vehicle } from 'src/app/model/vehicle';
import { VehicleService } from 'src/app/services/vehicle.service';


@Component({
  selector: 'app-addvehicle',
  templateUrl: './addvehicle.component.html',
  styleUrls: ['./addvehicle.component.css']
})
export class AddvehicleComponent {

  constructor(private  veService:VehicleService){}

  insertVehicle(data:Vehicle){
    
        this.veService.insert(data)
        .subscribe(
          (ve)=>{console.log('Added Employee is: '+ve);}
          );
  }

}
