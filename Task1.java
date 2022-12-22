// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("введено число " + userFloat());
    }
    public static float userFloat() {
        System.out.println("введите float");
        Scanner sc = new Scanner (System.in);
        float number = 0;
        while (!sc.hasNextFloat()) {          
            System.out.println(sc.hasNextFloat() ? "" : "введите float ");
            sc.next();
        }
        number = sc.nextFloat();
        sc.close();
        return number;
    }
}

// System.out.println(
//                     scanner.hasNextInt() ? "The Input text is int: " + scanner.nextInt() :
//                             scanner.hasNextLong() ? "The Input text is long: " + scanner.nextLong() :
//                                     scanner.hasNextDouble() ? "The Input text is double: " + scanner.nextDouble() :
//                                             scanner.hasNextBoolean() ? "The Input text is boolean: " + scanner.nextBoolean() :
//                                                     "The Input text is String: " + scanner.next());