<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.statistics.view")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/input.js"></script>
<style type="text/css">
*{
	font: 12px tahoma, Arial, Verdana, sans-serif;
}
html, body {
	width: 100%;
	height: 100%;
	overflow: hidden;
}
</style>
<script type="text/javascript">
$().ready(function() {

	[#if !setting.cnzzSiteId?has_content || !setting.cnzzPassword?has_content]
		$.message("warn", "${message("manage.statistics.disabled")}");
	[/#if]

});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.statistics.view")}
	</div>
	[#if setting.cnzzSiteId?has_content && setting.cnzzPassword?has_content]
		<iframe frameborder="0" width="100%" height="100%" src="http://intf.cnzz.com/user/companion/kcshop_login.php?site_id=${setting.cnzzSiteId}&password=${setting.cnzzPassword}"></iframe>
	[/#if]
</body>
</html>