import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1652&konwledgeId=134
public class Main
{
    public static void main(String args[])
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        int roadLength=0;
        int result=0;

        try{
            input = buffer.readLine();
            roadLength=Integer.parseInt(input.split(" ")[0])+1;
            int num=Integer.parseInt(input.split(" ")[1]);
            int[] road=new int[roadLength];
            int start=0;
            int end=0;
            for(int i=0;i<num;i++){
                input = buffer.readLine();
                start=Integer.parseInt(input.split(" ")[0]);
                end=Integer.parseInt(input.split(" ")[1]);
                for(int j=start;j<=end;j++){
                    road[j]=1;
                }

            }
            for(int i=0;i<roadLength;i++){
                if(road[i]==0){
                    result++;
                }
            }


            System.out.print(result);




        }catch(IOException IOExp){
            System.out.println(IOExp.getMessage());
        }catch(NumberFormatException NFExp){
            System.out.println(NFExp.getMessage());
        }

    }
}