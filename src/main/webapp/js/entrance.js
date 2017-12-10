/**
 * Created by h on 2017/11/27.
 */
layui.config({
    base: '/js/modules/' //你存放新模块的目录，注意，不是layui的模块目录
})

/*
layui.use('index',function () {

});
*/
/*
layui.use('demo',function () {
    var demo = layui.demo;
    demo();
});
*/

layui.use('tlayer',function () {

});

layui.use('form', function(){
    var form = layui.form;

    //监听提交
    form.on('submit(formDemo)', function(data){
        layer.msg(JSON.stringify(data.field));
        return false;
    });
});