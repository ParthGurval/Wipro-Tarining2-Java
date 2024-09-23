import { Component } from '@angular/core';
import { Vehicle } from 'src/app/model/vehicle';
import { VehicleService } from 'src/app/services/vehicle.service';

@Component({
  selector: 'app-updatevehicle',
  templateUrl: './updatevehicle.component.html',
  styleUrls: ['./updatevehicle.component.css']
})
export class UpdatevehicleComponent {


  vehicle: Vehicle = new Vehicle();
  vehicleFound: boolean = true;
  
  constructor(private veService: VehicleService) {}

  // Fetch vehicle details by ID
  fetchVehicle(vehicleId: number) {
    this.veService.find(vehicleId).subscribe(
      (response: Vehicle) => {
        this.vehicle = response; // Populate form with fetched data
        this.vehicleFound = true;
      },
      () => {
        console.error('Vehicle not found');
        this.vehicleFound = false;
        this.vehicle = new Vehicle(); // Reset form if vehicle is not found
      }
    );
  }

  // Insert or update vehicle based on vehicleId
  onSubmit(data: Vehicle) {
    if (data.vehicleId) {
      this.veService.update(data).subscribe(
        () => console.log('Vehicle updated successfully'),
        (error) => console.error('Error updating vehicle', error)
      );
    } else {
      this.veService.insert(data).subscribe(
        () => console.log('Vehicle added successfully'),
        (error) => console.error('Error adding vehicle', error)
      );
    }
  }
}
