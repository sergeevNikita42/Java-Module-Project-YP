import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String car1, car2, car3;
        int car1Speed, car2Speed, car3Speed;



        System.out.println("Введите название машины №1:");
        car1 = scanner.nextLine();
        System.out.println("Введите скорость машины №1:");
        car1Speed = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите название машины №2:");
        car2 = scanner.nextLine();
        System.out.println("Введите скорость машины №2:");
        car2Speed = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Введите название машины №3:");
        car3 = scanner.nextLine();
        System.out.println("Введите скорость машины №3:");
        car3Speed = scanner.nextInt();
        scanner.nextLine();



        //После ввода данных пользователем проверяем, что введённая скорость >0 и <=250. Если скорость ввели неверно, программа должна запросить эти данные заново.

        //(speed >0 && speed <=250)


        System.out.println("Самая быстрая машина: XXX");


    }
}