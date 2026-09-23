import java.io.*;
public class fourthJava {

    public static void main(String[] args) {
        String filePath = "Pedrozo.txt";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            writer.write("This is the first line of text.");
            writer.newLine();

            writer.write("This is the second line of text.");
            writer.newLine();
            writer.write("BufferedWriter makes writing fast and efficient.");
        }catch(IOException e){
            System.out.println("An error occured while writing to the file.");
            e.printStackTrace();
        }
    }
}
