package com.wipro.vehicleapi.services;

import java.util.List;

import com.wipro.vehicleapi.dto.Owner;
import com.wipro.vehicleapi.dto.VehicleDTO;
import com.wipro.vehicleapi.dto.VehicleOwnerVO;
import com.wipro.vehicleapi.entity.Vehicle;

public interface IVehicleService {
	
	public Vehicle addVehicle(VehicleDTO vehicledto);
    
	public Vehicle updateVehicle(VehicleDTO vehicledto);
	
	public VehicleDTO getVehicleById(int vehicleId);
    
	public String deleteVehicleById(int vehicleId);
     
    public List<Vehicle> getAllVehicle();
    
    public VehicleOwnerVO getVehicleAndOwnerById(int vehicleId);

	public void updateOwnerByVehicle(Owner owner);

}
