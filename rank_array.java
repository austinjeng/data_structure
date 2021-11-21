import java.util.*;

public class rank_array {

    public static void main(String[] args) 
    {
        Scanner input =new Scanner(System.in);
        int a[] = new int [9];
        int r[] = new int[9];
        System.out.println("輸入9個數字");
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=input.nextInt();
        }
        rank(a,r,a.length);
        System.out.println();
        for (int i = 0; i < 9; i++) 
        {
            System.out.print(r[i] + " ");
        }

        input.close();
    }
    public static void rank(int []a, int []r ,int n) 
    {
        for(int i = 0; i < r.length; i++)
        {
            r[i] = 0;
        }

        for(int i = 1; i < a.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(a[j] <= a[i])
                {
                    r[i]++;
                }
                else
                {
                    r[j]++;
                }
            }
        }
    }
}
