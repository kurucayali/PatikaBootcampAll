import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Dosya yolu. Eğer dosya yoksa oluşturulacak.
        String path = "C:\\Users\\kurucay\\IdeaProjects\\PatikaBootcampAll\\NotePad\\src\\Notlar.txt";
        File file = new File(path);
        if (!file.exists()) file.createNewFile();

        // Dosyaya daha önce girilmiş kayıt varsa okunacak. Ekrana verilecek.
        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);
        String line;

        System.out.println("***** Notlar *****");
        while ((line = bReader.readLine()) != null) {
            System.out.println(line);
        }
        bReader.close();

        // Kullanıcıdan yeni giriş alınacak.
        Scanner input = new Scanner(System.in);
        System.out.println("Not almaya başlayabilirsin :  ");
        String str = input.nextLine();


        // Alınan giriş dosyaya kaydedilecek.
        FileWriter fWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(str);
        bWriter.newLine();

        bWriter.close();

    }
}