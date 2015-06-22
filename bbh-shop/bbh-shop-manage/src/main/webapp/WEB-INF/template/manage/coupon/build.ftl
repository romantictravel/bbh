<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.coupon.build")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.validate.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/input.js"></script>
<script type="text/javascript">
$().ready(function() {

	var $inputForm = $("#inputForm");
	var $totalCount = $("#totalCount");
	var $count = $("#count");
	var totalCount = ${totalCount};
	
	[@flash_message /]
	
	// 表单验证
	$inputForm.validate({
		rules: {
			count: {
				required: true,
				integer: true,
				min: 1
			}
		},
		submitHandler: function(form) {
			totalCount = totalCount + parseInt($count.val());
			$totalCount.text(totalCount);
			form.submit();
		}
	});
	
});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.coupon.build")}
	</div>
	<form id="inputForm" action="download.do" method="post">
		<input type="hidden" name="id" value="${coupon.id}" />
		<table class="input">
			<tr>
				<th>
					${message("Coupon.name")}:
				</th>
				<td>
					${coupon.name}
				</td>
			</tr>
			<tr>
				<th>
					${message("Coupon.beginDate")}:
				</th>
				<td>
					[#if coupon.beginDate??]
						${coupon.beginDate?string("yyyy-MM-dd")}
					[#else]
						-
					[/#if]
				</td>
			</tr>
			<tr>
				<th>
					${message("Coupon.endDate")}:
				</th>
				<td>
					[#if coupon.endDate??]
						${coupon.endDate?string("yyyy-MM-dd")}
					[#else]
						-
					[/#if]
				</td>
			</tr>
			<tr>
				<th>
					${message("manage.coupon.totalCount")}:
				</th>
				<td>
					<span id="totalCount">${totalCount}</span>
				</td>
			</tr>
			<tr>
				<th>
					${message("manage.coupon.usedCount")}:
				</th>
				<td>
					${usedCount}
				</td>
			</tr>
			<tr>
				<th>
					<span class="requiredField">*</span>${message("manage.coupon.count")}:
				</th>
				<td>
					<input type="text" id="count" name="count" class="text" value="50" maxlength="9" />
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