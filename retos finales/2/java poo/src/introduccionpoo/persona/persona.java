package persona;

import java.util.*;

public class persona
{
        private String tipoDoc;
        private int documento;
        private String nombre;
        private String apellido;
        private double peso;
        private double estatura;
        private int edad;
        private String sexo;
        private double pesoActual = 0;

       public void pedirDatos() 
       {
        try (Scanner lector = new Scanner(System.in))
    {
        System.out.println("ingrese su tipo de documento : ");
        tipoDoc=lector.next();
        System.out.println("ingrese el numero de documento : ");
        documento=lector.nextInt();
        System.out.println("ingrese su nombre : ");
        nombre=lector.next();
        System.out.println("ingrese su apellido : ");
        apellido=lector.next();
        System.out.println("ingrese su peso en kg: ");
        peso=lector.nextDouble();
        System.out.println("ingrese su estatura en m: ");
        estatura=lector.nextDouble();
        System.out.println("ingrese su edad : ");
        edad=lector.nextInt();
        System.out.println("ingrese su sexo : ");
        sexo=lector.next();
    }
       }    
       //Ahora público
    public void mostrarPersona()
    {
        System.out.println(tipoDoc);
        System.out.println(documento);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(peso);
        System.out.println(estatura);
        System.out.println(edad);
        System.out.println(sexo);
        System.out.println();
    }

    public String calcularlmc()
    {
        String resu ="";
        pesoActual = peso/estatura;  
        if (pesoActual < 20)
        {
            resu = "PESOBAJO";
        }
        else if (pesoActual >=20 && pesoActual <=25)
        {
            resu = "PESOIDEAL";
            
        }
        else if (pesoActual >25)
        {
            resu="SOBREPESO";
        }
        System.out.println(resu);
        return resu;
    }
    public void mayorEdad()
    {
        if (edad >= 18)
        {
            System.out.println("Es mayor de edad");
        }
        else
        {
            System.out.println("Es menor de edad");
        }
    } 
}