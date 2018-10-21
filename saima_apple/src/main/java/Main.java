import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1654&konwledgeId=134
//https://blog.csdn.net/sinat_27339001/article/details/79870541
public class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        try{
            int num=s.nextInt();
            System.out.printf("%.0f",Math.pow(num,num)-num+1);
        }catch(NumberFormatException NFExp){
            System.out.println(NFExp.getMessage());
        }

    }
}