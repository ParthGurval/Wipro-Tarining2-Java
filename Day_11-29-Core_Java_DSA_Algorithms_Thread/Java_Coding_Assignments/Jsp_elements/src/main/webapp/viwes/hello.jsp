<%@page import="jakarta.servlet.jsp.JspWriter"%>
<%@page import="jakarta.servlet.jsp.PageContext"%>
<%@ page language="java"  import="java.time.*, java.util.* ,java.io.* "   contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- jsp templates html and text -->
<h1>Welcome to JSP PAGE</h1>
 <br>

hello friend

<!-- Jsp Scriplet -->
<%  


	int x = 90;
	out.print("value of x : "+x);
	
	out.print("<br> "+ LocalDate.now());

%>

<br>

<!-- Jsp Expression -->
<%= x  %>

<!-- Jsp Declaration -->

<%!

static String name;
 int eid;
 
 PageContext pageContext;
 
public void m1()throws IOException{

	JspWriter out =	pageContext.getOut();
	
		out.print("m1() is called...");

}




 %>




</body>
</html>