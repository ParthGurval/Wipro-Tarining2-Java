import { Component } from '@angular/core';
import { Vehicle } from 'src/app/model/vehicle';
import { VehicleService } from 'src/app/services/vehicle.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent {

  ve:Vehicle = new Vehicle();

    constructor(private route:ActivatedRoute, private veService:VehicleService){}
 
    ngOnInit(): void {
     
      this.find();
  }
   
     searchInput:number = 0;

    find(){

          // Here we search employees records , whose salary is greater than input = 15000 or input = 50000

        this.route.params.subscribe( (param)=>{ this.searchInput = param['input']});

        console.log("input param "+this.searchInput)

        this.veService.find(this.searchInput).subscribe( (input)=> {
                                                  this.ve = input;
                                          console.log('ve '+input);
        });
       
    }

}
