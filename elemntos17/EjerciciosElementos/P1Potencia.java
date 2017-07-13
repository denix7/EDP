package EjerciciosElementos;


/**
 * Write a description of class Potencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class P1Potencia
{
    public int elevarPotencia(int a, int b)
    {
        int res;
        if(b==0)
            res=1;
        else
        {
            res = a*elevarPotencia(a, b-1);  
        }
        return res;
    }
}
