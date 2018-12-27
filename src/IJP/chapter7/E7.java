package ijp.chapter7;

/**
 * 1 新的isPrime方法,可以复用
 * 2 显示出的结果是0-9分别产生的次数
 */
public class E7 {
    public static void main(String[] args) {
        int[] randInt = new int[100];
        for(int i=0;i<100;i++){
            randInt[i] = (int) (Math.random() * 10);
        }
        printNormalArr(countNumbersInArray(randInt),10);
    }

    public static void printNormalArr(int[] arr,int eachLine) {

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
            if ((i+1)% (eachLine) == 0) {
                System.out.println();
            }
        }
    }

    public static int[] countNumbersInArray(int[] arr) {
        int[] temp = new int[10];
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }
        return temp;
    }
}
