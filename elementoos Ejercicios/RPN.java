import java.util.Stack;
public class RPN
{
    public String getRPN(String exp){
        String rpn = "";
        char c;
        Stack<Character> simbs = new Stack<Character>();
        for(int i = 0; i <= exp.length()-1; i++){
            c = exp.charAt(i);
            if(c == ')'){
                while(simbs.peek() != '('){
                    rpn = rpn + simbs.peek();
                    simbs.pop();
                }
                simbs.pop();
            }
            else if(c == '(' || c == '+' || c == '-'|| c == '*' || 
                    c == '/' || c == '^') simbs.push(c);
            else rpn = rpn + c;
        }
        return rpn;
    }
}
