
public class ClockDriver {
    public static void main(String[] args) {
        Clock c = new Clock();
        for(int i = 0; i<1500; i++){
            if(i%10==0){
                c.displayTime();
            }
            c.displayTime();
            c.tick();
        }
        c.displayTime();
    }
}
