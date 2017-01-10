$(document).ready(function () {
    //隐藏后续Table
    $("#tissueTable2").hide();
    $("#tissueTable3").hide();
    //定义动态Table跳转变量
    var pageNo = 1;
    //下一步按钮显示不用table
    $(".footNextButton").click(function () {
        $("#tissueTable" + pageNo).hide();
        pageNo = pageNo + 1;
        $("#tissueTable" + pageNo).show();
    });
    //返回按钮
    $(".footBackwardButton").click(function () {
        $("#tissueTable" + pageNo).hide();
        pageNo = pageNo - 1;
        $("#tissueTable" + pageNo).show();
    })

});