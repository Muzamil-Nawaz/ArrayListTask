
import java.util.Arrays;

 class House{
    public String address;
    public double price;

    @Override
    public String toString() {
        return  "$"+getPrice()+" at "+getAddress();
    }

    public House(String address, double price) {
        this.address = address;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <0)
            this.price=0;
        else if(price >10000000)
            this.price = 10000000;
        else
            this.price = price;
    }
    
    public void inflate(double d){
        this.setPrice(getPrice()+d);
    }
    public static void main(String[] args) {
        House h = new House("19 Mona Street",2000000);
        House [] houses = new House[6];
        houses[3] = h;
        plzStop("StOp!");
        
}
     public static int whatsThis(int a, int b) {
         System.out.println("a:"+a+" b:"+b);
         if (a % b == 0) {
             System.out.println("done");
             return a;
         }
         System.out.println(a);
         return whatsThis(a - 4, b + 3);
     }
     public static String plzStop(String str) {
         System.out.println("str:"+str);
         if (str.length() <= 1) {
             System.out.println("done");
             return str;
         }
         System.out.println(str);
         if (str.length() % 2 == 1) {
             return plzStop(str + str.substring(0, 1));
         }
         return plzStop(str.substring(0, str.length() - 3));
     }
    public static int findHouse(House [] houses, String target){
        for (int i = 0; i < houses.length; i++) {
            if(houses[i].getAddress().equals(target))
                return i;
        }
        return -1;
    }
}

