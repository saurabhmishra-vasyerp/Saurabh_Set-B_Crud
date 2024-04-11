<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Read Employees Data </h1>
     <table border="2" width="70%" cellpadding="2">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Age</th>
            <th>Grade</th>
            <th>DOB</th>
            <th>Gender</th>
            <th>Hobby</th>
            <th>Phone</th>
            <th>BloodGroup</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.age}</td>
                <td>${employee.grade}</td>
                <td>${employee.dob}</td>
                <td>${employee.gender}</td>
                <td>${employee.hobby}</td>
                <td>${employee.phoneNumber}</td>
                <td>${employee.bloodGroup}</td>
                <td><a href="/update-employee/${employee.id}">Update</a></td>
                <td><a href="/delete-employee/${employee.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table> 
<br/>
<a href="/create-employee">Create Employee Info</a>