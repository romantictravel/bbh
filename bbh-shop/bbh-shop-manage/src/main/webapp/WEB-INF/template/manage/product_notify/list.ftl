<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.productNotify.list")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/list.js"></script>
<script type="text/javascript">
$().ready(function() {
	
	var $listForm = $("#listForm");
	var $selectAll = $("#selectAll");
	var $ids = $("#listTable input[name='ids']");
	var $sendButton = $("#sendButton");
	var $filterSelect = $("#filterSelect");
	var $filterOption = $("#filterOption a");
	
	[@flash_message /]
	
	// 发送到货通知
	$sendButton.click(function() {
		if ($sendButton.hasClass("disabled")) {
			return false;
		}
		var $checkedIds = $ids.filter(":enabled:checked");
		$.dialog({
			type: "warn",
			content: "${message("manage.productNofity.sendConfirm")}",
			ok: "${message("manage.dialog.ok")}",
			cancel: "${message("manage.dialog.cancel")}",
			onOk: function() {
				$.ajax({
					url: "send.do",
					type: "POST",
					data: $checkedIds.serialize(),
					dataType: "json",
					cache: false,
					success: function(message) {
						$.message(message);
						if (message.type == "success") {
							$checkedIds.closest("td").siblings(".hasSent").html('<span title="${message("manage.productNotify.hasSent")}" class="trueIcon">&nbsp;<\/span>');
						}
					}
				});
			}
		});
	});
	
	// 全选
	$selectAll.click(function() {
		var $this = $(this);
		var $enabledIds = $ids.filter(":enabled");
		if ($this.prop("checked")) {
			if ($enabledIds.filter(":checked").size() > 0) {
				$sendButton.removeClass("disabled");
			} else {
				$sendButton.addClass("disabled");
			}
		} else {
			$sendButton.addClass("disabled");
		}
	});
	
	// 选择
	$ids.click(function() {
		var $this = $(this);
		if ($this.prop("checked")) {
			$sendButton.removeClass("disabled");
		} else {
			if ($ids.filter(":enabled:checked").size() > 0) {
				$sendButton.removeClass("disabled");
			} else {
				$sendButton.addClass("disabled");
			}
		}
	});
	
	// 到货通知筛选
	$filterSelect.mouseover(function() {
		var $this = $(this);
		var offset = $this.offset();
		var $menuWrap = $this.closest("div.menuWrap");
		var $popupMenu = $menuWrap.children("div.popupMenu");
		$popupMenu.css({left: offset.left, top: offset.top + $this.height() + 2}).show();
		$menuWrap.mouseleave(function() {
			$popupMenu.hide();
		});
	});
	
	// 到货通知筛选
	$filterOption.click(function() {
		var $this = $(this);
		var $dest = $("#" + $this.attr("name"));
		if ($this.hasClass("checked")) {
			$dest.val("");
		} else {
			$dest.val($this.attr("val"));
		}
		$listForm.submit();
		return false;
	});
	
});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.productNotify.list")} <span>(${message("manage.page.total", page.total)})</span>
	</div>
	<form id="listForm" action="list.do" method="get">
		<input type="hidden" id="isMarketable" name="isMarketable" value="[#if isMarketable??]${isMarketable?string("true", "false")}[/#if]" />
		<input type="hidden" id="isOutOfStock" name="isOutOfStock" value="[#if isOutOfStock??]${isOutOfStock?string("true", "false")}[/#if]" />
		<input type="hidden" id="hasSent" name="hasSent" value="[#if hasSent??]${hasSent?string("true", "false")}[/#if]" />
		<div class="bar">
			<div class="buttonWrap">
				<a href="javascript:;" id="sendButton" class="button disabled">
					${message("manage.productNotify.send")}
				</a>
				<a href="javascript:;" id="deleteButton" class="iconButton disabled">
					<span class="deleteIcon">&nbsp;</span>${message("manage.common.delete")}
				</a>
				<a href="javascript:;" id="refreshButton" class="iconButton">
					<span class="refreshIcon">&nbsp;</span>${message("manage.common.refresh")}
				</a>
				<div class="menuWrap">
					<a href="javascript:;" id="filterSelect" class="button">
						${message("manage.productNotify.filter")}<span class="arrow">&nbsp;</span>
					</a>
					<div class="popupMenu">
						<ul id="filterOption" class="check">
							<li>
								<a href="javascript:;" name="isMarketable" [#if isMarketable] class="checked"[/#if] val="true">${message("manage.productNotify.marketable")}</a>
							</li>
							<li>
								<a href="javascript:;" name="isMarketable" [#if isMarketable?? && !isMarketable] class="checked"[/#if] val="false">${message("manage.productNotify.notMarketable")}</a>
							</li>
							<li class="separator">
								<a href="javascript:;" name="isOutOfStock" [#if isOutOfStock] class="checked"[/#if] val="true">${message("manage.productNotify.outOfStock")}</a>
							</li>
							<li>
								<a href="javascript:;" name="isOutOfStock" [#if isOutOfStock?? && !isOutOfStock] class="checked"[/#if] val="false">${message("manage.productNotify.inStock")}</a>
							</li>
							<li class="separator">
								<a href="javascript:;" name="hasSent" [#if hasSent] class="checked"[/#if] val="true">${message("manage.productNotify.hasSent")}</a>
							</li>
							<li>
								<a href="javascript:;" name="hasSent" [#if hasSent?? && !hasSent] class="checked"[/#if] val="false">${message("manage.productNotify.hasNotSent")}</a>
							</li>
						</ul>
					</div>
				</div>
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
							<a href="javascript:;"[#if page.searchProperty == "email"] class="current"[/#if] val="email">${message("ProductNotify.email")}</a>
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
					<span>${message("manage.productNotify.productName")}</span>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="member">${message("ProductNotify.member")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="email">${message("ProductNotify.email")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="createDate">${message("manage.productNotify.createDate")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="modifyDate">${message("manage.productNotify.notifyDate")}</a>
				</th>
				<th>
					<span>${message("manage.productNotify.status")}</span>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="hasSent">${message("manage.productNotify.hasSent")}</a>
				</th>
			</tr>
			[#list page.content as productNotify]
				<tr>
					<td>
						<input type="checkbox" name="ids" value="${productNotify.id}" />
					</td>
					<td>
						<a href="${base}${productNotify.product.path}" title="${productNotify.product.fullName}" target="_blank">${abbreviate(productNotify.product.fullName, 50, "...")}</a>
					</td>
					<td>
						[#if productNotify.member??]
							<a href="${base}/manage/member/view.do?id=${productNotify.member.id}">${productNotify.member.username}</a>
						[#else]
							-
						[/#if]
					</td>
					<td>
						${productNotify.email}
					</td>
					<td>
						<span title="${productNotify.createDate?string("yyyy-MM-dd HH:mm:ss")}">${productNotify.createDate}</span>
					</td>
					<td>
						[#if productNotify.hasSent]
							<span title="${productNotify.modifyDate?string("yyyy-MM-dd HH:mm:ss")}">${productNotify.modifyDate}</span>
						[#else]
							-
						[/#if]
					</td>
					<td>
						[#if productNotify.product.isMarketable]
							<span class="green">${message("manage.productNotify.marketable")}</span>
						[#else]
							${message("manage.productNotify.notMarketable")}
						[/#if]
						[#if productNotify.product.isOutOfStock]
							${message("manage.productNotify.outOfStock")}
						[#else]
							<span class="green">${message("manage.productNotify.inStock")}</span>
						[/#if]
					</td>
					<td class="hasSent">
						<span title="${productNotify.hasSent?string(message("manage.productNotify.hasSent"), message("manage.productNotify.hasNotSent"))}" class="${productNotify.hasSent?string("true", "false")}Icon">&nbsp;</span>
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