<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vue Test</title>
    <%--<script src="https://unpkg.com/vue"></script>--%>
    <script type="application/javascript" src="/plugin/vue/vue.js"></script>
    <script type="application/javascript" src="/plugin/jquery/jquery-3.2.1.js"></script>
    <script type="application/javascript" src="/js/vueTest.js"></script>
</head>
<body>

    <div id="app">
        {{message}}
    </div>

    <div id="app-2">
      <span v-bind:title="message">
        鼠标悬停几秒钟查看此处动态绑定的提示信息！
      </span>
    </div>

    <div id="app-3">
        <p v-if="seen">现在你看到我了</p>
    </div>

    <div id="app-4">
        <ol>
            <li v-for="todo in todos">
                {{ todo.text }}
            </li>
        </ol>
    </div>

    <div id="app-5">
        <p>{{ message }}</p>
        <button v-on:click="reverseMessage">逆转消息</button>
    </div>

    <div id="app-6">
        <p>{{ message }}</p>
        <input v-model="message">
    </div>

    <div id="app-7">
        <ol>
            <!--
              现在我们为每个 todo-item 提供 todo 对象
              todo 对象是变量，即其内容可以是动态的。
              我们也需要为每个组件提供一个“key”，晚些时候我们会做个解释。
            -->
            <todo-item
                    v-for="item in groceryList"
                    v-bind:todo="item"
                    v-bind:key="item.id">
            </todo-item>
        </ol>
    </div>


</body>
</html>