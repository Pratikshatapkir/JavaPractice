class Mobile{
    String brand;
    static String name;
    int price;

    public void show(){
        System.out.println(brand+ ":" +price+":"+name);
    }

}


public class StringBuffer {
    public static void main(String[] args) {
         
        Mobile mb=new Mobile();
        mb.brand="apple";
        mb.price=123;
        Mobile.name="smartphone";
        mb.name="phone";
        
        mb.show();

    
    }
    
}
