import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Order {
    //create a public constructor function named Order.
    //parameters: an ArrayList of Cupcake object named cupcakeMenu,ArrayList of Drink object named drinkMenu
    public Order(ArrayList<Cupcake> cupcakeMenu,ArrayList<Drink> drinkMenu){
        //Print “Hello customer. Would you like to place an order? (Y or N)”.
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");
        //create a Scanner object to accept the users input, and assign the input to a String variable named placeOrder.
        Scanner input = new Scanner(System.in);
        //assign the input to a String variable named placeOrder.
        String placeOrder = input.nextLine();
        //Create an Arraylist that contains Objects
        ArrayList<Object> order = new ArrayList<Object>();
        //Create an if statement that checks if placeOrder equals Y ignoring capitalization
        if(placeOrder.equalsIgnoreCase("Y")){
            //add LocalDate.now() to order
            order.add(LocalDate.now());
            //add LocalTime.now() to order
            order.add(LocalTime.now());
            //print "Here is the menu"
            System.out.println("Here is the menu");
            //print "CUPCAKES:"
            System.out.println("CUPCAKE: ");

            //create an int variable named itemNumber and set it equal to 0
            int itemNumber =0;
            // Create a for loop that iterates through each index of cupcakeMenu
            for(int i = 0 ; i < cupcakeMenu.size(); i++) {
                //increment itemNumber by one
                itemNumber++;
                //print itemNumber
                System.out.println(itemNumber + ".");
                //print a description of the cupcake at cupcakeMenu at index i
                cupcakeMenu.get(i).type();
                System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());

                // Print a new line
                System.out.println();
            }
                System.out.println("DRINKS:");
                // Create a for loop that iterates through each index of drinkMenu
                for (int i = 0; i < drinkMenu.size(); i++)
                {
                    // increment itemNumber by one
                    itemNumber++;

                    System.out.print(itemNumber + ".");

                    // Print a description of the drink at drinkMenu at index i
                    drinkMenu.get(i).type();

                    System.out.println("Price: $" + drinkMenu.get(i).getPrice());

                    // Print a new line
                    System.out.println();

            }

        }else{
            System.out.println("Have a nice day.");
        }
       //create a boolean variable named ordering and set it equal to true
        boolean ordering = true;
        //Create a while loop that continues as long as the value of ordering is true.
        while(ordering){
            System.out.println("What would you like to order? Please use the number associated with each item to order.");
            //Create an int variable named orderChoice and set it equal to input.nextInt().
            int orderChoice = input.nextInt();
            //call input.nextLine() to correct the terminal scanner input location.
            input.nextLine();
            //create an if statement that checks if orderChoice equals 1.
            if(orderChoice == 1){
             //add the first item from the cupcakeMenu ArrayList to the order ArrayList
             order.add(cupcakeMenu.get(0));
             // and print.
                System.out.println("Item added to order");
            }else if(orderChoice == 2){
                order.add(cupcakeMenu.get(1));
                System.out.println("Item added to order");
            }else if(orderChoice == 3){
                System.out.println("Item added to order");
            }else if(orderChoice == 4){
                System.out.println("Item added to order");
            }else if(orderChoice == 5){
                System.out.println("Item added to order");
            }else if(orderChoice == 6){
                System.out.println("Item added or order");
            }else{
                //create an else statement with no parameters
                System.out.println("Sorry, we don't seem to have that on the menu.");
            }
            //print " would you like to continue ordering?(Y/N)
            System.out.println("Would you like to continue ordering? (Y/N)");

            //create a String object named continueOrder  and set it equal to the user input.
            String continueOrder = input.nextLine();

            //create and if statement that checks if continueOrder does not equal Y ignoring capitalization.
            if (!continueOrder.equalsIgnoreCase("Y"))
            {
                // Set ordering equal to false
                ordering = false;
            }
        }

        //Cupcake week part 4


    }
}
