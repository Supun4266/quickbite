public class Loops {
    public static void main(String[] args) {
        System.out.println("--- kitchen ---");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Cooking burger number " + i);
        }

        System.out.println("--- Bill ---");
        int burgerPrice = 500;
        int total = 0;

        for (int i = 1; i <= 4; i++) {
            total += burgerPrice;
            System.out.println("Burger " + i + " added. Total so far: " + total);
        }

        System.out.println("Final total " + total);


        int seconds = 3;

        while (seconds > 0) {
            System.out.println("Food ready in " + seconds + "...");
            seconds--;
}

                System.out.println("Your food is ready!");


      for(int i=1; i<=10; i++){
            System.out.println("welcome, customer #"+ i);
        }
      
        int pizzacost = 800;
        int totalcost = 0;
         
         for(int i=1; i<=5; i++){
            totalcost += pizzacost;
            System.out.println("Pizza " + i + " added. Total so far: " + totalcost);
         }
            int count = 10;
            while(count > 0){
                count--;
                System.out.println("Food ready in " + count + "...");
            }
                int even =2;
                while(even <= 20){
                    System.out.println("Even number: " + even);
                    even += 2;
                }
                
            }

    
    
    
}
