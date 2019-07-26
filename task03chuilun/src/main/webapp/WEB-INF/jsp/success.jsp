<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isErrorPage="true" %>
<%@page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%--<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>--%>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<!doctype html>
<html>
<head>
    <title>成功页面</title>
</head>
<body>
<json:object>
    <json:property name="code" value="${code}"></json:property><br>
    <json:property name="message" value="${message}"></json:property><br>
    <json:property name="data" value="${data}"></json:property>
</json:object>
<%--<json:array name="data" var="item" items="${data}">--%>
<%--   <json:property name="id" value="${item.id}"></json:property>--%>
<%--    <json:property name="workname" value="${item.workname}"></json:property>--%>
<%--    <json:property name="firstid" value="${item.firstid}"></json:property>--%>
<%--    <json:property name="state" value="${item.state}"></json:property>--%>
<%--    <json:property name="compileby" value="${item.compileby}"></json:property>--%>
<%--    <json:property name="create_at" value="${item.create_at}"></json:property>--%>
<%--    <json:property name="update_at" value="${item.update_at}"></json:property>--%>
<%--</json:array>--%>


<%--<json:array name="data" var="item" items="${data}">--%>
<%--   <json:property name="id" value="${item.id}"></json:property>--%>
<%--    <json:property name="workname" value="${item.picture}"></json:property>--%>
<%--    <json:property name="firstid" value="${item.url}"></json:property>--%>
<%--    <json:property name="state" value="${item.state}"></json:property>--%>
<%--    <json:property name="compileby" value="${item.compileby}"></json:property>--%>
<%--    <json:property name="create_at" value="${item.create_at}"></json:property>--%>
<%--    <json:property name="update_at" value="${item.update_at}"></json:property>--%>
<%--</json:array>--%>


<%--<json:array name="data" var="item" items="${data}">--%>
<%--    <json:property name="id" value="${item.id}"></json:property>--%>
<%--    <json:property name="workname" value="${item.name}"></json:property>--%>
<%--    <json:property name="firstid" value="${item.url}"></json:property>--%>
<%--    <json:property name="state" value="${item.state}"></json:property>--%>
<%--    <json:property name="compileby" value="${item.compileby}"></json:property>--%>
<%--    <json:property name="create_at" value="${item.create_at}"></json:property>--%>
<%--    <json:property name="update_at" value="${item.update_at}"></json:property>--%>
<%--    <json:property name="parent_id" value="${item.parent_id}"></json:property>--%>
<%--    <json:property name="introduce" value="${item.introduce}"></json:property>--%>
<%--    <json:property name="article" value="${item.article}"></json:property>--%>
<%--</json:array>--%>
</body>
</html>
