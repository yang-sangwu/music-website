
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>音乐的播放</title>
</head>
<body>
<div class="title-text">
    <span onclick="music()">播放</span>
    <img src="QWQ.png" alt="">
    <audio src="/Users/a1002/eclipse-workspace/WebMusic/out/artifacts/WebMusic_war_exploded/WEB-INF/upload/冰壶秋月-夏日的雨林 I 莫扎特 C大调第7钢琴奏鸣曲.mp3" id="music"></audio>

</div>
<script>
    var count = 0;
    function music(){
        ++count;
        if(count % 2 == 1){
            document.getElementById("music").play();
        }else{
            document.getElementById("music").pause();
        }

    }

</script>
</body>
</html>
