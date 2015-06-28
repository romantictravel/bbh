<!DOCTYPE html>
<html>


<#macro htmlHead title keywords  description>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>${title}</title>
    <#if keywords??>
        <meta name="keywords" content="${keywords}" />
    </#if>
    <#if description??>
        <meta name="description" content="${description}" />
    </#if>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- basic styles -->
    <link rel="stylesheet" href="${base}/resources/assets/css/bootstrap.min.css"  />
    <link rel="stylesheet" href="${base}/resources/assets/css/font-awesome.min.css" />
    <!--[if IE 7]><link rel="stylesheet" href="${base}/resources/assets/css/font-awesome-ie7.min.css" /><![endif]-->

    <!-- ace styles -->
    <link rel="stylesheet" href="${base}/resources/assets/css/ace.min.css" />
    <link rel="stylesheet" href="${base}/resources/assets/css/ace-rtl.min.css" />
    <link rel="stylesheet" href="${base}/resources/assets/css/ace-skins.min.css" />
    <!--[if lte IE 8]><link rel="stylesheet" href="${base}/resources/assets/css/ace-ie.min.css" /><![endif]-->

    <!-- ace settings handler -->
    <script src="${base}/resources/assets/js/ace-extra.min.js"></script>

    <!--[if lt IE 9]>
    <script src="${base}/resources/assets/js/html5shiv.js"></script>
    <script src="${base}/resources/assets/js/respond.min.js"></script>
    <![endif]-->
    <#nested>
</head>
</#macro>

<#macro htmlBody>
<body>
    <#include "layout/layout01/navbar.ftl" />
    <div class="main-container" id="main-container">
        <script type="text/javascript">
            try{ace.settings.check('main-container' , 'fixed')}catch(e){}
        </script>

        <div class="main-container-inner">
            <a class="menu-toggler" id="menu-toggler" href="#">
                <span class="menu-text"></span>
            </a>
            <#include "layout/layout01/sidebar.ftl" />
            <div class="main-content">
                <#include "layout/layout01/breadcrumbs.ftl" />
                <#nested>
            </div><!-- /.main-content -->

            <div class="ace-settings-container" id="ace-settings-container">
                <div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
                    <i class="icon-cog bigger-150"></i>
                </div>

                <div class="ace-settings-box" id="ace-settings-box">
                    <div>
                        <div class="pull-left">
                            <select id="skin-colorpicker" class="hide">
                                <option data-skin="default" value="#438EB9">#438EB9</option>
                                <option data-skin="skin-1" value="#222A2D">#222A2D</option>
                                <option data-skin="skin-2" value="#C6487E">#C6487E</option>
                                <option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
                            </select>
                        </div>
                        <span>&nbsp;皮肤选择</span>
                    </div>

                    <div>
                        <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-navbar" />
                        <label class="lbl" for="ace-settings-navbar"> 导航条固定</label>
                    </div>

                    <div>
                        <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-sidebar" />
                        <label class="lbl" for="ace-settings-sidebar"> 侧边栏固定</label>
                    </div>

                    <div>
                        <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-breadcrumbs" />
                        <label class="lbl" for="ace-settings-breadcrumbs"> 面包屑固定</label>
                    </div>

                    <div>
                        <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl" />
                        <label class="lbl" for="ace-settings-rtl"> 侧边栏右停靠</label>
                    </div>

                    <div>
                        <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-add-container" />
                        <label class="lbl" for="ace-settings-add-container"> 网页居中</label>
                    </div>
                </div>
            </div><!-- /#ace-settings-container -->
        </div><!-- /.main-container-inner -->

        <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
            <i class="icon-double-angle-up icon-only bigger-110"></i>
        </a>
    </div><!-- /.main-container -->

</body>
</#macro>


<#macro htmlFoot>
    <!--[if !IE]> -->
    <script type="text/javascript">
        window.jQuery || document.write("<script src='${base}/resources/assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
    </script>
    <!-- <![endif]-->
    <!--[if IE]>
    <script type="text/javascript">
        window.jQuery || document.write("<script src='${base}/resources/assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
    </script>
    <![endif]-->
    <script type="text/javascript">
        if("ontouchend" in document) document.write("<script src='${base}/resources/assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
    </script>
    <script src="${base}/resources/assets/js/bootstrap.min.js"></script>
    <!-- ace scripts -->
    <script src="${base}/resources/assets/js/ace-elements.min.js"></script>
    <script src="${base}/resources/assets/js/ace.min.js"></script>
    <script type="text/javascript">
        jQuery(function($) {
            $('[data-rel="tooltip"]').tooltip({placement: tooltip_placement});
            function tooltip_placement(context, source) {
                var $source = $(source);
                var $parent = $source.closest('table')
                var off1 = $parent.offset();
                var w1 = $parent.width();

                var off2 = $source.offset();
                var w2 = $source.width();

                if( parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2) ) return 'right';
                return 'left';
            }
        })
    </script>
    <#nested>
</#macro>
</html>
