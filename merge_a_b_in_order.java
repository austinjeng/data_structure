public class merge_a_b_in_order{
    
    public static void main(String[] args) {
        //建立三個陣列 
        //firstArray, secondArray分別為要輸入的兩筆陣列
        //mergedArray是經過merge方法後排列好大小順序的陣列
        int[] firstArray = {1,2,3,6,8};
        int[] secondArray = {4,5,7,9,10,11};
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        
        //呼叫merge方法
        merge(firstArray, secondArray, mergedArray);

        //把mergedArray的內容列印出來
        for(int x : mergedArray)
        {
            System.out.print(x + " ");
        }


    }

    //建立merge方法，其回傳值為void，並帶入三個陣列參數a[], b[], c[]
    static void merge(int[] a, int[] b, int[] c)
    {
        //i, j, k分別為a[], b[], c[]的計數器
        int i = 0, j = 0, k = 0;
        //當a[], b[], c[]尚未比較完時，持續進行比較大小
        while (k < c.length && i < a.length && j < b.length)
        {
            //如果a[i]大於b[j]，把較小的b[j]存入c[k]中，並增加k和j的計數
            if (a[i] > b[j])
            {
                c[k] = b[j];
                k++;
                j++;
            }
            //如果b[j]大於a[i]，把較小的a[i]存入c[k]中，並增加k和i的計數
            else if (a[i] < b[j])
            {
                c[k] = a[i];
                k++;
                i++;
            }
            else
            //如果b[j]等於a[i]，就把a[i]和b[j]都存到c[k]中，先放a[i]到c[k]，
            //並增加i和k的計數，待放入b[j]後再加增加j和k的計數
            {
                c[k] = a[i];
                i++;
                k++;
                c[k] = b[j];
                j++;
                k++;
            }

            //如果a的計數i已經到達a[]的長度，代表a[]內的元素已經都比較結束，接下來只需把b陣列剩餘的
            //element放入c陣列中
            if (i == a.length && j != b.length)
            {
                while (j < b.length)
                {
                    c[k] = b[j];
                    j++;
                    k++;
                }

                break;
            }

            //如果b的計數j已經到達b[]的長度，代表b[]內的元素已經都比較結束，接下來只需把a陣列剩餘的
            //element放入c陣列中
            if (i != a.length && j == b.length)
            {
                while (i < a.length)
                {
                    c[k] = a[i];
                    i++;
                    k++;
                }

                break;
            }

        }
    }
}
