<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="../layout/header.jsp" %>

        <h1>제품 상세보기</h1>
        <hr>
        <table border="1">
            <tr>
                <th>상품명</th>
                <th>가격</th>
                <th>재고</th>
            </tr>
            <tr>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.qty}</td>
            </tr>
        </table>
        <img src="src\main\resources\product_img\바나나.jpg">
        <button><a href="/purchase/${product.id}/orderForm">주문하기</a></button>
        <%@ include file="../layout/footer.jsp" %>