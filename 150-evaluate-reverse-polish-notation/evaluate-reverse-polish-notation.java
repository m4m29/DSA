class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String c: tokens){
            if(!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")){
                stack.push(Integer.parseInt(c));
            }
            else{
                int a = stack.pop();
                int b = stack.pop();
                switch(c){
                    case "+" :
                        stack.push(b+a);
                        break;
                    case "-":
                        stack.push(b-a);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        if(a != 0) stack.push(b/a);
                        break;
                }
            }
        }
        return stack.peek();
    }
}