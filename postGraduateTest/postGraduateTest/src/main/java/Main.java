import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=3007&konwledgeId=134
public class Main
{
    public static void main(String args[])
    {
        //BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Scanner s=new Scanner(System.in);
        try{
            int num=s.nextInt();
            for(int i=0;i<num;i++){
                boolean pass=true;
                int sum=0;
                for(int j=0;j<4;j++){
                    int score=s.nextInt();
                    switch(j){
                        case 0:
                            if(score<60){
                                pass=false;
                            }
                            break;
                        case 1:
                            if(score<60){
                                pass=false;
                            }
                            break;
                        case 2:
                            if(score<90){
                                pass=false;
                            }
                            break;
                        case 3:
                            if(score<90){
                                pass=false;
                            }
                            break;
                    }
                    sum=sum+score;
                }
                if(pass&&sum>=310){
                    if(sum<350){
                        System.out.println("Zifei");
                    }else{
                        System.out.println("Gongfei");
                    }
                }else{
                    System.out.println("Fail");
                }
            }
        }catch(NumberFormatException NFExp){
            System.out.println(NFExp.getMessage());
        }

    }
}