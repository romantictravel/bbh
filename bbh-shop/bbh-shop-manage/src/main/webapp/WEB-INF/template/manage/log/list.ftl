<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.log.list")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/list.js"></script>
<script type="text/javascript">
$().ready(function() {
	
	var $clearButton = $("#clearButton");
	var $resultRow = $("#listTable tr:gt(0)");
	
	[@flash_message /]
	
	$clearButton.click(function() {
		var $this = $(this);
		$.dialog({
			type: "warn",
			content: "${message("manage.dialog.clearConfirm")}",
			onOk: function() {
				$.ajax({
					url: "clear.do",
					type: "POST",
					dataType: "json",
					cache: false,
					success: function(message) {
						if (message.type == "success") {
							$resultRow.remove();
						}
						$.message(message);
					}
				});
			}
		});
		return false;
	});
});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.log.list")} <span>(${message("manage.page.total", page.total)})</span>
	</div>
	<form id="listForm" action="list.do" method="get">
		<div class="bar">
			<div class="buttonWrap">
				<a href="javascript:;" id="deleteButton" class="iconButton disabled">
					<span class="deleteIcon">&nbsp;</span>${message("manage.common.delete")}
				</a>
				<a href="javascript:;" id="clearButton" class="iconButton">
					<span class="clearIcon">&nbsp;</span>${message("manage.common.clear")}
				</a>
				<a href="javascript:;" id="refreshButton" class="iconButton">
					<span class="refreshIcon">&nbsp;</span>${message("manage.common.refresh")}
				</a>
				<div class="menuWrap">
					<a href="javascript:;" id="pageSizeSelect" class="button">
						${message("manage.page.pageSize")}<span class="arrow">&nbsp;</span>
					</a>
					<div class="popupMenu">
						<ul id="pageSizeOption">
							<li>
								<a href="javascript:;"[#if page.pageSize == 10] class="current"[/#if] val="10">10</a>
							</li>
							<li>
								<a href="javascript:;"[#if page.pageSize == 20] class="current"[/#if] val="20">20</a>
							</li>
							<li>
								<a href="javascript:;"[#if page.pageSize == 50] class="current"[/#if] val="50">50</a>
							</li>
							<li>
								<a href="javascript:;"[#if page.pageSize == 100] class="current"[/#if] val="100">100</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="menuWrap">
				<div class="search">
					<span id="searchPropertySelect" class="arrow">&nbsp;</span>
					<input type="text" id="searchValue" name="searchValue" value="${page.searchValue}" maxlength="200" />
					<button type="submit">&nbsp;</button>
				</div>
				<div class="popupMenu">
					<ul id="searchPropertyOption">
						<li>
							<a href="javascript:;"[#if page.searchProperty == "operation"] class="current"[/#if] val="operation">${message("Log.operation")}</a>
						</li>
						<li>
							<a href="javascript:;"[#if page.searchProperty == "operator"] class="current"[/#if] val="operator">${message("Log.operator")}</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<table id="listTable" class="list">
			<tr>
				<th class="check">
					<input type="checkbox" id="selectAll" />
				</th>
				<th>
					<a href="javascript:;" class="sort" name="operation">${message("Log.operation")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="operator">${message("Log.operator")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="ip">${message("Log.ip")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="content">${message("Log.content")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="createDate">${message("manage.common.createDate")}</a>
				</th>
				<th>
					<span>${message("manage.common.handle")}</span>
				</th>
			</tr>
			[#list page.content as log]
				<tr>
					<td>
						<input type="checkbox" name="ids" value="${log.id}" />
					</td>
					<td>
						${log.operation}
					</td>
					<td>
						${log.operator}
					</td>
					<td>
						${log.ip}
					</td>
					<td>
						[#if log.content??]
							<span title="${log.content}">${abbreviate(log.content, 50, "...")}</span>
						[/#if]
					</td>
					<td>
						<span title="${log.createDate?string("yyyy-MM-dd HH:mm:ss")}">${log.createDate}</span>
					</td>
					<td>
						<a href="view.do?id=${log.id}">[${message("manage.common.view")}]</a>
					</td>
				</tr>
			[/#list]
		</table>
		[@pagination pageNumber = page.pageNumber totalPages = page.totalPages]
			[#include "/manage/include/pagination.ftl"]
		[/@pagination]
	</form>
</body>
</html>