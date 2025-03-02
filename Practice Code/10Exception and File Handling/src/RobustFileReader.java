import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scan.nextLine();

        try(FileReader reader = new FileReader(fileName)){
            int reading;

            while ((reading = reader.read()) != -1){
                System.out.print((char) reading);
            }

        } catch (FileNotFoundException exception){
            System.out.println("File NOT found");
        } catch (IOException exception){
            System.out.println("Exception occurred "+ exception.getMessage());
        }
    }
}
