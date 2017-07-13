public class pregunta2 {
    public void luckyNumbers(int []numeros){
        int []almacenar=new int[numeros.length];
        int []lucky=luckyNumb(numeros,0,0,almacenar);
        String mostrar=imprimir(lucky,0);
        System.out.println("lucky: "+mostrar);
        
    }


    private int []luckyNumb(int[] arreglo, int i,int j,int []alm) {
      if(arreglo.length==i){
            return alm;
        }else{
          if(arreglo[i]==7 || arreglo[i]==4){
              alm[j]=arreglo[i]; 
              return luckyNumb(arreglo,i+1,j+1,alm);
          }else{
              return luckyNumb(arreglo,i+1,j,alm);
          }
      }
    }
    private String imprimir(int []arreglo,int pos){
        if(pos==arreglo.length)
            return "";
        else
             if(arreglo[pos]==7 || arreglo[pos]==4)
            return arreglo[pos] + imprimir(arreglo,pos+1);
            else
            return imprimir(arreglo,pos+1);
    }
}