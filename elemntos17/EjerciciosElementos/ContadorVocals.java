package EjerciciosElementos;


/**
 * Write a description of class ContadorVocals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContadorVocals
{
    public int contarV(String texto)
    {
        int res;
        res = contarV(texto,0);
        return res;
    }
    private int contarV(String texto, int pos){
        int res;
        if(pos<texto.length())
        {
            char letra = texto.charAt(pos);
            if(esVocal(letra))
                res = 1+contarV(texto,pos+1);
            else
                res = contarV(texto, pos+1);
        }
        else
            res=0;
            
        return res;    
    }
    private boolean esVocal(char c)
    {
        boolean res=false;
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            res= true;
        else 
            res=false;
            
        return res;
    }
}
