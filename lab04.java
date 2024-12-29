import java.util.*;
class lab04{
    public static void main(String args[]){
        int n,i;
        int arr[];
        arr=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.print("How many value do you want in your array");
        n=sc.nextInt();
        System.out.println("Enter "+n+" values into array");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before sortiung array is");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        for(i=0;i<n-1;i++){
            for (int j=i;j<n;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After sortiung array is");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}