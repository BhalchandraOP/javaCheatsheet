<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alien Details</title>
    <link rel="icon" type="image/svg+xml" href="${pageContext.request.contextPath}/assets/svg/favicon.svg">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css">
</head>
<body class="inner-page">
<div class="stars" aria-hidden="true"></div>
<header class="site-header">
    <a class="brand" href="${pageContext.request.contextPath}/"><img src="${pageContext.request.contextPath}/assets/svg/logo-mark.svg" alt=""><span>ALIEN<span>BASE</span></span></a>
    <div class="status-pill"><i></i> MATCH FOUND</div>
</header>
<main class="result-shell">
    <section class="result-intro"><p class="eyebrow">REGISTRY SCAN COMPLETE</p><h1>LIFEFORM<br><span>IDENTIFIED.</span></h1></section>
    <article class="profile-card">
        <div class="profile-visual">
            <span class="scan-line"></span><span class="corner tl"></span><span class="corner br"></span>
            <img src="${pageContext.request.contextPath}/assets/svg/alien-avatar.svg" alt="Cartoon alien portrait">
            <small>BIOMETRIC MATCH · 99.8%</small>
        </div>
        <div class="profile-data">
            <p class="eyebrow">OFFICIAL GALACTIC RECORD</p><h2>${a.aname}</h2>
            <div class="data-row"><span>REGISTRY ID</span><strong>#${a.aid}</strong></div>
            <div class="data-row"><span>CODENAME</span><strong>${a.aname}</strong></div>
            <div class="data-row"><span>STATUS</span><strong class="active"><i></i> ACTIVE</strong></div>
            <div class="profile-actions">
                <form action="/" method="get"><button class="button secondary" type="submit">← BACK TO BASE</button></form>
                <form action="getAliens" method="get"><button class="button" type="submit">VIEW DIRECTORY →</button></form>
            </div>
        </div>
    </article>
</main>
<footer><span>ALIENBASE © 2026</span><span>CLASSIFIED · LEVEL 04 CLEARANCE</span></footer>
<script src="${pageContext.request.contextPath}/assets/js/script.js"></script>
</body></html>
