package calculator;


public abstract class Calculator implements CalInterface {
	    public abstract double add(double a, double b);
	    public abstract double sub(double a, double b);
	    public abstract double mul(double a, double b);
	    public abstract double div(double a, double b);
	    public abstract double cal(String expr);
	}
