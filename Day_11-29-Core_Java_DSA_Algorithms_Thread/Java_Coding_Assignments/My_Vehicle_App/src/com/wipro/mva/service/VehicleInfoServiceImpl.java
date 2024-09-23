package com.wipro.mva.service;

import java.util.List;

import com.wipro.mva.dao.IVehicleInfoDAO;
import com.wipro.mva.dao.VehicleInfoDAOImpl;
import com.wipro.mva.pojo.VehicleInfo;


public class VehicleInfoServiceImpl implements IVehicleInfoService {
	
	private IVehicleInfoDAO  dao;
	
	public VehicleInfoServiceImpl() {
		
		dao = new VehicleInfoDAOImpl(); 
	}

	@Override
	public int addVehicle(VehicleInfo ve) {
		// TODO Auto-generated method stub
		return dao.addVehicle(ve);
	}

	@Override
	public int updateVehicle(VehicleInfo ve) {
		// TODO Auto-generated method stub
		return dao.updateVehicle(ve);
	}

	@Override
	public int deleteVehicleById(String vehicleId) {
		// TODO Auto-generated method stub
		return dao.deleteVehicleById(vehicleId);
	}

	@Override
	public VehicleInfo selectVehicleById(String vehicleId) {
		// TODO Auto-generated method stub
		return dao.selectVehicleById(vehicleId);
	}

	@Override
	public List<VehicleInfo> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

}
