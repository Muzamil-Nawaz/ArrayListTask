
import java.util.ArrayList;
import java.util.Scanner;

class RunnerClass{
    public Scanner input = new Scanner(System.in);
    ArrayList<Runner> runnersList = new ArrayList<>();
    public static void main(String [] agrs){
        RunnerClass rc = new RunnerClass();
        rc.start();
        rc.sortRunners();
        System.out.println("*****************************Runners list in the order they completed*****************************");
        System.out.println(rc.runnersList);
    }
    public void start(){

        for(int i = 0; i<3; i++){
            System.out.print("Enter Runner "+(i+1)+" name:");
            String name = input.nextLine();

            System.out.print("Enter Runner "+(i+1)+" time in mins:");
            int time = Integer.parseInt(input.nextLine());

            Runner runner = new Runner(name,time);
            runnersList.add(runner);
        }
    }
    public void sortRunners(){
        for(int i = 0; i <runnersList.size();i++){
            for(int j = 0; j<i; j++){
                if(runnersList.get(i).compareTo(runnersList.get(j))==-1){
                    Runner r = runnersList.get(i);
                    runnersList.set(i, runnersList.get(j));
                    runnersList.set(j, r);
                }
            }
        }
    }
    
    class Runner{
        String name;
        int timeInMint;
        Runner(String name,int timeInMint){
            this.name = name;
            this.timeInMint = timeInMint;
        }
        int compareTo(Runner r){
            if(r.timeInMint == this.timeInMint)
                return 0;
            else if(this.timeInMint > r.timeInMint)
                return 1;
            else 
                return -1;

        }
        public String toString(){
            return "\nName : "+this.name+",Time :"+this.timeInMint;
        }
        
    }
}


