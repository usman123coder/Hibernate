import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 no : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%b==1)
            System.out.println("this is odd no.");
        else
            System.out.println("Even no.");
    }
    }

