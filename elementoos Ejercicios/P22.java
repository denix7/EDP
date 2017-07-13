import ed.edl.Pila;
public class P22
{
    public P22(){
        String a = "sapo";
        String b = "sigilo";
        System.out.println(((int)('a')));
        System.out.println(((int)('i')));
        System.out.println(a.compareTo(b));
    }
    
    public String getPatronReducido(String patron){
        String patronReducido = ""; 
        char c;
        Pila<Par> pila = new Pila<Par>();
        for(int idx = 0; idx <= patron.length()-1; idx++){
            c = patron.charAt(idx);
            if(!pila.vacio() && pila.tope().getC() == c)
                pila.tope().incr();
            else pila.push(new Par(c));
        }
        
        while(!pila.vacio()){
            patronReducido = pila.tope().toString() + patronReducido;
            pila.pop();
        }
        return patronReducido;
    }
}
