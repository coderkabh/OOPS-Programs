public class MyCalculator {
    int a,b,result;
    public int add(int a,int b){
        this.a=a;
        this.b=b;
        result=a+b;
        return result;
    }
    public int sub(int a,int b){
        this.a=a;
        this.b=b;
        result=a-b;
        return result;
    }
    public int mul(int a , int b){
        this.a=a;
        this.b=b;
        result=a*b;
        return result;
    }
    public double div(int a,int b){
        this.a=a;
        this.b=b;
        double result=(double) a/b;
        return result;
    }
}
