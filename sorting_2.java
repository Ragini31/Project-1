import java.util.Scanner;

public class sorting_2 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        //Selection Sort

        System.out.println("Enter the no. of element: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

            int minIndex = i;
            for(int j =0; j<n;j++){
                minIndex = j;
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        for(int e:a){
            System.out.print(e + " ");
        }
       sc.close();
    }
}