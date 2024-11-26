import java.sql.DriverManager;
import java.util.Scanner;
public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hii Usman..");
        int a = 20;
        int b = 30;
        System.out.println(a+b);
        for(int i=1;i<20;i++)
            if(i%2==0 && i<5)
                System.out.print(i+" ");
        int[] arr = {1,2,3,4,5};
        for(int ele : arr)
            System.out.print(ele + " ");
        int[] arr1 = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr1.length;i++) {
            System.out.print("Enter " + i + " element : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println();
        for(int ele1 : arr1)
            System.out.print(ele1 + " ");


    }
}
