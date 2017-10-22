package Task2;

import java.util.*;
public class Task2 {
    public static void main(String[] args) throws Exception {

        int a, b;
        a=1;b=1;
        Scanner sc, sc2;
        Boolean flag1 = false;
        Boolean flag2 = false;


        do {
            System.out.println("Введите число A ");
            sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                flag1 = true;
                System.out.println("число a равно " + a);
            } else {

                System.out.println("Вы ввели неправильное число !!! ");
            }

        } while (!flag1);
        //sc.close();


        do {
            System.out.println("Введите число B ");
            sc2 = new Scanner(System.in);
            if (sc2.hasNextInt()) {
                b = sc2.nextInt();
                flag2 = true;
                System.out.println("число b равно " + b);
            } else {

                System.out.println("Вы ввели неправильное число !!! ");
            }

        } while (!flag2);
        //sc2.close();

        if(a>b){
            System.out.println("a>b");

        }
        else if(a<b) {
            System.out.println("b>a");

        }
        else {
            System.out.println("Числа равны ");
        }




    }












}




