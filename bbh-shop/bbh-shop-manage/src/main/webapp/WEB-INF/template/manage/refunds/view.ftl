<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.refunds.view")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/input.js"></script>
<script type="text/javascript">
$().ready(function() {
	
	[@flash_message /]
	
});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.refunds.view")}
	</div>
	<table class="input">
		<tr>
			<th>
				${message("Refunds.sn")}:
			</th>
			<td>
				${refunds.sn}
			</td>
			<th>
				${message("manage.common.createDate")}:
			</th>
			<td>
				${refunds.createDate?string("yyyy-MM-dd HH:mm:ss")}
			</td>
		</tr>
		<tr>
			<th>
				${message("Refunds.method")}:
			</th>
			<td>
				${message("Refunds.Method." + refunds.method)}
			</td>
			<th>
				${message("Refunds.paymentMethod")}:
			</th>
			<td>
				${(refunds.paymentMethod)!"-"}
			</td>
		</tr>
		<tr>
			<th>
				${message("Refunds.bank")}:
			</th>
			<td>
				${(refunds.bank)!"-"}
			</td>
			<th>
				${message("Refunds.account")}:
			</th>
			<td>
				${(refunds.account)!"-"}
			</td>
		</tr>
		<tr>
			<th>
				${message("Refunds.payee")}:
			</th>
			<td>
				${(refunds.payee)!"-"}
			</td>
			<th>
				${message("Refunds.amount")}:
			</th>
			<td>
				${currency(refunds.amount, true)}
			</td>
		</tr>
		<tr>
			<th>
				${message("Refunds.order")}:
			</th>
			<td>
				${refunds.order.sn}
			</td>
			<th>
				${message("Refunds.operator")}:
			</th>
			<td>
				${refunds.operator}
			</td>
		</tr>
		<tr>
			<th>
				${message("Refunds.memo")}:
			</th>
			<td colspan="3">
				${refunds.memo}
			</td>
		</tr>
		<tr>
			<th>
				&nbsp;
			</th>
			<td colspan="3">
				<input type="button" id="backButton" class="button" value="${message("manage.common.back")}" />
			</td>
		</tr>
	</table>
</body>
</html>