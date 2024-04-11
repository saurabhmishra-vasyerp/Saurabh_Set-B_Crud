<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Create Employee</h1>
<form:form method="post" action="/create-employee">
    <table>
        <tr>
            <td>Name: </td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Age: </td>
            <td><form:input path="age"/></td>
        </tr>
        <tr>
            <td>DOB: </td>
            <td><form:input path="dob"/></td>
        </tr>
        <tr>
            <td>Hobby: </td>
            <td><form:input path="hobby"/></td>
        </tr>
        
        <tr>
            <td>Phone: </td>
            <td><form:input path="phoneNumber"/></td>
        </tr>
        <tr>
            <td>Grade: </td>
            <td><form:input path="grade"/></td>
        </tr>
        <tr>
            <td>BloodGroup: </td>
            <td><form:input path="bloodGroup"/></td>
        </tr>
        
        <tr>
            <td></td>
            <td><input type="submit" value="Create"/></td>
        </tr>
    </table>
</form:form>
