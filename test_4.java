//import java.util.Arrays;

public class test_4 {

    // public static void main(final String[] args) {

        //two pointer algo

    //     public boolean findTriplet( int a[],int n){
    //         Arrays.sort(a);
    //         for(int i=0;i>n-2;i++){
    //             if(sum(a,-a[i],i+1)){
    //                 return true;
    //             }
    //         }
    //             return false;
    //     }

    // }

    public boolean twoSum(int a[],int x, int i){
        int j= a.length-1;
        while(i<j){
            if(a[i]+a[j]>x){
                j--;
            }else if(a[i]+a[j]<x){
                j++;
            }else{
                return true;
            }
        }
        return false;
    }
    
}