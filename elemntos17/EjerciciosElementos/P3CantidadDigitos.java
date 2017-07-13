package EjerciciosElementos;


/**
 * Write a description of class p3CantidadDigitos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P3CantidadDigitos
{
   public int cantDig(int n)
   {
       int res;
       if(n<10)
        res=1;
       else
       {
           res=1+cantDig(n/10);
       }
       return res;
   }
}
