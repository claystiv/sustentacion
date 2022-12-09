package persona;

import persona.persona;

public class Empleado extends persona
{
    private int valorhora;
    private String cargo;
    private int horastrabajadas;
    private String departamento;

    public Empleado()
    {

    }
    public Empleado(int valorhora, String cargo, int horastrabajadas, String departamento) {
        this.valorhora = valorhora;
        this.cargo = cargo;
        this.horastrabajadas = horastrabajadas;
        this.departamento = departamento;
    }

    public Empleado(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo, double pesoActual, int valorhora, String cargo, int horastrabajadas,String departamento) {
        super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo, pesoActual);
        this.valorhora = valorhora;
        this.cargo = cargo;
        this.horastrabajadas = horastrabajadas;
        this.departamento = departamento;
    }


    public int getValorhora() {
        return valorhora;
    }
    public void setValorhora(int valorhora) {
        this.valorhora = valorhora;
    }
    public String getCargo()
    {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getHorastrabajadas() {
        return horastrabajadas;
    }
    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public void calcularHonorarios(int horastrabajadas, int valorhora)
    {
      double productividad = 0;
      double reteica = 0.996;

      productividad = (valorhora/horastrabajadas)-reteica;
    }

    public String getAtributos()
    {
        return "\nEl tipo de documento es :  " + super.getTipoDoc() + "\n numero de documento  : " + super.getDocumento() + " \nnombre " + super.getNombre() + " \napellido : " + super.getApellido() +  " \ncargo" + getCargo() + "\n horas trabajadas " + getHorastrabajadas() + "\n valor por hora : "+ getValorhora();
    }
}