<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>${message("manage.seo.edit")}</title>


<link href="${base}/resources/manage/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/manage/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.tools.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/jquery.validate.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/manage/js/input.js"></script>
<style type="text/css">
.tag {
	padding-top: 8px;
	margin-top: 6px;
	display: none;
	border-top: 1px dashed #c7deff;
}

.tag a {
	padding: 6px;
	margin-right: 6px;
	border: 1px solid #98bbd2;
	background-color: #f5f9ff;
}
</style>
<script type="text/javascript">
$().ready(function() {
	
	var $inputForm = $("#inputForm");
	var $text = $(":text");
	var $tag = $("div.tag");
	
	[@flash_message /]
	
	$text.click(function() {
		var $this = $(this);
		$tag.hide();
		$this.next().show();
	});
	
	$tag.find("a").click(function() {
		var $this = $(this);
		var $text = $this.parent().prev();
		$text.val($text.val() + $this.attr("val"));
	});
	
	// 表单验证
	$inputForm.validate();
	
});
</script>
</head>
<body>
	<div class="path">
		<a href="${base}/manage/common/index.do">${message("manage.path.index")}</a> &raquo; ${message("manage.seo.edit")}
	</div>
	<form id="inputForm" action="update.do" method="post">
		<input type="hidden" name="id" value="${seo.id}" />
		<table class="input">
			<tr>
				<th>
					${message("Seo.type")}:
				</th>
				<td>
					${message("Seo.Type." + seo.type)}
				</td>
			</tr>
			<tr>
				<th>
					${message("Seo.title")}:
				</th>
				<td>
					<input type="text" name="title" class="text" value="${seo.title}" maxlength="200" />
					<div class="tag">
						[#if seo.type == "productList"]
							<a href="javascript:;" val="[#noparse]${productCategory.name}[/#noparse]">${message("manage.seo.productCategoryName")}</a>
						[#elseif seo.type == "productSearch"]
							<a href="javascript:;" val="[#noparse]${productKeyword}[/#noparse]">${message("manage.seo.productKeyword")}</a>
						[#elseif seo.type == "productContent"]
							<a href="javascript:;" val="[#noparse]${product.name}[/#noparse]">${message("manage.seo.productName")}</a>
							<a href="javascript:;" val="[#noparse]${product.fullName}[/#noparse]">${message("manage.seo.productFullName")}</a>
							<a href="javascript:;" val="[#noparse]${product.sn}[/#noparse]">${message("manage.seo.productSn")}</a>
							<a href="javascript:;" val="[#noparse]${product.productCategory.name}[/#noparse]">${message("manage.seo.productProductCategoryName")}</a>
						[#elseif seo.type == "articleList"]
							<a href="javascript:;" val="[#noparse]${articleCategory.name}[/#noparse]">${message("manage.seo.articleCategoryName")}</a>
						[#elseif seo.type == "articleSearch"]
							<a href="javascript:;" val="[#noparse]${articleKeyword}[/#noparse]">${message("manage.seo.articleKeyword")}</a>
						[#elseif seo.type == "articleContent"]
							<a href="javascript:;" val="[#noparse]${article.title}[/#noparse]">${message("manage.seo.articleTitle")}</a>
							<a href="javascript:;" val="[#noparse]${article.author}[/#noparse]">${message("manage.seo.articleAuthor")}</a>
							<a href="javascript:;" val="[#noparse]${article.pageNumber}[/#noparse]">${message("manage.seo.articlePageNumber")}</a>
							<a href="javascript:;" val="[#noparse]${article.articleCategory.name}[/#noparse]">${message("manage.seo.articleArticleCategoryName")}</a>
						[#elseif seo.type == "brandContent"]
							<a href="javascript:;" val="[#noparse]${brand.name}[/#noparse]">${message("manage.seo.brandName")}</a>
						[/#if]
						<a href="javascript:;" val="[#noparse]${setting.siteName}[/#noparse]">${message("manage.seo.settingSiteName")}</a>
						<a href="javascript:;" val="[#noparse]${setting.siteUrl}[/#noparse]">${message("manage.seo.settingSiteUrl")}</a>
						<a href="javascript:;" val="[#noparse]${setting.address}[/#noparse]">${message("manage.seo.settingAddress")}</a>
						<a href="javascript:;" val="[#noparse]${setting.phone}[/#noparse]">${message("manage.seo.settingPhone")}</a>
						<a href="javascript:;" val="[#noparse]${setting.zipCode}[/#noparse]">${message("manage.seo.settingZipCode")}</a>
						<a href="javascript:;" val="[#noparse]${setting.email}[/#noparse]">${message("manage.seo.settingEmail")}</a>
					</div>
				</td>
			</tr>
			<tr>
				<th>
					${message("Seo.keywords")}:
				</th>
				<td>
					<input type="text" name="keywords" class="text" value="${seo.keywords}" maxlength="200" title="${message("manage.seo.keywordsTitle")}" />
					<div class="tag">
						[#if seo.type == "productList"]
							<a href="javascript:;" val="[#noparse]${productCategory.name}[/#noparse]">${message("manage.seo.productCategoryName")}</a>
						[#elseif seo.type == "productSearch"]
							<a href="javascript:;" val="[#noparse]${productKeyword}[/#noparse]">${message("manage.seo.productKeyword")}</a>
						[#elseif seo.type == "productContent"]
							<a href="javascript:;" val="[#noparse]${product.name}[/#noparse]">${message("manage.seo.productName")}</a>
							<a href="javascript:;" val="[#noparse]${product.fullName}[/#noparse]">${message("manage.seo.productFullName")}</a>
							<a href="javascript:;" val="[#noparse]${product.sn}[/#noparse]">${message("manage.seo.productSn")}</a>
							<a href="javascript:;" val="[#noparse]${product.productCategory.name}[/#noparse]">${message("manage.seo.productProductCategoryName")}</a>
						[#elseif seo.type == "articleList"]
							<a href="javascript:;" val="[#noparse]${articleCategory.name}[/#noparse]">${message("manage.seo.articleCategoryName")}</a>
						[#elseif seo.type == "articleSearch"]
							<a href="javascript:;" val="[#noparse]${articleKeyword}[/#noparse]">${message("manage.seo.articleKeyword")}</a>
						[#elseif seo.type == "articleContent"]
							<a href="javascript:;" val="[#noparse]${article.title}[/#noparse]">${message("manage.seo.articleTitle")}</a>
							<a href="javascript:;" val="[#noparse]${article.author}[/#noparse]">${message("manage.seo.articleAuthor")}</a>
							<a href="javascript:;" val="[#noparse]${article.pageNumber}[/#noparse]">${message("manage.seo.articlePageNumber")}</a>
							<a href="javascript:;" val="[#noparse]${article.articleCategory.name}[/#noparse]">${message("manage.seo.articleArticleCategoryName")}</a>
						[#elseif seo.type == "brandContent"]
							<a href="javascript:;" val="[#noparse]${brand.name}[/#noparse]">${message("manage.seo.brandName")}</a>
						[/#if]
						<a href="javascript:;" val="[#noparse]${setting.siteName}[/#noparse]">${message("manage.seo.settingSiteName")}</a>
						<a href="javascript:;" val="[#noparse]${setting.siteUrl}[/#noparse]">${message("manage.seo.settingSiteUrl")}</a>
						<a href="javascript:;" val="[#noparse]${setting.address}[/#noparse]">${message("manage.seo.settingAddress")}</a>
						<a href="javascript:;" val="[#noparse]${setting.phone}[/#noparse]">${message("manage.seo.settingPhone")}</a>
						<a href="javascript:;" val="[#noparse]${setting.zipCode}[/#noparse]">${message("manage.seo.settingZipCode")}</a>
						<a href="javascript:;" val="[#noparse]${setting.email}[/#noparse]">${message("manage.seo.settingEmail")}</a>
					</div>
				</td>
			</tr>
			<tr>
				<th>
					${message("Seo.description")}:
				</th>
				<td>
					<input type="text" name="description" class="text" value="${seo.description}" maxlength="200" />
					<div class="tag">
						[#if seo.type == "productList"]
							<a href="javascript:;" val="[#noparse]${productCategory.name}[/#noparse]">${message("manage.seo.productCategoryName")}</a>
						[#elseif seo.type == "productSearch"]
							<a href="javascript:;" val="[#noparse]${productKeyword}[/#noparse]">${message("manage.seo.productKeyword")}</a>
						[#elseif seo.type == "productContent"]
							<a href="javascript:;" val="[#noparse]${product.name}[/#noparse]">${message("manage.seo.productName")}</a>
							<a href="javascript:;" val="[#noparse]${product.fullName}[/#noparse]">${message("manage.seo.productFullName")}</a>
							<a href="javascript:;" val="[#noparse]${product.sn}[/#noparse]">${message("manage.seo.productSn")}</a>
							<a href="javascript:;" val="[#noparse]${product.productCategory.name}[/#noparse]">${message("manage.seo.productProductCategoryName")}</a>
						[#elseif seo.type == "articleList"]
							<a href="javascript:;" val="[#noparse]${articleCategory.name}[/#noparse]">${message("manage.seo.articleCategoryName")}</a>
						[#elseif seo.type == "articleSearch"]
							<a href="javascript:;" val="[#noparse]${articleKeyword}[/#noparse]">${message("manage.seo.articleKeyword")}</a>
						[#elseif seo.type == "articleContent"]
							<a href="javascript:;" val="[#noparse]${article.title}[/#noparse]">${message("manage.seo.articleTitle")}</a>
							<a href="javascript:;" val="[#noparse]${article.author}[/#noparse]">${message("manage.seo.articleAuthor")}</a>
							<a href="javascript:;" val="[#noparse]${article.pageNumber}[/#noparse]">${message("manage.seo.articlePageNumber")}</a>
							<a href="javascript:;" val="[#noparse]${article.articleCategory.name}[/#noparse]">${message("manage.seo.articleArticleCategoryName")}</a>
						[#elseif seo.type == "brandContent"]
							<a href="javascript:;" val="[#noparse]${brand.name}[/#noparse]">${message("manage.seo.brandName")}</a>
						[/#if]
						<a href="javascript:;" val="[#noparse]${setting.siteName}[/#noparse]">${message("manage.seo.settingSiteName")}</a>
						<a href="javascript:;" val="[#noparse]${setting.siteUrl}[/#noparse]">${message("manage.seo.settingSiteUrl")}</a>
						<a href="javascript:;" val="[#noparse]${setting.address}[/#noparse]">${message("manage.seo.settingAddress")}</a>
						<a href="javascript:;" val="[#noparse]${setting.phone}[/#noparse]">${message("manage.seo.settingPhone")}</a>
						<a href="javascript:;" val="[#noparse]${setting.zipCode}[/#noparse]">${message("manage.seo.settingZipCode")}</a>
						<a href="javascript:;" val="[#noparse]${setting.email}[/#noparse]">${message("manage.seo.settingEmail")}</a>
					</div>
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