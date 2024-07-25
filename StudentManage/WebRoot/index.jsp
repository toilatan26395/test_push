<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="StudentServlet" method="post">
        <label for="id">ID:</label>
        <input type="text" id="id" name="id"><br>
        
        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br>
        
        <label for="dob">DOB:</label>
        <input type="date" id="dob" name="dob"><br>
        
        <label for="department">Department:</label>
        <select id="department" name="department">
            <option value="Computer Science">Computer Science</option>
            <option value="Mechanical Engineering">Mechanical Engineering</option>
            <option value="Civil Engineering">Civil Engineering</option>
            <option value="Electrical Engineering">Electrical Engineering</option>
        </select><br>
        
        <label for="approved">Approved:</label>
        <input type="number" id="approved" name="approved"><br>
        
        <button type="submit" name="action" value="Add">Add</button>
        <button type="submit" name="action" value="Reset">Reset</button>
    </form>
</body>
</html>