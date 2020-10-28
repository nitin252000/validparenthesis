import javax.swing.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;
public class validpatrenthes {
    public static boolean valid(String s)
    {
        HashMap<Character,Character>map=new HashMap<Character,Character>();
        map.put('[',']');
        map.put('(',')');
        map.put('{','}');
        Stack<Character>stack=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map.keySet().contains(c))
            {
                stack.push(c);
            }
            else if(map.values().contains(c))
            {
            if(!stack.empty() &&map.get(stack.peek())==c)
            {
             stack.pop();
            }
            else
            {
                return false;
            }
        }
        }
        return stack.empty();}
        public static void main (String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter your input");
            String s=sc.next();
            valid(s);
            System.out.println(valid(s));



    }}


