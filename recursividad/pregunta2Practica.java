public class pregunta2Practica {
   public void sumas(int []numeros,int t){
         String resultado = sumas(numeros,t,0,0);
         String segundoResultado=sumas(numeros,t,0,1,2);
         if(resultado.length()==0 && segundoResultado.length()==0){
          System.out.println("Ningun numero suma igual a "+t);  
         }else{
         System.out.println("Las sumas totales que equivalen a "+t+" es:\n"+resultado);
         System.out.println(segundoResultado);
        }
   }
     private String sumas(int []arreglo,int comparador,int posicion,int recorrido)
    {
        if(arreglo.length == posicion)
        {
            return "";
        }else
        { 
            if(recorrido==arreglo.length){
            return sumas(arreglo,comparador,posicion+1,0);
            }else{
                if(arreglo[posicion]==comparador){
                   //System.out.println("El numero que es igual a t: "+comparador+" es: "+arreglo[posicion]);
                   return arreglo[posicion]+",\n"+sumas(arreglo,comparador,posicion+1,0);  
                }else{
                 if((arreglo[posicion]+arreglo[recorrido])==comparador){
                        //System.out.println("Los numeros que suman"+comparador+" son: "+arreglo[posicion]+" + "+arreglo[recorrido]);
                        return  (arreglo[posicion]+"+"+arreglo[recorrido])+",\n"+ sumas(arreglo,comparador,posicion,recorrido+1);
                        }else{
                        return sumas(arreglo,comparador,posicion,recorrido+1);
                    }
                }       
             }
         }
   }
   private String sumas(int []arreglo,int comparador,int posicion,int recorrido,int recorrido2){
         if(arreglo.length == posicion)
        {
            return "";
        }else
        { 
          if(posicion==(arreglo.length-2)){
          return "";
          }else{
              if((arreglo[posicion]+arreglo[recorrido]+arreglo[recorrido2])==comparador){
               return arreglo[posicion]+"+"+arreglo[recorrido]+"+"+arreglo[recorrido2]+",\n"+sumas(arreglo,comparador,posicion+1,recorrido+1,recorrido2+1);
              }
              else{
                  return sumas(arreglo,comparador,posicion+1,recorrido+1,recorrido2+1);
              }
          }  
         }
   }
}


