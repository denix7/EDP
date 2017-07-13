import ed.edl.*;
/**
 * Write a description of class Repartidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Repartidor
{
    private ColaPrioridad<Pedido> peds;
    public Repartidor(){
        peds = new ColaPrioridad<Pedido>();
    }
    public void agregarPedido(Pedido pedido){
        peds.encolar(pedido);
    }
    public ListaSE<ListaSE<Pedido>> getListadoPorZona(){
        ListaSE<ListaSE<Pedido>> listas = new ListaSE<ListaSE<Pedido>>();
        ListaSE<Pedido> lista = null;
        String zonaAct = "";
        Pedido pedido;
        while(!peds.vacia()){
            pedido = peds.decolar();
            if(zonaAct.isEmpty() || !zonaAct.equals(pedido.getZona())){
                if(lista != null) listas.add(lista);
                lista = new ListaSE<Pedido>();
                lista.add(pedido);
                zonaAct = pedido.getZona();                
            }else lista.add(pedido);
        }
        if(lista != null) listas.add(lista);
       
        return listas;
    }
}
