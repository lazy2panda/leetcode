import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

//http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1652&konwledgeId=134
public class Main
{
    public static void main(String args[])
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input=null;
        StringBuilder output = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        try{
            int count=Integer.parseInt(buffer.readLine());
            for(int k=0;k<count;k++){
                input=buffer.readLine();
                for(int i=0;i<input.length();i++){
                    if(input.charAt(i)=='#'){
                        if(!stack.empty()){
                            stack.pop();
                        }

                    }else if(input.charAt(i)=='@'){
                        while (!stack.empty()){
                            stack.pop();
                        }
                    }else {
                        stack.push(input.charAt(i));
                    }

                }
                while (!stack.empty()){
                    output.insert(0,stack.pop());
                }
                System.out.println(output);
                output.delete(0,output.length());

            }

        }catch(IOException IOExp){
            System.out.println(IOExp.getMessage());
        }catch(NumberFormatException NFExp){
            System.out.println(NFExp.getMessage());
        }

    }
}