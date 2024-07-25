package com.example;

import java.io.IOException;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if (action.equals("Add")) {
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String dob = request.getParameter("dob");
            String department = request.getParameter("department");
            int approved = Integer.parseInt(request.getParameter("approved"));
            
            Student student = new Student(id, name, dob, department, approved);
            request.setAttribute("student", student);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("confirmation.jsp");
            dispatcher.forward(request, response);
            
        } else if (action.equals("Reset")) {
            response.sendRedirect("index.jsp");
            
        } else if (action.equals("Confirm")) {
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String dob = request.getParameter("dob");
            String department = request.getParameter("department");
            int approved = Integer.parseInt(request.getParameter("approved"));
            Connection connection=null;
            try {
            	Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanage?useSSL=false", "root", "12345678");
                String query = "INSERT INTO studentmanage.student (id, name, dob, department, approved) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, id);
                statement.setString(2, name);
                statement.setDate(3, java.sql.Date.valueOf(dob));
                statement.setString(4, department);
                statement.setInt(5, approved);
                statement.executeUpdate();
                
                statement.close();
                connection.close();
                
                response.sendRedirect("index.jsp");
                
            }  catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        } else if (action.equals("Back")) {
            response.sendRedirect("index.jsp");
        }
    }
}
