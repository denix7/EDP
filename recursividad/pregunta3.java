public class pregunta3 {
    public void cajaNatural(int []numeros, int capMax ){
        int suma =cajaNatural(numeros, 0,0);
        if((capMax-suma)>0){
            int resultado=capMax-suma;
            System.out.println("La capacidad de memoria es: "+resultado);
        }else{
            System.out.println("No hay capacidad en la memoria");
        }
    }
    
    private int cajaNatural(int []arreglo, int posicion,int mirar){
        if(posicion==arreglo.length){
            return 0;
        }else{
            return arreglo[posicion] + cajaNatural(arreglo,posicion+1,0);
        }
    }
}
