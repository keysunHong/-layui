/**
 * Created by h on 2017/11/29.
 */
layui.define(["layer"],function (exports) {
    var layer = layui.layer;
    var $ = layui.$;
    /*
    如果是页面层
    */
    layer.open({
        type: 1
        ,id:"ttttt"
        // ,skin: 'layui-layer-lan'
        ,area: ['500px', '300px']
        ,content: '传入任意的文本或html' //这里content是一个普通的String
        ,btn: ['按钮一', '按钮二', '按钮三', '按钮四']
        ,btn4: function(index, layero){
            //按钮【按钮三】的回调
            alert('【按钮四】');
            console.log(layero);

            //return false 开启该代码可禁止点击该按钮关闭
        }
        ,btn1: function(index, layero){
            //按钮【按钮一】的回调
            alert('【按钮一】');
            console.log(layero);
        }
        ,btn2: function(index, layero){
            //按钮【按钮二】的回调
            alert('【按钮二】');
            console.log(layero);
            //return false 开启该代码可禁止点击该按钮关闭
        }
        ,btn3: function(index, layero){
            //按钮【按钮三】的回调
            alert('【按钮三】');
            console.log(layero);
            //return false 开启该代码可禁止点击该按钮关闭
        }

        ,cancel: function(){
            //右上角关闭回调
            // alert("cancel");
            //开启该代码可禁止点击该按钮关闭
            // return false;
        }
        // ,isOutAnim: false
        ,maxmin: true
        ,fixed: true
        ,shade:0

    });
  /*  layer.open({
        type: 1,
        content: $('.layer-test01') //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响
    });*/
    //Ajax获取
/*    $.post('http://sentsin.com', {}, function(str){
        layer.open({
            type: 1,
            content: str //注意，如果str是object，那么需要字符拼接。
        });
    });*/
    /*
        如果是iframe层
    */
  /*  layer.open({
        type: 2,
        content: 'http://sentsin.com' //这里content是一个URL，如果你不想让iframe出现滚动条，你还可以content: ['http://sentsin.com', 'no']
    });*/
    /*
        如果是用layer.open执行tips层
    */
    /*layer.open({
        type: 4,
        content: ['内容', '.layer-test01'] //数组第二项即吸附元素选择器或者DOM
    });*/
    exports("tlayer",function(){

    })
})