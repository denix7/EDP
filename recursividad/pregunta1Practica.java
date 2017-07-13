public class pregunta1Practica {
 public void grabarMusica(int N,int P,int []pistas){
       ordenar(pistas,0,0);
       String grabar=grabarMusica(N,pistas,0,0);
       int sumarPistas=sumar(pistas,0,N,0);
       grabar=grabar.substring(0,(grabar.length()-1));
       System.out.println("Las pistas que suman "+N+" son: "+grabar+" y la suma total de las pistas es: "+sumarPistas);
 }
  private String grabarMusica(int capacidad,int []arreglo,int posicion,int acumulado){
    int comparador=acumulado;
    if(posicion==arreglo.length || (comparador+arreglo[posicion])>capacidad){
        return "";
    }else{
    acumulado=acumulado+arreglo[posicion];
    return arreglo[posicion]+","+grabarMusica(capacidad,arreglo,posicion+1,acumulado);
    }    
 }
 private int []ordenar(int []arreglo,int pos, int orden){
        int mayor,menor;
        if(pos<arreglo.length){
            
            if(orden==arreglo.length){
              return ordenar(arreglo,pos+1,0);  
            }else{
                if(arreglo[orden]>=arreglo[pos]){
                   mayor=arreglo[orden];
                   menor=arreglo[pos];
                   arreglo[orden]=menor;
                   arreglo[pos]=mayor;
                   return ordenar(arreglo,pos,orden+1);
                }else{
                    return ordenar(arreglo,pos,orden+1);
                }
            }
        }else{           
        return arreglo;
        }
 }
 private int sumar(int []arreglo,int posicion,int capacidad,int acumulado){
    int comparador=acumulado;
    if(posicion==arreglo.length || (comparador+arreglo[posicion])>capacidad){
        return 0;
    }else{
     acumulado=acumulado+arreglo[posicion];
     return arreglo[posicion]+sumar(arreglo,posicion+1,capacidad,acumulado);
    }   
 }
}

