package principal;

import persona.*;

public class inicio
{
    public static void main(String[] args)
    {
        persona p = new persona();
        p.pedirDatos();
        p.mostrarPersona();
        p.calcularlmc();
        p.mayorEdad();

        Empleado E = new Empleado();

        E.getAtributos();
        E.calcularHonorarios(0, 0);
    }
}