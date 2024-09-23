package com.wipro.vehicleapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.vehicleapi.dto.Owner;
import com.wipro.vehicleapi.dto.VehicleDTO;
import com.wipro.vehicleapi.dto.VehicleOwnerVO;
import com.wipro.vehicleapi.entity.Vehicle;
import com.wipro.vehicleapi.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements IVehicleService {
	
	@Autowired
	private VehicleRepository repo;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public Vehicle addVehicle(VehicleDTO vehicledto) {
		// TODO Auto-generated method stub
		
		Vehicle vec = new Vehicle();
		vec.setVehicleId(vehicledto.getVehicleId());
		vec.setVehicleType(vehicledto.getVehicleType());
		vec.setModelName(vehicledto.getModelName());
		vec.setPurchaseDate(vehicledto.getPurchaseDate());
		vec.setVehicleNumber(vehicledto.getVehicleNumber());
		vec.setVehicleAge(vehicledto.getVehicleAge());
		vec.setOwner_id(vehicledto.getOwner_id());
		vec.setPurchaseCost(vehicledto.getPurchaseCost());
		vec.setCurrentCost(vehicledto.getCurrentCost());
		
		return repo.save(vec);
	}

	@Override
	public Vehicle updateVehicle(VehicleDTO vehicledto) {
		// TODO Auto-generated method stub
		Vehicle vec = new Vehicle();
		vec.setVehicleId(vehicledto.getVehicleId());
		vec.setVehicleType(vehicledto.getVehicleType());
		vec.setModelName(vehicledto.getModelName());
		vec.setPurchaseDate(vehicledto.getPurchaseDate());
		vec.setVehicleNumber(vehicledto.getVehicleNumber());
		vec.setVehicleAge(vehicledto.getVehicleAge());
		vec.setOwner_id(vehicledto.getOwner_id());
		vec.setPurchaseCost(vehicledto.getPurchaseCost());
		vec.setCurrentCost(vehicledto.getCurrentCost());
		
		return repo.save(vec);
	}

	@Override
	public VehicleDTO getVehicleById(int vehicleId) {
		// TODO Auto-generated method stub
		
		Vehicle vec = repo.findById(vehicleId).orElse(null);
		
		VehicleDTO vdto = new VehicleDTO();
		
		vdto.setVehicleId(vec.getVehicleId());
		vdto.setVehicleType(vec.getVehicleType());
		vdto.setModelName(vec.getModelName());
		vdto.setPurchaseDate(vec.getPurchaseDate());
		vdto.setVehicleNumber(vec.getVehicleNumber());
		vdto.setVehicleAge(vec.getVehicleAge());
		vdto.setOwner_id(vec.getOwner_id());
		vdto.setPurchaseCost(vec.getPurchaseCost());
		vdto.setCurrentCost(vec.getCurrentCost());
		
		return vdto;
	}

	@Override
	public String deleteVehicleById(int vehicleId) {
		// TODO Auto-generated method stub
		repo.deleteById(vehicleId);
		
		return "Record deleted for Vehicle ID:" + vehicleId;
	}

	@Override
	public List<Vehicle> getAllVehicle() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public VehicleOwnerVO getVehicleAndOwnerById(int vehicleId) {
		// TODO Auto-generated method stub
		
		VehicleDTO vdto = getVehicleById(vehicleId);
		
		int owner_id = vdto.getOwner_id();
		
		Owner owner = restTemplate.getForObject("http://localhost:8282/api/owners/getbyid/" + owner_id, Owner.class);
		
		VehicleOwnerVO vechicleOwnerVO = new VehicleOwnerVO();
		
		vechicleOwnerVO.setVehicle(vdto);
		vechicleOwnerVO.setOwner(owner);
		
		return vechicleOwnerVO;
	}

	@Override
	public void updateOwnerByVehicle(Owner owner) {
		// TODO Auto-generated method stub
		
		restTemplate.put("http://localhost:8282/api/owners/update", owner);
		System.out.println("Updated Owner from Vehcile Micro-Service...");
		
	}

}
