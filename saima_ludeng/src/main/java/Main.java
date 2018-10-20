import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1500&konwledgeId=134
public class Main {
    public static void main(String args[]) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        String input2 = null;
        try {
            input = buffer.readLine();
            input2 = buffer.readLine();
            int num=Integer.parseInt(input.split(" ")[0]);
            int distance=Integer.parseInt(input.split(" ")[1]);
            String[] roadLampPositionStr=input2.split(" ");
            int[] roadLampPosition=new int[num];
            for(int i=0;i<num;i++){
                roadLampPosition[i]=Integer.parseInt(roadLampPositionStr[i]);
            }
            Arrays.sort(roadLampPosition);
            double minDistance=roadLampPosition[0];

            for(int i=0;i<num-1;i++){
                if(minDistance<(roadLampPosition[i+1]-roadLampPosition[i])/2.0){
                    minDistance=(roadLampPosition[i+1]-roadLampPosition[i])/2.0;
                }
            }
            if(minDistance<(distance-roadLampPosition[num-1])){
                minDistance=distance-roadLampPosition[num-1];
            }
            System.out.printf("%.2f",minDistance);

        } catch (IOException IOExp) {
            System.out.println(IOExp.getMessage());
        } catch (NumberFormatException NFExp) {
            System.out.println(NFExp.getMessage());
        }
    }
}