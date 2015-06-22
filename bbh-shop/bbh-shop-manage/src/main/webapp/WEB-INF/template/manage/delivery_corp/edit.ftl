<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.deliveryCorp.edit")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.tools.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.validate.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.autocomplete.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/input.js"></script>
<script type="text/javascript">
$().ready(function() {

	var $inputForm = $("#inputForm");
	var $name = $("#name");
	var $url = $("#url");
	var $code = $("#code");
	
	[@flash_message /]
	
	// 物流公司选择
	$.ajax({
		url: "${base}/resources/manage/xml/delivery_corp.xml",
		type: "GET",
		dataType: "xml",
		success: function(xml) {
			var data = $.map($(xml).find("deliveryCorp"), function(item) {
				var $item = $(item);
				return {
					name: $item.attr("name"),
					url: $item.attr("url"),
					code: $item.attr("code")
				}
			});
			
			$name.autocomplete(data, {
				max: 20,
				width: 188,
				scrollHeight: 300,
				matchContains: true,
				formatItem: function(item, i, max) {
					return item.name;
				},
				formatMatch: function(item, i, max) {
					return item.name;
				},
				formatResult: function(item) {
					return item.name;
				}
			}).result(function(event, item, formatted) {
				$url.val(item.url);
				$code.val(item.code);
			});
		}
	});
	
	// 表单验证
	$inputForm.validate({
		rules: {
			name: "required",
			order: "digits"
		}
	});
	
});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.deliveryCorp.edit")}
	</div>
	<form id="inputForm" action="update.do" method="post">
		<input type="hidden" name="id" value="${deliveryCorp.id}" />
		<table class="input">
			<tr>
				<th>
					<span class="requiredField">*</span>${message("DeliveryCorp.name")}:
				</th>
				<td>
					<input type="text" id="name" name="name" class="text" value="${deliveryCorp.name}" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					${message("DeliveryCorp.url")}:
				</th>
				<td>
					<input type="text" id="url" name="url" class="text" value="${deliveryCorp.url}" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					${message("DeliveryCorp.code")}:
				</th>
				<td>
					<input type="text" id="code" name="code" class="text" maxlength="200" value="${deliveryCorp.code}" title="${message("manage.deliveryCorp.codeTitle")}" />
				</td>
			</tr>
			<tr>
				<th>
					${message("manage.common.order")}:
				</th>
				<td>
					<input type="text" name="order" class="text" value="${deliveryCorp.order}" maxlength="9" />
				</td>
			</tr>
			<tr>
				<th>
					&nbsp;
				</th>
				<td>
					<input type="submit" class="button" value="${message("manage.common.submit")}" />
					<input type="button" id="backButton" class="button" value="${message("manage.common.back")}" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>