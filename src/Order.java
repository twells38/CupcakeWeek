import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
            for(int i = 0; i < drinkMenu.size(); i++)
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
             ////create an if statement that checks if orderChoice equals 1.
            }else if(orderChoice == 2){
                order.add(cupcakeMenu.get(1));
                System.out.println("Item added to order");
            }else if(orderChoice == 3){
                order.add(cupcakeMenu.get(2));
                System.out.println("Item added to order");
            }else if(orderChoice == 4){
                order.add(drinkMenu.get(0));
                System.out.println("Item added to order");
            }else if(orderChoice == 5){
                order.add(drinkMenu.get(1));
                System.out.println("Item added to order");
            }else if(orderChoice == 6){
                order.add(drinkMenu.get(2));
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

        //Cupcake week part 4 (File Manipulation)

        // Print the first item in the order ArrayList - the date
        System.out.println(order.get(0));

        //Print the second item in the order ArrayList - the time
        System.out.println(order.get(1));

        // Create a double variable named subtotal and set it to 0.0;
        double subTotal = 0.0;

        // Create a for loop that starts at i = 2 and continues incrementing by 1, while i is less than order.size
        for (int i = 2; i < order.size(); i++)
        {
            // Check if order at i is equal to cupcakeMenu at 0
            if (order.get(i).equals(cupcakeMenu.get(0)))
            {
                // Print the type of cupcake at cupcakeMenu index 0
                cupcakeMenu.get(0).type();

                // Print the price of cupcake at cupcakeMenu index 0
                System.out.println(cupcakeMenu.get(0).getPrice());

                //Set subtotal equal to subtotal plus cupcakeMenu getPrice at 0
                subTotal = subTotal + cupcakeMenu.get(0).getPrice();
            }
            // Check if order at i is equal to cupcakeMenu at 1
            else if (order.get(i).equals(cupcakeMenu.get(1)))
            {
                // Print the type of cupcake at cupcakeMenu index 1
                cupcakeMenu.get(1).type();

                // Print the price of cupcake at cupcakeMenu index 1
                System.out.println(cupcakeMenu.get(1).getPrice());

                //Set subtotal equal to subtotal plus cupcakeMenu getPrice at 1
                subTotal = subTotal + cupcakeMenu.get(1).getPrice();
            }
            //check if order at i is equal to cupcakeMenu at 2
            else if (order.get(i).equals(cupcakeMenu.get(2)))
            {
                // Print the type of cupcake at cupcakeMenu index 2
                cupcakeMenu.get(2).type();

                // Print the price of cupcake at cupcakeMenu index 2
                System.out.println(cupcakeMenu.get(2).getPrice());

                //Set subtotal equal to subtotal plus cupcakeMenu getPrice at 2
                subTotal = subTotal + cupcakeMenu.get(2).getPrice();
            }
            // Check if order at i is equal to drinkMenu at 0
            else if (order.get(i).equals(drinkMenu.get(0)))
            {
                // Print the type of drink at drinkMenu index 0
                drinkMenu.get(0).type();

                // Print the price of drink at drinkMenu index 0
                System.out.println(drinkMenu.get(0).getPrice());

                //Set subtotal equal to subtotal plus drinkMenu getPrice at 0
                subTotal = subTotal + drinkMenu.get(0).getPrice();
            }
            // Check if order at i is equal to drinkMenu at 1
            else if (order.get(i).equals(drinkMenu.get(1)))
            {
                // Print the type of drink at drinkMenu index 1
                drinkMenu.get(1).type();

                // Print the price of drink at drinkMenu index 1
                System.out.println(drinkMenu.get(1).getPrice());

                //Set subtotal equal to subtotal plus drinkMenu getPrice at 1
                subTotal = subTotal + drinkMenu.get(1).getPrice();
            }
            // Check if order at index is equal to drinkMenu at 2
            else if (order.get(i).equals(drinkMenu.get(2)))
            {
                // Print the type of drink at drinkMenu index 2
                drinkMenu.get(2).type();

                // Print the price of drink at drinkMenu index 2
                System.out.println(drinkMenu.get(2).getPrice());

                //Set subtotal equal to subtotal plus drinkMenu getPrice at 2
                subTotal = subTotal + drinkMenu.get(2).getPrice();
            }
        }
        // Print subtotal
        System.out.println("Subtotal is $" + subTotal + "\n");
        // Create a new CreateFile()
        new CreateFile();

        //create a new WriterToFile() with the parameter order.
        new WriteToFile(order);
    }
}

// Create a class named CreateFile
class CreateFile
{
    // Create a public constructor function
    public CreateFile()
    {
        // Create a try catch block, with a catch parameter of IOException e
        try
        {
            // Create a File object named salesData and set it equal to a new File with the parameter "salesData.txt"
            File salesData = new File("salesData.txt");

            // Create an if statement with that parameter salesData.createNewFile()
            // .createNewFile() will return true if a new file is created
            if (salesData.createNewFile())
            {
                System.out.println("File created: " + salesData.getName());
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred");
        }
    }
}

//Write to File
//create a public constructor function named WriteToFile(), with ArrayList<Object> order as the parameter.
class WriteToFile{
    //create a public constructor function named WriteTOFunction(), with ArrayList<Object> order as the parameter
    public WriteToFile(ArrayList<Object> order){
        //create a try catch block, with a catch parameter of IOException e
    try{
        //create a new FileWrite object name fw, and set it equal to new FileWriter whose constructor
        //parameters are the same of hte object "salesData,txt", and the boolean true, which is  an option that
        //allows for appending to the file.
        FileWriter fw = new FileWriter("salesData.txt", true);

        //create anew PrintWriter object named salesWriter, and set it equal to new PrintWriter object whose
        //constructor parameter is the FileWriter object fw created previously
        PrintWriter salesWriter = new PrintWriter(fw);

        //print each value in order.
        for(int i = 0; i < order.size();i++){
            salesWriter.println(order.get(i));
        }
        //run salesWriter.println(order)
        //salesWriter.println(order);
        //use salesWriter.close() to stop the writer from continue to run
        salesWriter.close();
        System.out.println("Successfully wrote to the file");

    }catch(IOException e){
        System.out.println("An error occurred!");
    }

     }
    }






