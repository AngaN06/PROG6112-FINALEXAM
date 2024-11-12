
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

    

public class MovieTicketSalesReportTest {

    @Test
    void testCalculateTotalSalesPerMovie() {
        int[][] ticketSales = {
            {3000, 1500, 1700},
            {3500, 1200, 1600}
        };
        int[] expected = {6200, 6300};
        int[] actual = MovieTicketSalesReport.calculateTotalSalesPerMovie(ticketSales);
        assertArrayEquals(expected, actual, "Total sales per movie should match expected results.");
    }

    @Test
    void testCalculateTotalSalesPerMonth() {
        int[][] ticketSales = {
            {3000, 1500, 1700},
            {3500, 1200, 1600}
        };
        int[] expected = {6500, 2700, 3300};
        int[] actual = MovieTicketSalesReport.calculateTotalSalesPerMonth(ticketSales);
        assertArrayEquals(expected, actual, "Total sales per month should match expected results.");
    }

    @Test
    void testFindTopPerformingMovie() {
        String[] movieNames = {"Napoleon", "Oppenheimer"};
        int[] movieTotals = {6200, 6300};
        String expected = "Oppenheimer";
        String actual = MovieTicketSalesReport.findTopPerformingMovie(movieNames, movieTotals);
        assertEquals(expected, actual, "Top-performing movie should be Oppenheimer.");
    }
}

    
    
}
