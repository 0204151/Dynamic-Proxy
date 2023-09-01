public class ArraysUtils {//定义数组工具类，练习

    private ArraysUtils(){

    }


    //返回数组内容
    public static String toString(int[] a) {
        String str ="[";
        for (int j : a) {
            str = str + "," ;
            str += String.valueOf(j);
            System.out.println(String.valueOf(j));
        }
        str = str + "]";
        return str;
    }
    //计算平均值
    public static float getAverage(float[] a){
        float average = 0;
        float large = 0;
        float little = 100;
        for (float v : a) {
            if (large < v) large = v;
            if (little > v) little = v;
            average = average + v;
        }
        average = (average - little - large)/(a.length - 2);
        return average;
    }
}
