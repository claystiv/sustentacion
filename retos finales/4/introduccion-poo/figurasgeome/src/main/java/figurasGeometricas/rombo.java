package figurasGeometricas;

import java.util.*;

public class rombo 
{
    private Double diagonalMa ;
    private Double diagonalMe ;
    private Double lado;

    public rombo()
    {
    } 
    public rombo(Double diagonalMa, Double diagonalMe, Double lado) 
    {
        this.diagonalMa = diagonalMa;
        this.diagonalMe = diagonalMe;
        this.lado = lado;
    }
    public Double getDiagonalMa() {
        return diagonalMa;
    }
    public void setDiagonalMa(Double diagonalMa) {
        this.diagonalMa = diagonalMa;
    }
    public Double getDiagonalMe() 
    {
        return diagonalMe;
    }
    public void setDiagonalMe(Double diagonalMe) {
        this.diagonalMe = diagonalMe;
    }
    public Double getLado() {
        return lado;
    }
    public void setLado(Double lado) {
        this.lado = lado;
    }
    public void calcularArea(Double diagonalMa, Double diagonalMe)
    {
     double area = 0;
     area = ((getDiagonalMa()*getDiagonalMe())/2);
    }
     public void calcularPerimetro(Double lado)
    {
     double perimetro = 0;
     perimetro = getLado() * 4;
    }
        public void mostrarPentagono()
        {
            System.out.println("El rombo tiene una area : "+ lado +" perimetro : "+ diagonalMa + " longitud : " + longitudR + " ancho : "+anchoR);
        }
        public void mostrarPentagono(Double lado, Double diagonalMa, Double diagonalMe)
        {
            System.out.println("El rombo tiene una area : "+ lado +" perimetro : "+ diagonalMa + " longitud : " + diagonalMe);
            calcularArea(diagonalMa, diagonalMe);
            calcularPerimetro(lado);
        }
}