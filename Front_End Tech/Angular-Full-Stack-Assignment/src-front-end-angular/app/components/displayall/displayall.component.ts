import { Component } from '@angular/core';
import { Vehicle } from 'src/app/model/vehicle';
import { VehicleService } from 'src/app/services/vehicle.service';

@Component({
  selector: 'app-displayall',
  templateUrl: './displayall.component.html',
  styleUrls: ['./displayall.component.css']
})
export class DisplayallComponent {

  veList:Vehicle[] = [];

    constructor(private veService:VehicleService){}


  ngOnInit(){

      this.getAllVehicle();

  }


  getAllVehicle(){
    
      this.veService.getAll().subscribe( 
                                (list)=>{ this.veList = list;  console.log(list)}
                                
                                  );

          

 }

  deleteById(vehicleId:number){

        this.veService.delete(vehicleId).subscribe( (msg)=>{ console.log("Deleted "+msg);});

      
        this.getAllVehicle(); // to refresh list again

       

  }

}
