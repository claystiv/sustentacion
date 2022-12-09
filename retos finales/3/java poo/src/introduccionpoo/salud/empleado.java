package salud;
import java.util.*;

public class empleado extends persona
{
    private String cargo;
    private String departamento;
    private double valorHora;
    private double  honorarios;
    private int horasTrabajadas;

    Scanner scanner = new Scanner(System.in);
    

    public empleado() 
    {

    }
    public empleado(String tipoDocumento, String nombre, String apellido, String sexo, double peso, double estatura, double pesoActual, int documento, int edad   , String cargo, String departamento, double valorHora, double honorarios, int horasTrabajadas) 
    {
        super(tipoDocumento, nombre, apellido, sexo, peso, estatura, pesoActual, documento, edad);
        this.cargo = cargo;   
        this.departamento = departamento;   
        this.valorHora = valorHora;   
        this.honorarios = honorarios;   
        this.horasTrabajadas = horasTrabajadas;   
    }


    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public String getDepartamento() {
        return departamento;
    }


    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public double getValorHora() {
        return valorHora;
    }


    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }


    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }


    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getHonorarios() {
        return honorarios;
    }


    public void setHonorarios(double honorarios) {
        this.honorarios = honorarios;
    }

    public void InformacionEmpleado() 
    {
        System.out.println("\nINFORMACION EMPLEADO");
        System.out.println("\nIngrese el cargo");
        cargo = scanner.next();  
        System.out.println("Ingrese las horas trabajadas");
        horasTrabajadas = scanner.nextInt();
        System.out.println("Ingrese el valor por hora");
        valorHora = scanner.nextDouble();
        System.out.println("Ingrese el departamento");
        departamento = scanner.next();  
    }

    public void calcularHonorarios() 
    {
        final double reteica = 0.966;
        honorarios = (valorHora * horasTrabajadas) - (valorHora * horasTrabajadas) * reteica / 100;
        System.out.println("\nEl valor a pagar es: " + honorarios);
    }

    public void mostrarEmpleado() 
    {
        System.out.println("\nEMPLEADO");
        System.out.print("\nTipo de documento: " + getTipoDocumento() + "\nNumero documento: " + getDocumento() + "\nNombre: " + getNombre() + "\nApellido: " + getApellido() + "\nCargo: " + cargo + "\nHoras trabajadas: " + horasTrabajadas + "\nValor hora: " + valorHora + "\nTotal a pagar: " + honorarios);
    }
}