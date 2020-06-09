<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<title>考勤管理</title>

<div class="workingArea">
    <h1 class="label label-info" >考勤管理</h1>
    <br>
    <br>

    <div class="listDataTableDiv">
        <table class="table table-striped table-bordered table-hover  table-condensed">
            <thead>
            <tr class="success">
                <th>ID</th>
                <th>姓名</th>
                <th>部门</th>
                <th>登记日期</th>
                <th>考勤类型</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${cs}" var="c">

                <tr>
                    <td>${c.id}</td>
                    <td>${c.empname}</td>
                    <td>${c.dept}</td>
                    <td>${c.chkdata}</td>
                    <td>${c.status}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>


</div>
