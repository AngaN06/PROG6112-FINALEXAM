package movietiickets;



import java.util.Scanner;

public class MovieTIickets {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int[][] ticketSales = {
            {3000, 1500, 1700}, // Napoleon sales per month
            {3500, 1200, 1600}  // Oppenheimer sales per month
        };
        
        String[] movieNames = {"Napoleon", "Oppenheimer"};
        String[] months = {"JAN", "FEB", "MAR"};
        
        // Capture ticket sales data from user
        for (int i = 0; i < movieNames.length; i++) {
            for (int j = 0; j < months.length; j++) {
                System.out.println("Enter the sales for " + movieNames[i] + " in " + months[j] + ": ");
                ticketSales[i][j] = scanner.nextInt();
            }
        }
        
        // Display the report
        System.out.println("\nMOVIE TICKET SALES REPORT - 2024");
        System.out.println("---------------------------------------------------------------");
        
        System.out.printf("%-15s", "Movie");
        for (String month : months) {
            System.out.printf("%-15s", month);
        }
        System.out.println();
        
        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("%-15s", movieNames[i]);
            for (int j = 0; j < months.length; j++) {
                System.out.printf("%-15d", ticketSales[i][j]);
            }
            System.out.println();
        }
        
        System.out.printf("%-15s", "Total Sales");
        for (int j = 0; j < months.length; j++) {
            int totalTicketsForMonth = 0;
            for (int i = 0; i < movieNames.length; i++) {
                totalTicketsForMonth += ticketSales[i][j];
            }
            System.out.printf("%-15d", totalTicketsForMonth);
        }
        System.out.println();
        System.out.println(" Top Performing movie: Oppenheimer");
    }
}
/*
* Title: Java Programming
* Author: Joyce, J.
* Date: 2018
* Edition: 9th
* Publisher: Cengage
*/

/*
* Title: Java Programming Student management system
* Author: Master Skills
* Date: 11 October 2017
* Code version: 1
* availability: https://www.youtube.com/watch?v=GOGt7PACl10&t=443s
*/
