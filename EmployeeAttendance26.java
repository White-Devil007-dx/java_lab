import java.io.*;

public class EmployeeAttendance26 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("attendance.txt");

        fw.write("Kaushal,01-10-2026,P\n");
        fw.write("Rahul,01-10-2026,A\n");
        fw.write("Kaushal,02-10-2026,P\n");
        fw.write("Rahul,02-10-2026,P\n");
        fw.write("Kaushal,03-10-2026,A\n");
        fw.write("Rahul,03-10-2026,P\n");

        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("attendance.txt"));

        int kp = 0, ka = 0;
        int rp = 0, ra = 0;

        String line;

        while ((line = br.readLine()) != null) {
            String data[] = line.split(",");

            if (data[0].equals("Kaushal")) {
                if (data[2].equals("P"))
                    kp++;
                else
                    ka++;
            }

            if (data[0].equals("Rahul")) {
                if (data[2].equals("P"))
                    rp++;
                else
                    ra++;
            }
        }

        br.close();

        System.out.println("Kaushal Present: " + kp);
        System.out.println("Kaushal Absent: " + ka);
        System.out.println("Kaushal Percentage: " + (kp / 3.0) * 100 + "%");

        System.out.println();

        System.out.println("Rahul Present: " + rp);
        System.out.println("Rahul Absent: " + ra);
        System.out.println("Rahul Percentage: " + (rp / 3.0) * 100 + "%");
    }
}