package Day10;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Read_File_with_scanner {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(Path.of("src/Day10/test.txt"));
        System.out.println( scan.nextLine() );

    }
}
