import java.util.*;

public class remove_from_array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


		int a[] = new int[10];
		System.out.println("Size :");
		int size_a = input.nextInt();
		for (int i = 0; i < size_a; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("Remove x:");
		int x = input.nextInt();
		remove(a, size_a, x);
//
//
//
        // int b[] = new int[10];
		// System.out.println("Size : ");
		// int size_b = input.nextInt();
		// for (int i = 0; i < size_b; i++) {
		// 	b[i] = input.nextInt();
		// }
		// System.out.println("Insert y : ");
		// int y = input.nextInt();
		// add(b, size_b, y);

        input.close();
    }
    
    public static void remove(int[] A, int size, int x)
    {
        int removedIndex = 0;
        for(int i = 0; i < size; i++)
        {
            if(A[i] == x)
            {
                removedIndex = i;
                break;
            }
        }

        for(int i = removedIndex; i < size - 1; i++)
        {
            A[i] = A[i + 1];
        }

        size--;

        
        System.out.println("The new array is :");
		for (int i = 0; i < size; i++) {
			System.out.print(A[i] + " ");
		}
    }

    public static void add(int[] A, int size, int x)
    {
        int insert_index = 0;

        for (int i = 0; i < size; i++)
        {
            if(A[i] > x)
            {
                insert_index = i;
                break;
            }
            
        }

        for(int i = size - 1; i >= insert_index; i--)
        {
            A[i + 1] = A[i];
        }
        System.out.println("insert index = " + insert_index);
        A[insert_index] = x;

        size++;

        System.out.println("The new array is : ");
		for (int i = 0; i < size; i++) {
			System.out.print(A[i] + " ");
		}
    }
}
