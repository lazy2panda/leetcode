import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1659&konwledgeId=134
public class Main
{
    public static void main(String args[])
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        int maxNum=0;

        try{
            input = buffer.readLine();
            int count=Integer.parseInt(input);
            int currentNum=0;
            String[] place=null;
            for(int i=0;i<count;i++){
                place =buffer.readLine().split(" ");
                currentNum=currentNum+Integer.parseInt(place[1]);
                currentNum=currentNum-Integer.parseInt(place[0]);
                if(currentNum>maxNum){
                    maxNum=currentNum;
                }

            }

            System.out.print(maxNum);




        }catch(IOException IOExp){
            System.out.println(IOExp.getMessage());
        }catch(NumberFormatException NFExp){
            System.out.println(NFExp.getMessage());
        }

    }
}