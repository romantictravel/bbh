<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.tag.edit")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.validate.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/input.js"></script>
<script type="text/javascript">
$().ready(function() {

	var $inputForm = $("#inputForm");
	var $browserButton = $("#browserButton");
	
	[@flash_message /]
	
	$browserButton.browser();
	
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
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.tag.edit")}
	</div>
	<form id="inputForm" action="update.do" method="post">
		<input type="hidden" name="id" value="${tag.id}" />
		<table class="input">
			<tr>
				<th>
					${message("Tag.type")}:
				</th>
				<td>
					${message("Tag.Type." + tag.type)}
				</td>
			</tr>
			<tr>
				<th>
					<span class="requiredField">*</span>${message("Tag.name")}:
				</th>
				<td>
					<input type="text" name="name" class="text" value="${tag.name}" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					${message("Tag.icon")}:
				</th>
				<td>
					<input type="text" name="icon" class="text" value="${tag.icon}" maxlength="200" />
					<input type="button" id="browserButton" class="button" value="${message("manage.browser.select")}" />
					[#if tag.icon??]
						<a href="${tag.icon}" target="_blank">${message("manage.common.view")}</a>
					[/#if]
				</td>
			</tr>
			<tr>
				<th>
					${message("Tag.memo")}:
				</th>
				<td colspan="4">
					<input type="text" name="memo" class="text" value="${tag.memo}" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					${message("manage.common.order")}:
				</th>
				<td>
					<input type="text" name="order" class="text" value="${tag.order}" maxlength="9" />
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