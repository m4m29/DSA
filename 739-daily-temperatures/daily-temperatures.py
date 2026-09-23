class Solution:
    def dailyTemperatures(self, temperatures: list[int]) -> list[int]:
        self.result = []
        self.stack = []
        for i in range(len(temperatures)):
            while self.stack and temperatures[self.stack[-1]] < temperatures[i]:
                pop_index = self.stack.pop()
                self.result[pop_index] = i - pop_index
            self.stack.append(i)
            self.result.append(0)
        return self.result
         
        