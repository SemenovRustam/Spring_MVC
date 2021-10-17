<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCKTYPE html>
<html>


<body>

<h2>
    Dear Employee, Please Enter your details
</h2>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <br>
    <br>

    Surname<form:input path="surname"/>

    <br>
    <br>

    Salary<form:input path="salary"/>
    <br>
    <br>

    Department <form:select path="department">
   <form:options items="${employee.departmens}"/>
</form:select>
    <br>
    <br>

    Which   car do you want?

   <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>

    <br>
    <br>

    Foreign Laanguage (s)

    <form:checkboxes path="leanguages" items="${employee.list}"/>


    <input type="submit" value="OK">


</form:form>


</body>

</html>
