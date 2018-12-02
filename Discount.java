/* 
@author: Marcelo Mariduena
*/

import java.util.Scanner;

class Discount {
  public static void main(String[] args) {

    // Declaring variables
    Scanner input = new Scanner(System.in);
    double originalPrice;
    double discountPrice;
    double age;

    // Inform the user of the program
    System.out.println("Hello user! This program calculates discounts.");

    // Getting data from the user
    System.out.println("Please enter your age: ");
    age = input.nextDouble();

    System.out.println("Please enter the original purchase price: ");
    originalPrice = input.nextDouble();

    // If the purchaser is 65 or older and is eligible for both discounts, it is 30% of the total price.
    if (age >= 65 && originalPrice >= 100) {
      discountPrice = originalPrice * 0.7;
      System.out.printf("Your original purchase price was $%s, your discount is 30 percent, and your checkout price is $%s.", originalPrice, discountPrice);
    }
    // If the purchaser is 65 or older and is eligible for both discounts, it is 30% of the total price.
    else if (age >= 65) {
      discountPrice = originalPrice * 0.8;
      System.out.printf("Your original purchase price was $%s, your discount is 20 percent, and your checkout price is $%s.", originalPrice, discountPrice);
    }
    // If the total amount is $100 or over, there is a 20% discount of the total price.
    else if (originalPrice >= 100) {
      discountPrice = originalPrice * 0.9;
      System.out.printf("Your original purchase price was $%s, your discount is 10 percent, and your checkout price is $%s.", originalPrice, discountPrice);
    }
    else {
      System.out.printf("Sorry. You do not get a discount. Your checkout price is $%s", originalPrice);
    }


  }
}