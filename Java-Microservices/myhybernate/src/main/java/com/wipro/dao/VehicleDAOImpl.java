package com.wipro.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wipro.pojo.Vehicle;

public class VehicleDAOImpl implements IVehicleDAO {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	Session session = sessionFactory.openSession();
	
	Transaction transaction  = session.beginTransaction();

	@Override
	public int addVehicle(Vehicle ve1) {
		// TODO Auto-generated method stub
		
		Serializable ser = session.save(ve1);
		
		transaction.commit();
		
		return (int) ser;
		
	}

	@Override
	public int updateVehicle(Vehicle ve1) {
		// TODO Auto-generated method stub
       
		 session.update(ve1);
		 return 1;
	}

	@Override
	public int deleteVehicleById(String vehicleId) {
		// TODO Auto-generated method stub

		Vehicle vh1 = session.find(Vehicle.class, vehicleId);
		
		 if (vh1 != null) {
			 
	            session.delete(vh1);
	            
	            transaction.commit();
	            
	            session.close();
	            
	            return 1; // Success
	            
	        }
		 
		 transaction.commit(); 
	        
	        session.close();
	        
	        return 0; // failure 
		
	}

	@Override
	public Vehicle selectVehicleById(String vehicleId) {
		// TODO Auto-generated method stub

		Vehicle vehicle = session.get(Vehicle.class, vehicleId);
        session.close();
        return vehicle;
		
	}

	@Override
	public List<Vehicle> selectAll() {
		// TODO Auto-generated method stub

		List<Vehicle> vehicles = session.createQuery("Vehicle.findAll", Vehicle.class).list(); 
        session.close();
        return vehicles;
	        
	}

}
