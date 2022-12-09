import introduccionpoo.animal;

import persona.*;

import javax.naming.spi.DirObjectFactory;

import animales.*;

public class ejecucucion 
{
    public static void main(String[] args)
    {
        persona persona = new persona();
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        persona.mayorEdad();
    }
}












