package com.wipro.controller;

import java.io.IOException;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.pojo.Vehicle;
import com.wipro.service.IVehicleService;
import com.wipro.service.VehicleServiceImpl;
/**
 * Servlet implementation class myVehicleController
 */
@WebServlet("/myVehicleController")
public class myVehicleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	IVehicleService service;
	
    public myVehicleController() {
        // TODO Auto-generated constructor stub
    	
    	service = new VehicleServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Retrieve form parameters
        String vehicleId = request.getParameter("vehicleId");
        String vehicleType = request.getParameter("vehicleType");
        String modelName = request.getParameter("modelName");
        LocalDate purchaseDate = LocalDate.parse(request.getParameter("purchaseDate"));
        String vehicleNumber = request.getParameter("vehicleNumber");
        int vehicleAge = Integer.parseInt(request.getParameter("vehicleAge"));
        String ownerName = request.getParameter("ownerName");
        double purchaseCost = Double.parseDouble(request.getParameter("purchaseCost"));
        double currentCost = Double.parseDouble(request.getParameter("currentCost"));
        boolean isInUse = request.getParameter("isInUse") != null;

        // Create Vehicle object
        Vehicle vehicle = new Vehicle(vehicleId, vehicleType, modelName, purchaseDate, vehicleNumber, vehicleAge, ownerName, purchaseCost, currentCost, isInUse);

        // Add vehicle to database
        service.addVehicle(vehicle);

        // Set Vehicle in session
        HttpSession session = request.getSession();
        session.setAttribute("vehicle", vehicle);

        // Forward to success.jsp
        RequestDispatcher rd = request.getRequestDispatcher("views/sucess.jsp");
        rd.forward(request, response);
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
