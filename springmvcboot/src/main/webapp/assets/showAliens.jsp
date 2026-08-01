<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Galactic Directory</title>
    <link rel="icon" type="image/svg+xml" href="${pageContext.request.contextPath}/assets/svg/favicon.svg">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css">
</head>
<body class="inner-page directory-page">
<div class="stars" aria-hidden="true"></div>
<header class="site-header">
    <a class="brand" href="${pageContext.request.contextPath}/"><img src="${pageContext.request.contextPath}/assets/svg/logo-mark.svg" alt=""><span>ALIEN<span>BASE</span></span></a>
    <div class="status-pill"><i></i> DIRECTORY ONLINE</div>
</header>
<main class="directory-shell">
    <div class="directory-heading"><div><p class="eyebrow">UNIVERSAL REGISTRY</p><h1>KNOWN <span>LIFEFORMS</span></h1></div><div class="record-count">LIVE DATABASE<br><b>ALL SECTORS</b></div></div>
    <section class="directory-card">
        <div class="table-toolbar"><span><i></i> REGISTERED ALIENS</span><small>SECURE DATA STREAM</small></div>
        <div class="table-wrap">
            <table>
                <thead><tr><th>REGISTRY ID</th><th>CODENAME</th><th>STATUS</th><th>PROFILE</th></tr></thead>
                <tbody>
                <c:forEach items="${a}" var="alien" varStatus="loop">
                    <tr>
                        <td><span class="id-chip">#${alien.aid}</span></td>
                        <td><span class="list-avatar">👽</span><strong>${alien.aname}</strong></td>
                        <td><span class="active status"><i></i> ACTIVE</span></td>
                        <td><form action="getAlien" method="post"><input type="hidden" name="aid" value="${alien.aid}"><input class="view-button" type="submit" value="VIEW →"></form></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <form class="directory-back" action="/" method="get"><button class="button secondary" type="submit">← RETURN TO MISSION CONTROL</button></form>
    </section>
</main>
<footer><span>ALIENBASE © 2026</span><span>TRANSMISSION SECURE · EARTH STATION 03</span></footer>
<script src="${pageContext.request.contextPath}/assets/js/script.js"></script>
</body></html>
