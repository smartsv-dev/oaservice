<div class="am-cf admin-main">
  <jsp:include page="../layout/sidebar.jsp"></jsp:include>
  <!-- content start -->
  <div class="admin-content">
    <div class="am-cf am-padding">
      <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">个人资料</strong> / <small>Personal information</small></div>
    </div>

    <hr/>

    <div class="am-g">

      <div class="am-u-sm-12 am-u-md-4 am-u-md-push-8">
        <div class="am-panel am-panel-default">
          <div class="am-panel-bd">
            <div class="am-g">
              <div class="am-u-md-4">
                <img class="am-img-circle am-img-thumbnail" src="http://s.amazeui.org/media/i/demos/bw-2014-06-19.jpg?imageView/1/w/200/h/200/q/80" alt=""/>
              </div>
              <div class="am-u-md-8">
                <p>你可以使用<a href="#">gravatar.com</a>提供的头像或者使用本地上传头像。 </p>
                <form class="am-form">
                  <div class="am-form-group">
                    <input type="file" id="user-pic">
                    <p class="am-form-help">请选择要上传的文件...</p>
                    <button type="button" class="am-btn am-btn-primary am-btn-xs">保存</button>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>

        <div class="am-panel am-panel-default">
          <div class="am-panel-bd">
            <div class="user-info">
              <p>情報完成度</p>
              <div class="am-progress am-progress-sm">
                <div class="am-progress-bar" style="width: 60%"></div>
              </div>
              <p class="user-info-order">基本情報、電子履歴書など</p>
            </div>
          </div>
        </div>
      </div>
      <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
        <label class="am-u-sm-3 "></label>
        <div class="am-u-sm-9">
          <t:messagesPanel panelClassName="am-alert" panelTypeClassPrefix="am-alert-" outerElement="" innerElement="p"/>
        </div>
      </div>
      <div class="am-u-sm-12 am-u-md-8 am-u-md-pull-4">
        <form:form class="am-form am-form-horizontal"
                   action="${pageContext.request.contextPath}/user/register"
                   method="post" modelAttribute="userForm">
          <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">社員番号 / No</label>
            <div class="am-u-sm-9">
              <form:input path="userId" id="user-name" readonly="true"/>
              <small>該当番号は変更できません。</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">名前（漢字）</label>
            <div class="am-u-sm-9">
              <form:input path="nameKanji" id="user-name" placeholder="名前（漢字）を入力下さい。" />
              <small><form:errors path="nameKanji" /></small>
              <small>フルネームを入力下さい。</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">名前（カタカナ）</label>
            <div class="am-u-sm-9">
              <form:input path="nameKatakana" id="user-name" placeholder="名前（カタカナ）を入力下さい。" />
              <small><form:errors path="nameKatakana" /></small>
              <small>カタカナを入力下さい。</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">性別</label>
            <div class="am-u-sm-9">
               <form:select path="gender" id="doc-select-1">
                 <form:options items="${CL_GENDER}" />
              </form:select>
              <small><form:errors path="gender" /></small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-email" class="am-u-sm-3 am-form-label">生年月日</label>
            <div class="am-u-sm-9">
              <form:input path="birthday" id="user-email" placeholder="生年月日を入力下さい。" />
              <small><form:errors path="birthday" /></small>
              <small>８桁日付を入力下さい。YYYYMMDD</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-email" class="am-u-sm-3 am-form-label">入社時間</label>
            <div class="am-u-sm-9">
              <form:input path="joinedDate" id="user-email" placeholder="入社日を入力下さい。" />
              <small><form:errors path="joinedDate" /></small>
              <small>８桁日付を入力下さい。YYYYMMDD</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-email" class="am-u-sm-3 am-form-label">E-mail</label>
            <div class="am-u-sm-9">
              <form:input path="email" id="user-email" placeholder="Emailを入力下さい。" />
              <small><form:errors path="email" /></small>
              <small>よく使っているメールを入力下さい。</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-phone" class="am-u-sm-3 am-form-label">現住所</label>
            <div class="am-u-sm-9">
              <form:input path="address" id="user-phone" placeholder="住所を入力下さい。" />
              <small><form:errors path="address" /></small>
              <small>詳しく住所を入力下さい。</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-phone" class="am-u-sm-3 am-form-label">携帯</label>
            <div class="am-u-sm-9">
              <form:input path="telNo" id="user-phone" placeholder="携帯番号を入力下さい。" />
              <small><form:errors path="telNo" /></small>
              <small>例：080-1111-2222</small>
            </div>
          </div>

          <div class="am-form-group">
            <label for="user-name" class="am-u-sm-3 am-form-label">契約タイプ</label>
            <div class="am-u-sm-9">
              <form:select path="kykType" id="doc-select-1">
                 <form:options items="${CL_CONTRACT_TYPE}" />
              </form:select>
              <small><form:errors path="kykType" /></small>
            </div>
          </div>

          <div class="am-form-group">
            <div class="am-u-sm-9 am-u-sm-push-3">
              <form:button name="save" class="am-btn am-btn-primary">保存修改</form:button>
            </div>
          </div>
        </form:form>
      </div>
    </div>
  </div>
  <!-- content end -->

</div>

<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>
