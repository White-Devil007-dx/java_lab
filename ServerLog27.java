/*Server Log File Analyzer — 
Write a set of sample server log lines into a file 
(including "ERROR" and "WARNING" entries). 
Read the file back and count how many times each pattern 
("ERROR", "WARNING", "INFO") occurs using indexOf().  */

import java.io.*;

public class ServerLog27 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("serverlog.txt");

        fw.write("INFO Server started\n");
        fw.write("INFO User logged in\n");
        fw.write("WARNING High memory usage\n");
        fw.write("ERROR Database connection failed\n");
        fw.write("INFO Request received\n");
        fw.write("WARNING Disk space low\n");
        fw.write("ERROR Server connection failed\n");
        fw.write("INFO Server running\n");

        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("serverlog.txt"));

        String line;
        int error = 0;
        int warning = 0;
        int info = 0;

        while ((line = br.readLine()) != null) {
            int pos = 0;

            while ((pos = line.indexOf("ERROR", pos)) != -1) {
                error++;
                pos += 5;
            }

            pos = 0;
            while ((pos = line.indexOf("WARNING", pos)) != -1) {
                warning++;
                pos += 7;
            }

            pos = 0;
            while ((pos = line.indexOf("INFO", pos)) != -1) {
                info++;
                pos += 4;
            }
        }

        br.close();

        System.out.println("ERROR: " + error);
        System.out.println("WARNING: " + warning);
        System.out.println("INFO: " + info);
    }
}