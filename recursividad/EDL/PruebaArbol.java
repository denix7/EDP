package EDL;
import java.util.Random;
public class PruebaArbol
{

    public static void main(String []args)
    {
        arbolBB arbol=new arbolBB();
        int valor;
        Random numeroAleatorio=new Random();
        System.out.println("Insertando los siquientes valores: ");
        arbol.insertarNodo(10);
        System.out.println("10 ");
        for(int i=1;i<=10;i++){
            valor=numeroAleatorio.nextInt(20);
            System.out.println(valor+" ");
            arbol.insertarNodo(valor);
        }
        System.out.println("\n\nRecorrido preorden ");
        arbol.recorridoPreorden();
        
        System.out.println("\n\nRecorrido Inorden ");
        arbol.recorridoInorden();
        
        System.out.println("\n\nRecorrido Postorden ");
        arbol.recorridoPostorden();
    }
}
