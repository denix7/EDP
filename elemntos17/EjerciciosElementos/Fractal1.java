package EjerciciosElementos;


/**
 * Write a description of class Fractal1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fractal1
{
    public int arbolitoEsferas(int n)
    {
        if(n==1)
        {
            return 6;
        }
        else
        {
            return arbolitoEsferas(n-1)+(n*2)+3;
        }
    }
}
