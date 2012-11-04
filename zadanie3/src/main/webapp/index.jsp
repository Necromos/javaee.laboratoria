<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>pkrolik - test jsp - index</title>
	</head>
	<body>
		<form action="form.jsp" method="post">
			Nick: <input type="text" name="nick" /><br />
			Który z smakołyków jest najlepszy?:<br />
			<input type="radio" name="jd" value="ciastko" />Ciastko<br />
			<input type="radio" name="jd" value="karmel" />Karmel<br />
			<input type="radio" name="jd" value="czekolada" />Czekolada<br />
			<input type="radio" name="jd" value="paluszki" />Paluszki<br />
			Co posiadasz?:<br />
			<input type="checkbox" name="bel" value="samochód" />Samochód<br />
			<input type="checkbox" name="bel" value="namiot" />Namiot<br />
			<input type="checkbox" name="bel" value="ciężarówkę" />Ciężarówkę<br />
			<input type="checkbox" name="bel" value="patyk" />Patyk<br />
			<input type="submit" value="Wyślij" name="sub" />
		</form>
	</body>
</html>