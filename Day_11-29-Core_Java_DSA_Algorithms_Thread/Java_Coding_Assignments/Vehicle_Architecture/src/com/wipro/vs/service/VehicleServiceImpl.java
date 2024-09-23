package com.wipro.vs.service;

import java.util.List;

import com.wipro.vs.dao.IVehicleDAO;
import com.wipro.vs.dao.VehicleDAOImpl;
import com.wipro.vs.pojo.Vehicle;
//here we implemement business logic 
public class VehicleServiceImpl implements IVehicleService {
	
	private IVehicleDAO  dao;
	
	public VehicleServiceImpl() {
		
		dao = new VehicleDAOImpl(); 
	}

	@Override
	public int addVehicle(Vehicle ve) {
		// TODO Auto-generated method stub
		return dao.addVehicle(ve);
	}

	@Override
	public int updateVehicle(Vehicle ve) {
		// TODO Auto-generated method stub
		return dao.updateVehicle(ve);
	}

	@Override
	public int deleteVehicleById(String vehicleId) {
		// TODO Auto-generated method stub
		return dao.deleteVehicleById(vehicleId);
	}

	@Override
	public Vehicle selectVehicleById(String vehicleId) {
		// TODO Auto-generated method stub
		return dao.selectVehicleById(vehicleId);
	}

	@Override
	public List<Vehicle> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}


}
