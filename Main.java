import java.util.Scanner;
/**
 * Enter in two vectors and calculates product
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user to enter in the first vectors values
    System.out.println("Please enter the 3 values for the first vector");

    // create constant for vector
    final int VECTOR_SPACE = 3;

    // create an array for each vector
    int[] vector1 = new int[VECTOR_SPACE];
    int[] vector2 = new int[VECTOR_SPACE];

    // put vector1 values into the array using a loop
    for(int i = 0; i < VECTOR_SPACE; i++){
      vector1[i]= input.nextInt();
    }

    // ask the user to enter in the second vectors values
    System.out.println("Please enter the 3 values for the second vector");

    // put vector2 values into the array using a loop
    for(int i = 0; i < VECTOR_SPACE; i++){
      vector2[i]= input.nextInt();
    }
    // calculate the dot product
    int dotProduct = vector1[0]*vector2[0] + vector1[1]*vector2[1] + vector1[2]*vector2[2];
    
    // tell the user the dot product
    System.out.println("The dot product is " + dotProduct);




    
  }
}
