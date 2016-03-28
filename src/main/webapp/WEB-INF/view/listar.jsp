<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<jsp:include page="fragments/htmlHead.jsp" />
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Listar Contatos</title>
		<script type="text/javascript" src="<c:url value="resources/js/dataTable.js" />"></script>
	</head>
	<body>
		<div class="container">
			<jsp:include page="fragments/header.jsp" />		
			<h2>Contatos</h2>
			<table id="contatoTable" class="table table-striped table-bordered dt-responsive nowrap">
				<thead>
				<tr>
                	<th>Nome</th>
              	</tr>
				</thead>
				<tbody>
<%-- 				<c:forEach items="${contatos}" var="contato"> --%>
					<tr>
						<td></td>
					</tr>
<%-- 				</c:forEach> --%>
				</tbody>
			</table>
			<jsp:include page="fragments/footer.jsp" />
		</div>
		
	</body>
</html>