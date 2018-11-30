package JavaLib_3;

import java.io.File;

public class Launch {

    public static void main(String[] args) {

        JavaLib3Files text = new JavaLib3Files();

        String file ="../../../../javalib_3_files_samplecode/src/javalibraries/JavaLib3Files.java";
        text.readFile(file);
    }
}
