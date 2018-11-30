package JavaLib_3;

import java.io.*;

public class JavaLib3Files {

        public static void readFile(String filename){
            File inputFile = new File(filename);
            FileReader reader = null;
            BufferedReader inputBuffer = null;

            String inputLine = null;

            do {
                try {
                    reader = new FileReader(filename);
                    inputBuffer = new BufferedReader(reader);

                    inputLine = inputBuffer.readLine();

                } catch (FileNotFoundException fnfe) {
                    fnfe.printStackTrace();

                } catch (IOException ioe) {
                    ioe.printStackTrace();

                } finally {
                    if (inputBuffer != null) {

                        try {
                            inputBuffer.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }
                System.out.println(inputLine);
            }while(inputLine != null);
        }


}
