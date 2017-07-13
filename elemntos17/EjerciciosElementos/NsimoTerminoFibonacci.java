package EjerciciosElementos;


/**
 * Write a description of class NsimoTerminoFibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/*
 * Definir un metodo recursivo para encontrar el n-simo termino de la serie Fibonacci
*/
public class NsimoTerminoFibonacci
{
   public int Nsimotermino(int n)
   {
       int res;
       //parte basica
       if(n==1)
        res = 0;
       else if (n==2)
        res=1;
        
       else
        res = Nsimotermino(n-1)+Nsimotermino(n-2);
           
       return res;
   }
}
