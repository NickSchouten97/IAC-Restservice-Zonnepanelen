<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Simple Jersey</title>
</head>
<body>
<form method="GET" action="rest/ZonnepaneelService" >
  <input name="zonkracht" type="number" />
  <input name="zonstand" type="number" />
  <input name="bewolkingkans" type="number"/>
  <input name="seizoen" type="string"/>
  <input type="submit"/>
</form>
</body>
</html>
