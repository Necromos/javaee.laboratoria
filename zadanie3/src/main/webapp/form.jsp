<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>pkrolik - test jsp - form</title>
	</head>
	<body>
		Witaj <%=request.getParameter("nick") %>!<br />
		Czy to Ty lubisz<% for (String smak : request.getParameterValues("jd")) out.println(" " + smak);%> ?<br />
		Oraz posiadasz<% for (String pos : request.getParameterValues("bel")) out.println(" " + pos); %> ?
	</body>
</html>