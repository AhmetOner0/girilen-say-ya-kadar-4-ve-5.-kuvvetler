package patikadev;
import java.util.Scanner;
public class katsayı {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        System.out.print("bir n sayısı giriniz:");
        k = sc.nextInt();

        for (int i = 1;i < k;i*=4){
            System.out.println("n'e kadarki 4. kuvvetleri:"+i);
        }
        for (int i = 1;i < k;i*=5){
            System.out.println("n'e kadarki 5. kuvvetleri:"+i);
        }
    }
}
