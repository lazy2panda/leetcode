import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1668&konwledgeId=134
public class Main
{
    public static void main(String args[])
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        int count=0;
        try{
            input = buffer.readLine();
            count=Integer.parseInt(input);
            for(int i=0;i<count;i++){
                input=buffer.readLine();
                int result=solve(Integer.parseInt(input));;
                System.out.println(result);
            }
            buffer.close();

        }catch(IOException IOExp){
            System.out.println(IOExp.getMessage());
        }catch(NumberFormatException NFExp){
            System.out.println(NFExp.getMessage());
        }


    }
    public static int solve(int num){
       if(num<=1){
           return 0;
       }else if(num==2){
           return 1;
       }else if(num==3){
           return 2;
       }
       else{
           return solve(num-1)+solve(num-2);
       }
    }
}