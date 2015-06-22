<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.ad.list")}</title>


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
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.ad.list")} <span>(${message("manage.page.total", page.total)})</span>
	</div>
	<form id="listForm" action="list.do" method="get">
		<div class="bar">
			<a href="add.do" class="iconButton">
				<span class="addIcon">&nbsp;</span>${message("manage.common.add")}
			</a>
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
							<a href="javascript:;"[#if page.searchProperty == "title"] class="current"[/#if] val="title">${message("Ad.title")}</a>
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
					<a href="javascript:;" class="sort" name="title">${message("Ad.title")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="adPosition">${message("Ad.adPosition")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="type">${message("Ad.type")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="beginDate">${message("Ad.beginDate")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="endDate">${message("Ad.endDate")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="order">${message("manage.common.order")}</a>
				</th>
				<th>
					<span>${message("manage.common.handle")}</span>
				</th>
			</tr>
			[#list page.content as ad]
				<tr>
					<td>
						<input type="checkbox" name="ids" value="${ad.id}" />
					</td>
					<td>
						<span title="${ad.title}">${abbreviate(ad.title, 50, "...")}</span>
					</td>
					<td>
						${ad.adPosition.name}
					</td>
					<td>
						${message("Ad.Type." + ad.type)}
					</td>
					<td>
						[#if ad.beginDate??]
							<span title="${ad.beginDate?string("yyyy-MM-dd HH:mm:ss")}">${ad.beginDate}</span>
						[#else]
							-
						[/#if]
					</td>
					<td>
						[#if ad.endDate??]
							<span title="${ad.endDate?string("yyyy-MM-dd HH:mm:ss")}">${ad.endDate}</span>
						[#else]
							-
						[/#if]
					</td>
					<td>
						${ad.order}
					</td>
					<td>
						<a href="edit.do?id=${ad.id}">[${message("manage.common.edit")}]</a>
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