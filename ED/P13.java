import java.util.Stack;

public class P13
{
    public String msgRestaurado(String msgCifrado){
        String msgRes = "";
        Stack<Character> pila = new Stack<Character>();
        int i; char msgi;
        for(i = 0; i <= msgCifrado.length()-1; i++){
            msgi = msgCifrado.charAt(i);
            if(!pila.isEmpty() && pila.peek() == msgi) pila.pop();
            else pila.push(msgi);
        }
        msgRes = vaciarPila(pila);
        return msgRes;
    }
    
    private String vaciarPila(Stack<Character> pila){
        String res = "";
        while(!pila.isEmpty()){
            res = pila.peek() + res;
            pila.pop();
        }
        return res;
    }
}
