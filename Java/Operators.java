public class Operators{
    private int num1;
    private int num2;
    
    Operators(int a, int b){
        num1=a;
        num2=b;
    }
    
    public int addition(){
        return num1+num2;
    }
    public int subtraction(){
        return num1-num2;
    }
    public int multiply(){
        return num1*num2;
    }
    public double division(){
        return (double)num1/num2;
    }
}