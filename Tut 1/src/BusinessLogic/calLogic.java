package BusinessLogic;

/**
 * Created by Amay on 1/21/2018.
 */
import java.util.Stack;

public class calLogic implements Calculator{
    public int cal(String exp){
        char[] tokens = exp.toCharArray();

        Stack<Integer> val = new Stack<Integer>();
        Stack<Character> ops = new Stack<Character>();

        for(int i=0;i<tokens.length;i++){
            if(tokens[i] == ' ')
                continue;

            if(tokens[i] >= '0' && tokens[i] <= '9'){
                StringBuffer sbuf = new StringBuffer();
                while(i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    sbuf.append(tokens[i++]);
                val.push(Integer.parseInt(sbuf.toString()));
            }

            else if(tokens[i] == '(')
                ops.push(tokens[i]);

            else if(tokens[i] == ')'){
                while(ops.peek() != '(')
                    val.push(applyop(ops.pop(), val.pop(), val.pop()));
                ops.pop();
            }

            else if(tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/'){
                while(!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
                    val.push(applyop(ops.pop(), val.pop(), val.pop()));
                ops.push(tokens[i]);
            }
        }
        while(!ops.empty())
            val.push(applyop(ops.pop(), val.pop(), val.pop()));

        return val.pop();
    }

    public boolean hasPrecedence(char op1, char op2){
        if(op2 == '(' || op2 == ')')
            return false;
        if((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static int applyop(char op, int b, int a){
        switch(op){
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': if(b == 0)
                throw new UnsupportedOperationException("Cannot divide by zero");
                return a/b;
        }
        return 0;
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        if(b == 0)
            throw new UnsupportedOperationException("Cannot divide by zero");
        return a/b;
    }
}
