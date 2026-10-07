public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to QuickBite!");

        String food1 = "Burger";
        int price1 = 500;

        String food2 = "Pizza";
        int price2 = 800;

        String food3 = "Fried Rice";
        int price3 = 650;

        System.out.println(food1 + " costs " + price1 );
        System.out.println(food2 + " costs " + price2 );
        System.out.println(food3 + " costs " + price3 );

        int total = 2*price1 + price2 + price3;
        System.out.println("Your total bill is: "+ total);

        boolean isOpen = true;
        System.out.println("Is the restaurant open? " + isOpen);

    }
    
}
