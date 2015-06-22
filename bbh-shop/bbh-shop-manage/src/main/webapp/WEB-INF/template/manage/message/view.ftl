<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.message.view")}</title>


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
				maxlength: 1000
			}
		}
	});
});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.message.view")}
	</div>
	<form id="inputForm" action="reply.do" method="post">
		<input type="hidden" name="id" value="${manageMessage.id}" />
		<table class="input">
			<tr>
				<th>
					${message("Message.title")}:
				</th>
				<td colspan="2">
					${manageMessage.title}
				</td>
			</tr>
			<tr>
				<th>
					${message("Message.ip")}:
				</th>
				<td colspan="2">
					${manageMessage.ip}
				</td>
			</tr>
			<tr class="title">
				<td colspan="3">
					&nbsp;
				</td>
			</tr>
			<tr>
				<th>
					[#if manageMessage.sender??]
						<a href="${base}/manage/member/view.do?id=${manageMessage.sender.id}">
							<span class="red">[${manageMessage.sender.username}]</span>
						</a>
					[#else]
						<span class="green">[${message("manage.message.manage")}]</span>
					[/#if]
				</th>
				<td>
					${manageMessage.content}
				</td>
				<td width="80">
					<span title="${manageMessage.createDate?string("yyyy-MM-dd HH:mm:ss")}">${manageMessage.createDate}</span>
				</td>
			</tr>
			[#list manageMessage.replyMessages as replyMessage]
				<tr>
					<th>
						[#if replyMessage.sender??]
							<a href="${base}/manage/member/view.do?id=${replyMessage.sender.id}">
								<span class="red">[${replyMessage.sender.username}]</span>
							</a>
						[#else]
							<span class="green">[${message("manage.message.manage")}]</span>
						[/#if]
					</th>
					<td>
						${replyMessage.content}
					</td>
					<td width="80">
						<span title="${replyMessage.createDate?string("yyyy-MM-dd HH:mm:ss")}">${replyMessage.createDate}</span>
					</td>
				</tr>
			[/#list]
			<tr>
				<th>
					<span class="requiredField">*</span>${message("Consultation.content")}:
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