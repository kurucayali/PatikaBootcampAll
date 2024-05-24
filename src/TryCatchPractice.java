import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TryCatchPractice {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 13, 17, 20, 21, 8, 9, 99};

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin görmek istediğiniz indeks numarasını giriniz : ");
        try {
            int indexNum = input.nextInt();
            int result = arr[indexNum];
            System.out.println("Dizinin " + indexNum + ". indeksindeki eleman : " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: indeks dizi boyutunun dışında ! ");
        } catch (Exception e) {
            System.out.println("HATA ! :  " + e.toString());
        }


    }
}
