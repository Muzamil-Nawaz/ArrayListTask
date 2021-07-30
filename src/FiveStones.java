// Five Stones Game

import java.util.Random;
import java.util.Scanner;

public class FiveStones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int SIZE = 9;
        char[][] grid = new char[SIZE][SIZE];

        displayGrid(grid);
        startPlay(grid);
        displayGrid(grid);

    }

    public static void startPlay(char[][] grid) {
        int count = 0;

        while (true) {
            displayGrid(grid);
            if (count == 81) {
                return;
            }
            if (count % 2 == 0) {
                int row = 0;
                int col = 0;
                System.out.println("grid:"+grid[row][col]+"a");
                while(!(grid[row][col]==' ')) {
                    System.out.println("in");
                    if(row<8){
                        row++;
                    }
                    else if(col<8)
                        col++;
                    else{
                        break;
                    }
                }
                System.out.println(count);
                grid[row][col] = 'x';
                
                count++;
            } else if (count % 2 != 0) {
              int row = 0;
                int col = 0;
                System.out.println("grid:"+grid[row][col]);
                  while(!(grid[row][col]==' ')){
                    System.out.println("in");
                    if(row<8){
                        row++;
                    }
                    else if(col<8)
                        col++;
                    else{
                        break;
                    }
                }
                grid[row][col] = 'o';
                                displayGrid(grid);

                count++;

            }
        }
    }

    // Display the grid
    public static void displayGrid(char[][] grid) {
        // Display the col numbers
        System.out.print("\n   ");
        for (int i = 0; i < grid[0].length; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        for (int i = 0; i < grid.length; i++) {
            System.out.println("  ----------------------------");

            // Display the row number
            System.out.print(i + " ");

            // Display the squares
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 'x' && grid[i][j] != 'o') {
                    System.out.print("|  ");
                } else {
                    System.out.print("| " + grid[i][j]);
                }
            }
            System.out.println("|");
        }

        System.out.println("  ----------------------------");
    }

}
