package bol5.pkg3;

/**
 *
 * @author ggarciaalvarez
 */
public class Circulo {
    //ATRIBUTOS
    private double radio;
    private final double pi = 3.14 ;
    //CONSTRUCTORES
    public Circulo() {
    
}
    public Circulo (double r){
        radio = r;
       
    }
    //METODOS DE ACCESO
    public void setRadio(double r){
    r = radio;
}
    public double getRadio(){
        return radio;
    }
    //METODOS
    public double calcularArea (){
        return pi*Math.pow(radio, 2);
    }
    public double calcularLonxitude (){
        return 2*pi*radio;
    }
    
}
