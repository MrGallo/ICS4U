import java.io.*;

class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter fileStream = new FileWriter("FileIOAssets/out.txt");
        BufferedWriter out = new BufferedWriter(fileStream);
        out.write("Hello World!");
        out.close();  //Close the output stream
    }
}
