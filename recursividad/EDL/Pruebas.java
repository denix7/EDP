package EDL;

public class Pruebas {

    public static void main(String[] args) {
        // TODO code application logic here
        /*
       NodoSE prueba=new NodoSE("Hola");
       NodoSE prueba1=new NodoSE(455689);
       NodoSE prueba2=new NodoSE("Mundo");
       // enlazar
       prueba.setSiguiente(prueba1);
       prueba.getSiguiente().setSiguiente(prueba2);
       System.out.println("Prueba:"+prueba.getDato()+"Prueba1:"+prueba1.getDato()+"Prueba2:"+prueba2.getDato());
       System.out.println("Prueba:"+prueba.getDato() +":"+prueba.getSiguiente().getSiguiente().getDato());
       */
       NodoDE prueba=new NodoDE("Hola");
       NodoDE prueba1=new NodoDE(455689);
       NodoDE prueba2=new NodoDE("Mundo");
       prueba.setSiguiente(prueba1);
       prueba1.setAnterior(prueba);
       prueba1.setSiguiente(prueba2);
       prueba2.setAnterior(prueba1);
       /*
        System.out.println("Prueba:"+prueba.getDato());
        System.out.println("Prueba:"+prueba1.getDato());
        System.out.println("Prueba:"+prueba2.getDato());
        */
        System.out.println("Prueba:"+prueba1.getAnterior().toString());
        System.out.println("Prueba:"+prueba1.getDato());
        System.out.println("Prueba:"+prueba1.getSiguiente().toString());
    }


    
}
