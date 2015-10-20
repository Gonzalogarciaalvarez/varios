package bol5.pkg4;

/**
 *
 * @author ggarciaalvarez
 */
public class Polbo {
    //ATB
    private float polbo;
    private float patacas;
    //CONSTRUCTORES
    
    public Polbo(){
  
}
    public Polbo (float pol, float pat){
        polbo = pol;
        patacas = pat;
        
    }
    
    
    //SETTERS
    public void setPolbo (int x){
        polbo = polbo + x;
    }
    public void setPatacas (int y){
        patacas = patacas + y;
    }
    //GETTERS
    public float getPolbo (){
        return polbo;
    }
    public float getPatacas (){
        return patacas;
    }
    //METODOS
    public float Cantidade (float pol, float pat){
        return 0;
        
         }
    
        
}
