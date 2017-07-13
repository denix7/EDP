
public class Pedido implements Comparable<Pedido>
{
    private String nombreCliente;
    private String zona;
    private String direccion;
    private int pesoTotal;
    //private ListaSE<Item> listaItems;
    public Pedido(String nombreCliente, String zona, String direccion){
        this.nombreCliente = nombreCliente;
        this.zona= zona;
        this.direccion = direccion;
        //listaItems = new ListaSE<Item>();
        pesoTotal = getPesoTotal();
    }
    public int getPesoTotal(){
        int peso = 0,i;
        /*for(i = 0; i < listaItems.longitud(); i++) 
            peso = peso + listaItems.get(i).getPeso();*/
        peso = (int)(Math.random()*100 + 1);
        return peso;
    }
    public int compareTo(Pedido otro){
        int c = 0;
        if(this.zona.compareTo(otro.zona) == 0){
            if(this.pesoTotal > otro.pesoTotal)
                c = -1;
            if(this.pesoTotal < otro.pesoTotal)
               c = 1;
        }
        return c;
    }
    public String getZona(){
        return zona;
    }
    public String toString(){
        return nombreCliente + " zona : " + zona + " peso: " + pesoTotal;
    }
    /*
    public void agregarItem(Item i){
        listaItems.add(i);
    }
       */
    /*public class Item{
        private int peso;
        private String nombre;
        public int getPeso(){
            return peso;
        }
    }*/
}
