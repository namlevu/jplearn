<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
  <title>JpLearn</title>
</head>
<body>
  <h2>Confirm User Information</h2>
  
  <table>
    <tr>
      <td></td>
      <td>${name}</td>
    </tr>
    <tr>
      <td>E-mail</td>
      <td>${email}</td>
    </tr>
    <tr>
      <td colspan = "2">
        <input type = "submit" value = "OK"/>
      </td>
    </tr>
  </table>
</body>
   
</html>