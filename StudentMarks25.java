import java.io.*;

public class StudentMarks25 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("marks.txt"));

        bw.write("Kaushal,80,75,90");
        bw.newLine();
        bw.write("Rahul,65,70,60");
        bw.newLine();
        bw.write("Priya,90,85,95");
        bw.newLine();
        bw.write("Anu,35,40,30");
        bw.newLine();
        bw.write("Ravi,55,60,50");
        bw.newLine();

        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("marks.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            String data[] = line.split(",");

            String name = data[0];
            int m1 = Integer.parseInt(data[1]);
            int m2 = Integer.parseInt(data[2]);
            int m3 = Integer.parseInt(data[3]);

            int total = m1 + m2 + m3;
            double average = total / 3.0;

            String result;

            if (average >= 40)
                result = "Pass";
            else
                result = "Fail";

            System.out.println("Name: " + name);
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
            System.out.println("Result: " + result);
            System.out.println();
        }

        br.close();
    }
}
