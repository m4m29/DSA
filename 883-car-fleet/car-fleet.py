class Solution:
    def carFleet(self, target: int, position: list[int], speed: list[int]) -> int:
        n = len(position)
        fleet = {}
        stack = []
        for i in range(n):
            fleet[position[i]] = speed[i]
        sort_fleet = {key : fleet[key] for key in sorted(fleet, reverse = True)}
        for key in sort_fleet:
            time  = (target-key)/sort_fleet[key]
            if not stack or time > stack[-1]:
                stack.append(time)
        return len(stack)