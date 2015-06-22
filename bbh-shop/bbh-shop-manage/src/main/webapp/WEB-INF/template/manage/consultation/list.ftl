<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.consultation.list")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/list.js"></script>
<script type="text/javascript">
$().ready(function() {
	
	[@flash_message /]

});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.consultation.list")} <span>(${message("manage.page.total", page.total)})</span>
	</div>
	<form id="listForm" action="list.do" method="get">
		<input type="hidden" id="type" name="type" value="${type}" />
		<div class="bar">
			<div class="buttonWrap">
				<a href="javascript:;" id="deleteButton" class="iconButton disabled">
					<span class="deleteIcon">&nbsp;</span>${message("manage.common.delete")}
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
							<a href="javascript:;"[#if page.searchProperty == "content"] class="current"[/#if] val="content">${message("Consultation.content")}</a>
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
					<a href="javascript:;" class="sort" name="product">${message("Consultation.product")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="content">${message("Consultation.content")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="member">${message("Consultation.member")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="isShow">${message("Consultation.isShow")}</a>
				</th>
				<th>
					<span>${message("manage.consultation.isReply")}</span>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="createDate">${message("manage.common.createDate")}</a>
				</th>
				<th>
					<span>${message("manage.common.handle")}</span>
				</th>
			</tr>
			[#list page.content as consultation]
				<tr>
					<td>
						<input type="checkbox" name="ids" value="${consultation.id}" />
					</td>
					<td>
						<a href="${base}${consultation.product.path}" title="${consultation.product.name}" target="_blank">${abbreviate(consultation.product.name, 50, "...")}</a>
					</td>
					<td>
						<span title="${consultation.content}">${abbreviate(consultation.content, 50, "...")}</span>
					</td>
					<td>
						[#if consultation.member??]
							${consultation.member.username}
						[#else]
							${message("manage.consultation.anonymous")}
						[/#if]
					</td>
					<td>
						<span class="${consultation.isShow?string("true", "false")}Icon">&nbsp;</span>
					</td>
					<td>
						<span class="${consultation.replyConsultations?has_content?string("true", "false")}Icon">&nbsp;</span>
					</td>
					<td>
						<span title="${consultation.createDate?string("yyyy-MM-dd HH:mm:ss")}">${consultation.createDate}</span>
					</td>
					<td>
						<a href="reply.do?id=${consultation.id}">[${message("manage.consultation.reply")}]</a>
						<a href="edit.do?id=${consultation.id}">[${message("manage.common.edit")}]</a>
						<a href="${base}${consultation.path}" target="_blank">[${message("manage.common.view")}]</a>
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