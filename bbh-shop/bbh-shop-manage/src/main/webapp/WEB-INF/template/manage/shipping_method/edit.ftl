<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.shippingMethod.edit")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.tools.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.validate.js"></script>
<script type="text/javascript" src="${base}/resources/manage/editor/kindeditor.js"></script>
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
			firstWeight: {
				required: true,
				digits: true
			},
			continueWeight: {
				required: true,
				integer: true,
				min: 1
			},
			firstPrice: {
				required: true,
				min: 0,
				decimal: {
					integer: 12,
					fraction: ${setting.priceScale}
				}
			},
			continuePrice: {
				required: true,
				min: 0,
				decimal: {
					integer: 12,
					fraction: ${setting.priceScale}
				}
			},
			order: "digits"
		}
	});
	
});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.shippingMethod.edit")}
	</div>
	<form id="inputForm" action="update.do" method="post">
		<input type="hidden" name="id" value="${shippingMethod.id}" />
		<table class="input">
			<tr>
				<th>
					<span class="requiredField">*</span>${message("ShippingMethod.name")}:
				</th>
				<td>
					<input type="text" name="name" class="text" value="${shippingMethod.name}" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					${message("ShippingMethod.defaultDeliveryCorp")}:
				</th>
				<td>
					<select name="defaultDeliveryCorpId">
						<option value="">${message("manage.common.choose")}</option>
						[#list deliveryCorps as deliveryCorp]
							<option value="${deliveryCorp.id}" [#if deliveryCorp == shippingMethod.defaultDeliveryCorp] selected="selected"[/#if]>
								${deliveryCorp.name}
							</option>
						[/#list]
					</select>
				</td>
			</tr>
			<tr>
				<th>
					<span class="requiredField">*</span>${message("ShippingMethod.firstWeight")}:
				</th>
				<td>
					<input type="text" name="firstWeight" class="text" value="${shippingMethod.firstWeight}" maxlength="9" title="${message("manage.shippingMethod.weightTitle")}" />
				</td>
			</tr>
			<tr>
				<th>
					<span class="requiredField">*</span>${message("ShippingMethod.continueWeight")}:
				</th>
				<td>
					<input type="text" name="continueWeight" class="text" value="${shippingMethod.continueWeight}" maxlength="9" title="${message("manage.shippingMethod.weightTitle")}" />
				</td>
			</tr>
			<tr>
				<th>
					<span class="requiredField">*</span>${message("ShippingMethod.firstPrice")}:
				</th>
				<td>
					<input type="text" name="firstPrice" class="text" value="${shippingMethod.firstPrice}" maxlength="16" />
				</td>
			</tr>
			<tr>
				<th>
					<span class="requiredField">*</span>${message("ShippingMethod.continuePrice")}:
				</th>
				<td>
					<input type="text" name="continuePrice" class="text" value="${shippingMethod.continuePrice}" maxlength="16" />
				</td>
			</tr>
			<tr>
				<th>
					${message("ShippingMethod.icon")}:
				</th>
				<td>
					<input type="text" name="icon" class="text" value="${shippingMethod.icon}" maxlength="200" />
					<input type="button" id="browserButton" class="button" value="${message("manage.browser.select")}" />
					[#if shippingMethod.icon??]
						<a href="${shippingMethod.icon}" target="_blank">${message("manage.common.view")}</a>
					[/#if]
				</td>
			</tr>
			<tr>
				<th>
					${message("manage.common.order")}:
				</th>
				<td>
					<input type="text" name="order" class="text" value="${shippingMethod.order}" maxlength="9" />
				</td>
			</tr>
			<tr>
				<th>
					${message("ShippingMethod.description")}:
				</th>
				<td>
					<textarea id="editor" name="description" class="editor">${shippingMethod.description?html}</textarea>
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