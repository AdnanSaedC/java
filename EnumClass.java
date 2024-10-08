enum Laptop{
    Macbook(2020),Asus(2050),Lenovo;
    //they are the objects two will have price one 
    //will not

    //lenovo will not work becaue since we have declacred
    //constructor
    //which has overcome the default constuctor


    private int price;
    private Laptop(int price){
        this.price=price;
    }
    private Laptop(){
        this.price=15;
    };
    //open and closed curly are important
    public int price(){
        return this.price;
    }

}

public class EnumClass{
    public static void main(String args[]){
        Laptop s[]=Laptop.values();
        for(Laptop i: s){
            System.out.println(i +" : "+i.price());
        }
    }
}