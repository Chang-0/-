import java.util.Stack;

public class LongestValidParentheses {

    public static void main(String[] args) {
        String s = ")()())()()(";
        System.out.println(new LongestValidParentheses().longestValidParentheses(s));
    }
    public int longestValidParentheses(String s) {
        int[] read = new int[s.length()];
        Stack<Character> stack = new Stack<>();
        int[] dp = new int[s.length()];
        stack.push(s.charAt(0));
        for (int i=1;i<s.length();i++){
            if (s.charAt(i)=='(') {
                stack.push(s.charAt(i));
                dp[i] = dp[i-1];
            }
            if (s.charAt(i)==')'){
                if (stack.isEmpty()){
                    stack.push(s.charAt(i));
                    dp[i] = dp[i-1];
                    continue;
                }else {
                    if (stack.peek()=='('){
                        stack.pop();
                        read[i] = 1;
                        int left = i;
                        int count = 0;
                        for (int j=i-1;j>=0;j--){
                            if (read[j]==0) {
                               if (count==0){
                                   read[j] = 1;
                                   count++;
                               }else {
                                   left = j + 1;
                                   break;
                               }
                            }
                        }
                        if (left==i){
                            dp[i] = i+1;
                            continue;
                        }else {
                            int l = i - left+1;
                            if (l>dp[i-1]){
                                dp[i] = l;
                            }else dp[i] = dp[i-1];
                        }
                    }else {
                        stack.push(s.charAt(i));
                        dp[i] = dp[i-1];
                    }
                }
            }
        }
//        int count = 0;
//        int max = 0;
//        for (int i=0;i<s.length();i++){
//            if (read[i]==1){
//                count++;
//            }else {
//                if (max<count) max = count;
//                count = 0;
//            }
//        }
//        if (max<count) max = count;
//        System.out.println(Arrays.toString(read));
//      return  max;
        return dp[s.length()-1];
    }

    public int longestValidParentheses_MyVersion(String s) {
        int[] read = new int[s.length()];
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='(') stack.push(s.charAt(i));
            if (s.charAt(i)==')'){
                if (stack.isEmpty()){
                    stack.push(s.charAt(i));
                    continue;
                }else {
                    if (stack.peek()=='('){
                        stack.pop();
                        read[i] = 1;
                        for (int j=i-1;j>=0;j--){
                            if (read[j]==0) {
                                read[j] = 1;
                                break;
                            }
                        }
                    }
                }
            }
        }
        int count = 0;
        int max = 0;
        for (int i=0;i<s.length();i++){
            if (read[i]==1){
                count++;
            }else {
                if (max<count) max = count;
                count = 0;
            }
        }
        if (max<count) max = count;
        return  max;

    }
}
