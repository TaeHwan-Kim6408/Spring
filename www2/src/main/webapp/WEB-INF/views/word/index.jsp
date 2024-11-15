<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "ko">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>단어 검색</title>
</head>
<body>
	<h1>단어 검색</h1>
    <form action="search" method="post">
        <label for="query">검색할 단어를 입력하세요:</label>
        <input type="text" id="query" name="query" required>
        <button type="submit">검색</button>
    </form>
    <p>결과: ${result}</p>
</body>
</html>