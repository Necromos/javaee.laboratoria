<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>pkrolik - test jsp - index</title>
	</head>
	<body>
		<h4>Scope-page:</h4>
		<jsp:useBean id="stat" class="com.zadania.zadanie3.domain.Static" scope="page" />
		<% out.println(stat.getStat()); stat.statTrat();%>
		<h4>Scope-request:</h4>
		<jsp:useBean id="txt" class="com.zadania.zadanie3.domain.JustText" scope="request" />
		<jsp:setProperty property="jt" name="txt" value="Hello" />
		<%-- <jsp:forward page="scope.jsp" /> --%>
		<form action="scope.jsp" method="post">
			<input type="text" name="spt" />
			<input type="submit" name="sb" value="Sprawdź" />
		</form>
		<h4>Scope-session:</h4>
		<jsp:useBean id="msg" class="com.zadania.zadanie3.domain.Greet" scope="session" />
		<% msg.changeMsg(); out.println(msg.getMsg()); %>
		<h4>Scope-application:</h4>
		<jsp:useBean id="gcounter" class="com.zadania.zadanie3.domain.Counter" scope="application" />
		<p>Hit counter: <%  gcounter.incCounter(); out.println(gcounter.getCounter()); %></p>
		<h4>Form.jsp:</h4>
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