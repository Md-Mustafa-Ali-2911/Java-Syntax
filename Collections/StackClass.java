import java.util.*;

// Stack extends vector hence it is synchronized

public class StackClass {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        System.out.println(st.peek());
        System.out.println(st.pop());
    }
}