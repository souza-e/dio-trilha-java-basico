public class ExemploBreakContinue {
   
   

   
    public static void main(String[] args) {
       
       
        for (int i = 0; i < 10; i++) {
           
           
            if (i == 5) {
                break; // Exits the loop when i is 5
            }
            System.out.println("Value of i: " + i);
        }

        System.out.println("----");

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // Skips the rest of the loop when i is 5
            }
            System.out.println("Value of i: " + i);
        }
    }
}