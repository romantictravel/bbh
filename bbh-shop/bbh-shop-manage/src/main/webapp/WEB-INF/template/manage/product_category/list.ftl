<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.productCategory.list")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/list.js"></script>
<script type="text/javascript">
$().ready(function() {

	var $delete = $("#listTable a.delete");
	
	[@flash_message /]

	// 删除
	$delete.click(function() {
		var $this = $(this);
		$.dialog({
			type: "warn",
			content: "${message("manage.dialog.deleteConfirm")}",
			onOk: function() {
				$.ajax({
					url: "delete.do",
					type: "POST",
					data: {id: $this.attr("val")},
					dataType: "json",
					cache: false,
					success: function(message) {
						$.message(message);
						if (message.type == "success") {
							$this.closest("tr").remove();
						}
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
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.productCategory.list")}
	</div>
	<div class="bar">
		<a href="add.do" class="iconButton">
			<span class="addIcon">&nbsp;</span>${message("manage.common.add")}
		</a>
		<a href="javascript:;" id="refreshButton" class="iconButton">
			<span class="refreshIcon">&nbsp;</span>${message("manage.common.refresh")}
		</a>
	</div>
	<table id="listTable" class="list">
		<tr>
			<th>
				<span>${message("ProductCategory.name")}</span>
			</th>
			<th>
				<span>${message("manage.common.order")}</span>
			</th>
			<th>
				<span>${message("manage.common.handle")}</span>
			</th>
		</tr>
		[#list productCategoryTree as productCategory]
			<tr>
				<td>
					<span style="margin-left: ${productCategory.grade * 20}px;[#if productCategory.grade == 0] color: #000000;[/#if]">
						${productCategory.name}
					</span>
				</td>
				<td>
					${productCategory.order}
				</td>
				<td>
					<a href="${base}${productCategory.path}" target="_blank">[${message("manage.common.view")}]</a>
					<a href="edit.do?id=${productCategory.id}">[${message("manage.common.edit")}]</a>
					<a href="javascript:;" class="delete" val="${productCategory.id}">[${message("manage.common.delete")}]</a>
				</td>
			</tr>
		[/#list]
	</table>
</body>
</html>