//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;
public class CWH_25_Practice_Set_4 {
    public static void main(String[] args) {
        //Question 2

    /*        int sum =0;     //(its imp to make a variable by name sum)
            for(int i=0; i<=4; i++){
                sum = sum + (2*i);
            }
    //        System.out.print("sum of even numbers is:");
            System.out.println(sum);

     */


        //Question 3
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter the number");
    //    int num = sc.nextInt();
    //    for(int i=1; i<=10; i++){
    //        System.out.println(num + "*" + i + "=" + (num * i));
    //    }

        //Question 4
//    Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int num = sc.nextInt();
//        for(int i=10; i>=1; i--){
//            System.out.println(num + "*" + i + "=" + (num * i));
//        }

        //Question 5
    //    int num = 4;
    //    int factorial = 1; //Product variable ko 1 se initialize karte hain.

    //    int i = 1;
    //    while(i<=num){
    //        factorial = factorial*i;
    //        i++;
    //    }
    //    System.out.println("factorial:" + factorial);

        //Question 9
    /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int sum =0;   // sum variable ko 0 se initialize karte hai.
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num + "*" + i + "=" + (num*i));
            sum = sum + num*i;
        }
        System.out.println(sum);

     */

        int factorial =1;
        for(int i=1; i<=5; i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);

        int sum = 0;
        int i = 0;
        while(i<=4){
            sum = sum + (2*i);
            i++;
        }
        System.out.println(sum);



    }
}