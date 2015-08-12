<div class="row">
<form:form
    action="${pageContext.request.contextPath}/todo/list"
    method="post" modelAttribute="todoForm">
    <div class="span12">
        <fieldset>
             <legend>TODO LIST</legend>
             <form:input path="todoTitle" />
             <form:errors path="todoTitle"/>
             <span class="help-block">这里填写信息.</span>
             <form:button name="create" cssclass="btn">提交</form:button>
        </fieldset>
    </div>
    <br>
    <div><t:messagesPanel/></div>
    <div class="span12">
        <table class="table table-bordered table-hover">
            <thead>
                <tr>
                    <th width="70%">内容</th>
                    <th width="30%">操作</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${page.content}" var="todo">
                <tr>
                    <td>
                        <c:choose>
                            <c:when test="${todo.finished}">
                                <span class="strike">
                                ${f:h(todo.todoTitle)}
                                </span>
                            </c:when>
                            <c:otherwise>
                                ${f:h(todo.todoTitle)}
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td>
                        <c:if test="${todo.finished != true}">
                            <form:form
                                action="${pageContext.request.contextPath }/todo/list"
                                method="post" modelAttribute="todoForm" cssStyle="display: inline-block;">
                                <form:hidden path="todoId" value="${f:h(todo.todoId) }" />
                                <form:button name="finish" cssclass="btn">Finish</form:button>
                            </form:form>
                        </c:if>
                        <form:form
                            action="${pageContext.request.contextPath}/todo/list"
                            method="post" modelAttribute="todoForm"
                            cssStyle="display: inline-block;">
                            <form:hidden path="todoId"
                                value="${f:h(todo.todoId)}" />
                            <form:button name="delete" cssclass="btn">Delete</form:button>
                        </form:form>
                    </td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <nav class="nav-centered">
    <t:pagination page="${page}"
                  outerElementClass="pagination"
                  maxDisplayCount="5"
                  disabledHref="#"
                  enableLinkOfCurrentPage="false"/>
    </nav>

    <input name="page" type="hidden" value="${page.number }" />
    <input name="size" type="hidden" value="${page.size }" />
</form:form>
</div>