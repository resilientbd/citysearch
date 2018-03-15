	<%@ page import="java.sql.*" %>
<%
String n=request.getParameter("val");

try{
DriverManager.registerDriver(new com.mysql.jdbc.Driver());
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bnlivein_lict","bnlivein_lict","java@1234");

PreparedStatement ps=con.prepareStatement("select * from city1_user where name=?");
ps.setString(1,n);
ResultSet rs=ps.executeQuery();
boolean status=rs.next();

if(status)
out.println("Invalid user! userName already exists");
else
out.println("Valid user");

con.close();
}catch(Exception e){e.printStackTrace();}

%>