<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="kr">
<head>
    <meta charset="UTF-8">
    <title>요기오때 로그인</title>
    <style>
 .kakao{
   margin-top: 15px;
   height: 60px;
   border: solid 1px #FEE500;
   background: #FEE500;
   color: #3c1d1e;
   font-size: 18px;
   box-sizing: border-box;
   border-radius: 5px;
   cursor: pointer;
   width: 400px;
}

.kakao_i{
   background: url(/resources/assets/img/kakao.png) no-repeat;
   height: 100%;
   background-size: 90%;
   background-position: 50%;
   margin: 0 20px;
}

a {
   text-decoration: none;
}
.fixed-width-input{
   width: 35%;
}
.btn-block{
   width: 35%;
}

    </style>
</head>

<body>
    <div class="container">
        <h1>로그인</h1>
        <hr>
        <label for="m_id">아이디</label><br>
        <input type="text" class="form-control fixed-width-input" name="m_id"><br>
        <label for="m_pwd">비밀번호</label><br>
        <input type="password" class="form-control fixed-width-input" name="m_pwd"><br>
        <button type="submit" class="btn btn-primary btn-block">로그인</button><br>

        <a class="kakao" href="https://kauth.kakao.com/oauth/authorize?client_id=cdda19f737c3c3ab653132a2289a0505&redirect_uri=http://localhost:8080/oauth/kakaoLogin&response_type=code">
            <!-- REST_API키 및 REDIRECT_URI는 본인걸로 수정하세요 -->
            <div class="kakao_i"></div>
        </a>
    </div>
</body>
</html>