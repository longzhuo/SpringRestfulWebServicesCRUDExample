<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" />
	<title>Document</title>
	<link rel="stylesheet" href="css/dropload.css">

	<style>
   
   
    body {
    margin: 0;
    padding: 0;
    font-family: SimSun;
    font-size: 12px;
    color: #5e5e5e;
    font-family: "微软雅黑";
    background: #f4f5f6;
    position: relative;
}
    .tab{
        display: -webkit-box;
        display: -webkit-flex;
        display: -ms-flexbox;
        display: flex;
        height: 44px;
        line-height: 44px;
        border-bottom: 1px solid #cfcfcf;
        background-color: #fff;
    }
    .tab .item{
        display: block;
        -webkit-box-flex: 1;
        -webkit-flex: 1;
        -ms-flex: 1;
        flex: 1;
        width: 100%;
        font-size: 14px;
        text-align: center;
        color: #333;
        text-decoration: none;
    }
    .tab .cur{
        height: 42px;
        border-bottom: 2px solid #5582ff;
    
    }
    .content{
        background-color: #fff;
        margin-bottom: 50px;
    }
    .content .item{
        display: -webkit-box;
        display: -webkit-flex;
        display: -ms-flexbox;
        display: flex;
        -ms-flex-align:center;
        -webkit-box-align:center;
        box-align:center;
        -webkit-align-items:center;
        align-items:center;
        padding:3.125%;
        border-bottom: 1px solid #ddd;
        color: #333;
        text-decoration: none;
    }
    .content .item img{
        display: block;
        width: 40px;
        height: 40px;
        border:1px solid #ddd;
    }
    .content .item h3{
        display: block;
        -webkit-box-flex: 1;
        -webkit-flex: 1;
        -ms-flex: 1;
        flex: 1;
        width: 100%;
        max-height: 40px;
        overflow: hidden;
        line-height: 20px;
        margin: 0 10px;
        font-size: 1.2rem;
    }
    .content .item .date{
        display: block;
        height: 20px;
        line-height: 20px;
        color: #999;
    }
    .opacity{
        -webkit-animation: opacity 0.3s linear;
        animation: opacity 0.3s linear;
    }
    @-webkit-keyframes opacity {
        0% {
            opacity:0;
        }
        100% {
            opacity:1;
        }
    }
    @keyframes opacity {
        0% {
            opacity:0;
        }
        100% {
            opacity:1;
        }
    }
    .dropload-down{
     height: 50px;
    text-align: center;
    }
    .ls_list {
    width: 94%;
    height: 110px;
    padding: 10px 0;
    margin: 0 auto;
    border-bottom: 1px solid #e8e8e8;
}
.ls_lie {
    width: 90%;
    line-height: 34px;
    color: #5582FF;
    font-size: 1.25rem;
    display: inline-block;
}
.ls_mian {
    width: 10%;
    line-height: 34px;
    color: #53c85b;
    font-size: 0.75rem;
    text-align: right;
    float: right;
}
.ls_stage {
    width: 100%;
    display: block;
    color: #2d2d2d;
    font-size: 0.77rem;
    line-height: 20px;
}
.ls_source {
    width: 50%;
    float: left;
    display: block;
    color: #b2b2b2;
    line-height: 28px;
    font-size: 0.75rem;
}
.ls_tim {
    width: 50%;
    float: right;
    text-align: right;
    display: block;
    color: #b2b2b2;
    line-height: 28px;
    font-size: 0.75rem;
}
a {
    text-decoration: none;
    color: #5e5e5e;
}
 header {
    background: #5582ff;
    width: 100%;
    height: 50px;
    position: fixed;
    z-index: 99;
}
.back {
    float: left;
}
header div p {
    text-align: center;
    line-height: 50px;
    color: #fff;
    font-size: 1.2rem;
}
img, h1, h2, h3, h4, h5, h6, p, div, ul, li, a, dl, dt, dd, table, tr, td, ol {
    margin: 0;
    padding: 0;
    border: 0;
    list-style: none;
    text-decoration: none;
    font-weight: normal;
}
.station {
    height: 50px;
}
.bao_bottom {
    width: 100%;
    height: 40px;
    background: #f0f0f0;
    position: fixed;
    bottom: 0;
}
.b_bot_kuan {
    width: 90%;
    height: 40px;
    border: 1px solid #f0f0f0;
    margin: 0 auto;
}
.b_bot_kuan ul {
    display: flex;
    margin: 0 auto;
    text-align: center;
    justify-content: space-between;
}
.b_bot_kuan ul li {
    height: 40px;
    line-height: 40px;
    overflow: hidden;
    padding: 0 3vw;
    width: 49%;
}
.share_im {
    display: inline-block;
    vertical-align: middle;
    margin-right: 5px;
    margin-top: -6px;
}
.back img {
    width: 12.5px;
    height: 22px;
    padding: 14px 0 0 3vw;
}
    </style>
</head>
<body>
<header>
		<div>
			<li class="back"><a onclick="javascript:history.back()"><img src="images/arrow.png"></a></li>
			<p>热点</p>
		</div>
	</header>
	<div class="station"></div>
<div class="tab">
    <a href="javascript:;" class="item">头条</a>
    <a href="javascript:;" class="item cur">新闻</a>
    <a href="javascript:;" class="item">论坛</a>
    <a href="javascript:;" class="item">微博</a>
</div>
<div class="content">
    <div class="lists"></div>
    <div class="lists"></div>
    <div class="lists"></div>
    <div class="lists"></div>
    <div style="clear: both;"></div>
</div>
<div class="bao_bottom">
		<div class="b_bot_kuan">
			<ul>
				<li><img class="share_im" src="images/baogao_bot_icon01.png" />分享</li>
				<li><img class="share_im" src="images/baogao_bot_icon02.png" />收藏</li>
			</ul>

		</div>
	</div>
	<script src="js/zepto.min.js"></script>
    <script src="js/dropload.min.js"></script>
    <script>
$(function(){
    var itemIndex = 1;
    var tab1LoadEnd = false;
    var tab2LoadEnd = false;
    var tab3LoadEnd = false;
    var tab4LoadEnd = false;
    // tab
     $('.tab .item').on('click',function(){
        var $this = $(this);
        itemIndex = $this.index();
        $this.addClass('cur').siblings('.item').removeClass('cur');
        $('.lists').eq(itemIndex).show().siblings('.lists').hide();

        // 如果选中菜单一
        if(itemIndex == '0'){
            // 如果数据没有加载完
            if(!tab1LoadEnd){
                // 解锁
                dropload.unlock();
                dropload.noData(false);
            }else{
                // 锁定
                dropload.lock('down');
                dropload.noData();
            }
        // 如果选中菜单二
        }else if(itemIndex == '1'){
            if(!tab2LoadEnd){
                // 解锁
                dropload.unlock();
                dropload.noData(false);
            }else{
                // 锁定
                dropload.lock('down');
                dropload.noData();
            }
        
            //如果选中菜单三
         }else if(itemIndex == '2'){
            	if(!tab3LoadEnd){
                // 解锁
                dropload.unlock();
                dropload.noData(false);
            }else{
                // 锁定
                dropload.lock('down');
                dropload.noData();
            }
             //如果选中菜单四
        }else if(itemIndex == '3'){
        	if(!tab4LoadEnd){
                // 解锁
                dropload.unlock();
                dropload.noData(false);
            }else{
                // 锁定
                dropload.lock('down');
                dropload.noData();
            }
        }
        // 重置
        dropload.resetload();
    });


  var counter = 0;
   var counter2 = 0;
   var counter3 = 0;  
   var counter4 = 0;                   
    // dropload
    var dropload = $('.content').dropload({
    	scrollArea : window,
        loadDownFn : function(me){
            // 加载菜单一的数据
            if(itemIndex == '0'){
             var num = 5;
                var pageStart = 0,pageEnd = 0;
                $.ajax({
                    type: 'GET',
                    url: 'json/home.json',
                    dataType: 'json',
                    success: function(data){
                        var result = '';
                        counter++;
                        pageEnd = num * counter;
                        pageStart = pageEnd - num;
                        if(pageStart <= data.lists.length){
                            for(var i = pageStart; i < pageEnd; i++){
                                result +=   '<div class="ls_list" list_id="'+data.lists[i].link+'">'+
					                       '<span class="ls_lie">'+data.lists[i].title+'</span>'+
											'<span class="ls_mian">正面</span>'+
											'<a href="热点详情.html" class="ls_stage">'+data.lists[i].detail+'</a>'+
											'<span class="ls_source">来源：'+data.lists[i].laiyuan+'</span>'+
											'<span class="ls_tim">时间：'+data.lists[i].date+'</span>'+
					                        '</div>';
                                if((i + 1) >= data.lists.length){
                                    // 数据加载完
                                    tab1LoadEnd = true;
                                    // 锁定
                                    me.lock();
                                    // 无数据
                                    me.noData();
                                    break;
                                }
                            }
                            // 为了测试，延迟1秒加载
                            setTimeout(function(){
                                $('.lists').eq(0).append(result);
                                // 每次数据加载完，必须重置
                                me.resetload();
                            },1000);
                        }
                    },
                    error: function(xhr, type){
                        alert('Ajax error!');
                        // 即使加载出错，也得重置
                        me.resetload();
                    }
                });
            // 加载菜单二的数据
            }else if(itemIndex == '1'){
            var num = 5;
                var pageStart = 0,pageEnd = 0;
                $.ajax({
                    type: 'GET',
                    url: 'http://localhost:8080/SpringRestfulWebServicesCRUDExample/news',  // 新闻真的数据
                    dataType: 'json',
                    success: function(data){
                        var result = '';
                        counter2++;
                        pageEnd = num * counter2;
                        pageStart = pageEnd - num;
                        if(pageStart <= data.lists.length){
                            for(var i = pageStart; i < pageEnd; i++){
                            result +=   '<div class="ls_list" list_id="'+data.lists[i].link+'">'+
					                       '<span class="ls_lie">'+data.lists[i].title+'</span>'+
											'<span class="ls_mian">正面</span>'+
											'<a href="热点详情.html" class="ls_stage">'+data.lists[i].detail+'</a>'+
											'<span class="ls_source">来源：'+data.lists[i].laiyuan+'</span>'+
											'<span class="ls_tim">时间：'+data.lists[i].date+'</span>'+
					                        '</div>';
					              if((i + 1) >= data.lists.length){
                                    // 数据加载完
                                    tab2LoadEnd = true;
                                    // 锁定
                                    me.lock();
                                    // 无数据
                                    me.noData();
                                    break;
                                }
                        }
                        // 为了测试，延迟1秒加载
                        setTimeout(function(){
                            $('.lists').eq(1).append(result);
                            // 每次数据加载完，必须重置
                            me.resetload();
                        },1000);
                    }
                    },
                    error: function(xhr, type){
                        alert('Ajax error!');
                        // 即使加载出错，也得重置
                        me.resetload();
                    }
                });
                // 加载菜单三的数据
            }else if(itemIndex == '2'){
            var num = 5;
                var pageStart = 0,pageEnd = 0;
            	$.ajax({
                    type: 'GET',
                    url: 'json/bbs.json',
                    dataType: 'json',
                    success: function(data){
                        var result = '';
                        counter3++;
                        pageEnd = num * counter3;
                        pageStart = pageEnd - num;
                        if(pageStart <= data.lists.length){
                            for(var i = pageStart; i < pageEnd; i++){
                            result +=   '<div class="ls_list" list_id="'+data.lists[i].link+'">'+
					                       '<span class="ls_lie">'+data.lists[i].title+'</span>'+
											'<span class="ls_mian">正面</span>'+
											'<a href="热点详情.html" class="ls_stage">'+data.lists[i].detail+'</a>'+
											'<span class="ls_source">来源：'+data.lists[i].laiyuan+'</span>'+
											'<span class="ls_tim">时间：'+data.lists[i].date+'</span>'+
					                        '</div>';
					              if((i + 1) >= data.lists.length){
                                    // 数据加载完
                                    tab3LoadEnd = true;
                                    // 锁定
                                    me.lock();
                                    // 无数据
                                    me.noData();
                                    break;
                                }
					             
                        }
                        setTimeout(function(){
                            $('.lists').eq(2).append(result);
                            // 每次数据加载完，必须重置
                            me.resetload();
                        },1000);
                    }
                    },
                    error: function(xhr, type){
                        alert('Ajax error!');
                        // 即使加载出错，也得重置
                        me.resetload();
                    }
                });
                // 加载菜单四的数据
            }else if(itemIndex == '3'){
 var num = 5;
                var pageStart = 0,pageEnd = 0;
            	$.ajax({
                    type: 'GET',
                    url: 'json/weibo.json',
                    dataType: 'json',
                    success: function(data){
                        var result = '';
                        counter4++;
                        pageEnd = num * counter4;
                        pageStart = pageEnd - num;
                        if(pageStart <= data.lists.length){
                            for(var i = pageStart; i < pageEnd; i++){
                            result +=   '<div class="ls_list" list_id="'+data.lists[i].link+'">'+
					                       '<span class="ls_lie">'+data.lists[i].title+'</span>'+
											'<span class="ls_mian">正面</span>'+
											'<a href="热点详情.html" class="ls_stage">'+data.lists[i].detail+'</a>'+
											'<span class="ls_source">来源：'+data.lists[i].laiyuan+'</span>'+
											'<span class="ls_tim">时间：'+data.lists[i].date+'</span>'+
					                        '</div>';
					            if((i + 1) >= data.lists.length){
                                    // 数据加载完
                                    tab4LoadEnd = true;
                                    // 锁定
                                    me.lock();
                                    // 无数据
                                    me.noData();
                                    break;
                                }
					         
                        }
                        setTimeout(function(){
                            $('.lists').eq(3).append(result);
                            // 每次数据加载完，必须重置
                            me.resetload();
                        },1000);
                    }
                    },
                    error: function(xhr, type){
                        alert('Ajax error!');
                        // 即使加载出错，也得重置
                        me.resetload();
                    }
                });
            }
        }
    });
});
</script>
</body>
</body>
</html>