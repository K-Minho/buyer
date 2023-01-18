<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="../layout/header.jsp" %>
        <h1>주문 페이지</h1>
        <hr>
        <table border="1">
            <tr>
                <th>상품명</th>
                <th>상품 가격</th>
                <th>현 재고 수량</th>
            </tr>
            <tr>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.qty}</td>
            </tr>
        </table>

        <c:choose>
            <c:when test="${principal == null}">
                <h3>로그인 유저만 주문할 수 있습니다.</h3>
                <a href="/loginForm">로그인하러 가기</a>
            </c:when>

            <c:otherwise>
                <h3>주문 내역 확인</h3>
                <form action="/order/${product.id}" method="post">
                    제품번호 : <input size="1" type="text" name="id" value="${product.id}" readonly>
                    제품명 : <input size="5" type="text" name="name" value="${product.name}" readonly>
                    제품 재고 : <input size="5" type="text" name="qty" value="${product.qty}" readonly> <br>
                    <br>
                    주문수량 변경 : <input type="number" name="orderqty" value="1" min="1" max="${product.qty}">
                    <button type="submit">주문</button>
                </form>

            </c:otherwise>
        </c:choose>
        <%@ include file="../layout/footer.jsp" %>