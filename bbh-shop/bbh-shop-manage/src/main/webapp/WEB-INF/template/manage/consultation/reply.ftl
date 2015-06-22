<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.consultation.reply")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.validate.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/input.js"></script>
<script type="text/javascript">
$().ready(function() {

	var $inputForm = $("#inputForm");

	[@flash_message /]
	
	// 表单验证
	$inputForm.validate({
		rules: {
			content: {
				required: true,
				maxlength: 200
			}
		}
	});
	
});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.consultation.reply")}
	</div>
	<form id="inputForm" action="reply.do" method="post">
		<input type="hidden" name="id" value="${consultation.id}" />
		<table class="input">
			<tr>
				<th>
					${message("Consultation.product")}:
				</th>
				<td colspan="2">
					<a href="${base}${consultation.product.path}" target="_blank">${consultation.product.name}</a>
				</td>
			</tr>
			<tr>
				<th>
					${message("Consultation.member")}:
				</th>
				<td colspan="2">
					[#if consultation.member??]
						<a href="../member/view.do?id=${consultation.member.id}">${consultation.member.username}</a>
					[#else]
						${message("manage.consultation.anonymous")}
					[/#if]
				</td>
			</tr>
			<tr>
				<th>
					${message("Consultation.content")}:
				</th>
				<td colspan="2">
					${consultation.content}
				</td>
			</tr>
			[#if consultation.replyConsultations?has_content]
				<tr class="title">
					<td colspan="3">
						&nbsp;
					</td>
				</tr>
				[#list consultation.replyConsultations as replyConsultation]
					<tr>
						<th>
							&nbsp;
						</th>
						<td>
							${replyConsultation.content}
						</td>
						<td width="80">
							<span title="${consultation.createDate?string("yyyy-MM-dd HH:mm:ss")}">${consultation.createDate}</span>
						</td>
					</tr>
				[/#list]
			[/#if]
			<tr>
				<th>
					${message("Consultation.content")}:
				</th>
				<td colspan="2">
					<textarea name="content" class="text"></textarea>
				</td>
			</tr>
			<tr>
				<th>
					&nbsp;
				</th>
				<td colspan="2">
					<input type="submit" class="button" value="${message("manage.common.submit")}" />
					<input type="button" id="backButton" class="button" value="${message("manage.common.back")}" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>