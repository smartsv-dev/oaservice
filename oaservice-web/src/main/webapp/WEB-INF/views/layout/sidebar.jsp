<!-- sidebar start -->
<div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
  <div class="am-offcanvas-bar admin-offcanvas-bar">
    <ul class="am-list admin-sidebar-list">
      <li><a href="#"><span class="am-icon-home"></span> HOME</a></li>
      <li class="admin-parent">
        <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 社員管理 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
        <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav">
          <li><a href="${pageContext.request.contextPath}/user/register" class="am-cf"><span class="am-icon-check"></span> 基本情報<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
          <li><a href="${pageContext.request.contextPath}/user/list"><span class="am-icon-puzzle-piece"></span> 社員リクエスト</a></li>
        </ul>
      </li>
      <li><a href="admin-table.html"><span class="am-icon-table"></span> 履歴書管理</a></li>
      <li><a href="#"><span class="am-icon-sign-out"></span> ログアウト</a></li>
    </ul>

    <div class="am-panel am-panel-default admin-sidebar-panel">
      <div class="am-panel-bd">
        <p><span class="am-icon-bookmark"></span> 会社理念</p>
        <p>技術とサービス精神スマートな会社を創ろう。—— Smartservice</p>
      </div>
    </div>

    <div class="am-panel am-panel-default admin-sidebar-panel">
      <div class="am-panel-bd">
        <p><span class="am-icon-tag"></span> メッセージ</p>
        <p>信用を守る、顧客満足度100％を目指す</p>
      </div>
    </div>
  </div>
</div>
<!-- sidebar end -->