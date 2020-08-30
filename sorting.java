import java.util.Scanner;

public class sorting {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bubble Sort

        System.out.println("enter number of elements");

        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.print("enter elements");
        for(int i=0;i<n;i++){//for reading array
            a[i]=sc.nextInt();
            boolean sorted = true;
            for(int j= 0; j<(n-1);j++){
                if(a[j+1]<a[j]){
                    int temp = a[j+1];
                    a[j+1]=a[j];
                    a[j] = temp;
                    sorted = false;
                }
                if(sorted) break;
            }
        }
        for(int item:a){
            System.out.print(item + "");
        }
        sc.close();

    }
    
}