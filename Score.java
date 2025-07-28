
package score;

public class Score {

	public static void main(String[] args) {
      int[] Scores = {85, 92, 78, 95, 88, 70, 81, 90, 75, 83, 91, 68, 89, 93, 72, 80, 96, 79, 87, 84};
      boolean firstScoreSkipped = false; //tracks the first element
      
      //checks if scores are empty
      if (Scores == null) {
    	  System.out.println("ERROR: List is empty");
      }
      
      int max_score = Scores[0];
      int min_score = Scores[0];
      int total_score = Scores[0];
      
      System.out.print("Scores: ");
      System.out.print("[ ");
      
      //iterates all scores in the array
     for (int score: Scores) {
    	 
     System.out.print(score + "  "); //displays all scores
     
	   if (score > max_score) {
		   max_score = score;
	   }
	   
	   else if (score < min_score) {
		   min_score = score;
	   }
	  
	   //enables to skip the first iteration of element
	   if(!firstScoreSkipped) {
		firstScoreSkipped = true;
		continue;
	   }
	
	total_score += score; //adds all scores
   }
     
     
     int average_score = total_score / Scores.length;
     
     System.out.print("]");
     System.out.println("\n\nMaximum Score: " + max_score);
     System.out.println("Minimum Score: " + min_score);
     System.out.println("Average Score: " + average_score);
     
	}

}
