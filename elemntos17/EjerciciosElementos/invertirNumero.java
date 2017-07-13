package EjerciciosElementos;


/**
 * Write a description of class invertirNumero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class invertirNumero
{
   public int invertirN(int n)
   {
       return invertirN(n, contarDig(n));
   }
   private int invertirN(int n, int dig)
   {
       int res;
       if(n<10) //si el numero tiene menos de 2 digitos, devuelve el mismo numero
        res=n;
       else //si el numero tiene mas de 2 digitos
       {
           res=(n%10)*elevarPotencia(10,dig-1)+invertirN(n/10, dig-1);
       }
       return res;
   }
   
   private int contarDig(int n)
   {
       int res;
       if(n<10)
        res=1;
       else
        res=contarDig(n/10)+1;
       
       return res; 
   }
   
   private int elevarPotencia(int a, int b)
   {
       if(b==0)
        return 1;
       else
        return a*elevarPotencia(a, b-1);
   }
}
