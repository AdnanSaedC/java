//inheritance

class Calc{
    Calc(){
        System.out.print("a");
    }
    }

class AdvanceCalc extends Calc{
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public int add(int a,int b){
        System.out.print("\nHI");
        return a+b;
    }
}
class Inheritance{
    public static void main(String args[]){
        Calc c1=new Calc();
        int x;//c1.add(5,4);
        //System.out.println(x);
        AdvanceCalc c2=new AdvanceCalc();
        x=c2.mul(4,5);
        System.out.println(x);
        x=c2.add(4,5);
        System.out.println(x);
    }
}