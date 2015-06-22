/*



 * 
 * JavaScript - Input
 * Version: 3.0
 */

$().ready( function() {
	
	var $backButton = $("#backButton");
	
	if ($.tools != null) {
		var $tab = $("#tab");
		var $title = $("#inputForm :input[title], #inputForm label[title]");

		// Tab效果
		$tab.tabs("table.tabContent, div.tabContent", {
			tabs: "input"
		});
	
		// 表单提示
		$title.tooltip({
			position: "center right",
			offset: [0, 4],
			effect: "fade"
		});
	}
	
	// 返回上一页
	$backButton.click( function() {
		location.href = document.referrer;
		return false;
	});

	// 验证消息
	if($.validator != null) {
		$.extend($.validator.messages, {
		    required: message("manage.validate.required"),
			email: message("manage.validate.email"),
			url: message("manage.validate.url"),
			date: message("manage.validate.date"),
			dateISO: message("manage.validate.dateISO"),
			pointcard: message("manage.validate.pointcard"),
			number: message("manage.validate.number"),
			digits: message("manage.validate.digits"),
			minlength: $.validator.format(message("manage.validate.minlength")),
			maxlength: $.validator.format(message("manage.validate.maxlength")),
			rangelength: $.validator.format(message("manage.validate.rangelength")),
			min: $.validator.format(message("manage.validate.min")),
			max: $.validator.format(message("manage.validate.max")),
			range: $.validator.format(message("manage.validate.range")),
			accept: message("manage.validate.accept"),
			equalTo: message("manage.validate.equalTo"),
			remote: message("manage.validate.remote"),
			integer: message("manage.validate.integer"),
			positive: message("manage.validate.positive"),
			negative: message("manage.validate.negative"),
			decimal: message("manage.validate.decimal"),
			pattern: message("manage.validate.pattern"),
			extension: message("manage.validate.extension")
		});
		
		$.validator.setDefaults({
			errorClass: "fieldError",
			ignore: ".ignore",
			ignoreTitle: true,
			errorPlacement: function(error, element) {
				var fieldSet = element.closest("span.fieldSet");
				if (fieldSet.size() > 0) {
					error.appendTo(fieldSet);
				} else {
					error.insertAfter(element);
				}
			},
			submitHandler: function(form) {
				$(form).find(":submit").prop("disabled", true);
				form.submit();
			}
		});
	}

});

// 编辑器
if(typeof(KindEditor) != "undefined") {
	KindEditor.ready(function(K) {
		editor = K.create("#editor", {
			height: "350px",
			items: [
				"source", "|", "undo", "redo", "|", "preview", "print", "template", "cut", "copy", "paste",
				"plainpaste", "wordpaste", "|", "justifyleft", "justifycenter", "justifyright",
				"justifyfull", "insertorderedlist", "insertunorderedlist", "indent", "outdent", "subscript",
				"superscript", "clearhtml", "quickformat", "selectall", "|", "fullscreen", "/",
				"formatblock", "fontname", "fontsize", "|", "forecolor", "hilitecolor", "bold",
				"italic", "underline", "strikethrough", "lineheight", "removeformat", "|", "image",
				"flash", "media", "insertfile", "table", "hr", "emoticons", "baidumap", "pagebreak",
				"anchor", "link", "unlink"
			],
			langType: kcshop.locale,
			syncType: "form",
			filterMode: false,
			pagebreakHtml: '<hr class="pageBreak" \/>',
			allowFileManager: true,
			filePostName: "file",
			fileManagerJson: kcshop.base + "/manage/file/browser.do",
			uploadJson: kcshop.base + "/manage/file/upload.do",
			uploadImageExtension: setting.uploadImageExtension,
			uploadFlashExtension: setting.uploadFlashExtension,
			uploadMediaExtension: setting.uploadMediaExtension,
			uploadFileExtension: setting.uploadFileExtension,
			extraFileUploadParams: {
				token: getCookie("token")
			},
			afterChange: function() {
				this.sync();
			}
		});
	});
}