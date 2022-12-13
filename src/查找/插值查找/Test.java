package 查找.插值查找;

public class Test {
    public static int generateRandomNum(int maxValue) {
        return (int)(Math.random()*(maxValue+1)) - (int)(Math.random()*(maxValue+1));
    }

    public static int generateRandomNatureNum(int maxValue) {
        return (int)(Math.random()*(maxValue+1));
    }

    public static int[] generateRandomAscendingArray(int maxSize,int maxValue){
        int size = generateRandomNatureNum(maxSize);
        int[] arr = new int[size];
        int base = generateRandomNum(maxValue);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = base;
            base += generateRandomNatureNum(1000);
        }
        return arr;
    }

    public static int[] generateArray(int maxSize){
        int size = generateRandomNatureNum(maxSize);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void printArray(int[] arr){
        if(arr==null||arr.length==0) {System.out.println("The array is empty");return;}
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d]%d ",i,arr[i]);
        }
        System.out.println();
        return;
    }
}
