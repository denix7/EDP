package EDL;

public class ArbolBBusqueda
{
    NodoABB raiz;
    int contador;
    public ArbolBBusqueda()
    {
        this.raiz=null;
    }
    public void insertar(int dato){
        insertar(dato,raiz);
    }
    private void insertar(int dato,NodoABB recorrido){
        NodoABB nuevo=new NodoABB(dato);
        if(vacio()){
            raiz=nuevo;
        }else{
            if(dato<recorrido.getDato()){
               if(recorrido.getIzq()==null){
                   recorrido.setIzq(nuevo);
               }else{
                  insertar(dato,recorrido.getIzq()); 
               }
            }else{
                if(recorrido.getDer()==null){
                   recorrido.setDer(nuevo);
               }else{
                  recorrido.getDer();
                  insertar(dato,recorrido.getDer());
               }
            }
        }
    }
    public boolean vacio(){
        return this.raiz==null;
    }
    public void InOrden(){
        InOrden(raiz);
    }
    private void InOrden(NodoABB rec){
        if(rec!=null)
        {   
            InOrden(rec.getIzq());
            System.out.println(rec.getDato());
            InOrden(rec.getDer());
        }
    }
    public void PreOrden(){
        PreOrden(raiz);
    }
    private void PreOrden(NodoABB rec){
        if(rec!=null)
        {   
            System.out.println(rec.getDato());
            PreOrden(rec.getIzq());
            PreOrden(rec.getDer());
        }
    }
    public void PostOrden(){
        PostOrden(raiz);
    }
    private void PostOrden(NodoABB rec){
        if(rec!=null)
        {   
            PostOrden(rec.getIzq());
            PostOrden(rec.getDer());
            System.out.println(rec.getDato());
        }
    }
    public void PorNivel(){
        PorNivel(raiz,1);
    }
    private void  PorNivel(NodoABB rec,int num){
        if(rec!=null)
        {   
            PorNivel(rec.getIzq(),num+1);
            System.out.println(rec.getDato()+" Nivel: ("+num+")");
            PorNivel(rec.getDer(),num+1);
        }
    }
    public void Mayor(){
        Mayor(raiz);
    }
    private void Mayor(NodoABB rec){
        if(rec.getDer()!=null)
        {   
            Mayor(rec.getDer());
        }else{
         System.out.println(rec.getDato());
        }
    }
    public void Menor(){
        Menor(raiz);
    }
    private void Menor(NodoABB rec){
        if(rec.getIzq()!=null)
        {   
            Menor(rec.getIzq());
        }else{
         System.out.println(rec.getDato());
        }
    }
    public int BuscaryObtener(int dat){
        return BuscaryObtener(raiz,dat);
    }
    private int BuscaryObtener(NodoABB rec,int dat){
      if(rec!=null){
            if(dat==rec.getDato()){
                return rec.getDato()+BuscaryObtener(rec.getDer(),dat);
                
            }else{
               if(dat>rec.getDato()){
                 return BuscaryObtener(rec.getDer(),dat);
               }else{
                 return BuscaryObtener(rec.getIzq(),dat);
               }
            }
        }else{
        return 0;
      }
    }
    public boolean Buscar(int dat){
        if(BuscaryObtener(raiz,dat)==dat){
            return true;
        }else{
            return false;
        }
    }
    public void Hojas(){
        Hojas(raiz);
    }
    private void Hojas(NodoABB rec){
        if(rec!=null)
        {   
            Hojas(rec.getIzq());
            if(rec.esHoja()){
              System.out.println(rec.getDato());
            }
            Hojas(rec.getDer());
        }
    }
    public int contarHojas(){
         contador=0;
         contarHojas(raiz);
         return contador;
    }
    private void contarHojas(NodoABB rec){
        if(rec!=null)
        {   
            if(rec.esHoja()){
              contador++;
            }    
            contarHojas(rec.getIzq());
            contarHojas(rec.getDer());
        }
    }
}
    
    
    /*
     public void insertar(int dato){
        NodoABB nuevo=new NodoABB(dato);
        if(vacio()){
            raiz=nuevo;
        }else{
            if(dato<raiz.getDato()){
               if(raiz.getIzq()==null){
                   raiz.setIzq(nuevo);
               }else{
                  raiz=raiz.getIzq();
                  insertar(dato); 
               }
            }else{
                if(raiz.getDer()==null){
                   raiz.setDer(nuevo);
               }else{
                  raiz=raiz.getDer();
                  insertar(dato);
               }
            }
        }
    }   
       
    */

