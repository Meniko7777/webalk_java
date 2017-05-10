<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Webalk</title>
<link href="/css/theme.css" type="text/css" rel="stylesheet">




</head>
<body>


<h2>Webalkalmazások - Marincsák Enikő</h2>

  Név: <input type="text" id="myText" placeholder="ide írhatod a neved">


<button onclick="myFunction()">OK</button>

<h1 id="demo"></h1>

<script>
function myFunction() {
    var x = document.getElementById("myText").value;
    document.getElementById("demo").innerHTML = "Helló "+x+"!";
}
</script>

<p>
<h4><a href="/kolcsonzes">Kölcsönzések</a></h4>
<h4><a href="/konyv">Könyvek</a></h4>
<h4><a href="/olvaso">Olvasók</a></h4>
</p>

</body>
</html>