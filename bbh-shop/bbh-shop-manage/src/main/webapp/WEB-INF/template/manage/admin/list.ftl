<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.manage.list")}</title>


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
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.manage.list")} <span>(${message("manage.page.total", page.total)})</span>
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
							<a href="javascript:;"[#if page.searchProperty == "username"] class="current"[/#if] val="username">${message("Admin.username")}</a>
						</li>
						<li>
							<a href="javascript:;"[#if page.searchProperty == "email"] class="current"[/#if] val="email">${message("Admin.email")}</a>
						</li>
						<li>
							<a href="javascript:;"[#if page.searchProperty == "name"] class="current"[/#if] val="name">${message("Admin.name")}</a>
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
					<a href="javascript:;" class="sort" name="username">${message("Admin.username")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="email">${message("Admin.email")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="name">${message("Admin.name")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="department">${message("Admin.department")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="loginDate">${message("Admin.loginDate")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="loginIp">${message("Admin.loginIp")}</a>
				</th>
				<th>
					<span>${message("manage.manage.status")}</span>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="createDate">${message("manage.common.createDate")}</a>
				</th>
				<th>
					<span>${message("manage.common.handle")}</span>
				</th>
			</tr>
			[#list page.content as manage]
				<tr>
					<td>
						<input type="checkbox" name="ids" value="${manage.id}" />
					</td>
					<td>
						${manage.username}
					</td>
					<td>
						${manage.email}
					</td>
					<td>
						${manage.name}
					</td>
					<td>
						${manage.department}
					</td>
					<td>
						[#if manage.loginDate??]
							<span title="${manage.loginDate?string("yyyy-MM-dd HH:mm:ss")}">${manage.loginDate}</span>
						[#else]
							-
						[/#if]
					</td>
					<td>
						${(manage.loginIp)!"-"}
					</td>
					<td>
						[#if !manage.isEnabled]
							<span class="red">${message("manage.manage.disabled")}</span>
						[#elseif manage.isLocked]
							<span class="red"> ${message("manage.manage.locked")} </span>
						[#else]
							<span class="green">${message("manage.manage.normal")}</span>
						[/#if]
					</td>
					<td>
						<span title="${manage.createDate?string("yyyy-MM-dd HH:mm:ss")}">${manage.createDate}</span>
					</td>
					<td>
						<a href="edit.do?id=${manage.id}">[${message("manage.common.edit")}]</a>
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