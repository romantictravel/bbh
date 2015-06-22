<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.index.title")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.input .powered {
	font-size: 11px;
	text-align: right;
	color: #cccccc;
}
</style>
</head>
<body>
	<div class="path">
		${message("manage.index.title")}
	</div>
	<table class="input">
		<tr>
			<th>
				${message("manage.index.systemName")}:
			</th>
			<td>
				${systemName}
			</td>
			<th>
				${message("manage.index.systemVersion")}:
			</th>
			<td>
				${systemVersion}
			</td>
		</tr>
		<tr>
			<th>
				${message("manage.index.official")}:
			</th>
			<td>
				<a href="http://www.kcshop.net" target="_blank">http://www.kcshop.net</a>
			</td>
			<th>
				${message("manage.index.bbs")}:
			</th>
			<td>
				<a href="http://bbs.kcshop.net" target="_blank">http://bbs.kcshop.net</a>
			</td>
		</tr>
		<tr>
			<td colspan="4">
				&nbsp;
			</td>
		</tr>
		<tr>
			<th>
				${message("manage.index.javaVersion")}:
			</th>
			<td>
				${javaVersion}
			</td>
			<th>
				${message("manage.index.javaHome")}:
			</th>
			<td>
				${javaHome}
			</td>
		</tr>
		<tr>
			<th>
				${message("manage.index.osName")}:
			</th>
			<td>
				${osName}
			</td>
			<th>
				${message("manage.index.osArch")}:
			</th>
			<td>
				${osArch}
			</td>
		</tr>
		<tr>
			<th>
				${message("manage.index.serverInfo")}:
			</th>
			<td>
				${serverInfo}
			</td>
			<th>
				${message("manage.index.servletVersion")}:
			</th>
			<td>
				${servletVersion}
			</td>
		</tr>
		<tr>
			<td colspan="4">
				&nbsp;
			</td>
		</tr>
		<tr>
			<th>
				${message("manage.index.marketableProductCount")}:
			</th>
			<td>
				${marketableProductCount}
			</td>
			<th>
				${message("manage.index.notMarketableProductCount")}:
			</th>
			<td>
				${notMarketableProductCount}
			</td>
		</tr>
		<tr>
			<th>
				${message("manage.index.stockAlertProductCount")}:
			</th>
			<td>
				${stockAlertProductCount}
			</td>
			<th>
				${message("manage.index.outOfStockProductCount")}:
			</th>
			<td>
				${outOfStockProductCount}
			</td>
		</tr>
		<tr>
			<th>
				${message("manage.index.waitingPaymentOrderCount")}:
			</th>
			<td>
				${waitingPaymentOrderCount}
			</td>
			<th>
				${message("manage.index.waitingShippingOrderCount")}:
			</th>
			<td>
				${waitingShippingOrderCount}
			</td>
		</tr>
		<tr>
			<th>
				${message("manage.index.memberCount")}:
			</th>
			<td>
				${memberCount}
			</td>
			<th>
				${message("manage.index.unreadMessageCount")}:
			</th>
			<td>
				${unreadMessageCount}
			</td>
		</tr>
		<tr>
			<td class="powered" colspan="4">
				COPYRIGHT © 2005-2013 KCSHOP.NET ALL RIGHTS RESERVED.
			</td>
		</tr>
	</table>
</body>
</html>