import ed.edl.*;
import ed.ednl.*;
/**
 * Write a description of class Prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prueba
{
    public void textCuenca(){
        Cuenca cuenca = new Cuenca("Bora");
        cuenca.agregarPueblo(new Pueblo("Notar", 0));
        cuenca.agregarPueblo(new Pueblo("Notar", 0), new Pueblo("NejoCo", 15));
        cuenca.agregarPueblo(new Pueblo("Notar", 0), new Pueblo("Noel", 10));
        cuenca.agregarPueblo(new Pueblo("NejoCo", 15), new Pueblo("NoAs", 30));
        cuenca.agregarPueblo(new Pueblo("NejoCo", 15), new Pueblo("DillaR",60));
        cuenca.agregarPueblo(new Pueblo("DillaR", 60), new Pueblo("Onom", 40));
        cuenca.agregarPueblo(new Pueblo("Onom", 40), new Pueblo("ABo", 50));  
        cuenca.agregarPueblo(new Pueblo("Noel", 10), new Pueblo("NoRe", 20));
        cuenca.agregarPueblo(new Pueblo("Noel", 10), new Pueblo("Mapu", 100));
        cuenca.agregarPueblo(new Pueblo("Mapu", 100), new Pueblo("Dopar", 35));
        cuenca.agregarPueblo(new Pueblo("Mapu", 100), new Pueblo("TeraPan", 40));
        
        System.out.println(cuenca.getPueblosAVisitar(120));
    }
    
    public void testPodarHojas(){
        ArbolBB<Character> arbol = new ArbolBB<Character>();
        arbol.insertar('K');
        arbol.insertar('G');
        arbol.insertar('Q');
        arbol.insertar('C');
        arbol.insertar('H');
        arbol.insertar('M');
        arbol.insertar('Y');
        arbol.insertar('B');
        arbol.insertar('D');
        arbol.insertar('P');
        while(!arbol.vacio()){
            System.out.println(arbol.podarHojas());
        }
    }
    
    public void testPedidos(){
        Repartidor rep = new Repartidor();
        rep.agregarPedido(new Pedido("A", "Miraflores", "callle #34"));
        rep.agregarPedido(new Pedido("B", "Zofraco", "callle #34"));
        rep.agregarPedido(new Pedido("C", "Alalay", "callle #3"));
        rep.agregarPedido(new Pedido("Z", "Miraflores", "callle #39"));
        rep.agregarPedido(new Pedido("H", "Alalay", "callle #34"));
        ListaSE<ListaSE<Pedido>> listas = rep.getListadoPorZona();
        for(int i = 0; i < listas.longitud(); i++){
            System.out.println(listas.get(i));
        }
    }
}
