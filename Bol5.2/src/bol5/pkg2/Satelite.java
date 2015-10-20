package bol5.pkg2;

/**
 *
 * @author ggarciaalvarez
 */
public class Satelite {
        //ATRIBUTOS
    private double meridiano ;
    private double paralelo;
    private double distanciaTerra ;
    //CONSTRUCTORES
    public Satelite (){
        meridiano=paralelo=distanciaTerra=0;
    }
    public Satelite(double m, double p, double d){
        meridiano = m;
        paralelo = p;
        distanciaTerra = d;
    }
   
    //MÉTODOS
    public void verPosicion (){
        System.out.println("o satelite atopase  no paralelo" + paralelo + "meridiano" + meridiano + "a unha distancia da terra" + distanciaTerra);
    }
}
