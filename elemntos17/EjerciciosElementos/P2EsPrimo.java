package EjerciciosElementos;


/**
 * Write a description of class p2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P2EsPrimo
{
    public boolean esPrimo(int n)
    {
        boolean res=false;
        if(n%2==0 || n%3==0 || n%5==0)
            res=false;
        else
        {
            res=true;
        }
        return res;
    }
    
}
