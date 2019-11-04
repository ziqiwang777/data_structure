import java.lang.annotation.ElementType;
import java.util.Stack;

public class Main {




    public boolean isVaild(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i< s.length();i++){
            char c = s.charAt(i);

            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else {

                if (stack.isEmpty()){
                    return false;
                }

                char topchar = stack.pop();

                if (topchar =='{' && c != '}'){
                    return false;
                }else if (topchar == '[' && c != ']'){
                    return false;
                }else if (topchar == '(' && c != ')'){
                    return false;
                }
            }
        }


        return stack.isEmpty();
    }
    public static void main(String[] args) {

        System.out.println(new Main().isVaild("[("));
        System.out.println(new Main().isVaild("[({})]"));

    }


}
