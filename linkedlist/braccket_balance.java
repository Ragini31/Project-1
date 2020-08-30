package linkedlist;

import java.util.Scanner;
import java.util.Stack;

public class braccket_balance {
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t--!=0){
            String s =sc.nextLine();
            Stack <Character> stack = new Stack<>();
            boolean isBalanced = true;
            for(int i = 0; i<s.length();i++){
                char ch = s.charAt(i);
                if(ch =="(" || ch == "{" || ch == "["){
                    stack.push(ch);
                }
            }
            if(stack.isEmpty()){
                isBalanced = false;
                break;
                }
            }else if(ch == ")"){
                if(stack.peek() == "("){
                    stack.pop();
                }else{
                    isbalnced = false;
                    break;

                }else if(ch == "}"){
                    if(stack.peek() == "{"){
                        stack.pop();
                    }else{
                        isbalnced = false;
                        break;
                    }
                    }
                }
                
            }

        }
    
    }

}