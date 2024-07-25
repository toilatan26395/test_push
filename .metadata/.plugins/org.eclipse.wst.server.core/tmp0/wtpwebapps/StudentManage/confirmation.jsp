<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Information</h2>
    <p>ID: ${student.id}</p>
    <p>Name: ${student.name}</p>
    <p>DOB: ${student.dob}</p>
    <p>Department: ${student.department}</p>
    <p>Approved: ${student.approved}</p>
    
    <form action="StudentServlet" method="post">
        <input type="hidden" name="id" value="${student.id}">
        <input type="hidden" name="name" value="${student.name}">
        <input type="hidden" name="dob" value="${student.dob}">
        <input type="hidden" name="department" value="${student.department}">
        <input type="hidden" name="approved" value="${student.approved}">
        
        <button type="submit" name="action" value="Confirm">Confirm</button>
        <button type="submit" name="action" value="Back">Back</button>
    </form>
</body>
</html>