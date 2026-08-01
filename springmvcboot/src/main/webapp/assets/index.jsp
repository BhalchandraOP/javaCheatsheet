<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alien Management System</title>
    <link rel="icon" type="image/svg+xml" href="${pageContext.request.contextPath}/assets/svg/favicon.svg">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css">
</head>
<body>
<div class="stars" aria-hidden="true"></div>
<header class="site-header">
    <a class="brand" href="${pageContext.request.contextPath}/" aria-label="Alien base home">
        <img src="${pageContext.request.contextPath}/assets/svg/logo-mark.svg" alt="">
        <span>ALIEN<span>BASE</span></span>
    </a>
    <div class="status-pill"><i></i> SYSTEM ONLINE</div>
</header>

<main class="home-shell">
    <section class="hero">
        <div class="hero-copy">
            <img class="hero-logo" src="${pageContext.request.contextPath}/assets/svg/logo-mark.svg" alt="">
            <h1><span>ALIEN</span> MANAGEMENT SYSTEM</h1>
            <p class="hero-text">Manage your alien records with precision</p>
        </div>
        <div class="hero-art" aria-hidden="true">
            <span class="orbit orbit-one"></span><span class="orbit orbit-two"></span>
            <img class="planet" src="${pageContext.request.contextPath}/assets/svg/alien-planet.svg" alt="">
            <img class="ufo" src="${pageContext.request.contextPath}/assets/svg/ufo.svg" alt="">
        </div>
    </section>

    <section class="control-section" id="mission-control">
        <div class="section-heading">
            <div><p class="eyebrow">COMMAND DECK</p><h2>MISSION CONTROL</h2></div>
            <p>Select an operation to update the galactic registry.</p>
        </div>

        <div class="control-grid">
            <article class="action-card add-card">
                <div class="card-number">01</div><div class="card-icon">＋</div>
                <h3>REGISTER<br>NEW ALIEN</h3><p>Add a newly discovered lifeform to the universal database.</p>
                <form action="addAlien" method="post">
                    <label for="add-aid">ALIEN ID</label><input id="add-aid" type="text" name="aid" placeholder="e.g. 4096" required>
                    <label for="add-name">CODENAME</label><input id="add-name" type="text" name="aname" placeholder="e.g. Zorg" required>
                    <input type="submit" value="REGISTER LIFEFORM">
                </form>
            </article>

            <article class="action-card find-card">
                <div class="card-number">02</div><div class="card-icon">⌕</div>
                <h3>LOCATE<br>AN ALIEN</h3><p>Scan the registry for a known extraterrestrial visitor.</p>
                <form action="getAlien" method="post">
                    <label for="find-aid">ALIEN ID</label><input id="find-aid" type="text" name="aid" placeholder="Enter registry ID" required>
                    <input type="submit" value="START SCAN">
                </form>
            </article>

            <article class="action-card update-card">
                <div class="card-number">03</div><div class="card-icon">↻</div>
                <h3>UPDATE<br>IDENTITY</h3><p>Correct the codename of a lifeform already in the registry.</p>
                <form action="updateAlien" method="post">
                    <label for="update-aid">ALIEN ID</label><input id="update-aid" type="text" name="aid" placeholder="Enter registry ID" required>
                    <label for="update-name">NEW CODENAME</label><input id="update-name" type="text" name="aname" placeholder="Enter new codename" required>
                    <input type="submit" value="UPDATE RECORD">
                </form>
            </article>

            <article class="action-card delete-card">
                <div class="card-number">04</div><div class="card-icon">×</div>
                <h3>DELETE<br>RECORD</h3><p>Permanently remove a lifeform from the active registry.</p>
                <form action="deleteAlien" method="post">
                    <label for="delete-aid">ALIEN ID</label><input id="delete-aid" type="text" name="aid" placeholder="Enter registry ID" required>
                    <input class="danger" type="submit" value="DELETE RECORD">
                </form>
            </article>
        </div>

        <form class="all-records" action="getAliens" method="get">
            <div class="card-number">05</div><div class="card-icon">▤</div>
            <h3>VIEW<br>RECORDS</h3><p>Browse all registered extraterrestrial lifeforms in the system.</p>
            <button type="submit">VIEW RECORDS <span>→</span></button>
        </form>
    </section>
</main>

<footer><span>ALIENBASE © 2026</span><span>TRANSMISSION SECURE · EARTH STATION 03</span></footer>
<script src="${pageContext.request.contextPath}/assets/js/script.js"></script>
</body>
</html>
