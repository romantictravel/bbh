<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.role.add")}</title>


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
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.role.add")}
	</div>
	<form id="inputForm" action="save.do" method="post">
		<table class="input">
			<tr>
				<th>
					<span class="requiredField">*</span>${message("Role.name")}:
				</th>
				<td>
					<input type="text" name="name" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					${message("Role.description")}:
				</th>
				<td>
					<input type="text" name="description" class="text" maxlength="200" />
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
							<input type="checkbox" name="authorities" value="manage:product" />${message("manage.role.product")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:productCategory" />${message("manage.role.productCategory")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:parameterGroup" />${message("manage.role.parameterGroup")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:attribute" />${message("manage.role.attribute")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:specification" />${message("manage.role.specification")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:brand" />${message("manage.role.brand")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:productNotify" />${message("manage.role.productNotify")}
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
							<input type="checkbox" name="authorities" value="manage:order" />${message("manage.role.order")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:print" />${message("manage.role.print")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:payment" />${message("manage.role.payment")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:refunds" />${message("manage.role.refunds")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:shipping" />${message("manage.role.shipping")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:returns" />${message("manage.role.returns")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:deliveryCenter" />${message("manage.role.deliveryCenter")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:deliveryTemplate" />${message("manage.role.deliveryTemplate")}
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
							<input type="checkbox" name="authorities" value="manage:member" />${message("manage.role.member")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:memberRank" />${message("manage.role.memberRank")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:memberAttribute" />${message("manage.role.memberAttribute")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:review" />${message("manage.role.review")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:consultation" />${message("manage.role.consultation")}
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
							<input type="checkbox" name="authorities" value="manage:navigation" />${message("manage.role.navigation")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:article" />${message("manage.role.article")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:articleCategory" />${message("manage.role.articleCategory")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:tag" />${message("manage.role.tag")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:friendLink" />${message("manage.role.friendLink")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:adPosition" />${message("manage.role.adPosition")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:ad" />${message("manage.role.ad")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:template" />${message("manage.role.template")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:cache" />${message("manage.role.cache")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:static" />${message("manage.role.static")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:index" />${message("manage.role.index")}
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
							<input type="checkbox" name="authorities" value="manage:promotion" />${message("manage.role.promotion")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:coupon" />${message("manage.role.coupon")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:seo" />${message("manage.role.seo")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:sitemap" />${message("manage.role.sitemap")}
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
							<input type="checkbox" name="authorities" value="manage:statistics" />${message("manage.role.statistics")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:sales" />${message("manage.role.sales")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:salesRanking" />${message("manage.role.salesRanking")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:purchaseRanking" />${message("manage.role.purchaseRanking")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:deposit" />${message("manage.role.deposit")}
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
							<input type="checkbox" name="authorities" value="manage:setting" />${message("manage.role.setting")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:area" />${message("manage.role.area")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:paymentMethod" />${message("manage.role.paymentMethod")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:shippingMethod" />${message("manage.role.shippingMethod")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:deliveryCorp" />${message("manage.role.deliveryCorp")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:paymentPlugin" />${message("manage.role.paymentPlugin")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:storagePlugin" />${message("manage.role.storagePlugin")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:manage" />${message("manage.role.manage")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:role" />${message("manage.role.role")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:message" />${message("manage.role.message")}
						</label>
						<label>
							<input type="checkbox" name="authorities" value="manage:log" />${message("manage.role.log")}
						</label>
					</span>
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