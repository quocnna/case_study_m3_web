<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>
<head>
    <title><tiles:getAsString name="title" /></title>
    <title>Furama Resort</title>
    <link rel="stylesheet" href="../assets/style.css">
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
<div class="container-fluid">
    <tiles:insertAttribute name="header" />

    <%--    <nav class="row border">--%>
    <%--        <div class="col-9">--%>
    <%--            <nav class="nav ps-5">--%>
    <%--                <a class="nav-link active" aria-current="page" href="#">Home</a>--%>
    <%--                <a class="nav-link" href="#">Employee</a>--%>
    <%--                <a class="nav-link" href="#">Customer</a>--%>
    <%--                <a class="nav-link" href="#">Service</a>--%>
    <%--                <a class="nav-link" href="#">Contract</a>--%>
    <%--            </nav>--%>
    <%--        </div>--%>
    <%--        <div class="col-3">--%>
    <%--            <a class="btn btn-primary float-end" id="btSearch">Search</a>--%>
    <%--            <input class="form-control-sm float-end" id="ipSearch"/>--%>
    <%--        </div>--%>
    <%--    </nav>--%>
    <main class="row">
        <tiles:insertAttribute name="menu" />
        <div class="col-11">
            <tiles:insertAttribute name="body" />
        </div>
    </main>
<%--    <tiles:insertAttribute name="footer" />--%>
</div>

<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="../assets/main.js"></script>
</body>
</html>