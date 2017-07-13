package EjerciciosElementos;


/**
 * Write a description of class P4descomponerFactorPrimo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CadenaPalindromo
{
    public boolean pal(String cad)
    {
        return pal(cad, cad.length());
    }
    private boolean pal(String cad, int n)
    {
        boolean res;
        if(n==0 || n==1)
         res=true;
        
        else if(cad.charAt(0)==cad.charAt(n-1))    
        {
            res = pal(cad.substring (1, n-1), n-2);
        }
        else
            res=false;
        return res;
    }
}
