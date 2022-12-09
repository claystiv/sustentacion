package figurasGeometricas;

import java.util.*;

public class trapecio 
{
    private Double baseMe ;
    private Double baseMa ;
    private Double altura;
    private Double lado1;
    private Double lado2;
    private Double lado3;
    private Double lado4;
    public trapecio()
    {
    }   
    public trapecio(Double baseMe, Double baseMa, Double altura, Double lado1, Double lado2, Double lado3,
            Double lado4) {
        this.baseMe = baseMe;
        this.baseMa = baseMa;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }
        public Double getBaseMe() {
        return baseMe;
    }
    public void setBaseMe(Double baseMe) {
        this.baseMe = baseMe;
    }
    public Double getBaseMa() {
        return baseMa;
    }
    public void setBaseMa(Double baseMa) {
        this.baseMa = baseMa;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getLado1() {
        return lado1;
    }
    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }
    public Double getLado2() {
        return lado2;
    }
    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }
    public Double getLado3() {
        return lado3;
    }
    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }
    public Double getLado4() {
        return lado4;
    }
    public void setLado4(Double lado4) {
        this.lado4 = lado4;
    }
    public void calcularArea(Double diagonalMa, Double diagonalMe)
    {
     double area = 0;
     area = (((getBaseMa()+getBaseMe())*getAltura())/2);
    }
     public void calcularPerimetro(Double lado1,Double lado12,Double lado3,Double lado4)
    {
     double perimetro = 0;
     perimetro = getLado1()+getLado2()+getLado3()+getLado4();
    }

        public void mostrarPentagono()
        {
            System.out.println("El rombo tiene una area : "+areaT+" perimetro : "+perimetroT + " longitud : " + longitudT + " ancho : "+anchoT);
        }
        public void mostrarPentagono(Double areaT , Double longitudT , Double anchoT , Double perimetroT)
        {
            System.out.println("El rombo tiene una area : "+areaT +" perimetro : "+perimetroT + " longitud : " + longitudT + " ancho : "+anchoT);
        }
  
}
