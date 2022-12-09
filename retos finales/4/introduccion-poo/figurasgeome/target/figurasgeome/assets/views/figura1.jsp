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
            <li><a href="#A" target="_self" class="inicio"><h4>pentagono</h3></a></li>
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
         <div class="contenido"><br>
            <main>
                  <h1 name="A">PENTAGONO</h1><br>
                  <img src="/figurasgeome/src/main/webapp/assets/img/pentagonos.png" alt="ejemplo-pentagono" class="ejemplo-pentagono">
                  <p>El pentágono es una figura geométrica formada por cinco lados, además que tiene cinco vértices y cinco ángulos internos.<br><br>Es decir, el pentágono es un polígono que cuenta con cinco lados, siendo de mayor complejidad que un cuadrilátero y que un triángulo.<br><br>
                    Cabe señalar que un polígono es una figura bidimensional constituida por un número finito de segmentos consecutivos no colineales, formando un espacio cerrado. <br><br> Fuente : https://economipedia.com/definiciones/pentagono.html</p><br><br>
                    <h3><a name="B"></a>Sacar el area</h3><br><br>
                    <form action="" method="get">
                      <fieldset>
                         <label for="ladop">Lado : </label><br>
                         <input type="text" id="ladop" name="ladoP" required placeholder="Lado" pattern="[A-Za-z0-9]{5,15}"><br><br>
                         <label for="apotemap">Apotema : </label><br>
                         <input type="text" id="apotemap" name="apotemap" required placeholder="Apotema" pattern="[A-Za-z0-9]{5,15}"><br><br>
                         <label for="areap">El area es de : </label><br><br>
                         <input type="text" id="areap" name="areap" required placeholder="" pattern="[A-Za-z0-9]{5,15}"><br><br>
                         <input type="submit" value="Enviar">
                         <input type="reset" value="Restablecer">
                      </fieldset>
                     </form><br><br>
                     <h3><a name="C"></a>Sacar el perimetro</h3><br><br>
                     <form action="" method="get">
                      <fieldset>
                         <label for="ladop">Lado : </label><br>
                         <input type="text" id="ladop" name="ladoP" required placeholder="Lado" pattern="[A-Za-z0-9]{5,15}"><br><br>
                         <label for="perimetrop">El perimetro es de : </label><br><br>
                         <input type="text" id="perimetrop" name="perimetrop" required placeholder="" pattern="[A-Za-z0-9]{5,15}"><br><br>
                         <input type="submit" value="Enviar">
                         <input type="reset" value="Restablecer">
                      </fieldset>
                     </form>
            </main>
         </div>
     </div>
</body>
</html>