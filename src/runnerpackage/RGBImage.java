

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * Write a description of class RGBImage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RGBImage
{

    // RGB colors array to represent each pixel of image
    private RGBColor[][] _image;

    // constructo to create a RGB image with given rows and cols length
    public RGBImage(int rows, int cols){

        _image = new RGBColor[rows][cols]; // create a new instance of _image arr and set its params to rows and cols

        for (int i=0; i<rows; i++) // declare i as 0; if i is smaller than rows; promote i++
//        // *rows is a variable that holds the amount of rows given by the arr
        {
            for (int j=0; j<cols; j++){
                _image[i][j] = new RGBColor();
//
//               // System.out.println("i" + i);
//               // System.out.println("j" + j);
            }
        }
    }
    

    // constructor for accepting an array of RGB color and initializing _image with the colors of array which is passed through parameter. 

    public RGBImage(RGBColor[][] pixels) {

        // Extracting rows and columns of given array
        int rowsAmount = pixels.length; //
        int colsAmount = pixels[0].length;

        // Initializing _image array with given array's size of rows and columns
        _image = new RGBColor[rowsAmount][colsAmount];

        // looping to copy each item of pixels to _image 
        for (int row=0; row<rowsAmount; row++)
        {
            for (int col=0; col<colsAmount; col++){

                _image[row][col] = pixels[row][col];

                //  System.out.println("i" + row);
                // System.out.println("j" + col);
            }
        }

    }

    // Method for accepting a RGBImage as paramter and cloning/copying it into _image array
    public RGBImage(RGBImage other)
    {
        // copy constructor
        int rowsAmount = other.getHeight(); //
        int colsAmount = other.getWidth();

        _image = new RGBColor[rowsAmount][colsAmount];

        // looping to copy each pixel of given array in to _image array
        for (int row=0; row<rowsAmount; row++)
        {
            for (int col=0; col<colsAmount; col++){

                _image[row][col] = other.getPixel(row,col);

                //  System.out.println("i" + row);
                // System.out.println("j" + col);
            }
        }

    }

    // Method to get height or number of rows in _image array
    public int getHeight(){
        return _image.length;
    }

    // Method to get width of number of columns in _image array
    public int getWidth(){
        return _image[0].length;
    }

    // Method to get specific pixel located at given row and column
    public RGBColor getPixel (int row, int col){
        return _image[row][col];
    }

    // Method for replacing any specific pixel of _image at given row and col with provided RGBColor pixel
    public void setPixel (int row, int col, RGBColor pixel){

        _image[row][col] =  pixel;

    }


    // Method to compare two RGBImage object
    public boolean equals (RGBImage other){
        // if number of rows are not equal, images are not equal
        if(other._image.length != _image.length)
            return false;
        // if number of cols are not equal, images are not equal
        if(other._image[0].length != _image[0].length)
            return false;

        // looping through other image to compare each pixel of both images
        for (int row=0; row<other._image.length; row++)
        {
            for (int col=0; col<other._image[0].length; col++){
                
                // if any pixel of both images doesn't match, return false
                if(!_image[row][col].equals(other.getPixel(row,col)))
                    return false;

            }
        }

        // this means images are equal in every aspect
        return true;

    }

    // Method for fliping image pixels horiontally, to make first row last and so on.
    public  void  flipHorizontal(){

        // Initializing a temperory colors array to store previous version of image
        RGBColor [][] temp = new RGBColor[_image.length][_image[0].length];

        // putting pixels of current image into temp array
        for (int row=0; row<_image.length; row++)
        {
            for (int col=0; col<_image[0].length; col++){
                temp[row][col]=_image[row][col];
            }
        }

        // Now looping through the image pixels and replacing rows of the image horizontally
        for (int row=0; row<_image.length; row++)
        {
            for (int col=0; col<_image[0].length; col++){
                _image[row][(_image[0].length-1)-col]=temp[row][col];
            }
        }

    }

    
    // Method for fliping image pixels vertically, to make first col last and so on.
     public void flipVertical() {
        // Looping through image to swap it's columns
        for (int i=0; i<getHeight()/2; i++) {
            
            for (int j=0; j<getWidth(); j++) {
                // making a temperory variable to store on column, which is going to be replaced
                RGBColor temp = _image[i][j];
                // replacing 1st to be replaced column with 2nd to be replaced column
                _image[i][j] = _image[getHeight()-i-1][j];
                // replacing 2nd to be replaced with temp variable which contains old data of 1st to be replaced column
                _image[getHeight()-i-1][j] = temp;
            }
        }
    }

     
    // Method for invering color of each pixel of current image
    public  void  invertColors(){

        // Looping through image to invert each pixel
        for (int row=0; row<_image.length; row++)
        {

            for (int col=0; col<_image[0].length; col++){
                // inverting red pixel of image with it's respective inverted color
                _image[row][col].setRed(255 - _image[row][col].getRed());
                // inverting green pixel of image with it's respective inverted color
                _image[row][col].setGreen(255 - _image[row][col].getGreen());
                // inverting blue pixel of image with it's respective inverted color
                _image[row][col].setBlue(255 - _image[row][col].getBlue());

            }
        }
    }


    // Method to rotate the content of image at 90 degree clockwise convert columns in to rows into reverse order
    void rotateClockwise ( ){

        // Initializing temp array whihc will be used original rows and columns of image
        RGBColor [][] Temp = new RGBColor[_image.length][_image[0].length];

        // Putting all content of original image in temp array
        for (int row=0; row<_image.length; row++)
        {
            for (int col=0; col<_image[0].length; col++){
                Temp[row][col]=_image[row][col];
            }
        }

        // Reinitializing _image array with reversed length of rows and columns
        _image = new RGBColor[Temp[0].length][Temp.length];

        // looping through image to convert the vertical data from original array into horizontal data of new image
        for (int row=0; row<_image.length; row++)
        {
            for (int col=0; col<_image[0].length; col++){
                _image[row][col] = Temp[col][row];
            }
        }

        flipHorizontal();

    }

    // Method to rotate the content of image at 90 degree counter clockwise convert columns in to rows into reverse order
        public void rotateCounterClockwise() {

        // flipping contents of array horizontally first
        flipHorizontal();

        
        // Initializing temp array whihc will be used original rows and columns of image
        RGBColor[][] temp = new RGBColor[getWidth()][getHeight()];
        
        // Putting all content of original image in temp array
        for (int i = 0; i <getHeight(); i++) {
            for (int j = 0; j <getWidth(); j++) {
                temp[j][i] = _image[i][j]; }
        }
        // Converting image cols in to rows and rows into columns anti-clockwise
        _image = temp;        
    }
    
        // Method for shifting columns towards given offset number, like if offset is 1, 
        //it will shift col 0 to position col 0+offset which will be 1 in this case and so on for other column
        public void shiftCol(int offset) {

        // initializing temperory array to access original array
        RGBColor[][] temp = new RGBColor[getHeight()][getWidth()];

        // checking if given offset is valid 
        if (Math.abs(offset) <= getWidth())
            if (Math.abs(offset) == getWidth())
                for (int i=0; i < getHeight(); i++) {
                    // Resetting pixels of original image array
                    for (int j=0; j < getWidth(); j++) {
                        _image[i][j] = new RGBColor();
                    }
                }
            else {
                for (int i=0; i < getHeight(); i++) {
                    for (int j=0; j < getWidth(); j++) {
                        temp[i][j] = new RGBColor();
                    }
                }
                for (int i=0; i<getHeight(); i++) {
                    for (int j=0; j<getWidth(); j++){
                        if (j + offset < getWidth() && j + offset >= 0)
                            temp[i][j+offset] = _image[i][j];
                    }
                }
                _image = temp;
            }
    }
    
        
        // Method for shifting rows towards given offset number, like if offset is 1, 
        //it will shift row  0 to position row 0+offset which will be 1 in this case and so on for other row
        public void shiftRow(int offset) {

        RGBColor[][] temp = new RGBColor[getHeight()][getWidth()];

        if (Math.abs(offset) <= getHeight())
            if (Math.abs(offset) == getHeight())
                for (int i=0; i < getHeight(); i++) {
                    for (int j=0; j < getWidth(); j++) {
                        _image[i][j] = new RGBColor();
                    }
                }
            else {
                for (int i=0; i < getHeight(); i++) {
                    for (int j=0; j < getWidth(); j++) {
                        temp[i][j] = new RGBColor();
                    }
                }
                for (int i=0; i<getHeight(); i++) {
                    for (int j=0; j<getWidth(); j++){
                        if (i + offset < getHeight() && i + offset >= 0)
                            temp[i+offset][j] = _image[i][j];
                    }
                }
                _image = temp;
            }
    }

    
    // Method for converting each pixel of original image in to grayscale and return the grayscale image array
    public double[][] toGrayscaleArray() {
        // Initializing new array to store grayscale pixels
        double[][] gray = new double[getHeight()][getWidth()];
        // looping through original image to convert each image into grayscale and populating grayscale array
        for (int i=0; i<getHeight(); i++) {
            for (int j=0; j<getWidth(); j++) {
                gray[i][j] = _image[i][j].convertToGrayscale();
            }
        }
        // returning new grayscale array
        return gray;
    }

    // Method for doing string representation of original image by printing pixels (rows and images)
    public String toString() {
        // Initializing a string object to store each pixel's value
        String represent = new String();
        // looping through array to convert each pixel to string 
        for (int i=0; i<getHeight(); i++) {
            for (int j=0; j<getWidth(); j++) {
                represent += _image[i][j].toString() + " ";
            }
            represent += "\n";
        }
        // returning the final string representation of array
        return represent;
    }

    
    // A method to simply get the copy of pixels of original array
    public RGBColor[][] toRGBColorArray(){
        // initializing copy array for storing clone of original array
        RGBColor[][] arrayCopy = new RGBColor[getHeight()][getWidth()];

        // looping through original array to store copy of each pixel in array clone.
        for (int i=0; i < getHeight(); i++) {
            for (int j=0; j < getWidth(); j++) {
                arrayCopy[i][j] = new RGBColor(_image[i][j]);
            }
        }
        // returning cloned version of original array
        return arrayCopy;
    }
}
    


