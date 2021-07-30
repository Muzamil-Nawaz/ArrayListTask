
import java.text.DecimalFormat;

public class Clock {
    private int hour =0;
    private int minute= 0;
    final int MAX_HOUR = 23;
    final int MAX_MIN = 59;
    
    public void displayTime(){
        DecimalFormat decimalFormat = new DecimalFormat("00");
        System.out.println(decimalFormat.format(this.hour)+":"+decimalFormat.format(this.minute));
    }
    public void tick(){
        if(this.minute<MAX_MIN){
            this.minute+=1;
        }
        else if(this.hour < MAX_HOUR){
            this.hour+=1;
            this.minute=0;
        }
        else{
            this.minute=0;
            this.hour=0;
        }
    }
    public void reset(){
        this.minute=0;
        this.hour=0;
    }
  
    
}
