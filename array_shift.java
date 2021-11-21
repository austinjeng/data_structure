public class array_shift{


    public static void main(String[] args) {

        //建立測試用陣列
        int[] L = {0, 1, 2, 3, 4};

        //呼叫circularShift方法
        circularShift(L, 2);

        //列印出移動過後的結果
        for(int x : L)
        {
            System.out.print(x + " ");
        }
    }


    //建立circularShift方法，回傳值為void，輸入一個inpuatArray[]，並將輸入的陣列內的元素整體向左移動shift次
    static void circularShift(int [] inputArray, int shift)
    { 
        //將迴圈內的向左移動一次執行shift次
        for(int i = 0; i < shift; i++)
        {
            //把陣列內的第一個元素取出
            int first = inputArray[0];

            //從陣列內第二個位置開始，將數值往前面一格放置
            for(int j = 1; j < inputArray.length; j++)
            {
                inputArray[j - 1] = inputArray[j];
            }

            //最後再將先取出的第一個數字放到陣列的最後，完成陣列的移動
            inputArray[inputArray.length - 1] = first;
        }
    }

}