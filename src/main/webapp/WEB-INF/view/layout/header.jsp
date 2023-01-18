<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <!-- 이 첫줄을 보고 jsp라고 인식함-->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>구매 서버</title>
        </head>

        <body>
            <ul>
                <li>
                    <a href="/">상품 목록</a>
                </li>
                <li>
                    <a href="/loginForm">로그인</a> <!-- 인증에 관련된(수행하는) 페이지는 앞에 폴더이름을 안붙이는 규칙이 있음 (접속하기전에 필터링을 함)-->
                </li>
                <li>
                    <a href="/joinForm">회원가입</a>
                </li>
                <li>
                    <a href="/purchase">구매 목록보기</a> <!-- 로그인이 이미 완료되어야(인증된) 갈수있는 페이지는 상관없음 -->
                </li>
                <li>
                    <a href="/logout">로그아웃</a>
                </li>
            </ul>