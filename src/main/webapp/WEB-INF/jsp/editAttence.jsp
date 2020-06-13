<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="workingArea">

    <form action="admin_attence_update" method="get">
        <tr class="success">
            <th>姓名</th>
            <th>部门</th>
            <th>登记日期</th>
            <th>考勤类型</th>
        </tr>
        <tr>
            <br/>
            <input type="hidden" value="${attence.id}" name="id">
            <input type="text" name="empname" placeholder="姓名" value="${attence.empname}"/>
            <input type="text" name="dept" placeholder="部门" value="${attence.dept}"/>
            <br/>
            <input type="text" name="chkdate" placeholder="登记日期" value="${attence.chkdate}"/>
            <input type="text" name="status" placeholder="考勤类型" value="${attence.status}"/>
            <br/>
            <br/>
            <button class="alert-danger" type="submit">增加</button>
        </tr>

    </form>
</div>