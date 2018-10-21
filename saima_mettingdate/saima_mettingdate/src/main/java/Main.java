import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1652&konwledgeId=134
public class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        try{
            int a=s.nextInt();
            int b=s.nextInt();
            int step=s.nextInt();
            int sum=Math.abs(a)+Math.abs(b);
            if(sum==step){
                System.out.print("Yes");
            }else if(sum>step){
                System.out.print("No");

            }else if((step-sum)%2==0){
                System.out.print("Yes");
            }else{
                System.out.print("No");
            }


        }catch(NumberFormatException NFExp){
            System.out.println(NFExp.getMessage());
        }

    }
}