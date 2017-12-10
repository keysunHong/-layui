/**
 * Created by h on 2017/11/30.
 */
layui.define(['table','element','jquery'],function (exports) {
    var element = layui.element;
    var table = layui.table;
    var $ = layui.$;

    table.render({
        elem: '.table-content' + 0
        ,skin: 'row'
        ,limits: [5,10,50]
        ,limit: 5
        ,loading: true
        ,height: 365
        ,page: true
        ,even : true
        ,size : 'lg'
        ,cols: [[
            {field: 'Project', title: 'Project', width:140 , sort: true, align:'center'}
            , {field: 'Spider', title: 'Spider', width: 175, sort: true, align:'center'}
            , {field: 'LastStatus', title: 'LastStatus', width: 140, sort: true, align:'center'}
            , {field: 'LastStart', title: 'LastStart', width: 175, sort: true, align:'center'}
            , {field: 'LastFinish', title: 'LastFinish', width: 175, sort: true, align:'center'}
            , {field: 'schdule', title: 'schdule', toolbar: '<div> <a class="layui-btn layui-btn-normal" lay-event="start-up">启动</a><a class="layui-btn layui-btn-disabled " lay-event="shut-down">停止</a></div>', width: 175}
        ]]
        ,data: [{
                "Project":"xueqiuSpider0"
                ,"Spider":"spd_rong_licai_bank"
                ,"LastStatus":"Running"
                ,"LastStart":"2017-09-26 15:20:30"
                ,"LastFinish":"2017-09-27 11:24:04"
            }
            ,{
                "Project":"xueqiuSpider1"
                ,"Spider":"spd_rong_licai_bank"
                ,"LastStatus":"Running"
                ,"LastStart":"2017-09-26 15:20:30"
                ,"LastFinish":"2017-09-27 11:24:04"
            }
            ,{
                "Project":"xueqiuSpider2"
                ,"Spider":"spd_rong_licai_bank"
                ,"LastStatus":"Running"
                ,"LastStart":"2017-09-26 15:20:30"
                ,"LastFinish":"2017-09-27 11:24:04"
            }
            ,{
                "Project":"xueqiuSpider3"
                ,"Spider":"spd_rong_licai_bank"
                ,"LastStatus":"Running"
                ,"LastStart":"2017-09-26 15:20:30"
                ,"LastFinish":"2017-09-27 11:24:04"
            }
            ,{
                "Project":"xueqiuSpider4"
                ,"Spider":"spd_rong_licai_bank"
                ,"LastStatus":"Running"
                ,"LastStart":"2017-09-26 15:20:30"
                ,"LastFinish":"2017-09-27 11:24:04"
            }
            ,{
                "Project":"xueqiuSpider5"
                ,"Spider":"spd_rong_licai_bank"
                ,"LastStatus":"Running"
                ,"LastStart":"2017-09-26 15:20:30"
                ,"LastFinish":"2017-09-27 11:24:04"
            }
            ,{
                "Project":"xueqiuSpider6"
                ,"Spider":"spd_rong_licai_bank"
                ,"LastStatus":"Running"
                ,"LastStart":"2017-09-26 15:20:30"
                ,"LastFinish":"2017-09-27 11:24:04"
            }
        ]
    });

    table.on('tool(table-content0)', function(obj){
        console.log(obj);
    });
    //监听排序
    table.on('sort(table-content0)', function(obj) {

    });

    element.on('tab(main)', function(data) {

    });




    exports("spiderTabs",function(){

    });
})