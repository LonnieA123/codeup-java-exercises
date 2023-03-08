import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.List;

public class FilePractice {

    public static void main(String[] args) throws IOException {

//must wrap in try and catch
        try {

            Path local = Paths.get("src/util", "me"); // will make file in specified location (first parameter)
//          Path local = Paths.get("me.txt"); // will make file in current directory

            Path file = Files.createFile(local);
//          Path file = Files.createDirectory(local); // will create directory instead


            // creating an array to put inside my file
            // writing to that file local being the location and me being the array name
            List<String> me = Arrays.asList("bro","im","him");
            List<String> see = Arrays.asList("bro","im","him");
            Files.write(local,me);
            Files.write(local,see, StandardOpenOption.APPEND);
            // OR doing it all at once


            // read from a file
            List <String> listsME = Files.readAllLines(local);

            for (int i = 0; i < listsME.size(); i++){
                System.out.println(listsME.get(i));
            }


        } catch (FileAlreadyExistsException e){
            System.out.println(e);
        }


    }

}
