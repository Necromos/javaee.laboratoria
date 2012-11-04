<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>pkrolik - test jsp - scope-request</title>
	</head>
	<body>
		<jsp:useBean id="txt" class="com.zadania.zadanie3.domain.JustText" scope="request" />
		<jsp:getProperty property="jt" name="txt" /> <%=request.getParameter("spt") %>
	</body>
</html>