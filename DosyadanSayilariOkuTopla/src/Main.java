import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\kurucay\\IdeaProjects\\PatikaBootcampAll\\DosyadanSayilariOkuTopla\\src\\Veri.txt";

        File file = new File(path);

        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);
        String line;
        int total = 0;

        while ((line = bReader.readLine()) != null) {
            System.out.println(line);
            int num = Integer.parseInt(line);
            total = total + num;
        }
        System.out.println("Bu sayıların toplamı : " + total);

        bReader.close();
    }
}