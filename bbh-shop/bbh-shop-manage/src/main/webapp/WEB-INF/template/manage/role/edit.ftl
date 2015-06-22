<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.role.edit")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.validate.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/input.js"></script>
<style type="text/css">
.authorities label {
	min-width: 120px;
	_width: 120px;
	display: block;
	float: left;
	padding-right: 4px;
	_white-space: nowrap;
}
</style>
<script type="text/javascript">
$().ready(function() {

	var $inputForm = $("#inputForm");
	var $selectAll = $("#inputForm .selectAll");
	
	[@flash_message /]
	
	$selectAll.click(function() {
		var $this = $(this);
		var $thisCheckbox = $this.closest("tr").find(":checkbox");
		if ($thisCheckbox.filter(":checked").size() > 0) {
			$thisCheckbox.prop("checked", false);
		} else {
			$thisCheckbox.prop("checked", true);
		}
		return false;
	});
	
	// 表单验证
	$inputForm.validate({
		rules: {
			name: "required",
			authorities: "required"
		}
	});
	
});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.role.edit")}
	</div>
	<form id="inputForm" action="update.do" method="post">
		<input type="hidden" name="id" value="${role.id}" />
		<table class="input">
			<tr>
				<th>
					<span class="requiredField">*</span>${message("Role.name")}:
				</th>
				<td>
					<input type="text" name="name" class="text" value="${role.name}" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					${message("Role.description")}:
				</th>
				<td>
					<input type="text" name="description" class="text" value="${role.description}" maxlength="200" />
				</td>
			</tr>
			<tr>
				<td colspan="2">
					&nbsp;
				</td>
			</tr>
			<tr class="authorities">
				<th>
					<a href="javascript:;" class="selectAll" title="${message("manage.role.selectAll")}">${message("manage.role.productGroup")}</a>
				</th>
				<td>
					<span class="fieldSet">
						<label>
							<input type="checkbox" name="authorities" value="manage:product"[#if role.authorities?seq_contains("manage:product")] checked="checked"[/#if] />${message("manage.role.product")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:productCategory"[#if role.authorities?seq_contains("manage:productCategory")] checked="checked"[/#if] />${message("manage.role.productCategory")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:parameterGroup"[#if role.authorities?seq_contains("manage:parameterGroup")] checked="checked"[/#if] />${message("manage.role.parameterGroup")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:attribute"[#if role.authorities?seq_contains("manage:attribute")] checked="checked"[/#if] />${message("manage.role.attribute")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:specification"[#if role.authorities?seq_contains("manage:specification")] checked="checked"[/#if] />${message("manage.role.specification")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:brand"[#if role.authorities?seq_contains("manage:brand")] checked="checked"[/#if] />${message("manage.role.brand")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:productNotify"[#if role.authorities?seq_contains("manage:productNotify")] checked="checked"[/#if] />${message("manage.role.productNotify")}
						</label>
					</span>
				</td>
			</tr>
			<tr class="authorities">
				<th>
					<a href="javascript:;" class="selectAll" title="${message("manage.role.selectAll")}">${message("manage.role.orderGroup")}</a>
				</th>
				<td>
					<span class="fieldSet">
						<label>
							<input type="checkbox" name="authorities" value="manage:order"[#if role.authorities?seq_contains("manage:order")] checked="checked"[/#if] />${message("manage.role.order")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:print"[#if role.authorities?seq_contains("manage:print")] checked="checked"[/#if] />${message("manage.role.print")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:payment"[#if role.authorities?seq_contains("manage:payment")] checked="checked"[/#if] />${message("manage.role.payment")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:refunds"[#if role.authorities?seq_contains("manage:refunds")] checked="checked"[/#if] />${message("manage.role.refunds")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:shipping"[#if role.authorities?seq_contains("manage:shipping")] checked="checked"[/#if] />${message("manage.role.shipping")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:returns"[#if role.authorities?seq_contains("manage:returns")] checked="checked"[/#if] />${message("manage.role.returns")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:deliveryCenter"[#if role.authorities?seq_contains("manage:deliveryCenter")] checked="checked"[/#if] />${message("manage.role.deliveryCenter")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:deliveryTemplate"[#if role.authorities?seq_contains("manage:deliveryTemplate")] checked="checked"[/#if] />${message("manage.role.deliveryTemplate")}
						</label>
					</span>
				</td>
			</tr>
			<tr class="authorities">
				<th>
					<a href="javascript:;" class="selectAll" title="${message("manage.role.selectAll")}">${message("manage.role.memberGroup")}</a>
				</th>
				<td>
					<span class="fieldSet">
						<label>
							<input type="checkbox" name="authorities" value="manage:member"[#if role.authorities?seq_contains("manage:member")] checked="checked"[/#if] />${message("manage.role.member")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:memberRank"[#if role.authorities?seq_contains("manage:memberRank")] checked="checked"[/#if] />${message("manage.role.memberRank")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:memberAttribute"[#if role.authorities?seq_contains("manage:memberAttribute")] checked="checked"[/#if] />${message("manage.role.memberAttribute")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:review"[#if role.authorities?seq_contains("manage:review")] checked="checked"[/#if] />${message("manage.role.review")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:consultation"[#if role.authorities?seq_contains("manage:consultation")] checked="checked"[/#if] />${message("manage.role.consultation")}
						</label>
					</span>
				</td>
			</tr>
			<tr class="authorities">
				<th>
					<a href="javascript:;" class="selectAll" title="${message("manage.role.selectAll")}">${message("manage.role.contentGroup")}</a>
				</th>
				<td>
					<span class="fieldSet">
						<label>
							<input type="checkbox" name="authorities" value="manage:navigation"[#if role.authorities?seq_contains("manage:navigation")] checked="checked"[/#if] />${message("manage.role.navigation")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:article"[#if role.authorities?seq_contains("manage:article")] checked="checked"[/#if] />${message("manage.role.article")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:articleCategory"[#if role.authorities?seq_contains("manage:articleCategory")] checked="checked"[/#if] />${message("manage.role.articleCategory")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:tag"[#if role.authorities?seq_contains("manage:tag")] checked="checked"[/#if] />${message("manage.role.tag")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:friendLink"[#if role.authorities?seq_contains("manage:friendLink")] checked="checked"[/#if] />${message("manage.role.friendLink")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:adPosition"[#if role.authorities?seq_contains("manage:adPosition")] checked="checked"[/#if] />${message("manage.role.adPosition")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:ad"[#if role.authorities?seq_contains("manage:ad")] checked="checked"[/#if] />${message("manage.role.ad")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:template"[#if role.authorities?seq_contains("manage:template")] checked="checked"[/#if] />${message("manage.role.template")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:cache"[#if role.authorities?seq_contains("manage:cache")] checked="checked"[/#if] />${message("manage.role.cache")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:static"[#if role.authorities?seq_contains("manage:static")] checked="checked"[/#if] />${message("manage.role.static")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:index"[#if role.authorities?seq_contains("manage:index")] checked="checked"[/#if] />${message("manage.role.index")}
						</label>
					</span>
				</td>
			</tr>
			<tr class="authorities">
				<th>
					<a href="javascript:;" class="selectAll" title="${message("manage.role.selectAll")}">${message("manage.role.marketingGroup")}</a>
				</th>
				<td>
					<span class="fieldSet">
						<label>
							<input type="checkbox" name="authorities" value="manage:promotion"[#if role.authorities?seq_contains("manage:promotion")] checked="checked"[/#if] />${message("manage.role.promotion")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:coupon"[#if role.authorities?seq_contains("manage:coupon")] checked="checked"[/#if] />${message("manage.role.coupon")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:seo"[#if role.authorities?seq_contains("manage:seo")] checked="checked"[/#if] />${message("manage.role.seo")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:sitemap"[#if role.authorities?seq_contains("manage:sitemap")] checked="checked"[/#if] />${message("manage.role.sitemap")}
						</label>
					</span>
				</td>
			</tr>
			<tr class="authorities">
				<th>
					<a href="javascript:;" class="selectAll" title="${message("manage.role.selectAll")}">${message("manage.role.statisticsGroup")}</a>
				</th>
				<td>
					<span class="fieldSet">
						<label>
							<input type="checkbox" name="authorities" value="manage:statistics"[#if role.authorities?seq_contains("manage:statistics")] checked="checked"[/#if] />${message("manage.role.statistics")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:sales"[#if role.authorities?seq_contains("manage:sales")] checked="checked"[/#if] />${message("manage.role.sales")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:salesRanking"[#if role.authorities?seq_contains("manage:salesRanking")] checked="checked"[/#if] />${message("manage.role.salesRanking")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:purchaseRanking"[#if role.authorities?seq_contains("manage:purchaseRanking")] checked="checked"[/#if] />${message("manage.role.purchaseRanking")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:deposit"[#if role.authorities?seq_contains("manage:deposit")] checked="checked"[/#if] />${message("manage.role.deposit")}
						</label>
					</span>
				</td>
			</tr>
			<tr class="authorities">
				<th>
					<a href="javascript:;" class="selectAll" title="${message("manage.role.selectAll")}">${message("manage.role.systemGroup")}</a>
				</th>
				<td>
					<span class="fieldSet">
						<label>
							<input type="checkbox" name="authorities" value="manage:setting"[#if role.authorities?seq_contains("manage:setting")] checked="checked"[/#if] />${message("manage.role.setting")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:area"[#if role.authorities?seq_contains("manage:area")] checked="checked"[/#if] />${message("manage.role.area")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:paymentMethod"[#if role.authorities?seq_contains("manage:paymentMethod")] checked="checked"[/#if] />${message("manage.role.paymentMethod")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:shippingMethod"[#if role.authorities?seq_contains("manage:shippingMethod")] checked="checked"[/#if] />${message("manage.role.shippingMethod")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:deliveryCorp"[#if role.authorities?seq_contains("manage:deliveryCorp")] checked="checked"[/#if] />${message("manage.role.deliveryCorp")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:paymentPlugin"[#if role.authorities?seq_contains("manage:paymentPlugin")] checked="checked"[/#if] />${message("manage.role.paymentPlugin")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:storagePlugin"[#if role.authorities?seq_contains("manage:storagePlugin")] checked="checked"[/#if] />${message("manage.role.storagePlugin")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:manage"[#if role.authorities?seq_contains("manage:manage")] checked="checked"[/#if] />${message("manage.role.manage")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:role"[#if role.authorities?seq_contains("manage:role")] checked="checked"[/#if] />${message("manage.role.role")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:message"[#if role.authorities?seq_contains("manage:message")] checked="checked"[/#if] />${message("manage.role.message")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:log"[#if role.authorities?seq_contains("manage:log")] checked="checked"[/#if] />${message("manage.role.log")}
						</label>
					</span>
				</td>
			</tr>
			[#if role.isSystem]
				<tr>
					<th>
						&nbsp;
					</th>
					<td>
						<span class="tips">${message("manage.role.editSystemNotAllowed")}</span>
					</td>
				</tr>
			[/#if]
			<tr>
				<th>
					&nbsp;
				</th>
				<td>
					<input type="submit" class="button" value="${message("manage.common.submit")}"[#if role.isSystem] disabled="disabled"[/#if] />
					<input type="button" id="backButton" class="button" value="${message("manage.common.back")}" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>