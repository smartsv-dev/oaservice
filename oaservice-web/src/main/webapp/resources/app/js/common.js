/**
 * common.js
 */
/*
var contextPath = $("meta[name='contextPath']").attr("content");

// AJAX
<meta name="contextPath" content="${pageContext.request.contextPath}" />
// 実現例-1
function searchByFreeWord() {
    $.ajax(contextPath + "/ajax/search", {
        type : "GET",
        data : $("#searchForm").serialize(),
        dataType : "json",

    }).done(function(json) {
        // render search result
        // omitted

    }).fail(function(xhr) {
        // render error message
        // omitted

    });
    return false;
}

// 実現例-2
var contextPath = $("meta[name='contextPath']").attr("content");

var csrfToken = $("meta[name='_csrf']").attr("content");
var csrfHeaderName = $("meta[name='_csrf_header']").attr("content");
$(document).ajaxSend(function(event, xhr, options) {
    xhr.setRequestHeader(csrfHeaderName, csrfToken);
});

function plus() {
    $.ajax(contextPath + "/ajax/plusForForm", {
        type : "POST",
        data : $("#calculationForm").serialize(),
        dataType : "json"
    }).done(function(json) {
        $("#calculationResult").text(json.resultNumber);

    }).fail(function(xhr) {
        var messages = "";
        if(400 <= xhr.status && xhr.status <= 499){
            var contentType = xhr.getResponseHeader('Content-Type');
            if (contentType != null && contentType.indexOf("json") != -1) {
                json = $.parseJSON(xhr.responseText);
                $(json.errorResults).each(function(i, errorResult) {
                    messages += ("<div>" + errorResult.message + "</div>");
                });
            } else {
                messages = ("<div>" + xhr.statusText + "</div>");
            }
        }else{
            messages = ("<div>" + "System error occurred." + "</div>");
        }
        $("#calculationResult").html(messages);
    });

    return false;
}

// 実現例-3
function toJson($form) {
    var data = {};
    $($form.serializeArray()).each(function(i, v) {
        data[v.name] = v.value;
    });
    return JSON.stringify(data);
}

function plus() {

    $.ajax(contextPath + "/ajax/plusForJson", {
        type : "POST",
        contentType : "application/json;charset=utf-8", // (3)
        data : toJson($("#calculationForm")), // (2)
        dataType : "json",
        beforeSend : function(xhr) {
            xhr.setRequestHeader(csrfHeaderName, csrfToken);
        }

    }).done(function(json) {
        $("#calculationResult").text(json.resultNumber);

    }).fail(function(xhr) {
        $("#calculationResult").text("");

    });
    return false;
}

上記例では、Ajaxの通信処理、DOM操作処理(描画処理)、エラー処理を同じfunction内で行っているが、これらの処理は分離して実装することを推奨する。
*/