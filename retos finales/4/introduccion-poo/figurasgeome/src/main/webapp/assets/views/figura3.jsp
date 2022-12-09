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
                <li><a href="#A" target="_self" class="inicio"><h4>rombo</h3></a></li>
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
                <h1 name="A">ROMBO</h1><br>
                <img src="/figurasgeome/src/main/webapp/assets/img/rombo.png" alt="ejemplo-rombo" class="ejemplo-rombo">
                <p>El rombo es un cuadrilátero, específicamente un paralelogramo, que tiene dos ángulos idénticos agudos (menores que 90º) y otro par de ángulos, también iguales, que son obtusos (mayores que 90º). Asimismo, todos los lados de la figura son de la misma longitud. <br><br> Fuente : https://economipedia.com/definiciones/rombo.html</p><br><br>
                <h3><a name="B"></a>Sacar el area</h3><br><br>
                <form action="" method="get">
                  <fieldset>
                     <label for="longitudr">Longitud : </label><br>
                     <input type="text" id="longitudr" name="longitudr" required placeholder="Longitud" pattern="[A-Za-z0-9]{5,15}" ><br><br>
                     <label for="anchor">Ancho : </label><br>
                     <input type="text" id="anchor" name="anchor" required placeholder="Ancho" pattern="[A-Za-z0-9]{5,15}"><br><br>
                     <label for="perimetror">Perimetro : </label><br>
                     <input type="text" id="perimetror" name="perimetror" required placeholder="Perimetro" pattern="[A-Za-z0-9]{5,15}"><br><br>
                     <label for="arear">El area es de : </label><br><br>
                     <input type="submit" value="Enviar">
                     <input type="reset" value="Restablecer">
                  </fieldset>
                 </form><br><br>
                 <h3><a name="C"></a>Sacar el perimetro</h3><br><br>
                 <form action="" method="get">
                  <fieldset>
                     <label for="longitudr">Longitud : </label><br>
                     <input type="text" id="longitudp" name="longitudP" required placeholder="Longitud" pattern="[A-Za-z0-9]{5,15}" ><br><br>
                     <label for="anchor">Ancho : </label><br>
                     <input type="text" id="anchor" name="anchor" required placeholder="Ancho" pattern="[A-Za-z0-9]{5,15}"><br><br>
                     <label for="arear">Area : </label><br>
                     <input type="text" id="arear" name="arear" required placeholder="Area" pattern="[A-Za-z0-9]{5,15}"><br><br>
                     <label for="perimetror">El perimetro es de : </label><br><br>
                     <input type="submit" value="Enviar">
                     <input type="reset" value="Restablecer">
                  </fieldset>
                 </form>
            </main>
         </div>
     </div>
</body>
</html>