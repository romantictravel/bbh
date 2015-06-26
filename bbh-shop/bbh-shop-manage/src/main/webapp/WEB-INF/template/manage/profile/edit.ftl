<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.profile.edit")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.validate.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/input.js"></script>
<script type="text/javascript">
$().ready(function() {

	var $inputForm = $("#inputForm");
	
	[@flash_message /]
	
	$.validator.addMethod("requiredTo", 
		function(value, element, param) {
			var parameterValue = $(param).val();
			if ($.trim(parameterValue) == "" || ($.trim(parameterValue) != "" && $.trim(value) != "")) {
				return true;
			} else {
				return false;
			}
		},
		"${message("manage.profile.requiredTo")}"
	);
	
	// 表单验证
	$inputForm.validate({
		rules: {
			currentPassword: {
				requiredTo: "#password",
				remote: {
					url: "check_current_password.do",
					cache: false
				}
			},
			password: {
				pattern: /^[^\s&\"<>]+$/,
				minlength: 4,
				maxlength: 20
			},
			rePassword: {
				equalTo: "#password"
			},
			email: {
				required: true,
				email: true
			}
		},
		messages: {
			password: {
				pattern: "${message("manage.validate.illegal")}"
			}
		}
	});
	
});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.profile.edit")}
	</div>
	<form id="inputForm" action="update.do" method="post">
		<table class="input">
			<tr>
				<th>
					${message("Admin.username")}: 
				</th>
				<td>
					${manage.username}
				</td>
			</tr>
			<tr>
				<th>
					${message("Admin.name")}: 
				</th>
				<td>
					${manage.name}
				</td>
			</tr>
			<tr>
				<th>
					${message("Admin.department")}: 
				</th>
				<td>
					${manage.department}
				</td>
			</tr>
			<tr>
				<th>
					${message("manage.profile.currentPassword")}: 
				</th>
				<td>
					<input type="password" name="currentPassword" class="text" maxlength="20" />
				</td>
			</tr>
			<tr>
				<th>
					${message("manage.profile.password")}: 
				</th>
				<td>
					<input type="password" id="password" name="password" class="text" maxlength="20" />
				</td>
			</tr>
			<tr>
				<th>
					${message("manage.profile.rePassword")}: 
				</th>
				<td>
					<input type="password" name="rePassword" class="text" maxlength="20" />
				</td>
			</tr>
			<tr>
				<th>
					<span class="requiredField">*</span>${message("Admin.email")}: 
				</th>
				<td>
					<input type="text" name="email" class="text" value="${manage.email}" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					&nbsp;
				</th>
				<td>
					<span class="tips">${message("manage.profile.tips")}</span>
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