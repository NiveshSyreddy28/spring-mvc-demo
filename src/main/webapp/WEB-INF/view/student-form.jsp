<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>

    <form:form action = "processForm" modelAttribute = "student">
        First name: <form:input path = "firstName" />
        <br><br>

        Last Name: <form:input path = "lastName" />
        <br><br>

        Country:
        <form:select path = "country">

            <form:options items = "${student.countryOptions}"/>

        </form:select>
        <br><br>

        Favourite Programming Language:
        Java <form:radiobutton path = "favouriteLanguage" value = "Java" />
        C# <form:radiobutton path = "favouriteLanguage" value = "C#" />
        PHP <form:radiobutton path = "favouriteLanguage" value = "PHP" />
        Ruby <form:radiobutton path = "favouriteLanguage" value = "Ruby" />

        <br><br>

        Operating Systems:
        Mac<form:checkbox path = "operatingSystem" value = "Mac OS" />
        Windows<form:checkbox path = "operatingSystem" value = "Windows" />
        Linux<form:checkbox path = "operatingSystem" value = "Linux" />

        <br><br>

        <input type="submit" value=" Submit" />
    </form:form>

  </body>
</html>