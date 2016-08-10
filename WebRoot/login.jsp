<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE>登陆</TITLE>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
<LINK 
href="images/public.css" type=text/css rel=stylesheet>
<LINK 
href="images/login.css" type=text/css rel=stylesheet>
<STYLE type=text/css>
</STYLE>
<script type="text/javascript">
	var message = document.getElementsByName("sign");
	alert(message.getAttrbute("value"));
</script>
<META content="MSHTML 6.00.2900.5848" name=GENERATOR>
</HEAD>
<BODY>
 <s:hidden value="errorsdghhsd" name="sign"></s:hidden>
<DIV id=div1>
  <TABLE id=login height="100%" cellSpacing=0 cellPadding=0 width=800 
align=center>
    <TBODY>
      <TR id=main>
        <TD>
       
        <form action="${pageContext.request.contextPath}/manager!login.action">
          <TABLE height="100%" cellSpacing=0 cellPadding=0 width="100%">
            <TBODY>
              <TR>
                <TD colSpan=4>&nbsp;</TD>
              </TR>
              <TR height=30>
                <TD width=380>&nbsp;</TD>
                <TD>&nbsp;</TD>
                <TD>&nbsp;</TD>
                <TD>&nbsp;</TD>
              </TR>
              <TR height=40>
                <TD rowSpan=4>&nbsp;</TD>
                <TD>用户名：</TD>
                <TD>
                  <INPUT class=textbox id=txtUserName name="manager.account">
                </TD>
                <TD width=120>&nbsp;</TD>
              </TR>
              <TR height=40>
                <TD>密　码：</TD>
                <TD>
                  <INPUT class=textbox id=txtUserPassword type=password 
            name="manager.password">
                </TD>
                <TD width=120>&nbsp;</TD>
              </TR>
              <TR height=40>
                <TD>验证码：</TD>
                <TD vAlign=center colSpan=2>
                  <INPUT id=txtSN size=4 name="randomcode">
                  &nbsp; <IMG src="${pageContext.request.contextPath}/random.img" border=0> <A id=LinkButton1 
            href="${pageContext.request.contextPath}/login.jsp">不清楚，再来一张</A></TD>
              </TR>
              <TR height=40>
                <TD></TD>
                <TD align=right>
                  <INPUT id=btnLogin type=submit value=" 登 录 " name=btnLogin>
                </TD>
                <TD width=120>&nbsp;</TD>
              </TR>
              <TR height=110>
                <TD colSpan=4>&nbsp;</TD>
              </TR>
            </TBODY>
          </TABLE>
          </form>
        </TD>
      </TR>
      <TR id=root height=104>
        <TD>&nbsp;</TD>
      </TR>
    </TBODY>
  </TABLE>
</DIV>
<DIV id=div2 style="DISPLAY: none"></DIV>
</CONTENTTEMPLATE>
</BODY>
</HTML>
