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
   width: 450px;
   display: flex;
}
.kakao_i{
   background: url(resources/icons/kakao.png) no-repeat;
   width: 40px;
   height: 100%;
   background-size: 90%;
   background-position: 50%;
   margin: 0 20px;
}
.kakao_txt{
   width: 100%;
   display: flex;
   justify-content: center;
   align-items: center;
   font-size: 16px;
   padding-right: 60px;
}
a {
   text-decoration: none;
}
    </style>
</head>
<h1>여기오때 로그인</h1>
<body>

  <hr>
  <lable for="m_id">아이디</lable><br>
  <input type="text" name="m_id"><br>
  <lable for="m_pwd">비밀번호</lable><br>
  <input type="password" name="m_pwd"><br>
  <button type="submit">로그인</button><br>
  <br>
  <a class="kakao" href="https://kauth.kakao.com/oauth/authorize?client_id=cdda19f737c3c3ab653132a2289a0505&redirect_uri=http://localhost:8080/oauth/kakaoLogin&response_type=code">
    <!-- REST_API키 및 REDIRECT_URI는 본인걸로 수정하세요 -->

     <div class="kakao_i"></div>
     <div class="kakao_txt">카카오톡으로 간편로그인 </div>
  </a>
</body>
</html>