<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.log.view")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/input.js"></script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.log.view")}
	</div>
	<table class="input">
		<tr>
			<th>
				${message("Log.operation")}:
			</th>
			<td>
				${log.operation}
			</td>
		</tr>
		<tr>
			<th>
				${message("Log.operator")}:
			</th>
			<td>
				${log.operator}
			</td>
		</tr>
		<tr>
			<th>
				${message("Log.content")}:
			</th>
			<td>
				${log.content!"-"}
			</td>
		</tr>
		<tr>
			<th>
				${message("Log.parameter")}:
			</th>
			<td>
				<textarea class="textarea" style="width: 98%; height: 300px;" readonly="readonly">${log.parameter?html}</textarea>
			</td>
		</tr>
		<tr>
			<th>
				${message("Log.ip")}:
			</th>
			<td>
				${log.ip}
			</td>
		</tr>
		<tr>
			<th>
				${message("manage.common.createDate")}
			</th>
			<td>
				${log.createDate?string("yyyy-MM-dd HH:mm:ss")}
			</td>
		</tr>
		<tr>
			<th>
				&nbsp;
			</th>
			<td>
				<input type="button" id="backButton" class="button" value="${message("manage.common.back")}" />
			</td>
		</tr>
	</table>
</body>
</html>