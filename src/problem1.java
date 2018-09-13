//problem1.java
/*This is just a short program that will take in info on the number of snacks and calculate the cost
* the deal*/

import javax.swing.*;

public class problem1 {
    public static void main(String args[]) {
        String name, className, numOfSnacksAsStr;
        int numOfSnacks;

        name = JOptionPane.showInputDialog(null, "Please enter your Name: ", "Student Name", JOptionPane.PLAIN_MESSAGE);


        className = JOptionPane.showInputDialog(null, "Please enter your Class Name: ", "Class Name", JOptionPane.PLAIN_MESSAGE);

        numOfSnacksAsStr = JOptionPane.showInputDialog(null, "Please enter the number of Snack Deals you want : ", "# Of Snacks", JOptionPane.PLAIN_MESSAGE);
        numOfSnacks = Integer.parseInt(numOfSnacksAsStr);

        CalSnacks(numOfSnacks);

        JOptionPane.showMessageDialog(null, "Customer Name: " + name + "\nClass Name: " + className +
                "\n# Of Snacks: " + numOfSnacksAsStr + "\nTotal Cost: " + CalSnacks(numOfSnacks) + " euro", "Receipt", JOptionPane.PLAIN_MESSAGE);


    }


    public static int CalSnacks(int numOfSnacks)
    {
        return numOfSnacks*2;
    }
}



