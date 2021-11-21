
import java.util.*;
public class x_mod_y{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);System.out.println("請輸入兩正整數x,y: ");
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(div(x,y));
        in.close();
    }

    public static int div(int x, int y)
    {
        if (x < y) 
        {
            return x;
        }else
        {
            return div(x - y, y);
        }
        
    }
}