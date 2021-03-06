<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>글 상세</title>
</head>
<body>
	<%
	// 세션에 저장된 게시글 정보를 꺼낸다
	BoardVO board=(BoardVO)session.getAttribute("board");
	
	// 3. 응답 화면 구성
	%>

	<center>
		<h1>글 상세</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="updateBoard.do" method="post">
			<input name="seq" type="hidden" value="${board.seq}" />
			<table border="1" cellpadding="0" cellspacing="0">

				<tr>
					<td bgcolor="orange" width="70">제목</td>
					<td align="left"><input name="title" type="text"
						value="${board.title }" /></td>
				</tr>

				<tr>
					<td bgcolor="orange">작성자</td>
					<td align="left">${board.writter}</td>
				</tr>

				<tr>
					<td bgcolor="orange">내용</td>
					<td align="left"><textarea rows="10" cols="40" name="content">${board.content }</textarea></td>
				</tr>

				<tr>
					<td bgcolor="orange">등록일</td>
					<td align="left">${board.regDate }</td>
				</tr>

				<tr>
					<td bgcolor="orange">조회수</td>
					<td align="left">${board.cnt}</td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="글 수정" /></td>
				</tr>

			</table>
		</form>

		<hr>

		<a href="insertBoard.jsp">글등록</a>&nbsp;&nbsp;&nbsp; <a
			href="deleteBoard.do?seq=${board.seq }">글삭제</a>&nbsp;&nbsp;&nbsp; <a
			href="getBoardList.do">글목록</a>
	</center>
</body>
</html>