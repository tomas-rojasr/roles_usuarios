<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parqueadero</title>
</head>
<body>
<h1>Paqueadero</h1>

<form action="" method="POST">
    <div>
        <label for="placa">Placa del vehículo:</label><br>
        <input type="text" id="placa" name="placa" maxlength="6" required><br>
    </div>
    <div>
        <label for="hora_entrada">Hora de entrada:</label><br>
        <input type="number" id="hora_entrada" name="hora_entrada" required><br>
    </div>
    <div>
        <label for="hora_salida">Hora de salida:</label><br>
        <input type="number" id="hora_salida" name="hora_salida" required><br>
    </div>
    <div>
        <label for="ubicacion">Ubicación:</label><br>
        <input type="text" id="ubicacion" name="ubicacion" required><br>
    </div>
    <div>
        <label for="tipo_vehiculo">Tipo de vehículo:</label><br>
        <select id="tipo_vehiculo" name="tipo_vehiculo" required>
            <option value="automovil">Automóvil</option>
            <option value="motocicleta">Motocicleta</option>
            <option value="camion">Camión</option>
        </select><br>
    </div>
    <button type="submit">Enviar</button>
</form>

<a href="logout">Cerrar sesion</a>
</body>
</html>