import java.io.*;

class FileWriteRead {

    public static void main(String[] args) {

        // writing to file
        try {
            FileWriter file = new FileWriter("text.txt");
            file.write("Hello\nJava");
            file.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // reading from file
        try {
            int b;
            FileReader file = new FileReader("text.txt");
            while ((b = file.read()) != -1)
                System.out.print((char)b);
            file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}