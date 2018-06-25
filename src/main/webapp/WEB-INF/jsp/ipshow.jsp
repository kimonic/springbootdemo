<%@ page import="java.util.Enumeration" %>
<html>
<header>
    <script type="text/javascript" src="http://pv.sohu.com/cityjson?ie=utf-8"></script>
    <script type="text/javascript">
        alert(returnCitySN.cip);
    </script>
</header>
<body>
<%
    out.println(request.getRemoteHost() + "<br>");
    out.println(request.getRemoteAddr() + "<br>");
    Enumeration<String> enumeration = request.getHeaderNames();
    while (enumeration.hasMoreElements()) {
        String headername = enumeration.nextElement();
        out.println(headername + "----" + request.getHeader(headername) + "<br>");
    }

%>
</body>
</html>