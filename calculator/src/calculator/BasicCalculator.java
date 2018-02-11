package calculator;
import java.util.Stack;

/*created by vinay on 11-02-18*/

public class BasicCalculator{
	    public double calculate1(String expr) {
	    	System.out.println("vinay"+expr);
	        Stack<Double> values;
	        Stack<Character> ops;
	        char[] tokens;
	        tokens = expr.toCharArray();
	        values = new Stack<>();
	        ops = new Stack<Character>();
	        //for(int i=0;i<tokens.length;i++)
	        	//System.out.println(tokens[i]);
	        for (int i = 0; i < tokens.length; i++)
	        {
	        	System.out.println(tokens[i]);
	            if (tokens[i] >= '0' && tokens[i] <= '9')
	            {
	                StringBuffer sbuf = new StringBuffer();
	                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
	                {
	                    sbuf.append(tokens[i]);i++;
	                }
	                values.push(Double.parseDouble(sbuf.toString()));
	            }
	            if (i<tokens.length)
            	{
	            	if (tokens[i] == '(')
	                    ops.push(tokens[i]);
		            if (tokens[i] == ')')
		            {
		                while (ops.peek() != '(')
		                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
		                ops.pop();
		            }
	            	if(tokens[i] == '+' || tokens[i] == '-' ||tokens[i] == '*' || tokens[i] == '/')
		            {
		            	System.out.println(tokens[i]);
		                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek()))
		                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
		                ops.push(tokens[i]);
		            }
            	}
	        }
	        while (!ops.empty())
	            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
	        return values.pop();
	    }
	    protected static boolean hasPrecedence(char op1, char op2)
	    {
	        if (op2 == '(' || op2 == ')')
	            return false;
	        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
	            return false;
	        else
	            return true;
	    }
	    public static double applyOp(char op, double b, double a){
	    	System.out.println(op);
	        switch(op){
	            case '+': 
	            	return a + b;
	            case '-': return a - b;
	            case '*': 
	            	System.out.println("vinay"+a*b);
	            	return a * b;
	            	
	            case '/': if(b == 0)
	                throw new UnsupportedOperationException("Cannot divide by zero");
	                return a/b;
	        }
	        return 0;
	    }


	    public double add(double a, double b) {
	        return a + b;
	    }


	    public double sub(double a, double b) {
	        return a - b;
	    }

	    public double mul(double a, double b) {
	        return a * b;
	    }


	    public double div(double a, double b) {
	        if(b == 0)
	            throw new UnsupportedOperationException("Cannot divide by zero");
	        return a/b;
	    }


	}

