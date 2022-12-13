package 基本数据结构.串;

class Test {
    public static char[] generateRandomCharArr(int MaxSize) {
        int len = generateRandomPosNum(MaxSize, 0);
        char[] source = new char[len];
        for (int i = 0; i < source.length; i++) {
//            source[i] = geenerateRandomChar();
        }
        return null;
    }

    //generate a random num from [min,max]
    public static int generateRandomPosNum(int Value1, int Value2) {
        if (Value1 == Value2) return Value1;

        int MaxValue = Math.max(Value1, Value2);
        int MinValue = Math.min(Value1, Value2);
        int Diff = MaxValue - MinValue;
        return MinValue + (int) ((Diff + 1) * Math.random());
    }

//    public static char geenerateRandomChar(){
//
//    }
//


}
