public class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;

        //the pair (position, timeToTarget)
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        //sort by position descending.
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        int fleets = 0;
        double maxTimeSoFar = 0.0;

        //sweep from front to back
        for (int i = 0; i < n; i++) {
            double time = cars[i][1];
            if (time > maxTimeSoFar) {
                fleets++;
                maxTimeSoFar = time; //this fleet pace (time) becomes the new.
            }
            //else it joins the current fleet (no change to fleets or maxTimeSoFar)
        }

        return fleets;
    }
}
