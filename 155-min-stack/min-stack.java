class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;
    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(minstack.isEmpty() || minstack.peek() >= value) {minstack.push(value);}

    }
    
    public void pop() {
        if(stack.pop().equals(minstack.peek())){
            minstack.pop();
        };
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */