public class vase_pattern {
    public static void main(String[] args) {

        int numRows = 7; 

        
        for (int i = 0; i < numRows; i++) {
            
            if (i == 0 || i == numRows - 1) {
                for (int j = 0; j < 12; j++) {
                    System.out.print("*");
                }
            }
        
            else if (i % 2 == 1) {
                for (int j = 0; j < i; j++) {
                    System.out.print("\\");
                }
                for (int j = 0; j < 12 - 2*i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("/");
                }
            }
            
            else {
                for (int j = 0; j < 12; j++) {
                    System.out.print(" ");
                }
            }

            
            System.out.println();
        }
        
    }
    
}
