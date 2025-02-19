import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        isEvenOrOdd();
    }
    public static void isEvenOrOdd() {
        System.out.print("Введите число: ");
        int userInputNumber = new Scanner(System.in).nextInt();

        System.out.println(userInputNumber % 2 == 0);
    }
}
