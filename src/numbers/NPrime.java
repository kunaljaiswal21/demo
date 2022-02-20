package numbers;

import java.util.Scanner;

class NPrime{

    static boolean isPrime(int n)
    {
        if(n == 0 || n==1)
        return false;

        else
        {
            for(int i=2; i<n; i++)
            {
                if(n%i == 0)
                 return false;
            }
        }
       return true;
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();

        System.out.print("Prime no ---> ");
        for(int i=0; i<=num; i++)
        {
            if(isPrime(i))
                 System.out.print(i+" ");
        }

    }

}
