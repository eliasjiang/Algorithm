package 查找.二叉排序树;

public class TestUtil {

    public static int generateRandomNum(int maxValue) {
        return (int)(Math.random()*(maxValue+1)) - (int)(Math.random()*(maxValue+1));
    }

    public static int generateRandomNatureNum(int maxValue) {
        return (int)(Math.random()*(maxValue+1));
    }

    public static BiTree generateRandomBiTree(int maxSize,int maxValue){
        int size = generateRandomNatureNum(maxValue);
        BiTree BT = new BiTree();
        for (int i = 0; i < size; i++) {
            int data =generateRandomNum(maxValue);
            BT.addNode(data);
        }
        return BT;
    }
}
