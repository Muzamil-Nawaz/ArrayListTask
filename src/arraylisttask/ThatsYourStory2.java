




public class ThatsYourStory2{
	static GTerm mFrame; // for FirstScreen
	static GTerm storyWiindow; // for Story Screen
	static GTerm mainFraem;  // for search Screen
	static String stringValue ="x";
	public String txt;
	public int numTxt;
	static int intValue = 0;
	
public static void searchStory() {
		
		// below are some stories
		String story1 = "Tired of the bragging of a speedy hare, \n"
				+ "\na tortoise challenges it to a race. "
				+ "\nThe overconfident hare accepts the competition and"
				+ "\nruns as fast as it can after the race begins. "
				+ "\nSoon it gets tired and decides to rest, "
				+ "\nthinking that there�s plenty of time to relax "
				+ "\nbefore tortoise can catch up with it. "
				+ "\nMeanwhile, the tortoise continues to walk slowly, "
				+ "\nuntil it reaches the finish line. The overslept hare"
				+ "\nwakes up, only to be shocked that a slow moving"
				+ "\ntortoise beat it in the race."
				+ "\nMoral: Slow and steady 1 wins the race.";
		
		String story2 = "A farmer had a duck, which laid 10 eggs. \r\n" + 
				"Soon, they all hatched. Of the ten, \r\n" + 
				"nine ducklings looked like the mom. \r\n" + 
				"The tenth one was big, gray and ugly. \r\n" + 
				"All the other ducklings made fun of the ugly one.\r\n" + 
				"Unhappy in the farm, the poor duckling ran away to a river nearby.\r\n" + 
				"There he sees white, beautiful swans. Afraid and lost, \r\n" + 
				"he wanted to drown in the river. But when he looked at his\r\n" + 
				"reflection in the river, he realized that he was not an\r\n" + 
				"ugly duckling, but a beautiful swan!\r\n" + 
				"Moral: You are beautiful just the way you are.";


		String story3 = "On a hot summer day,  fox comes upon an orchard \r\n" + 
				"and sees a bunch of ripened grapes. It thinks: \r\n" + 
				"�Just what I need to quench my thirst.� \r\n" + 
				"It moves back a few paces, runs, and jumps but \r\n" + 
				"falls short of reaching the grapes. It tries in \r\n" + 
				"different ways to reach the bunch of grapes, but in vain.\r\n" + 
				"It finally gives up, and says to himself \r\n" + 
				"�I am sure they are sour anyway.�\r\n" + 
				"Moral: It is easy to despise what you cannot get your hands on.";
		
		
		String story4 = "After a feast, 2 cats see a piece of cake \r\n" + 
				"and start fighting for it. A monkey sees this \r\n" + 
				"as an opportunity for gain and offers to help them \r\n" + 
				"The monkey divides the cake into two parts but \r\n" + 
				"shakes its head saying they are unequal. \r\n" + 
				"He takes a bite of one piece and then the other,\r\n" + 
				"but still finds them unequal. He continues doing\r\n" + 
				"so until there is no more cake left, \r\n" + 
				"leaving the poor little cats disappointed.\r\n" + 
				"Moral: When you quarrel amongst yourselves, someone else gains from it.";
 
		String story5 = "A wolf was having a tough time getting hold of 5 sheeps for meal.\r\n" + 
				"It decides to attack them discreetly by dressing itself in \r\n" + 
				"sheepskin. Soon, it starts leading the sheep one-by-one\r\n" + 
				"to a corner and eats them all.\r\n" + 
				"Moral: Appearances are deceptive";
		
		storyWiindow = new GTerm(1700, 790);
		storyWiindow.setTitle("Story");
		
		
		
		int i = 1;
                // story keywords are here
		String[] words1 = story1.split(" "); 
		String[] words2 = story2.split(" ");
		String[] words3 = story3.split(" ");
		String[] words4 = story4.split(" ");
		String[] words5 = story5.split(" ");
                // this boolean variable will look after if a story is already displayed then others 
		// shall not
		boolean isDisplayed = false; 
		boolean isFound = false;
                
		////// Below code will compare keywords in story 1
		for(int j=0; j<words1.length && !isDisplayed; j++) {
			// if word matched then print the picture and story
			if(isFound) {
                                // Setting a background image
				storyWiindow.addImageIcon("1.JPG"); 
				
				
				storyWiindow.println("");
				storyWiindow.setFontName("Gabriola");
				storyWiindow.setFontSize(23);
				storyWiindow.setXY(800,25);
				storyWiindow.addTextArea(story1, 450, 500);
								
				
				
				isDisplayed = true;
						
			}
                        
			// meaning that action field is empty then numeric field is compared
			if(stringValue.equals("x")) {
				
				if(words1[j].equalsIgnoreCase(intValue+"")) {
					isFound = true;
				}
			}
			if(stringValue.equalsIgnoreCase(words1[j])) {
				isFound = true;
				
			}	
		}
		
                
		// below code will compare keywrods in story 2
		for(int j=0; j<words2.length && !isDisplayed; j++) {
			if(isFound) {
				// if word matched then print the picture and story
				storyWiindow.addImageIcon("2.JPG"); // Setting a background image
				
				
				storyWiindow.println("");
				storyWiindow.setFontName("Gabriola");
				storyWiindow.setFontSize(23);
				storyWiindow.setXY(800,25);
				storyWiindow.addTextArea(story2, 450, 500);
				isDisplayed = true;		
				
			}
		
			if(stringValue.equals("x")) {
				// meaning that action field is empty then numeric field is compared
				
				if(words2[j].equalsIgnoreCase(intValue+"")) {
					isFound = true;
				}
			}
			if(stringValue.equalsIgnoreCase(words2[j])) {
				isFound = true;
				
			}	
		}
		
		
		// the below code will compare keywords for story 3
		for(int j=0; j<words3.length && !isDisplayed; j++) {
			if(isFound) {
				// if word matched then print the picture and story
				storyWiindow.addImageIcon("3.JPG"); // Setting a background image
				
				
				storyWiindow.println("");
				storyWiindow.setFontName("Gabriola");
				storyWiindow.setFontSize(23);
				storyWiindow.setXY(800,25);
				storyWiindow.addTextArea(story3, 450, 500);
				isDisplayed = true;		
		
			}
		
			if(stringValue.equals("x")) {
				// meaning that action field is empty then numeric field is compared
				
				if(words3[j].equalsIgnoreCase(intValue+"")) {
					isFound = true;
				}
			}
			if(stringValue.equalsIgnoreCase(words3[j])) {
				isFound = true;
				
				
			}	
		}
		
		
		// below code will compare keywords for story 4
		for(int j=0; j<words4.length && !isDisplayed; j++) {
			// if word matched then print the picture and story
			if(isFound) {
                                 // Setting a background image
				storyWiindow.addImageIcon("4.JPG");
				
				
				storyWiindow.println("");
				storyWiindow.setFontName("Gabriola");
				storyWiindow.setFontSize(23);
				storyWiindow.setXY(800,25);
				storyWiindow.addTextArea(story4, 450, 500);
				isDisplayed = true;		
			}
                        
			// meaning that action field is empty then numeric field is compared
			if(stringValue.equals("x")) {
				
				if(words4[j].equalsIgnoreCase(intValue+"")) {
					isFound = true;
				}
			}
			if(stringValue.equalsIgnoreCase(words4[j])) {
				isFound = true;
				
			}	
		}
		
		
		// above code will compare keywords for story 5
		for(int j=0; j<words5.length && !isDisplayed; j++) {
			if(isFound) {
				// if word matched then print the picture and story
				storyWiindow.addImageIcon("7.JPG"); // Setting a background image
				
				
				storyWiindow.println("");
				storyWiindow.setFontName("Gabriola");
				storyWiindow.setFontSize(23);
				storyWiindow.setXY(800,25);
				storyWiindow.addTextArea(story5, 450, 500);
				
				isDisplayed = true;		
				
			}
		
			if(stringValue.equals("x")) {
				// meaning that action field is empty then numeric field is compared
				
				if(words5[j].equalsIgnoreCase(intValue+"")) {
					isFound = true;
				}
			}
			if(stringValue.equalsIgnoreCase(words5[j])) {
				isFound = true;
								
			}	
		}
		
		
		
		
		// Code for interactive Buttons Below the stories , Home and Close
		storyWiindow.println("");
                storyWiindow.setBackgroundColor(235, 223, 54);
		storyWiindow.setXY(570,580);
		ThatsYourStory2 ob = new ThatsYourStory2(); 
		storyWiindow.addButton("Home", ob, "homeBtn");
		storyWiindow.println("");
		storyWiindow.setXY(720,580);
		storyWiindow.addButton("Close", ob, "closeBtn");
		storyWiindow.println("");
		storyWiindow.setVisible(true);
		
		
	}
	public void closeBtn() {
		storyWiindow.setVisible(false);
                
		 // all frames are closed
		storyWiindow.close();
	}
	public void homeBtn() {
		// back to  the mainScreen
		storyWiindow.setVisible(false);
		storyWiindow.close();
		mainScreen();
	}
	public static void mainScreen() {
		// this method will show a interactive Home Window
		//Since there is no input and output in this particular window
		//therefore no GTerm is used
		
		mFrame = new GTerm(1700,790);
		mFrame.setLayout(null);
		
                mFrame.setBackgroundColor(232, 133, 79);
		mFrame.setTitle("ThatsYourStory");
                mFrame.setFontName("Gabriola");
                mFrame.setFontSize(75);
		mFrame.setXY(150, 50);
		mFrame.println("That's Your Story");
                mFrame.setFontName("Gabriola");
                mFrame.setFontSize(32);
		
		ThatsYourStory2 ob = new ThatsYourStory2();
		mFrame.setXY(720,370);
		mFrame.addButton("Search", ob, "searchBtn");
		mFrame.setXY(900,370);
		mFrame.addButton("Exit", ob, "exitBtn");
		
		
	}
	public void searchBtn() {
		mFrame.setVisible(false);
		mFrame.close();
		searchScreen();
	}
	public void exitBtn() {
		mFrame.setVisible(false);
		mFrame.close();
	}
	public void handler() {
		// to be performed when search button is pressed 
		mainFraem.setVisible(false);
		mainFraem.close(); // GTerm Window closed
		
		// Will set the inputs and search the values accordingly
		if(txt.equals("")) {
			stringValue = "x";
                        //String value converted into Integer using parse method
			// if text field is empty place x in textVariable to match conditions
			// and obtain the numerical value
			intValue = Integer.parseInt(numTxt+"");
			
			// when text is not inserted searchstory with numerical value
                        
			// if text field is empty search using numeric field
			searchStory();
		}
		else {
			stringValue = txt;
			if(numTxt==0) {
				intValue = 1;
			}
			else {
                                // Terminating the Input Winndow here
				intValue = Integer.parseInt(numTxt+"");
				
			}
			mainFraem.setVisible(false);
			mainFraem.close();
			searchStory();
		}
	}
	public void tryAgain() {
		mainFraem.setVisible(false);
		mainFraem.close();
		searchScreen();
	}
	public static void searchScreen() {
		// the size of the Window is defined later
		// GTerm library is used to take input and show output only
		// For interactive window other components are used
		// in below code Font and Color class are used to change the usual fonts and color
		mainFraem = new GTerm(600,550); 
		
		mainFraem.setFontSize(27);
		mainFraem.setTitle("Input");
		
		/** Getting
		 * Inputs from the user
		 */
		
		ThatsYourStory2 ob = new ThatsYourStory2();
		
		ob.txt = mainFraem.getInputString("Enter Action/Character: ");
		String number = mainFraem.getInputString("Enter Numerical Input: ");
		// if the string is empty set it to 0
		if(number==null || number.equals(" ") || number.equals("")) {
			ob.numTxt = 0;
		}
		else {  
                    // otherwise set it to the number
			ob.numTxt = Integer.parseInt(number);
		}
		
		
		
		
		mainFraem.println("");
		// Confirming the input
		String message = "Word: "+ob.txt+", Value: "+ob.numTxt+" ";
		mainFraem.print(message);
		
		// Search Button
		mainFraem.println("");
		mainFraem.println("");
		mainFraem.addButton("Search", ob, "handler");
		mainFraem.println("");
		mainFraem.println("");
		
		// Try again button
		
		mainFraem.addButton("Try Again", ob, "tryAgain");
	}
	public static void main(String[] args) {
		ThatsYourStory2 obj = new ThatsYourStory2();
                // this method will turn the mainScreen on and then based upon the
		// user's input the program flow will run on . . .
		obj.mainScreen(); 
		
	}

}
