// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("введите непустую строку ");
        String str;
        try {
            if ((str = sc.nextLine()) == ""){
                sc.close();
                throw new Exception ("пустые строки вводить нельзя");               
            }
        } catch (Exception e) {
            System.out.println("Catching exception: " + e);
        }
        sc.close();
    }
}
