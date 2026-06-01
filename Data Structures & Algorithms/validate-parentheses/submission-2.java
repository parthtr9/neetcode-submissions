class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack <>();
        char [] str = s.toCharArray();
        for (int i = 0; i < str.length; i++){
            char c = str[i];
            if (c == '[') stack.push(']');
            else if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else{
                if(stack.isEmpty() || c != stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
