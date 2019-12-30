<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.3.1.js"></script>
    <script src="js/echarts.js"></script>

    <script>

        $(function () {
            //init中是要dom对象，如果用 jquery方式获取，需要转换成dom对象
            var myChart = echarts.init($('#echartsdiv')[0]);
            var ejson = {
                xAxis: {
                    type: 'category',
                    data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
                },
                yAxis: {
                    type: 'value'
                },
                series: [{
                    data: [120, 200, 150, 80, 70, 110, 130],
                    type: 'bar'
                }]
            };


            myChart.setOption(ejson);

        })

    </script>

</head>
<body>

<div style="width:600px;height:450px;" id="echartsdiv"></div>
</body>
</html>
