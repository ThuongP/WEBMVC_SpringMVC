<%-- 
    Document   : index
    Created on : Mar 12, 2023, 9:11:45 PM
    Author     : thuon
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TRANG CHỦ</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    </head>
    <body>
        <header>
            <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
                <div class="container-fluid">
                    <a class="navbar-brand" href="javascript:void(0)">BÁN HÀNG TRỰC TUYẾN</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="mynavbar">
                        <ul class="navbar-nav me-auto">
                            <li class="nav-item">
                                <a class="nav-link" href="javascript:void(0)">Trang chủ</a>
                            </li>
                            <c:forEach items="${categories}" var = "c">
                                <li class="nav-item">
                                    <a class="nav-link" href="javascript:void(0)">${c.name}</a>
                                </li>
                            </c:forEach>
                            
                        </ul>
                        <c:url value="/" var="action"/>
                        <form class="d-flex"action="${action}">
                            <input class="form-control me-2" name="kw"type="text" placeholder="Search">
                            <button class="btn btn-primary" type="submit">Tìm</button>
                        </form>
                    </div>
                </div>
            </nav>
        </header>
    <session class="container">
        <div class="row">
            <c:forEach items="${products}" var = "p">
                <div class="col-md-3 xs-12"style="padding: 1rem">
                    <div class="card" >
                        <img class="card-img-top" src="${p.image}" alt="Card image">
                        <div class="card-body">
                            <h4 class="card-title">${p.name}</h4>
                            <p class="card-text">${p.price} VNĐ</p>
                            <a href="#" class="btn btn-primary">Xem chi tiết</a>
                            <a href="#" class="btn btn-danger">Đặt hàng</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </session>
    <footer>
        <div class="mt-4 p-5 bg-primary text-white rounded">
            <h1>Quản lý bán hàng online</h1>
            <p>Phan Thị Hoài Thương &copy; 2023</p>
        </div>
    </footer>
</body>
</html>
