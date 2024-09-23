package com.wipro.controller;

import java.io.IOException;
import java.time.LocalDate;

import com.wipro.pojo.Vehicle;
import com.wipro.service.IVehicleService;
import com.wipro.service.VehicleServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class MyVehicleController
 */
@WebServlet("/MyVehicleController")
public class MyVehicleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
IVehicleService service;
	
    public MyVehicleController() {
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
