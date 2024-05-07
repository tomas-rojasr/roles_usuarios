<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Iniciar sesión</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <h2 class="text-center">Iniciar sesión</h2>
            <form action="${pageContext.request.contextPath}/login" method="post">
                <div class="form-group">
                    <label>Nombre de usuario:</label>
                    <input type="text" name="username" class="form-control"/>
                </div>
                <div class="form-group">
                    <label>Contraseña:</label>
                    <input type="password" name="password" class="form-control"/>
                </div>
                <div class="form-group">
                    <input type="submit" value="Iniciar sesión" class="btn btn-primary btn-block"/>
                </div>

                <c:if test="${error != null}">
                    <div class="alert alert-danger" role="alert">
                            ${error}
                    </div>
                </c:if>
            </form>
        </div>
    </div>
</div>
</body>
</html>