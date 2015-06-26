<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.purchaseRanking.list")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/list.js"></script>
<script type="text/javascript" src="${base}/resources/manage/datePicker/WdatePicker.js"></script>
<script type="text/javascript">
$().ready(function() {
	
	var $listForm = $("#listForm");
	var $count = $("#count");
	var $countSelect = $("#countSelect");
	var $countOption = $("#countOption a");
	
	[@flash_message /]
	
	// 显示数量
	$countSelect.mouseover(function() {
		var $this = $(this);
		var offset = $this.offset();
		var $menuWrap = $this.closest("div.menuWrap");
		var $popupMenu = $menuWrap.children("div.popupMenu");
		$popupMenu.css({left: offset.left, top: offset.top + $this.height() + 2}).show();
		$menuWrap.mouseleave(function() {
			$popupMenu.hide();
		});
	});
	
	// 显示数量
	$countOption.click(function() {
		var $this = $(this);
		if ($this.hasClass("checked")) {
			$count.val("");
		} else {
			$count.val($this.attr("val"));
		}
		$listForm.submit();
		return false;
	});
	
});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.purchaseRanking.list")}
	</div>
	<form id="listForm" action="list.do" method="get">
		<input type="hidden" id="count" name="count" value="${count}" />
		<div class="bar">
			<div class="buttonWrap">
				<a href="javascript:;" id="refreshButton" class="iconButton">
					<span class="refreshIcon">&nbsp;</span>${message("manage.common.refresh")}
				</a>
				<div class="menuWrap">
					<a href="javascript:;" id="countSelect" class="button">
						${message("manage.purchaseRanking.count")}<span class="arrow">&nbsp;</span>
					</a>
					<div class="popupMenu">
						<ul id="countOption">
							<li>
								<a href="javascript:;"[#if count == 10] class="current"[/#if] val="10">10</a>
							</li>
							<li>
								<a href="javascript:;"[#if count == 20] class="current"[/#if] val="20">20</a>
							</li>
							<li>
								<a href="javascript:;"[#if count == 50] class="current"[/#if] val="50">50</a>
							</li>
							<li>
								<a href="javascript:;"[#if count == 100] class="current"[/#if] val="100">100</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			${message("manage.purchaseRanking.beginDate")}: <input type="text" id="beginDate" name="beginDate" class="text Wdate" value="${(beginDate?string('yyyy-MM-dd'))!}" onfocus="WdatePicker({maxDate: '#F{$dp.$D(\'endDate\')}'});" />
			${message("manage.purchaseRanking.endDate")}: <input type="text" id="endDate" name="endDate" class="text Wdate" value="${(endDate?string('yyyy-MM-dd'))!}" onfocus="WdatePicker({minDate: '#F{$dp.$D(\'beginDate\')}'});" />
			<input type="submit" class="button" value="${message("manage.common.submit")}" />
		</div>
		<table id="listTable" class="list">
			<tr>
				<th>
					<span>${message("manage.purchaseRanking.rank")}</span>
				</th>
				<th>
					<span>${message("manage.purchaseRanking.memberUsername")}</span>
				</th>
				<th>
					<span>${message("manage.purchaseRanking.memberEmail")}</span>
				</th>
				<th>
					<span>${message("manage.purchaseRanking.amount")}</span>
				</th>
			</tr>
			[#list data as row]
				<tr>
					<td>
						${row_index + 1}
					</td>
					<td>
						${row[1]}
					</td>
					<td>
						${row[2]}
					</td>
					<td>
						${currency(row[6], true)}
					</td>
				</tr>
			[/#list]
		</table>
	</form>
</body>
</html>