package figurasGeometricas;
import java.util.*;
import figurasGeometricas.*;

public class ejecutor
{
public static void main(String[] args)
 {
int opcion;
int opcion1;

    try (Scanner lector = new Scanner(System.in))
     {

     System.out.prinlt("Bienvenido al menu \n eliga una de las siguientes opciones :
     \n 1.pentagono\n 2.rombo\ 3.trapecio");
     opcion lector.NextInt();

switch (opcion)
{
case 1:
{
 System.out.prinlt("Bienvenido al menu del pentagono \n eliga una de las siguientes opciones :
     \n 1.sacar el area \n 2. sacar el perimetro");
     opcion lector.NextInt();
     switch(opcion)
     {
     case 1: 
     {
       pentagono.calcularArea(null, null);;
     }break;
     case 2:
     {
       pentagono.calcularPerimetro(null);
     }break;
     default: 
     {
      System.out.println("Opcion incorrecta");
     }break;
}

case 2:
{
 System.out.prinlt("Bienvenido al menu \n eliga una de las siguientes opciones :
     \n 1.pentagono\n 2.rombo\ 3.trapecio");
     opcion lector.NextInt();
}
break;

case 3:
{
 System.out.prinlt("Bienvenido al menu \n eliga una de las siguientes opciones :
     \n 1.pentagono\n 2.rombo\ 3.trapecio");
     opcion lector.NextInt();
}
break;

default: 
{
                System.out.println("Opcion incorrecta");
}

}

      

        pentagono pentagono = new pentagono();
        pentagono.setLado(null);
        pentagono.setApotema(null);
        pentagono.calcularArea(null, null);;
        pentagono.calcularPerimetro(null);

        System.out.println("ingrese su lado : ");
        pentagono.setLado(lector.nextDouble());
        System.out.println("ingrese su apotema : ");
        pentagono.setApotema(lector.nextDouble());
    }
 }  
}
