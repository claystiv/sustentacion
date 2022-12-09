package figurasGeometricas;

import java.util.*;

public class pentagono
 {
    private Double ladoP ;
    private Double apotemaP ;
    
    public pentagono()
    {
    } 
    public pentagono(Double ladoP , Double apotemaP )
    {
        this.ladoP=ladoP;
        this.apotemaP=apotemaP;
    }
    public Double getLado() 
    {
        return ladoP;
    }
        public void setLado(Double ladoP) 
        {
        this.ladoP = ladoP;
        }
        public Double getApotema()
    {
        return apotemaP;
    }
        public void setApotema(Double perimetroP) 
        {
        this.apotemaP = perimetroP;
        }
        public void calcularArea(Double ladoP, Double apotemaP)
       {
        double area = 0;
        area = ((5*getLado()*getApotema())/2);
       }
        public void calcularPerimetro(Double ladoP)
       {
        double perimetro = 0;
        perimetro = getLado() * 5;
       }
       public void mostrarPentagono()
       {
           System.out.println("El pentagono tiene un lado : "+ladoP+" y un apotema de : "+apotemaP );
       }
       public void mostrarPentagono(Double ladoP , Double apotemaP)
       {
           System.out.println("El pentagono tiene un lado : "+ladoP+" y un apotema de : "+apotemaP );
       }
}