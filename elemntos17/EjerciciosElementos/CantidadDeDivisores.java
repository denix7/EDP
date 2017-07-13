package EjerciciosElementos;


/**
 * Write a description of class CantidadDeDivisores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

/*
 * Definir un metodo recursivo que defina la cantidad de divisores de un numero
 * ej: nro=8 ====> devuelve 4  <== {1,2,4,8}
 *     nro=31 ===> devuelve 2  <== {1,31}
 */
public class CantidadDeDivisores
{
   public int cantDivisiones(int nro)
   {
       return cantDivisiones (nro , 1);
   }
   private int cantDivisiones(int nro, int posDivisor)
   {
       int res;
       if(posDivisor <= nro)
       {
          if(nro%posDivisor == 0)
            res = 1+cantDivisiones(nro, posDivisor+1);
            else
            res = cantDivisiones(nro, posDivisor+1);
       }
       else
            res = 0;
       
       return res;
    }
}

/*public int cantDivisiones(int nro)
    {
        return cantDivisiones(nro,1);
    }
    
    private int cantDivisiones(int nro, int pd)
    {
        int res;
        if(pd <= nro)
        {
            if(nro%pd == 0)
                return 1+cantDivisiones(nro, pd+1);
                
            else
                return cantDivisiones(nro, pd+1);
        }
        else
            return 0;
    }
    */