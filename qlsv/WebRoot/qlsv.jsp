<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String formtitle="QUẢN LÝ THÔNG TIN SINH VIÊN";
		%>
		<h4><%= formtitle%></h4>
		<FORM method="post" action='svlSV'>
		Mã SV	<input type='text' name='parmasv' value=''><br> 
		Họ đệm SV:	<input type='text' name='parhodem' value=''><br> 
		Tên SV:	<input type='text' name='partensv' value=''><br> 
		Số điện thoại:<input type='text' name='partelsv' value=''><br>
		Email:<input type='text' name='paremailsv' value=''><br>
		<input type="submit" value='Lưu SV mới' name='btnSavesv'/>
		</FORM>
</body>
</html>