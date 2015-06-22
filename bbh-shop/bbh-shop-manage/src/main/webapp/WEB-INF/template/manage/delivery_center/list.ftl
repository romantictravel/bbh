<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.deliveryCenter.list")}</title>


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
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.deliveryCenter.list")} <span>(${message("manage.page.total", page.total)})</span>
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
							<a href="javascript:;"[#if page.searchProperty == "name"] class="current"[/#if] val="name">${message("DeliveryCenter.name")}</a>
						</li>
						<li>
							<a href="javascript:;"[#if page.searchProperty == "contact"] class="current"[/#if] val="contact">${message("DeliveryCenter.contact")}</a>
						</li>
						<li>
							<a href="javascript:;"[#if page.searchProperty == "phone"] class="current"[/#if] val="phone">${message("DeliveryCenter.phone")}</a>
						</li>
						<li>
							<a href="javascript:;"[#if page.searchProperty == "mobile"] class="current"[/#if] val="mobile">${message("DeliveryCenter.mobile")}</a>
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
					<a href="javascript:;" class="sort" name="name">${message("DeliveryCenter.name")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="contact">${message("DeliveryCenter.contact")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="areaName">${message("DeliveryCenter.areaName")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="address">${message("DeliveryCenter.address")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="zipCode">${message("DeliveryCenter.zipCode")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="phone">${message("DeliveryCenter.phone")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="mobile">${message("DeliveryCenter.mobile")}</a>
				</th>
				<th>
					<a href="javascript:;" class="sort" name="isDefault">${message("DeliveryCenter.isDefault")}</a>
				</th>
				<th>
					<span>${message("manage.common.handle")}</span>
				</th>
			</tr>
			[#list page.content as deliveryCenter]
				<tr>
					<td class="check">
						<input type="checkbox" name="ids" value="${deliveryCenter.id}"/>
					</td>
					<td>
						${deliveryCenter.name}
					</td>
					<td>
						${deliveryCenter.contact}
					</td>
					<td>
						${deliveryCenter.areaName}
					</td>
					<td>
						<span title="${deliveryCenter.address}">${abbreviate(deliveryCenter.address, 50, "...")}</span>
					</td>
					<td>
						${deliveryCenter.zipCode}
					</td>
					<td>
						${deliveryCenter.phone}
					</td>
					<td>
						${deliveryCenter.mobile}
					</td>
					<td>
						<span class="${deliveryCenter.isDefault?string("true", "false")}Icon">&nbsp;</span>
					</td>
					<td>
						<a href="edit.do?id=${deliveryCenter.id}">[${message("manage.common.edit")}]</a>
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