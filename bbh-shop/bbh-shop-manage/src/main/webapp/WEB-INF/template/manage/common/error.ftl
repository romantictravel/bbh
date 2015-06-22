<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.error.title")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<link href="${base}/resources/manage/css/error.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="wrap">
		<div class="error">
			<dl>
				<dt>${message("manage.error.message")}</dt>
				[#if content??]
					<dd>${content}</dd>
				[/#if]
				[#if constraintViolations?has_content]
					[#list constraintViolations as constraintViolation]
						<dd>[${constraintViolation.propertyPath}] ${constraintViolation.message}</dd>
					[/#list]
				[/#if]
				<dd>
					<a href="javascript:;" onclick="window.history.back(); return false;">${message("manage.error.back")}</a>
				</dd>
			</dl>
		</div>
	</div>
</body>
</html>