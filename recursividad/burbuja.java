public class burbuja {
    
    public int []ordenar(int []ordenarArreglo){
       return ordenar(ordenarArreglo,1,0);
        
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
}