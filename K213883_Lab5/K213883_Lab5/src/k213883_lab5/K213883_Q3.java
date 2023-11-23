package k213883_lab5;
import java.io.*;

public class K213883_Q3 
{
    public static void main(String[] args) 
    {
        try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) 
        {
            System.out.print("Enter a string: ");
            String input = r.readLine();
            int len = input.length();
            System.out.println("Length of the string: " + len);

            try (BufferedWriter w = new BufferedWriter(new FileWriter("k213883_output.txt"))) 
            {
                w.write(input);
                System.out.println("Successfully written a string in the file : 'k213883_output.txt'.");
            } 
            catch (IOException e) {
                System.err.println("Error occured while writing into this file: " + e.getMessage());
            }

            try (BufferedReader fr = new BufferedReader(new FileReader("k213883_output.txt"))) 
            {
                String stored = fr.readLine();
                System.out.println("Reading a string from 'k213883_output.txt':\n" + stored);
            } 
            catch (IOException e) {
                System.err.println("Error occured while reading from the file: " + e.getMessage());
            }
        } 
        catch (IOException e) {
            System.err.println("Error occurred while reading : " + e.getMessage());
        }
    }
}
