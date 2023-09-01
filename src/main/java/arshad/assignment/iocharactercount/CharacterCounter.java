package arshad.assignment.iocharactercount;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) {
        // Specify the input and output file names
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try {
            // Create a FileReader to read the input file
            FileReader fileReader = new FileReader(inputFileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Create a Map to store character counts
            Map<Character, Integer> characterCountMap = new HashMap<>();

            int charCode;
            while ((charCode = bufferedReader.read()) != -1) {
                char character = (char) charCode;

                // Only count alphanumeric characters (letters and digits)
                if (Character.isLetterOrDigit(character)) {
                    characterCountMap.put(character, characterCountMap.getOrDefault(character, 0) + 1);
                }
            }

            // Close the input file
            bufferedReader.close();

            // Create a FileWriter to write the output file
            FileWriter fileWriter = new FileWriter(outputFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write character counts to the output file
            for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
                bufferedWriter.write(entry.getKey() + ": " + entry.getValue());
                bufferedWriter.newLine();
            }

            // Close the output file
            bufferedWriter.close();

            System.out.println("Character counts have been written to " + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
