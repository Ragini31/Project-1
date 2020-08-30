import java.util.Scanner;

/**
 * file_1
 */
public class Test {

    public static void main(final String[] args) {
        // int a= 10;
        // int b=13;
        // int c = b>>1;
        // System.out.println(c);

        // int a =4;
        // int b=56;
        // int max = (a>b)? a:b;
        // System.out.println("The max is"+ max);

        // int a= 12, b=10, c= 3;
        // int max = 0;
        // if (a>b){
        // if(a>c){
        // max=a;
        // }else{
        // max= c;
        // }
        // }else{
        // if(b>c){
        // max=b;
        // }else{
        // max = c;
        // }
        // }System.out.println(max);

        // int dayofweek=4;
        // switch(dayofweek){
        // case 1: System.out.println("study");break;
        // case 2: System.out.println("travel");break;
        // case 3: System.out.println("work");break;
        // default: System.out.println("dont know");

        // }

        // int n = 5, sum=0;
        // for(int i=0; i<=n;i++){
        // sum+=i;
        // }
        // System.out.println(sum);

        // Factorial

        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();

        // int factorial=1;
        // for(int i=n; i>=1; i--){
        // factorial= factorial*i;
        // }
        // System.out.println(factorial);

        // Fibonacci

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int a=1;
        // int b= 1;
        // System.out.println(a+" ");
        // System.out.println(b+" ");

        // for(int i = 0; i<n-2; i++){
        // int c =a+b;
        // System.out.println(c +" ");
        // a=b;
        // b=c;
        // }

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b= sc.nextInt();
        // int result = 1;

        // for (int i=0; i<=b;i++){
        // result*=a;
        // }
        // System.out.println(result);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime=true;

        for(int i=2;i*i<n;i++){
        if(n%2==0){
        isPrime=false;
        break;
        }
        if(n<2){
        isPrime=false;
        }
        System.out.println("is prime "+ isPrime);
        }

    //      Scanner sc = new Scanner(System.in);
    //      int a = sc.nextInt();
    //     for(int i=1; i>=a;i++){
    //          for(int j=1;j<=i-1;j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1; j<=a-i+1;j++){
    //             System.out.print("*");
    //          }
    //      System.out.println();
         
    //  }
    sc.close();

    
    
    



    



     }



}