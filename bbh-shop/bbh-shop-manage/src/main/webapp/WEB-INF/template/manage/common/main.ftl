[#assign shiro=JspTaglibs["/WEB-INF/tld/shiro.tld"] /]
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.main.title")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<link href="${base}/resources/manage/css/main.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
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

	var $nav = $("#nav a:not(:last)");
	var $menu = $("#menu dl");
	var $menuItem = $("#menu a");
	
	$nav.click(function() {
		var $this = $(this);
		$nav.removeClass("current");
		$this.addClass("current");
		var $currentMenu = $($this.attr("href"));
		$menu.hide();
		$currentMenu.show();
		return false;
	});
	
	$menuItem.click(function() {
		var $this = $(this);
		$menuItem.removeClass("current");
		$this.addClass("current");
	});

});
</script>
</head>
<body>
	<script type="text/javascript">
		if (self != top) {
			top.location = self.location;
		};
	</script>
	<table class="main">
		<tr>
			<th class="logo">
				<a href="main.do">
					<img src="${base}/resources/manage/images/header_logo.gif" alt="KCSHOP" />
				</a>
			</th>
			<th>
				<div id="nav" class="nav">
					<ul>
						[#list ["manage:product", "manage:productCategory", "manage:parameterGroup", "manage:attribute", "manage:specification", "manage:brand", "manage:productNotify"] as permission]
							[@shiro.hasPermission name = permission]
								<li>
									<a href="#product">${message("manage.main.productNav")}</a>
								</li>
								[#break /]
							[/@shiro.hasPermission]
						[/#list]
						[#list ["manage:order", "manage:payment", "manage:refunds", "manage:shipping", "manage:returns", "manage:deliveryCenter", "manage:deliveryTemplate"] as permission]
							[@shiro.hasPermission name = permission]
								<li>
									<a href="#order">${message("manage.main.orderNav")}</a>
								</li>
								[#break /]
							[/@shiro.hasPermission]
						[/#list]
						[#list ["manage:member", "manage:memberRank", "manage:memberAttribute", "manage:review", "manage:consultation"] as permission]
							[@shiro.hasPermission name = permission]
								<li>
									<a href="#member">${message("manage.main.memberNav")}</a>
								</li>
								[#break /]
							[/@shiro.hasPermission]
						[/#list]
						[#list ["manage:navigation", "manage:article", "manage:articleCategory", "manage:tag", "manage:friendLink", "manage:adPosition", "manage:ad", "manage:template", "manage:cache", "manage:static", "manage:index"] as permission]
							[@shiro.hasPermission name = permission]
								<li>
									<a href="#content">${message("manage.main.contentNav")}</a>
								</li>
								[#break /]
							[/@shiro.hasPermission]
						[/#list]
						[#list ["manage:promotion", "manage:coupon", "manage:seo", "manage:sitemap"] as permission]
							[@shiro.hasPermission name = permission]
								<li>
									<a href="#marketing">${message("manage.main.marketingNav")}</a>
								</li>
								[#break /]
							[/@shiro.hasPermission]
						[/#list]
						[#list ["manage:statistics", "manage:sales", "manage:salesRanking", "manage:purchaseRanking", "manage:deposit"] as permission]
							[@shiro.hasPermission name = permission]
								<li>
									<a href="#statistics">${message("manage.main.statisticsNav")}</a>
								</li>
								[#break /]
							[/@shiro.hasPermission]
						[/#list]
						[#list ["manage:setting", "manage:area", "manage:paymentMethod", "manage:shippingMethod", "manage:deliveryCorp", "manage:paymentPlugin", "manage:storagePlugin", "manage:manage", "manage:role", "manage:message", "manage:log"] as permission]
							[@shiro.hasPermission name = permission]
								<li>
									<a href="#system">${message("manage.main.systemNav")}</a>
								</li>
								[#break /]
							[/@shiro.hasPermission]
						[/#list]
						<li>
							<a href="${base}/" target="_blank">${message("manage.main.home")}</a>
						</li>
					</ul>
				</div>
				<div class="link">
					<a href="http://www.kcshop.net" target="_blank">${message("manage.main.official")}</a>|
					<a href="http://bbs.kcshop.net" target="_blank">${message("manage.main.bbs")}</a>|
					<a href="http://www.kcshop.net/about.html" target="_blank">${message("manage.main.about")}</a>
				</div>
				<div class="link">
					<strong>[@shiro.principal /]</strong>
					${message("manage.main.hello")}!
					<a href="../profile/edit.do" target="iframe">[${message("manage.main.profile")}]</a>
					<a href="../logout.jsp" target="_top">[${message("manage.main.logout")}]</a>
				</div>
			</th>
		</tr>
		<tr>
			<td id="menu" class="menu">
				<dl id="product" class="default">
					<dt>${message("manage.main.productGroup")}</dt>
					[@shiro.hasPermission name="manage:product"]
						<dd>
							<a href="../product/list.do" target="iframe">${message("manage.main.product")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:productCategory"]
						<dd>
							<a href="../product_category/list.do" target="iframe">${message("manage.main.productCategory")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:parameterGroup"]
						<dd>
							<a href="../parameter_group/list.do" target="iframe">${message("manage.main.parameterGroup")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:attribute"]
						<dd>
							<a href="../attribute/list.do" target="iframe">${message("manage.main.attribute")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:specification"]
						<dd>
							<a href="../specification/list.do" target="iframe">${message("manage.main.specification")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:brand"]
						<dd>
							<a href="../brand/list.do" target="iframe">${message("manage.main.brand")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:productNotify"]
						<dd>
							<a href="../product_notify/list.do" target="iframe">${message("manage.main.productNotify")}</a>
						</dd>
					[/@shiro.hasPermission]
				</dl>
				<dl id="order">
					<dt>${message("manage.main.orderGroup")}</dt>
					[@shiro.hasPermission name="manage:order"]
						<dd>
							<a href="../order/list.do" target="iframe">${message("manage.main.order")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:payment"]
						<dd>
							<a href="../payment/list.do" target="iframe">${message("manage.main.payment")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:refunds"]
						<dd>
							<a href="../refunds/list.do" target="iframe">${message("manage.main.refunds")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:shipping"]
						<dd>
							<a href="../shipping/list.do" target="iframe">${message("manage.main.shipping")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:returns"]
						<dd>
							<a href="../returns/list.do" target="iframe">${message("manage.main.returns")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:deliveryCenter"]
						<dd>
							<a href="../delivery_center/list.do" target="iframe">${message("manage.main.deliveryCenter")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:deliveryTemplate"]
						<dd>
							<a href="../delivery_template/list.do" target="iframe">${message("manage.main.deliveryTemplate")}</a>
						</dd>
					[/@shiro.hasPermission]
				</dl>
				<dl id="member">
					<dt>${message("manage.main.memberGroup")}</dt>
					[@shiro.hasPermission name="manage:member"]
						<dd>
							<a href="../member/list.do" target="iframe">${message("manage.main.member")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:memberRank"]
						<dd>
							<a href="../member_rank/list.do" target="iframe">${message("manage.main.memberRank")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:memberAttribute"]
						<dd>
							<a href="../member_attribute/list.do" target="iframe">${message("manage.main.memberAttribute")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:review"]
						<dd>
							<a href="../review/list.do" target="iframe">${message("manage.main.review")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:consultation"]
						<dd>
							<a href="../consultation/list.do" target="iframe">${message("manage.main.consultation")}</a>
						</dd>
					[/@shiro.hasPermission]
				</dl>
				<dl id="content">
					<dt>${message("manage.main.contentGroup")}</dt>
					[@shiro.hasPermission name="manage:navigation"]
						<dd>
							<a href="../navigation/list.do" target="iframe">${message("manage.main.navigation")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:article"]
						<dd>
							<a href="../article/list.do" target="iframe">${message("manage.main.article")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:articleCategory"]
						<dd>
							<a href="../article_category/list.do" target="iframe">${message("manage.main.articleCategory")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:tag"]
						<dd>
							<a href="../tag/list.do" target="iframe">${message("manage.main.tag")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:friendLink"]
						<dd>
							<a href="../friend_link/list.do" target="iframe">${message("manage.main.friendLink")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:adPosition"]
						<dd>
							<a href="../ad_position/list.do" target="iframe">${message("manage.main.adPosition")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:ad"]
						<dd>
							<a href="../ad/list.do" target="iframe">${message("manage.main.ad")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:template"]
						<dd>
							<a href="../template/list.do" target="iframe">${message("manage.main.template")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:cache"]
						<dd>
							<a href="../cache/clear.do" target="iframe">${message("manage.main.cache")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:static"]
						<dd>
							<a href="../static/build.do" target="iframe">${message("manage.main.static")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:index"]
						<dd>
							<a href="../index/build.do" target="iframe">${message("manage.main.index")}</a>
						</dd>
					[/@shiro.hasPermission]
				</dl>
				<dl id="marketing">
					<dt>${message("manage.main.marketingGroup")}</dt>
					[@shiro.hasPermission name="manage:promotion"]
						<dd>
							<a href="../promotion/list.do" target="iframe">${message("manage.main.promotion")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:coupon"]
						<dd>
							<a href="../coupon/list.do" target="iframe">${message("manage.main.coupon")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:seo"]
						<dd>
							<a href="../seo/list.do" target="iframe">${message("manage.main.seo")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:sitemap"]
						<dd>
							<a href="../sitemap/build.do" target="iframe">${message("manage.main.sitemap")}</a>
						</dd>
					[/@shiro.hasPermission]
				</dl>
				<dl id="statistics">
					<dt>${message("manage.main.statisticsGroup")}</dt>
					[@shiro.hasPermission name="manage:statistics"]
						<dd>
							<a href="../statistics/view.do" target="iframe">${message("manage.main.statistics")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:statistics"]
						<dd>
							<a href="../statistics/setting.do" target="iframe">${message("manage.main.statisticsSetting")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:sales"]
						<dd>
							<a href="../sales/view.do" target="iframe">${message("manage.main.sales")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:salesRanking"]
						<dd>
							<a href="../sales_ranking/list.do" target="iframe">${message("manage.main.salesRanking")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:purchaseRanking"]
						<dd>
							<a href="../purchase_ranking/list.do" target="iframe">${message("manage.main.purchaseRanking")}</a>
						</dd>
					[/@shiro.hasPermission]
						[@shiro.hasPermission name="manage:deposit"]
						<dd>
							<a href="../deposit/list.do" target="iframe">${message("manage.main.deposit")}</a>
						</dd>
					[/@shiro.hasPermission]
				</dl>
				<dl id="system">
					<dt>${message("manage.main.systemGroup")}</dt>
					[@shiro.hasPermission name="manage:setting"]
						<dd>
							<a href="../setting/edit.do" target="iframe">${message("manage.main.setting")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:area"]
						<dd>
							<a href="../area/list.do" target="iframe">${message("manage.main.area")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:paymentMethod"]
						<dd>
							<a href="../payment_method/list.do" target="iframe">${message("manage.main.paymentMethod")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:shippingMethod"]
						<dd>
							<a href="../shipping_method/list.do" target="iframe">${message("manage.main.shippingMethod")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:deliveryCorp"]
						<dd>
							<a href="../delivery_corp/list.do" target="iframe">${message("manage.main.deliveryCorp")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:paymentPlugin"]
						<dd>
							<a href="../payment_plugin/list.do" target="iframe">${message("manage.main.paymentPlugin")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:storagePlugin"]
						<dd>
							<a href="../storage_plugin/list.do" target="iframe">${message("manage.main.storagePlugin")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:manage"]
						<dd>
							<a href="../manage/list.do" target="iframe">${message("manage.main.manage")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:role"]
						<dd>
							<a href="../role/list.do" target="iframe">${message("manage.main.role")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:message"]
						<dd>
							<a href="../message/send.do" target="iframe">${message("manage.main.send")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:message"]
						<dd>
							<a href="../message/list.do" target="iframe">${message("manage.main.message")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:message"]
						<dd>
							<a href="../message/draft.do" target="iframe">${message("manage.main.draft")}</a>
						</dd>
					[/@shiro.hasPermission]
					[@shiro.hasPermission name="manage:log"]
						<dd>
							<a href="../log/list.do" target="iframe">${message("manage.main.log")}</a>
						</dd>
					[/@shiro.hasPermission]
				</dl>
			</td>
			<td>
				<iframe id="iframe" name="iframe" src="index.do" frameborder="0"></iframe>
			</td>
		</tr>
	</table>
</body>
</html>