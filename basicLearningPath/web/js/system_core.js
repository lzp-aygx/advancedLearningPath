/*前端就绪函数*/
$(document).ready(function(){
	//window resize后组件宽度自适应
	$(window).resize(function(){
		$(window).unbind("onresize");  
		//window resize后重新设置所有grid的宽度
		$(".panelGrid").setGridWidth($(window).width() - 255);
		$(".panelGrid").setGridHeight($(window).height() - 200);
		$(window).bind("onresize", this);  
	});  
	//启动对body的布局
	$('body').layout({ applyDefaultStyles: true });
	//对主页的手风琴导航进行实例化
	$( "#accordion" ).accordion();
	//初始化的时候内容模块全部隐藏
	$(".panel").hide(); 
	
	//模块锁：只初始化一次模块插件 
	var userPanel=true;
	var orderPanel=true;
	var productPanel=true;

	//口风琴导航选择后的事件绑定
	$( ".selectable" ).selectable({
		stop: function() {
			//each函数
			$( ".ui-selected", this ).each(function(index, domEle) {
				alert( $(domEle).attr('id'));
				$(".panel").hide(); 
				var panelId = $(domEle).attr('id')+"Panel";
				$("#"+panelId).show();
				
				//添加点击后初始化对应模块的插件：
				switch(panelId){
					case "userPanel":
						if(userPanel){//永远只渲染一次
							new userPanelGrid2().init();
							userPanel = false;
						}
						break;
					case "orderPanel":
						if(orderPanel){
							//init
						}
						break;
					case "productPanel":
						if(productPanel){
							//init
						}
						break;
				}
			
				
			});
		}
	});
});