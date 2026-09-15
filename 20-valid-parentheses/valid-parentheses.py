class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        Map = {")" : "(", "}" : "{", "]" : "["}
        for c in s:
            if c in Map:
                if stack and stack[-1] == Map[c]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)
        return True if not stack else False