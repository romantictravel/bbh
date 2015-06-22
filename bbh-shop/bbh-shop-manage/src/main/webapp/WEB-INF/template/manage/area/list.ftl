<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.area.list")}</title>


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
							$this.parent().html("&nbsp;");
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
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.area.list")}
	</div>
	<div class="bar">
		<a href="add.do[#if parent??]?parentId=${parent.id}[/#if]" class="iconButton">
			<span class="addIcon">&nbsp;</span>${message("manage.common.add")}
		</a>
		[#if parent??]
			<div class="pageBar">
				[#if parent.parent??]
					<a href="list.do?parentId=${parent.parent.id}" class="iconButton">
						<span class="upIcon">&nbsp;</span>${message("manage.area.parent")}
					</a>
				[#else]
					<a href="list.do" class="iconButton">
						<span class="upIcon">&nbsp;</span>${message("manage.area.parent")}
					</a>
				[/#if]
			</div>
		[/#if]
	</div>
	<table id="listTable" class="list">
		<tr>
			<th colspan="5" class="green" style="text-align: center;">
				[#if parent??]${message("manage.area.parent")} - ${parent.name}[#else]${message("manage.area.root")}[/#if]
			</th>
		</tr>
		[#list areas?chunk(5, "") as row]
			<tr>
				[#list row as area]
					[#if area?has_content]
						<td>
							<a href="list.do?parentId=${area.id}" title="${message("manage.common.view")}">${area.name}</a>
							<a href="edit.do?id=${area.id}">[${message("manage.common.edit")}]</a>
							<a href="javascript:;" class="delete" val="${area.id}">[${message("manage.common.delete")}]</a>
						</td>
					[#else]
						<td>
							&nbsp;
						</td>
					[/#if]
				[/#list]
			</tr>
		[/#list]
		[#if !areas?has_content]
			<tr>
				<td colspan="5" style="text-align: center; color: red;">
					${message("manage.area.emptyChildren")} <a href="add.do[#if parent??]?parentId=${parent.id}[/#if]" style="color: gray">${message("manage.common.add")}</a>
				</td>
			</tr>
		[/#if]
	</table>
</body>
</html>