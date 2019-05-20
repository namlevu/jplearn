<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
  <title>JpLearn</title>
</head>
<body>
  <h2>Add User</h2>
  <form:form method = "POST" action = "/addUser">
    <table>
      <tr>
        <td><form:label path = "name">Name</form:label></td>
        <td><form:input path = "name" /></td>
      </tr>
      <tr>
        <td><form:label path = "email">E-mail</form:label></td>
        <td><form:input path = "email" /></td>
      </tr>
      <tr>
        <td><form:label path = "password">Password</form:label></td>
        <td><form:input path = "password" /></td>
      </tr>
      <tr>
        <td><form:label path = "confirmPassword">Confirm password</form:label></td>
        <td><form:input path = "confirmPassword" /></td>
      </tr>
      <tr>
        <td colspan = "2">
          <input type = "submit" value = "Submit"/>
        </td>
      </tr>
    </table>  
  </form:form>
</body>
   
</html>