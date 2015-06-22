<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.cache.clear")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.validate.js"></script>
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
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.cache.clear")}
	</div>
	<form id="inputForm" action="clear.do" method="post">
		<table class="input">
			<tr>
				<th>
					${message("manage.cache.cacheSize")}:
				</th>
				<td>
					${cacheSize}
				</td>
			</tr>
			<tr>
				<th>
					${message("manage.cache.freeMemory")}:
				</th>
				<td>
					[#if maxMemory?? && totalMemory?? && freeMemory??]
						${(maxMemory - totalMemory + freeMemory)?string("0.##")}MB
					[#else]
						-
					[/#if]
				</td>
			</tr>
			<tr>
				<th>
					${message("manage.cache.diskStorePath")}:
				</th>
				<td>
					${diskStorePath}
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