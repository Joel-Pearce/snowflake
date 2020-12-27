package snowflake;

import java.util.Scanner;

public class Snowflake {
    
    public static void createSnowflake(int n) {
        String[][] array = new String[n][n];

        float temp = (float) (n/2);
        int start_point = 0;
        int mid_point = (int) (temp);
        int end_point = n - 1;

        for(int i = 0; i < n; i++) {
            if(i > mid_point+1) {
                start_point--;
                end_point++;
            }
            for(int j = 0; j < n; j++) {
                if((j == start_point) || (j == mid_point) || (j == end_point) || (i == mid_point)) {
                    array[i][j] = "*";
                }
                else {
                    array[i][j] = ".";
                }
            }
            
            if(i < mid_point-1) {
                start_point++;
                end_point--;
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(array[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number: ");
        try{
        	int number = scanner.nextInt();
        	createSnowflake(number);
        	System.out.println("Merry Christmas!");
        }
        catch(Exception e) {
        	System.out.println("Invalid input.");
        	System.out.println("Maybe not such a Merry Christmas...");
        }
    }
}