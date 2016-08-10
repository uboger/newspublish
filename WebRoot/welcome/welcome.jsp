<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table>
    	<s:if test="news1.size()!=0">
			<tr>
				<td>
					<table>
						<tr><td colspan="2"><s:property value=""/></td></tr>
						<tr><td></td><td></tr>
					</table>
				</td>
			</tr>
		</s:if>
		<s:else>
			nothing
		</s:else>
    </table>
  </body>
</html>
