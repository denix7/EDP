package EjerciciosElementos;


/**
 * Write a description of class MultiploDeCinco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/* Definir un metodo recursivo que devuelva la sumatoria de los n primeros multiplos de 5
 * ejemplo n=3 =====> 5+10+15 = 20
 *         n=2 =====> 5+10    
 *         n=1 =====> 5 
*/
public class SumatoriaMultiploDeCinco
{
  public int sumatoria5(int n)
  {
      int res;
      //parte basica
      if(n==1)
        res = 5;
      //parte recursiva  
      else
        res = sumatoria5(n-1)+5*n;
        
      return res;
    }

}
