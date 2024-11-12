
package gui_movietickets_finalexam;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_movietickets_FinalExam {

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Movie Ticket Report");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        // Create components for the form
        JLabel movieLabel = new JLabel("MOVIE");
        movieLabel.setBounds(10, 20, 120, 25);
        panel.add(movieLabel);

        String[] movies = {"Napoleon", "Oppenheimer"};
        JComboBox<String> movieComboBox = new JComboBox<>(movies);
        movieComboBox.setBounds(150, 20, 165, 25);
        panel.add(movieComboBox);

        JLabel ticketsLabel = new JLabel("NUMBER OF TICKETS");
        ticketsLabel.setBounds(10, 50, 120, 25);
        panel.add(ticketsLabel);

        JTextField ticketsField = new JTextField();
        ticketsField.setBounds(150, 50, 165, 25);
        panel.add(ticketsField);

        JLabel priceLabel = new JLabel("TICKET PRICE");
        priceLabel.setBounds(10, 80, 120, 25);
        panel.add(priceLabel);

        JTextField priceField = new JTextField();
        priceField.setBounds(150, 80, 165, 25);
        panel.add(priceField);

        JTextField totalPriceField = new JTextField();
        totalPriceField.setBounds(150, 140, 165, 25);
        totalPriceField.setEditable(false);
        panel.add(totalPriceField);

        JLabel totalLabel = new JLabel("TOTAL PRICE");
        totalLabel.setBounds(10, 140, 120, 25);
        panel.add(totalLabel);
        
        

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // File menu with Exit option
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(e -> System.exit(0)); // Exit action
        fileMenu.add(exitMenuItem);

        // Tools menu with Process and Clear options
        JMenu toolsMenu = new JMenu("Tools");

        JMenuItem processMenuItem = new JMenuItem("Process");
        processMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String selectedMovie = (String) movieComboBox.getSelectedItem();
                    int numberOfTickets = Integer.parseInt(ticketsField.getText());
                    double ticketPrice = Double.parseDouble(priceField.getText());
                    double totalPrice = numberOfTickets * ticketPrice;

                    // Display the total price in the totalPriceField
                    totalPriceField.setText(String.format("%.2f", totalPrice));

                    // Output the report to the console
                    System.out.println("MOVIE TICKET REPORT");
                    System.out.println("**********************************");
                    System.out.println("MOVIE NAME: " + selectedMovie);
                    System.out.println("TICKET PRICE: " + ticketPrice);
                    System.out.println("NUMBER OF TICKETS: " + numberOfTickets);
                    System.out.println("TOTAL PRICE: " + totalPrice);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Please enter valid numbers for tickets and price.",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        toolsMenu.add(processMenuItem);

        JMenuItem clearMenuItem = new JMenuItem("Clear");
        clearMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clear all input fields
                ticketsField.setText("");
                priceField.setText("");
                totalPriceField.setText("");
                movieComboBox.setSelectedIndex(0);
            }
        });
        toolsMenu.add(clearMenuItem);

        // Add File and Tools menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);

        // Set the menu bar on the frame
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}

/*
* Title: Java Programming
* Author: Joyce, J.
* Date: 2018
* Edition: 9th
* Publisher: Cengage
*/
