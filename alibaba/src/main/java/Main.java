/*
* 编译器版本: Java 1.8.0_66
请使用标准输入输出(System.in, System.out)；已禁用图形、文件、网络、系统相关的操作，如java.lang.Process , javax.swing.JFrame , Runtime.getRuntime；不要自定义包名称，否则会报错，即不要添加package answer之类的语句；您可以写很多个类，但是必须有一个类名为Main，并且为public属性，并且Main为唯一的public class，Main类的里面必须包含一个名字为'main'的静态方法（函数），这个方法是程序的入口
时间限制: 3S (C/C++以外的语言为: 5 S)   内存限制: 128M (C/C++以外的语言为: 640 M)
输入:
输入数据包含两行，
第一行，实体列表，多种实体之间用分号隔开，实体名和实体值之间用下划线隔开，多个实体值之间用竖线隔开，所有标点都是英文状态下的，格式如下：
实体名称1_实体值1|实体值2|…;实体名称2_实体值1|实体值2|…;…
第二行，用户的自然语言指令
输出:
被标记了关键词的指令。指令中的关键词前后加一个空格被单独分出来，并在后面跟上"/"+实体名称来标记。如果一个实体值属于多个实体，将这些实体都标记出来，并按照实体名称的字符串顺序正序排列，并以逗号分隔。
输入范例:
singer_周杰|周杰伦|刘德华|王力宏;song_冰雨|北京欢迎你|七里香;actor_周杰伦|孙俪
请播放周杰伦的七里香给我听
输出范例:
请播放 周杰伦/actor,singer 的 七里香/song 给我听
* */
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static int main(String a,String b){
        //Scanner s=new Scanner(System.in);
        String str1 = a;
        String str2 = b;
        int totalNum=Integer.parseInt(str1.split(" ")[0]);
        int value=Integer.parseInt(str1.split(" ")[1]);
        int[] num=new int[totalNum];
        String[] numArray=str2.split(" ");
        for(int i=0;i<totalNum;i++){
            num[i] = Integer.valueOf(numArray[i]);
        }
        Arrays.sort(num);
        int j=0;
        for(int i=0;j<value;i++){
            j=j+num[i];
        }
        return j;


}
}
