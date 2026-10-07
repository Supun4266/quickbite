public class BIll {
    public static void main(String[] args) {
        boolean isOpen = true;

        if (isOpen) {
            System.out.println("Welcome to QuickBite! We are open.");
        } else {
            System.out.println("Sorry, we are closed.");
        }
        int burgerPrice = 500;
        int pizzaPrice = 800;
        int friedRicePrice = 650;

        int total = burgerPrice *2 + pizzaPrice + friedRicePrice;
        System.out.println("Your total  is: " + total);

        if (total > 2000){
            total = total -200;
            System.out.println("Big order! You get 200 off!");
        }else{
            System.out.println("Spend more than 2000 to get a discount!");
        }
        boolean isMember = true;

        if (total > 2000 && isMember){
            total = total - 100;
            System.out.println("You are a member! You get 100 off!");
        }
        
        int distance = 7;
        if(distance > 5){
            total = total + 150;
            System.out.println("Delivery fee: 150");
        }else{
            System.out.println("No delivery fee!");
        }

        System.out.println("Your final total is: " + total);


     if (total > 3000) {                                          
            System.out.println("Gold customer! Free dessert!");     
        } else if (total > 2000) {                                   
            System.out.println("Silver customer! Free drink!");      
        } else {                                                     
            System.out.println("Thank you for ordering!");           
        }    

 }
}
