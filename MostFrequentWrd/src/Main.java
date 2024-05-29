import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni girin:");

        String text = scanner.nextLine();

        // Metni noktalama işaretlerinden arındırma ve küçük harfe dönüştürme
        text = text.replaceAll("[^a-zA-Z\\s]", "").toLowerCase();

        // Metni kelimelere ayırma
        String[] words = text.split("\\s+");

        // Kelimeleri saymak için bir HashMap oluşturma
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Kelimeleri HashMap'e ekleme ve en çok geçen kelimeyi bulma
        String mostFrequentWord = null;
        int maxCount = 0;

        for (String word : words) {
            int count = wordCountMap.getOrDefault(word, 0) + 1;
            wordCountMap.put(word, count);

            if (count > maxCount) {
                mostFrequentWord = word;
                maxCount = count;
            }
        }

        // Sonucu ekrana yazdırma
        if (mostFrequentWord != null) {
            System.out.println("En çok kullanılan kelime: " + mostFrequentWord);
            System.out.println("Kullanılma sayısı: " + maxCount);
        } else {
            System.out.println("Metinde kelime bulunamadı.");
        }

    }
}
