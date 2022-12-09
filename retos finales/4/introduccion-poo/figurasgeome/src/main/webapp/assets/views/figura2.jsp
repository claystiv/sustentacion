<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>APLICATIVO WEB</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/figurasgeome/src/main/webapp/assets/css/estilos.css">
    <link rel="shortcut icon" href="/figurasgeome/src/main/webapp/assets/img/cifras.png">
</head>
<body>
    <img src="/figurasgeome/src/main/webapp/assets/img/formas-geometricas.png" alt="figuras formas-geometricas" class="img-logo">
     <div class="menu">
           <ul>
                <li><a href="#A" target="_self" class="inicio"><h4>trapecio</h3></a></li>
                <li><a href="#B" target="_self" class="fi1"><h4>Sacar el area</h3></a></li>
                <li><a href="#C" target="_self" class="fi2"><h4>Sacar el perimetro</h3></a></li>
           </ul>
     </div>
     <div class="contenedor">
      <header>
        <ul class="nave">
            <li><a href="/figurasgeome/src/main/webapp/assets/menu.jsp">INICIO</a></li>
            <li><a href="/figurasgeome/src/main/webapp/assets/views/figura1.jsp">PENTAGONO</a></li>
            <li><a href="/figurasgeome/src/main/webapp/assets/views/figura2.jsp">TRAPECIO</a></li>
            <li><a href="/figurasgeome/src/main/webapp/assets/views/figura3.jsp">ROMBO</a></li>
        </ul>
      </header>
         <div class="contenido">
            <main>
                <h1 name="A">TRAPECIO</h1><br>
                <img src="/figurasgeome/src/main/webapp/assets/img/trapecio.png" alt="ejemplo-trapecio" class="ejemplo-trapecio">
                <p>El trapecio es un cuadrilátero que tiene dos lados paralelos, es decir, que no se cruzan, aunque sean prolongados. Estos son llamados bases del trapecio. En tanto, sus otros dos lados no son paralelos.<br><br> Fuente : https://economipedia.com/definiciones/trapecio.html</p><br><br>
                <h3><a name="B"></a>Sacar el area</h3><br><br>
                <form action="" method="get">
                  <fieldset>
                     <label for="longitudt">Longitud : </label><br>
                     <input type="text" id="longitudt" name="longitudt" required placeholder="Longitud" pattern="[A-Za-z0-9]{5,15}"><br><br>
                     <label for="anchot">Ancho : </label><br>
                     <input type="text" id="anchot" name="anchot" required placeholder="Ancho" pattern="[A-Za-z0-9]{5,15}"><br><br>
                     <label for="perimetrot">Perimetro : </label><br>
                     <input type="text" id="perimetrot" name="perimetrot" required placeholder="Perimetro" pattern="[A-Za-z0-9]{5,15}"><br><br>
                     <label for="areat">El area es de : </label><br><br>
                     <input type="submit" value="Enviar">
                     <input type="reset" value="Restablecer">
                  </fieldset>
                 </form><br><br>
                 <h3><a name="C"></a>Sacar el perimetro</h3><br><br>
                 <form action="" method="get">
                  <fieldset>
                     <label for="longitudt">Longitud : </label><br>
                     <input type="text" id="longitudt" name="longitudt" required placeholder="Longitud" pattern="[A-Za-z0-9]{5,15}"><br><br>
                     <label for="anchot">Ancho : </label><br>
                     <input type="text" id="anchot" name="anchot" required placeholder="Ancho" pattern="[A-Za-z0-9]{5,15}"><br><br>
                     <label for="areat">Area : </label><br>
                     <input type="text" id="areat" name="areat" required placeholder="Area" pattern="[A-Za-z0-9]{5,15}"><br><br>
                     <label for="perimetrot">El perimetro es de : </label><br><br>
                     <input type="submit" value="Enviar">
                     <input type="reset" value="Restablecer">
                  </fieldset>
                 </form>
            </main>
         </div>
     </div>
</body>
</html>