<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<script src="https://how2j.cn/study/vue.min.js"></script>
<link href="https://how2j.cn/study/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
<script src="https://how2j.cn/study/js/bootstrap/3.3.6/bootstrap.min.js"></script>
<script>
    $(function () {
        $("#add1").submit(function () {
            if (!checkEmpty("name", "考勤管理"))
                return false;
            return true;
        });
    });
    del(function (id) {
        alert("您确定要删除吗?");
    })

</script>
<style>

    .workingArea {
        margin: 30px;

    }

    #data1 {
        align-content: center;
    }

    h1 {
        color: lightcoral;
    }

    #table1 {
        table-layout: fixed;
        border-collapse: separate;
        border-style: solid;
        border-color: darkgrey;
    }

    #table1 {
        text-align: center;
    }
</style>
<title>考勤管理</title>

<div class="workingArea">
    <h1>考勤管理</h1>
    <br>
    <div class="listDataTableDiv">
        <table id="table1" border="solid">
            <thead>
            <tr class="success1">
                <th style="text-align: center">ID</th>
                <td></td>
                <th style="text-align: center">姓名</th>
                <th style="text-align: center">部门</th>
                <th style="text-align: center">登记日期</th>
                <th></th>
                <th style="text-align: center">考勤类型</th>
                <th style="text-align: center">操</th>
                <th style="text-align: center">作</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach items="${cs}" var="c">
                <tr>
                    <td>${c.id}</td>
                    <td></td>
                    <td>${c.empname}</td>
                    <td>${c.dept}</td>
                    <td>
                            ${c.chkdate}
                    </td>
                    <td></td>
                    <td style="text-align: center">${c.status}</td>
                    <td>
                        <a href="admin_attence_selectById?id=${c.id}">
                            修改</a>
                    </td>
                    <td>
                        <a id="delete1" href="admin_attence_delete?id=${c.id}">
                            删除</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <br/><br/>
    </div>

    <form id="add1" action="admin_attence_add" method="get">
        <input type="text" name="empname" placeholder="姓名"/>
        <input type="text" name="dept" placeholder="部门"/>
        <br/>
        <input type="text" name="chkdate" placeholder="登记日期"/>
        <input type="text" name="status" placeholder="考勤类型"/>
        <br/>
        <br/>
        <button class="alert-danger" type="submit">增加</button>
    </form>
</div>


