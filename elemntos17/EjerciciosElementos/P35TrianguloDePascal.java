package EjerciciosElementos;


/**
 * Write a description of class TrianguloDePascal_35 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class P35TrianguloDePascal
{
   
    public int [] nfilaPascal(int n)
    {
                int fila []; //promesa de respuesta es una fila de elemntos
                if(n==0) //parte basica
                    fila = new int [] {1};
                    
                else if //parte basica
                    (n==1) fila = new int[] {1,1};
        
                else { //parte recursiva
                    fila = new int[n+1]; //mi arreglo esta vacio y sera de tama;o n+1
                    fila[0] = fila[n] = 1; //el primer y ultimo elemnto seran 1
                    llenarActual (nfilaPascal(n-1),fila, 1); //llamamos a llenarActual
                }
                return fila;
            
    }
    private void llenarActual(int []ant, int []act, int i)
    {
        if(i<=ant.length-1){
            act[i] = ant[i-1]+ant[i];
            llenarActual(ant, act, i+1);
        }
    }
}