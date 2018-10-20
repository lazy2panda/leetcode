import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1677&konwledgeId=134
public class Main
{
    public static void main(String args[])
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        String input2 = null;
        int num=0;
        int reverseCount=0;
        try{
            input = buffer.readLine();
            input2=buffer.readLine();
            String trans="";
            for(int i=0;i<input.length();i++){
                if((input.charAt(i)>='a'&&input.charAt(i)<='z')||(input.charAt(i)>='A'&&input.charAt(i)<='Z')||(input.charAt(i)>='0'&&input.charAt(i)<='9')){
                    trans=trans+"1";
                }else{
                    trans=trans+"0";
                }
            }
            int count=0;
            for(int i=0;i<input2.length();i++){
                if(trans.charAt(i)==input2.charAt(i)){
                    count++;
                }
            }
            System.out.printf("%.2f%%",(float)count*100/input.length());


        }catch(IOException IOExp){
            System.out.println(IOExp.getMessage());
        }catch(NumberFormatException NFExp){
            System.out.println(NFExp.getMessage());
        }

    }
}