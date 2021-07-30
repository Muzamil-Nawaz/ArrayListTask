
import java.util.ArrayList;

public class Game {
    private String name;
    private double price;

    public Game(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList();
        games.add(new Game("PUBG",20.50));
        games.add(new Game("COD",89.99));
        System.out.println(games.get(0).getPrice());
        
}
    
}
