package EjerciciosElementos;


/**
 * Write a description of class P71 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P71
{
    public String eliminarCCI(String cad){
        return eliminar(cad, "", 0);
    }
    private String eliminar(String orig, String cons, int ind){
        String destino = "";
        if(ind == orig.length()){
            if(!cons.isEmpty())
                destino = destino + reducir(cons);            
        }else{
            if(cons.isEmpty()) cons = cons + orig.charAt(ind);
            else{
                if(orig.charAt(ind) == cons.charAt(0)){
                    cons = cons + orig.charAt(ind);
                }
                else{
                    destino = destino + reducir(cons);
                    cons = ""+orig.charAt(ind);                    
                }
            }  
            destino = destino + eliminar(orig , cons, ind+1);
        }
        return destino;
    }
    private String reducir(String cad){
        String red = cad;
        if(cad.length()%2 != 0){
            if(cad.length() == 1) red = "";
            else red = cad.substring(1);
        }
        return red;
    }
}
