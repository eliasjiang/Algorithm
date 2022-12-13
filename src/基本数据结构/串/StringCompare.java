package 基本数据结构.串;

import org.junit.Test;

public class StringCompare {
    public static int Index(String S,String T,int pos){
        int i = pos;
        int j = 0;
        while(i<S.length()&&j<T.length()){
            if(S.charAt(i)==T.charAt(j)){++i;++j;}
            else{
                i = i-j+1;
                j = 0;
            }

        }
        if(j==T.length()) return i-T.length();
        else return -1;
    }

class KMPCompare{

}
    @Test
    public void test(){
        String S = "goodgogoogle";
        String T = "google";
//        System.out.println(S.charAt(0));
        int res = StringCompare.Index(S,T,0);
        System.out.println(res);
    }
}

