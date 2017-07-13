package EDL;


public class PruebaArbol2
{

    public static void main(String []args)
    {
        ABB prueba=new ABB();
        int valor=15;
        int valor1=1;
        int valor2=17;
        int valor3=21;
        int valor4=25;
        int valor5=28;
        int valor6=10;
        int valor7=13;
        int valor8=18;
        int valor9=8;
        int valor10=7;
        int valor11=41;
        prueba.insertarNodo(valor);
        prueba.insertarNodo(valor1);
        prueba.insertarNodo(valor2);
        prueba.insertarNodo(valor3);
        prueba.insertarNodo(valor4);
        prueba.insertarNodo(valor5);
        prueba.insertarNodo(valor6);
        prueba.insertarNodo(valor7);
        prueba.insertarNodo(valor8);
        prueba.insertarNodo(valor9);
        prueba.insertarNodo(valor10);
        prueba.insertarNodo(valor11);
        System.out.println("\n\nRecorrido preorden ");
        prueba.recorridoPreorden();
        
        System.out.println("\n\nRecorrido Inorden ");
        prueba.recorridoInorden();
        
        System.out.println("\n\nRecorrido Postorden ");
        prueba.recorridoPostorden();
    }
}
