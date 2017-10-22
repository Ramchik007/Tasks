package Task2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int i1,i2;
        Scanner sc = new Scanner(System.in);


        System.out.println("Введите первое число: ");
        while(sc.hasNextInt() == false)
        {System.out.println("Некорректный тип введенного числа " + sc.next());
            System.out.println("Введите первое число: ");}
        i1 = sc.nextInt();
        System.out.println("первое число =  " + i1);

        System.out.println("Введите второе число: ");
        while(sc.hasNextInt() == false)
        { System.out.println("Некорректный тип введенного числа " + sc.next());
            System.out.println("введите второе число : ");  }
        i2 = sc.nextInt();
        System.out.println("второе число =  " + i1);

        if ((i1%2)==0) {
            System.out.println( "i1 * i2 = " + i1*i2);
        }
        else {
            System.out.println("i1 + i2 = " + i1 + i2);
        }










    }




}
