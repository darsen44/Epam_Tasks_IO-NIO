package task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CommentReader {

     // @param path the path to file
     // @throws IOException
     // @return  all raw comments
    String read(String path) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine())!=null){
            int matchIndex  = line.indexOf("//");
            if(matchIndex>0){
                stringBuilder.append(line.subSequence(matchIndex+2,line.length())).append('\n');
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        CommentReader cr = new CommentReader();
        System.out.println(cr.read("/home/darsen/Documents/Epam/IO-NIO/src/main/java/task4/CommentReader.java"));
    }
}
