<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE></TITLE>
<META http-equiv=Content-Type content="text/html; charset=utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
<STYLE type=text/css> 
{
	FONT-SIZE: 12px
}
.gridView {
	BORDER-RIGHT: #bad6ec 1px; BORDER-TOP: #bad6ec 1px; BORDER-LEFT: #bad6ec 1px; COLOR: #566984; BORDER-BOTTOM: #bad6ec 1px; FONT-FAMILY: Courier New
}
.gridViewHeader {
	BORDER-RIGHT: #bad6ec 1px solid; BORDER-TOP: #bad6ec 1px solid; BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/bg_th.gif); BORDER-LEFT: #bad6ec 1px solid; LINE-HEIGHT: 27px; BORDER-BOTTOM: #bad6ec 1px solid
}
.gridViewItem {
	BORDER-RIGHT: #bad6ec 1px solid; BORDER-TOP: #bad6ec 1px solid; BORDER-LEFT: #bad6ec 1px solid; LINE-HEIGHT: 32px; BORDER-BOTTOM: #bad6ec 1px solid; TEXT-ALIGN: center; 
}
.cmdField {
	BORDER-RIGHT: 0px; BORDER-TOP: 0px; BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/bg_rectbtn.png); OVERFLOW: hidden; BORDER-LEFT: 0px; WIDTH: 67px; COLOR: #364c6d; LINE-HEIGHT: 27px; BORDER-BOTTOM: 0px; BACKGROUND-REPEAT: repeat-x; HEIGHT: 27px; BACKGROUND-COLOR: transparent; TEXT-DECORATION: none
}
.buttonBlue {
	BORDER-RIGHT: 0px; BORDER-TOP: 0px; BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/bg_button_blue.gif); BORDER-LEFT: 0px; WIDTH: 78px; COLOR: white; BORDER-BOTTOM: 0px; BACKGROUND-REPEAT: repeat-x; HEIGHT: 21px;text-align: center;TEXT-DECORATION: none;BACKGROUND-COLOR: transparent; OVERFLOW: hidden;
}
</STYLE>
<META content="MSHTML 6.00.2900.5848" name=GENERATOR>
</HEAD>
<BODY 
style="BACKGROUND-POSITION-Y: -120px; BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/bg.gif); BACKGROUND-REPEAT: repeat-x">
<SCRIPT type=text/javascript>
//<![CDATA[
var theForm = document.forms['aspnetForm'];
if (!theForm) {
    theForm = document.aspnetForm;
}
function __doPostBack(eventTarget, eventArgument) {
    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
        theForm.__EVENTTARGET.value = eventTarget;
        theForm.__EVENTARGUMENT.value = eventArgument;
        theForm.submit();
    }
}
//]]>
</SCRIPT>
<DIV>
  <TABLE height="100%" cellSpacing=0 cellPadding=0 width="100%" border=0>
    <TBODY>
      <TR 
  style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/bg_header.gif); BACKGROUND-REPEAT: repeat-x" 
  height=47>
        <TD width=10><SPAN 
      style="FLOAT: left; BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/main_hl.gif); WIDTH: 15px; BACKGROUND-REPEAT: no-repeat; HEIGHT: 47px"></SPAN></TD>
        <TD><SPAN 
      style="FLOAT: left; BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/main_hl2.gif); WIDTH: 15px; BACKGROUND-REPEAT: no-repeat; HEIGHT: 47px"></SPAN><SPAN 
      style="PADDING-RIGHT: 10px; PADDING-LEFT: 10px; FLOAT: left; BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/main_hb.gif); PADDING-BOTTOM: 10px; COLOR: white; PADDING-TOP: 10px; BACKGROUND-REPEAT: repeat-x; HEIGHT: 47px; TEXT-ALIGN: center; 0px: ">新闻管理 </SPAN><SPAN 
      style="FLOAT: left; BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/main_hr.gif); WIDTH: 60px; BACKGROUND-REPEAT: no-repeat; HEIGHT: 47px"></SPAN></TD>
        <TD 
    style="BACKGROUND-POSITION: 50% bottom; BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/main_rc.gif)" 
    width=10></TD>
      </TR>
      <TR>
        <TD style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/main_ls.gif)">&nbsp;</TD>
        <TD 
    style="PADDING-RIGHT: 10px; PADDING-LEFT: 10px; PADDING-BOTTOM: 10px; COLOR: #566984; PADDING-TOP: 10px; BACKGROUND-COLOR: white" 
    vAlign=top align=middle>
          <DIV>
          	<s:if test="page.results.size()!=0">
            <TABLE class=gridView id=ctl00_ContentPlaceHolder2_GridView1 
      style="WIDTH: 100%; BORDER-COLLAPSE: collapse" cellSpacing=0 rules=all 
      border=1>
              <TBODY>
                <TR>
                  <TH class=gridViewHeader scope=col>编号</TH>
                  <TH class=gridViewHeader scope=col>新闻标题</TH>
                  <TH class=gridViewHeader scope=col>新闻内容</TH>
                  <TH class=gridViewHeader scope=col>详细类别</TH>
                  <TH class=gridviewHeader scope=col>发布时间</TH>
                  <TH class=gridviewHeader scope=col>查看</TH>
                  <TH class=gridviewHeader scope=col>更新</TH>
                  <TH class=gridviewHeader scope=col>删除</TH>
                </TR>
                <s:iterator value="page.results" var="news">
	                <TR>
	                  <TD class=gridViewItem><s:property value="#news.nid"/></TD>
	                  <TD class=gridViewItem>
							<s:a action="news!newsInfor.action" namespace="/">
		    					<s:if test="#news.title.length()>8">
		    						<s:property value="#news.title.substring(0,8)"/>
		    					</s:if>
		    					<s:else>
		    						<s:property value="#news.title"/>
		    					</s:else>
		    					<s:param name="news.nid"><s:property value="#news.nid"/></s:param>
		    				</s:a>
						</TD>
	                  <TD class=gridViewItem>
	                  	<s:if test="#news.content.length()>8">
	    						<s:property value="#news.content.substring(0,8)"/>
	    					</s:if>
	    					<s:else>
	    						<s:property value="#news.content"/>
	    					</s:else>
	                  </TD>
	                  <TD class=gridViewItem><s:property value="#news.category.cname"/></TD>
	                  <TD class=gridViewItem><s:date name="#news.createtime" format="yyyy-MM-dd  HH:mm"/></TD>
	                  <TD class=gridViewItem>
	                  <s:a action="news!newsInfor.action" namespace="/" cssClass="cmdField">查看详情
	                  	<s:param name="news.nid"><s:property value="#news.nid"/></s:param>
	                  </s:a>
	                 </TD>
	                  <TD class=gridViewItem>
	                  	<s:a action="news!newsEdit" namespace="/" cssClass="cmdField" onclick="return confirm('确定要编辑吗？');">编辑
								<s:param name="news.nid"><s:property value="#news.nid"/></s:param>
								<s:param name="topid"><s:property value="#session.topid"/></s:param>
						</s:a>
	            		</TD>
	                  <TD class=gridViewItem>
	                  	<s:a action="news!newsDelete" namespace="/" cssClass="cmdField" onclick="return confirm('确定要删除吗？');">删除
								<s:param name="news.nid"><s:property value="#news.nid"/></s:param>
								<s:param name="topid"><s:property value="#session.topid"/></s:param>
							</s:a>
	                	</TD>
	                </TR>
                </s:iterator>
                <tr>
                	<TD class=gridViewItem style="WIDTH: 50px"></TD>
                	<TD class=gridViewItem>
                		<s:a action="news.action" namespace="/" cssClass="buttonBlue">第一页
	    					<s:param name="page.no">1</s:param>
	    					<s:param name="topid"><s:property value="#session.topid"/></s:param>
	    				</s:a>
                	</TD>
                	<TD class=gridViewItem colspan="2">第<s:property value="page.no"/>页&nbsp;/&nbsp;共<s:property value="page.count"/>页</TD>
                	<TD class=gridViewItem></TD>
                	<TD class=gridViewItem>
		                <s:a action="news.action" namespace="/" cssClass="buttonBlue">上一页
		    				<s:param name="page.no"><s:property value="page.no-1"/></s:param>
		    				<s:param name="topid"><s:property value="#session.topid"/></s:param>
		    			</s:a>
                	</TD>
                	<TD class=gridViewItem>
                		<s:a action="news.action" namespace="/" cssClass="buttonBlue">下一页
			    			<s:param name="page.no"><s:property value="page.no+1"/></s:param>
			    			<s:param name="topid"><s:property value="#session.topid"/></s:param>
			    		</s:a>
    				</TD>
                	<TD class=gridViewItem>
                		 <s:a action="news.action" namespace="/" cssClass="buttonBlue">最后一页
			    			<s:param name="page.no"><s:property value="page.count"/></s:param>
			    			<s:param name="topid"><s:property value="#session.topid"/></s:param>
    					</s:a>
                	</TD>
                </tr>
              </TBODY>
            </TABLE>
          	</s:if>
    		<s:else>
    		还没有新闻
    	</s:else>
          </DIV>
        </TD>
        <TD style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/main_rs.gif)"></TD>
      </TR>
      <TR 
  style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/main_fs.gif); BACKGROUND-REPEAT: repeat-x" 
  height=10>
        <TD style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/main_lf.gif)"></TD>
        <TD style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/main_fs.gif)"></TD>
        <TD 
style="BACKGROUND-IMAGE: url(${pageContext.request.contextPath}/images/main_rf.gif)"></TD>
      </TR>
    </TBODY>
  </TABLE>
</DIV>
<SCRIPT type=text/javascript>Sys.Application.initialize();
</SCRIPT>
</BODY>
</HTML>
