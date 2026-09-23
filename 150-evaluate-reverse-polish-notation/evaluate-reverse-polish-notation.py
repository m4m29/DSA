class Solution:
    def evalRPN(self, tokens: list[str]) -> int:
        self.stack = []
        for i in tokens:
            if i != "+" and i != "-" and i != "*" and i != "/":
                self.stack.append(int(i))    
            else:
                a = self.stack.pop()
                b = self.stack.pop()    
                match i:
                    case "+":
                        self.stack.append(b+a)
                    case "-":
                        self.stack.append(b-a)
                    case "*":
                        self.stack.append(b*a)
                    case "/":
                        if a != 0: 
                            self.stack.append(int(b/a))
        return self.stack[-1]