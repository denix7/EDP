package EjerciciosElementos;


/**
 * Write a description of class Factorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Factorial
{
   public int Factorial(int n)
   {
       int res;
       if(n==0)
        res=1;
       else
        res=Factorial(n-1)*n;
       return res; 
   }
}
