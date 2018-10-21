import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1652&konwledgeId=134
public class Main
{
    public static void main(String args[])
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        //Scanner s=new Scanner(System.in);
        String input = null;
        int roadLength=0;
        int result=0;

        try{
            input = buffer.readLine();
        }catch(IOException IOExp){
            System.out.println(IOExp.getMessage());
        }catch(NumberFormatException NFExp){
            System.out.println(NFExp.getMessage());
        }

    }
}