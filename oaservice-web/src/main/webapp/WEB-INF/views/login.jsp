<c:if test="${param.error}">
    <t:messagesPanel
        messagesAttributeName="SPRING_SECURITY_LAST_EXCEPTION"/>
</c:if>
<form:form action="${pageContext.request.contextPath}/authentication" method="post">
    <!-- omitted -->
    <input type="text" id="username" name="j_username">
    <input type="password" id="password" name="j_password">
    <input type="submit" value="Login">
    <label for="remember_me">Remember Me : </label>
    <input name="remember_me" id="remember_me" type="checkbox" checked="checked">
    <input type="submit" value="LOGIN">
    <!-- omitted -->
</form:form>