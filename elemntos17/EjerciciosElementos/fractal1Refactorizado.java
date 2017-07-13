package EjerciciosElementos;


/**
 * Write a description of class fractal1Refactorizado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fractal1Refactorizado
{
    public int nEsferas(int n)
    {
        int res;
        if(n==1) //PB
        {
            res = 6;
        }
        else //PR
        {
            res = nEsferas(n-1)+(n*2)+3;
        }
        return res;
    }
}
