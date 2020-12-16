/*
 * DecisionLoopLab.java
 *
 */
package lab02a;

import javax.swing.*;


public class DecisionLoopLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String title;       // Value entered by user; string type
        String costStr;     // Value entered by user; string type
        String categoryStr; // Value entered by user; string type
        String category;
        int categoryInt;
        double cost;        // The double form of the user-entered video game cost
        double totalCost = 0;
        int resp = 0;       // The user's response as to whether to continue
        int counter = 0;    // The number of video games entered

        // Initialize the output string to the empty string
        String outputStr = "";
        
        String categoryType = " 1 Simulation\n 2 Sports\n 3 Action\n 4 "
                + "Strategy\n 5 Roleplaying\n";


        // Loop to input information on the user's video game collection
        while (true) {
            // Read in video game title from user as a string
            title = JOptionPane.showInputDialog("Enter video game title");
          

            // Read in cost from user as a string
            costStr = JOptionPane.showInputDialog("Enter video game cost");

            // Convert from type String to type double
            cost = Double.parseDouble(costStr);
            totalCost = totalCost + cost;
            categoryStr = JOptionPane.showInputDialog("Choose category by number\n" + categoryType);
            categoryInt = Integer.parseInt(categoryStr);
            counter++;
            
            switch(categoryInt)
            {
                case 1:
                    category = "Simulation";
                    break;
                case 2:
                    category = "Sports";
                    break;
                case 3:
                    category = "Action";
                    break;
                case 4:
                    category = "Strategy";
                    break;
                case 5:
                    category = "Role-playing";
                    break;
                default:
                   category = "Invalid category";
                   break;
            }

            // Add the user-entered values to the output string 
            outputStr = outputStr + "Video Game #" + counter + "." + " Cat: " + category + ", Video game title: " 
                    + title + ", ";
            outputStr = outputStr + "Cost: $" + cost + " Total: $" + totalCost + "\n";

            // Get the user's choice as to whether to continue the loop
            resp = JOptionPane.showConfirmDialog(null, outputStr + "\nContinue?", "Confirm",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            // Test whether the user's choice is to continue the loop or not
            if (resp == JOptionPane.NO_OPTION) {
                break;
            }
        }

        // Display final output to the user
        JOptionPane.showMessageDialog(
                null, outputStr, "Video Game List", JOptionPane.INFORMATION_MESSAGE);

    }
}
