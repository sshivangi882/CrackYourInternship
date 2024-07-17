
import java.util.Stack;
class vaildParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch=='(' || ch=='{' || ch=='[')
                    st.push(ch);
                else{
                    if(st.isEmpty()) return false;
                    char p= st.peek();
                    if(ch == ')' && p != '(') return false;
                    else if(ch == '}' && p != '{') return false;
                    else if(ch == ']' && p != '[') return false;
                    else{
                        st.pop();
                    }
                }

            }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "{[]}";
        vaildParanthesis obj = new vaildParanthesis();
        System.out.println(obj.isValid(s));
    }
}