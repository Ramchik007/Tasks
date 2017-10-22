package Task2;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int x,y;
        Scanner sc = new Scanner(System.in);


        System.out.println("Введите координату x: ");
        while(sc.hasNextInt() == false)
        {System.out.println("Некорректный тип введенного числа " + sc.next());
            System.out.println("Введите координату x: ");}
        x = sc.nextInt();
        System.out.println("координата x =  " + x);

        System.out.println("Введите координату y: ");
        while(sc.hasNextInt() == false)
        { System.out.println("Некорректный тип введенного числа " + sc.next());
            System.out.println("Введите координату y: ");  }
        y = sc.nextInt();
        System.out.println("координата y =  " + y);


         if((x>0)&(y>0)) {
             System.out.println("Число с координатами  " + x + "," + y + "  принадлежит первой четверти!!!" );
         }
         else if((x<0)&(y>0)) {
             System.out.println("Число с координатами  " + x + "," + y + "  принадлежит второй четверти!!!" );
        }
        else {
             if((x<0)&(y<0)){
                 System.out.println("Число с координатами " + x + "," + y + "  принадлежит третьей четверти!!!" );
             }
         else {
                 System.out.println("Число с координатами " + x + "," + y + "  принадлежит четвертой четверти!!!" );

             }
         }


    }




}

