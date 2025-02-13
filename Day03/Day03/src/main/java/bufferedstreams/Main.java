package bufferedstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static bufferedstreams.BufferedCopy.copyFileWithBuffer;

public class Main {
    public static void main(String[] args) {
        String source = "D:\\Week04\\Day03\\Day03\\src\\main\\resources\\100mb-examplefile-com.txt";
        String destinationBuffered = "D:\\Week04\\Day03\\Day03\\src\\main\\resources\\copyTo.txt";
        String destinationUnbuffered = "D:\\Week04\\Day03\\Day03\\src\\main\\resources\\Destinationfile.txt";

        try {
            long startBuffered = System.nanoTime();
            copyFileWithBuffer(source, destinationBuffered);
            long endBuffered = System.nanoTime();
            System.out.println("Buffered copy completed in: " + (endBuffered - startBuffered) + " ns");

            long startUnbuffered = System.nanoTime();
            try (FileInputStream fis = new FileInputStream(source);
                 FileOutputStream fos = new FileOutputStream(destinationUnbuffered)) {
                int data;
                while ((data = fis.read()) != -1) {
                    fos.write(data);
                }
            }
            long endUnbuffered = System.nanoTime();
            System.out.println("Unbuffered copy completed in: " + (endUnbuffered - startUnbuffered) + " ns");

        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}
