<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.paymentMethod.edit")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.tools.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.validate.js"></script>
<script type="text/javascript" src="${base}/resources/manage/editor/kindeditor.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/input.js"></script>
<style type="text/css">
.shippingMethods label {
	width: 150px;
	display: block;
	float: left;
	padding-right: 6px;
}
</style>
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
			timeout: {
				integer: true,
				min: 1
			},
			order: "digits"
		}
	});
	
});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.paymentMethod.edit")}
	</div>
	<form id="inputForm" action="update.do" method="post">
		<input type="hidden" name="id" value="${paymentMethod.id}" />
		<table class="input">
			<tr>
				<th>
					<span class="requiredField">*</span>${message("PaymentMethod.name")}:
				</th>
				<td>
					<input type="text" name="name" class="text" value="${paymentMethod.name}" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					${message("PaymentMethod.method")}:
				</th>
				<td>
					<select name="method">
						[#list methods as method]
							<option value="${method}"[#if method == paymentMethod.method] selected="selected"[/#if]>${message("PaymentMethod.Method." + method)}</option>
						[/#list]
					</select>
				</td>
			</tr>
			<tr>
				<th>
					${message("PaymentMethod.timeout")}:
				</th>
				<td>
					<input type="text" name="timeout" class="text" value="${paymentMethod.timeout}" maxlength="9" title="${message("manage.paymentMethod.timeoutTitle")}" />
				</td>
			</tr>
			<tr class="shippingMethods">
				<th>
					${message("PaymentMethod.shippingMethods")}:
				</th>
				<td>
					[#list shippingMethods as shippingMethod]
						<label>
							<input type="checkbox" name="shippingMethodIds" value="${shippingMethod.id}"[#if paymentMethod.shippingMethods?seq_contains(shippingMethod)] checked="checked"[/#if] />${shippingMethod.name}
						</label>
					[/#list]
				</td>
			</tr>
			<tr>
				<th>
					${message("PaymentMethod.icon")}:
				</th>
				<td>
					<input type="text" name="icon" class="text" value="${paymentMethod.icon}" maxlength="200" />
					<input type="button" id="browserButton" class="button" value="${message("manage.browser.select")}" />
					[#if paymentMethod.icon??]
						<a href="${paymentMethod.icon}" target="_blank">${message("manage.common.view")}</a>
					[/#if]
				</td>
			</tr>
			<tr>
				<th>
					${message("PaymentMethod.description")}:
				</th>
				<td>
					<input type="text" name="description" class="text" value="${paymentMethod.description}" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					${message("manage.common.order")}:
				</th>
				<td>
					<input type="text" name="order" class="text" value="${paymentMethod.order}" maxlength="9" />
				</td>
			</tr>
			<tr>
				<th>
					${message("PaymentMethod.content")}:
				</th>
				<td>
					<textarea id="editor" name="content" class="editor">${paymentMethod.content?html}</textarea>
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