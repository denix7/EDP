package EjerciciosElementos;


/**
 * Write a description of class P78 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P78SelvadeLeones
{
   public int contarLeones(String selva, String palabra)
   {   //delegamos responsabilidad a un metodo privado donde recibira parametros adicionales (sobrecarga)
       return contarLeones(selva, palabra, 0, 0); // mandamos la selva, la palabra y sus indices que empiezan en 0, son sus primeros caracteres que analizaremos 
   }
   private int contarLeones(String selva, String palabra, int i, int j) //(sobrecarga)
   {
       if(i<selva.length()) //mientras el indice sea menor al tama;o de la selva, Tengo caracteres que procesar
       {
           if(j<palabra.length()) //mientras el indice sea menor al de la palabra, Tengo caracteres para comparar
           {
               char cpalabra = palabra.charAt(j);
               char cselva = selva.charAt(i);
               
               if(cpalabra == cselva)
                return contarLeones(selva, palabra, i+1, j+1); //si caracteres son iguales avanzamos en selva y palabra
               else
                return contarLeones(selva, palabra, i+1, j); //si caracteres NO son iguales solo seguimos avanzando la selva
           }
           else //terminamos de recorrer la palabra 
            return 1+contarLeones(selva, palabra, i+1, 0); //seguimos analizando la selva la proxima letra de la selva pero la palabra es 0 para enalizar otra palabra
        }
       else // terminamos de recorrer la selva regresamos 0
        return 0;
   }
}
