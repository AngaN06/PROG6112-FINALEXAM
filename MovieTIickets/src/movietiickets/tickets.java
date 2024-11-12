
package movietiickets;
import java.util.Scanner;

public class tickets {
    
    private String MovieName;
    private double MoviePrice;

    public tickets(String MovieName, double MoviePrice) {
        this.MovieName = MovieName;
        this.MoviePrice = MoviePrice;
    }

    public String getMovieName() {
        return MovieName;
    }

    public double getMoviePrice() {
        return MoviePrice;
    }
    
    public interface Itickets{
        int TotalMovieSales(int[] movieTicketSales);
        String TopMovie(String[]movies, int[]totalSales);
    }
}
