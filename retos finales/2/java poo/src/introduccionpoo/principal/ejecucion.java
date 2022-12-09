package principal;

import persona.*;


public class ejecucion 
{
    public static void main(String[] args)
    {
     double resu;

        persona persona = new persona();
        persona.pedirDatos();
        persona.mostrarPersona();
        resu = persona.calcularlmc();
        persona.mayorEdad();

        if (resu < 20)
        {
            System.out.println("PESOBAJO");
        }
        else if (resu >=20 && resu <=25)
        {
            System.out.println("PESOIDEAL");

        }
        else if (resu >25)
        {
            System.out.println("SOBREPESO");

        }
    }
}


