package 异或运算与二进制;

import java.util.HashMap;
import java.util.HashSet;

public class onlyKTimes {
    public static HashMap<Integer, Integer> map = new HashMap<>();

    /*findOnlyKTimes方法，如果真名天子出现真出现k次则返回k，否则返回-1*/
    public static int findOnlyKTimes(int[] arr, int k, int m) {

        int[] t = new int[32];//创建辅助数组t，t[i]用来表示i位置出现1的个数

        for (int num : arr) {
            for (int i=0;i<=31;i++){
                t[i] += (num>>i)&1;
            }
        }

        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if (t[i] % m != 0) {//说明该数在该位有1
                if (t[i] % m == k) {
                    ans |= (1 << i);//设置答案
                } else {
                    return -1;
                }
            }
        }
        if (ans == 0) {
            int count = 0;
            for (int num : arr) {
                if (num == 0) count++;
            }
            if (count != k) {
                return -1;
            }
        }
        return ans;
    }



    //对数器方法
    public static int test(int[] arr, int k, int m) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);//将新出现的数添加进map
            }
        }
        for (int num : map.keySet()) {
            if (map.get(num) == k) {
                return num;
            }
        }
        return -1;//返回无效解
    }

    public static int[] randomArray(int maxKinds, int range, int k, int m) {
        int ktimeNum = randomNumber(range);
        int numKinds = (int) (Math.random() * maxKinds) + 2;
        int times = Math.random()<0.5?k:((int)(Math.random()*(m-1)+1));//决定真命天子真实出现的次数
        int[] arr = new int[times+(numKinds-1)*m];
        int index = 0;
        for (; index < times; index++) {
            arr[index] = ktimeNum;
        }
        numKinds--;//剩下种个数填只出现k次的数
        HashSet<Integer> set = new HashSet<>();
        set.add(ktimeNum);
        //制造新的数
        while (numKinds != 0) {
            int curNum = 0;
            do {
                curNum = randomNumber(range);
            } while (set.contains(curNum));//必须是新的数
            set.add(curNum);
            numKinds--;
            for (int i = 0; i < m; i++) {
                arr[index++] = curNum;
//                System.out.println(index);//test
            }
        }
        // arr 填好了，进行随机swap
        for (int i = 0; i < arr.length; i++) {
            // i 位置的数，我想随机和j位置的数做交换
            int j = (int) (Math.random() * arr.length);// 0 ~ N-1
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    //辅助方法，用于生成随机数
    public static int randomNumber(int range) {
        return ((int) (Math.random() * range) + 1) - ((int) (Math.random() * range) + 1);
    }

    public static void main(String[] args) {
        int kinds = 5;
        int range = 30;
        int testTime = 100000;
        int max = 9;
        System.out.println("测试开始");
        for (int i = 0; i < testTime; i++) {
            int a = (int) (Math.random() * max) + 1; // a 1 ~ 9
            int b = (int) (Math.random() * max) + 1; // b 1 ~ 9
            //生成k和m
            int k = Math.min(a, b);
            int m = Math.max(a, b);
            // if(k < m)
            if (k == m) {
                m++;
            }//保证k和m不相等
            int[] arr = randomArray(kinds, range, k, m);
            int ans1 = test(arr, k, m);
            int ans2 = findOnlyKTimes(arr, k, m);
            if (ans1 != ans2) {
                System.out.println(ans1);
                System.out.println(ans2);
                System.out.println("出错了！");
            }
        }

        System.out.println("测试结束");
    }
}