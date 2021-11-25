import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int i;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n= input.nextInt();
     System.out.println("Enter the element to be searched: ");
        int k=input.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                System.out.println("Element found at: "+i);
                break;
            }
      
           
        }
          if(i==n){
            System.out.println("Element not found");
        }
       
    }
