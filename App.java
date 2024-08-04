import java.io.File;
import java.util.Scanner;

public class App {

    public static int countCharacters(String text)
    {
        return text.length();
    }

    public static int countWords(String text) 
    {
        String[] words = text.split("\\w+");
        return words.length; 
    }

    public static int countLines(String text) 
    {
        String[] lines = text.split("\r\n|\r|\n");
        return lines.length;
    } 
    public static void main(String[] args) {

        //ask for file name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        // File theFile = new File("\""+fileName+"\"");
        File theFile = new File(fileName);
        

        try (Scanner fileScanner = new Scanner(theFile))
        {
            String content = theFile.toString();

            int numCharacters = countCharacters(theFile.toString());
            int numWords = countWords(content);
            int numLines = countLines(content);
            
            System.out.println("Number of characters: " + numCharacters);
            System.out.println("Number of words: " + numWords);
            System.out.println("Number of lines: " + numLines);
            
        } catch (Exception e) {
            System.out.println("Error: The file '" + fileName + "' was not found.");
        }
        scanner.close();

       
        
    }
}
