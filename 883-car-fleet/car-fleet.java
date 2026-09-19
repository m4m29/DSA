class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        int n = position.length;
        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // sort theo position tăng dần
        Arrays.sort(cars, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = n - 1; i >= 0  ; i--){
            double time = (double)(target - cars[i][0]) / cars[i][1];
            if(stack.isEmpty() || stack.peek() < time){
                stack.push(time);
            }
        }
        return stack.size();
    }
}