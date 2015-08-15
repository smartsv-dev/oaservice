<div class="am-cf admin-main">
  <jsp:include page="../layout/sidebar.jsp"></jsp:include>
  <!-- content start -->
  <div class="admin-content">
  <form:form class="am-form"
      action="${pageContext.request.contextPath}/user/list" method="post"
      modelAttribute="userForm">
    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">社員一覧</strong></div>
    </div>

    <div class="am-g">
      <div class="am-u-sm-12 am-u-md-3">
        <div class="am-input-group am-input-group-sm">
          <form:input path="keywords" class="am-form-field" />
          <span class="am-input-group-btn">
            <form:button class="am-btn am-btn-default">搜索</form:button>
          </span>
        </div>
      </div>
    </div>

    <div class="am-g">
      <div class="am-u-sm-12">
          <table class="am-table am-table-striped am-table-hover table-main">
            <thead>
              <tr>
                <th class="table-id">No</th>
                <th class="table-title">名前</th>
                <th class="table-type">メール</th>
                <th class="table-author am-hide-sm-only">携帯</th>
                <th class="table-date am-hide-sm-only">入社日</th>
                <th class="table-date am-hide-sm-only">契約状態</th>
                <th class="table-set">操作</th>
              </tr>
          </thead>
          <tbody>
          <c:forEach items="${page.content}" var="userInfo">
            <tr>
              <td>${userInfo.userId }</td>
              <td><a href="#">${userInfo.nameKanji }</a></td>
              <td>${userInfo.email }</td>
              <td class="am-hide-sm-only">${userInfo.telNo }</td>
              <td class="am-hide-sm-only">
                  <fmt:parseDate var="joinedDate" value="${userInfo.joinedDate }" pattern="yyyyMMdd" />
                  <fmt:formatDate value="${joinedDate }" pattern="yyyy/MM/dd"/></td>
              <td class="am-hide-sm-only">
                  <c:if test="${userInfo.kykType == '1' }">
                      <spring:message code="label.oa.user.contractTypePr" />
                  </c:if>
                  <c:if test="${userInfo.kykType == '2' }">
                      <spring:message code="label.oa.user.contractTypeBp" />
                  </c:if>
              </td>
              <td>
                <div class="am-btn-toolbar">
                  <div class="am-btn-group am-btn-group-xs">
                    <button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span> 编辑</button>
                 </div>
                </div>
              </td>
            </tr>
          </c:forEach>
          </tbody>
        </table>
        <div class="am-cf">共 ${page.totalElements }条记录
            <div class="am-fr">
            <t:pagination page="${page}"
                          outerElement="ul"
                          outerElementClass="am-pagination"
                          innerElement="li"
                          disabledClass="am-disabled"
                          activeClass="am-active"
                          maxDisplayCount="5"
                          disabledHref="#"
                          enableLinkOfCurrentPage="false"
                          criteriaQuery="keywords=${f:h(userForm.keywords)}" />
            </div>
        </div>
        <hr />
        <p>注：.....</p>
      </div>
    </div>
  </form:form>
  </div>
  <!-- content end -->
</div>
<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>