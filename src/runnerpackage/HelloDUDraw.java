/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnerpackage;

public class HelloDUDraw {

    public static final int CANVAS_SIZE = 400;

    public static void main(String[] args) {
        DUDraw.setCanvasSize(CANVAS_SIZE, CANVAS_SIZE);
        DUDraw.setXscale(0, CANVAS_SIZE);
        DUDraw.setYscale(0, CANVAS_SIZE);

//make the pen thicker
        DUDraw.setPenRadius(25);

//Make drawing Red circle
        DUDraw.setPenColor(DUDraw.CYAN);
//Draw circle centered at 200,200 with Radius=100pixels
        DUDraw.square(200, 200, 100);

//Make drawing line green
        DUDraw.setPenColor(DUDraw.BLACK);
//drawing a line from (0,200) to (400,200) (horizontal line across canvas at y=200)
        DUDraw.line(0, 200, 400, 200);

//Make drawing orange
        DUDraw.setPenColor(DUDraw.BLACK);
//Draw a filled square centered at (100,100)
        DUDraw.filledSquare(100, 100, 50);

    }
}
