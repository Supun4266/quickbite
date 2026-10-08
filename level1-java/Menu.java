public class Menu {

    public static void main(String[] args) {
        String[] foods = {"Burger", "pizza", "Fried Rice","Fries","pasta"};
        int[] prices = {500, 800, 650, 200,750};
    
        System.out.println("First food item: " + foods[0] + " costs " + prices[0]);
        System.out.println("second food:"+ foods[1]+ "cost "+ prices[1]);
        System.out.println("third food:"+ foods[2]+ "cost "+ prices[2]);
        System.out.println("fourth food:"+ foods[3]+ "cost "+ prices[3]);
        System.out.println("fifth food:"+ foods[4]+ "cost "+ prices[4]);

        prices[0] = 550;
        System.out.println("fourth food:"+ foods[0]+ "cost "+ prices[0]);

         System.out.println("--- QuickBite Menu ---");
         for (int i=0; i < foods.length; i++) {
            System.out.println(foods[i] + " costs " + prices[i]);
            } 

            int total = 0;
         
            for (int i = 0; i < prices.length; i++) {
                total += prices[i];
            }
            System.out.println("Total revenue: " + total);


            System.out.println("--- Cheap foods (under 600) ---");
for (int i = 0; i < foods.length; i++) {
    if (prices[i] < 600) {
        System.out.println(foods[i] + " costs " + prices[i]);
    }
}
 
int maxIndex = 0;
for (int i = 0; i < foods.length; i++) {

    if (prices[i] > prices[maxIndex]) {
        
        maxIndex = i;

        System.out.println("Most expensive food: " + foods[maxIndex] + " costs " + prices[maxIndex]);
    }

         

}

    }
}