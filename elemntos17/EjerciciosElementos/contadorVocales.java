package EjerciciosElementos;


/**
 * Write a description of class contadorVocales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/*
 * Definir un metodo recursivo que cuente cuantas vocales tiene un texto
 * */
 
public class contadorVocales
{
   public int contarVocal(String texto)
   {
       return contarVocal(texto, 0); //delegamos responsabilidad a otro metodo donde le mandaremos 2 datos
   }
   private int contarVocal(String texto, int pos) //declaramos pos para recorrer todas las posiciones del texto
   {
       int res; //nuestra promesa de respuesta es un entero
       //parte basica
       if(pos<texto.length()) //el analisis se acaba cuando se sobrepasa el tama;o del texto
       {
           char letra = texto.charAt(pos);
           if(esVocal(letra))//parte recursiva //delegamos responsabilidad a otro metodo
            res = 1+contarVocal(texto, pos+1); //si es vocal contamos y procesamos la siguiente posicion
           else
            res = contarVocal(texto, pos+1); // sino es vocal solo procesamos el siguiente
       }
       else
        res=0; // se sobrepaso el tama;o del texto res es 0
        
       return res; // retornamos la variable res donde almacenamos nestra respuesta
   }
   private boolean esVocal(char c)
   {
       boolean res = false;
       if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        res = true;
        else
        res = false;
        return res;
    }
}


/*
 *public int contarVocales(String texto){
       return contarVocales(texto, 0);
   }
   private int contarVocales (String texto, int pos){ 
           if(pos<texto.length())
           {
               char letra = texto.charAt(pos);
               if (esVocal(letra))
                    return 1+contarVocales(texto, pos+1);
               else 
                    return contarVocales(texto, pos+1);
           }
           else
            return 0;
   }
   private boolean esVocal(char c)
   {
       boolean res = false;
       if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        res = true;
       else
        res = false;
        
        return res;
   } 
 * */
 