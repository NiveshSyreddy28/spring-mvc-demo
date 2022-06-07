<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
The student is confirmed :${student.firstName} ${student.lastName}
    <br><br>

Country: ${student.country}
<br><br>

Favourite Language: ${student.favouriteLanguage}
<br><br>

Operating Systems:
    <ul>
        <c:forEach var = "temp" items = "${student.operatingSystem}">
            <li> ${temp} </li>
        </c:forEach>
    <ul>
  </body>
  </html>