package 基本数据结构.串;

class MyString {
    private int len = 0;
    private char[] data = new char[0];


    MyString() {

    }

    //char[]构造器，从char[] 中拷贝生成串
    MyString(char[] source) {
        if (source != null && source.length != 0) {
            this.len = source.length;
            this.data = new char[this.len];
            for (int i = 0; i < this.len; i++) {
                this.data[i] = source[i];
            }
        }
    }


//    public static void strCopy(MyString T,MyString S){
//        return;
//    }
//
//    public static void clearString(MyString S){
//        return;
//    }
//
//    public static boolean stringEmpty(MyString S){
//        return true;
//    }
//
//    public static int strLength(MyString S){
//        return 0;
//    }
//
//    public static int strCompare(MyString T,MyString S){
//        return 0;
//    }
//
//    public static MyString Concat(MyString S1,MyString S2){
//        return ;
//    }
//
//    public static MyString SubString(MyString Sub,MyString str){
//        return ;
//    }
//
//    public static int index(MyString S,MyString T){
//        return 0;
//    }
//
//    public static void replace(MyString S,MyString T,MyString V){
//        return;
//    }
//
//    public static void StrInsert(MyString S,int pos,MyString T){
//        return;
//    }
//
//    public static void strDelete(MyString S,int pos,int len){
//        return;
//    }


}
