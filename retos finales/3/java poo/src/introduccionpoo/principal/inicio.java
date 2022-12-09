package principal;
import salud.empleado;

public class inicio {
    public static void main(String[] args) 
    {
        double resu;
        empleado empleado = new empleado();

        empleado.pedirDatos();
        empleado.mostrarPersona();
        resu = empleado.calcularImc();
        empleado.mayorEdad();
        
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

        empleado.InformacionEmpleado();
        empleado.calcularHonorarios();
        empleado.mostrarEmpleado();
    }   
}