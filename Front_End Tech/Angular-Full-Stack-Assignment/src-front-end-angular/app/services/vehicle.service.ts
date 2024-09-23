import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Vehicle } from '../model/vehicle';

@Injectable({
  providedIn: 'root'
})
export class VehicleService {

  constructor(private http:HttpClient) { }


  baseURL:string = 'http://localhost:9191/api/vehicles';

    getAll():Observable<Vehicle[]>{

        return this.http.get<Vehicle[]>(this.baseURL+"/getall");


    }

    insert(body:Vehicle):Observable<Vehicle>{

      console.log(body);

        return this.http.post<Vehicle>(this.baseURL+"/add",body);

    }

    update(body:Vehicle):Observable<Vehicle>{

      console.log(body);

      return this.http.put<Vehicle>(this.baseURL+"/update",body);
      
    }

    delete(vehicleId:number):Observable<string>{

      return  this.http.delete<string>(this.baseURL+`/deletebyid/${vehicleId}`);

    }


    find(vehicleId:number):Observable<Vehicle>{


      console.log("service "+vehicleId)
     return this.http.get<Vehicle>(this.baseURL+"/getbyid/"+vehicleId);  // data is id

    }
}
