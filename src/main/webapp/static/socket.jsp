<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>socket</title>
</head>
<script>
    var ws = new WebSocket('ws://localhost:8080/websocket/handler');

    ws.onopen = function (ev) {
        console.log("connecting...");
        ws.send("hello world");
    };

    ws.onmessage = function (ev) {
        console.log('receive msg: ' + ev.data);
        setTimeout(1000);
        console.log('xxx')
    };

    ws.onclose = function (ev) {
        console.log('closing...')
    }
</script>
<body>

</body>
</html>
