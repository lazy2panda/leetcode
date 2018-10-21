import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1652&konwledgeId=134
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
                int result=compare(input);
                System.out.println(result+1);
            }
            buffer.close();

        }catch(IOException IOExp){
            System.out.println(IOExp.getMessage());
        }catch(NumberFormatException NFExp){
            System.out.println(NFExp.getMessage());
        }


    }
    public static int compare(String text){
        int result=0;
        for(int i=0;i<text.length();i++){
            result=result+round(text,i)*factorial(11-i);
        }
        return result;
    }
    public static int round(String text,int index){
        int res=0;
        for(int j=index+1;j<text.length();j++){
            if(text.charAt(index)>text.charAt(j)){
                res++;
            }
        }
        return  res;
    }
    public static int factorial(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    }
}