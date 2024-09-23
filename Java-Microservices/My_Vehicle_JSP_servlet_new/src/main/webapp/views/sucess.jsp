<%@ page language="java" import="com.wipro.pojo.Vehicle" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Operation Successful</h1>

<br>

<br>JSP Scriplets:<br>

<%
    // Retrieve Vehicle object from session
    Vehicle v1 = (Vehicle) session.getAttribute("vehicle");

    // Check if Vehicle is not null and print its details
    if (v1 != null) {
        out.print("Vehicle ID: " + v1.getVehicleId() + "<br>");
        out.print("Type: " + v1.getVehicleType() + "<br>");
        out.print("Model: " + v1.getModelName() + "<br>");
        out.print("Purchase Date: " + v1.getPurchaseDate() + "<br>");
        out.print("Number: " + v1.getVehicleNumber() + "<br>");
        out.print("Age: " + v1.getVehicleAge() + "<br>");
        out.print("Owner: " + v1.getOwnerName() + "<br>");
        out.print("Purchase Cost: " + v1.getPurchaseCost() + "<br>");
        out.print("Current Cost: " + v1.getCurrentCost() + "<br>");
        out.print("In Use: " + v1.isInUse() + "<br>");
    } else {
        out.print("No vehicle details available.<br>");
    }
%>

<br>JSP Expression:<br>
<%= session.getAttribute("vehicle") %>

<br>EL Expression:<br>
${vehicle}

</body>
</html>