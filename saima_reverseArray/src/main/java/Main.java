import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1656&konwledgeId=134
public class Main
{
    public static void main(String args[])
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        int num=0;
        int reverseCount=0;
        try{
            if((input = buffer.readLine() )!= null){
                num=Integer.parseInt(input);
                input = buffer.readLine();
                String[] numArray=input.split(" ");
                String[] numArray2=input.split(" ");
                int start=0;
                int end=0;
                boolean upOrder=true;
                for(int i=0;i<num-1;i++){
                    int a=Integer.parseInt(numArray[i]);
                    int b=Integer.parseInt(numArray[i+1]);
                    if(a>b&&upOrder==true){
                        start=i;
                        upOrder=false;
                    }else if(a<b&&upOrder==false)
                    {
                        end=i;
                        upOrder=true;
                    }
                }

                for(int i=start;i<end+1;i++){
                    numArray2[i]=numArray[end-i+start];
                }
                boolean isUp=true;
                for(int i=0;i<num-1;i++){
                    int a=Integer.parseInt(numArray2[i]);
                    int b=Integer.parseInt(numArray2[i+1]);
                    if(a>b){
                        isUp=false;
                    }
                }
                if(isUp){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }

            }
        }catch(IOException IOExp){
            System.out.println(IOExp.getMessage());
        }catch(NumberFormatException NFExp){
            System.out.println(NFExp.getMessage());
        }

    }
}