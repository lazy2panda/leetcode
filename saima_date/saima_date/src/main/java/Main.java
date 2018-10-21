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
        String startDateStr="2015-10-18";
        SimpleDateFormat DateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try{
            input = buffer.readLine();
            Date startDate=DateFormat.parse(startDateStr);
            Date endDate=DateFormat.parse(input);
            long day=(endDate.getTime()-startDate.getTime())/(24*60*60*1000);
            System.out.print(day);

        }catch(ParseException ParseExp){
            System.out.println(ParseExp.getMessage());
        }catch(IOException IOExp){
            System.out.println(IOExp.getMessage());
        }catch(NumberFormatException NFExp){
            System.out.println(NFExp.getMessage());
        }

    }
}