<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/1
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <input type="text" value="1,4,2,3,4,1,2,8,9,5" disabled="true" id="arr">
  <input type="button" id="quickSort" value="快速排序">
  <input type="text" id="quickSortResult" disabled="true">
  <input type="button" id="bubbleSort" value="冒泡排序">
  <input type="text" id="bubbleSortResult" disabled="true">
  <input type="button" id="selectSort" value="选择排序">
  <input type="text" id="selectSortResult" disabled="true">

  </body>
  <script type="text/javascript" src="/js/jquery.min.js"></script>
  <script type="text/javascript">
    $(function () {
      $('#quickSort').click(function(){
        var url="/main/quickSort";
        var arr=$('#arr').val();
        $.post(url,{arr:arr},function (data){
          $('#quickSortResult').val(data.msg);
        })
      });

      $('#bubbleSort').click(function(){
        var url="/main/bubbleSort";
        var arr=$('#arr').val();
        $.post(url,{arr:arr},function (data){
          $('#bubbleSortResult').val(data.msg);
        })
      });

      $('#selectSort').click(function(){
        var url="/main/selectSort";
        var arr=$('#arr').val();
        $.post(url,{arr:arr},function (data){
          $('#selectSortResult').val(data.msg);
        })
      });
    });
    </script>
</html>
