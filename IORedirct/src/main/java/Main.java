import java.io.*;
import java.util.*;
//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1664&konwledgeId=134

public class Main
{
    public static void main(String args[])
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try{
        while((input = buffer.readLine()) != null)
        {
            int n=Integer.parseInt(input);
            int value=1;
            int day=1;
            for(int i=1;!(day==n);i++){
                for(int j=0;j<i&&!(day==n);j++){
                    if(j==i-2){
                        value=value-1;
                    }else{
                        value=value+1;
                    }
                    day++;

                }
            }
            System.out.println(value);
        }
        }
        catch(IOException IOExp){
            System.out.println(IOExp.getMessage());
        }
        catch(NumberFormatException NFExp){
            System.out.println(NFExp.getMessage());
        }
    }
}
