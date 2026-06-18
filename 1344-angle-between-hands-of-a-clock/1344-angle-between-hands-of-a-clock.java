class Solution {
    public double angleClock(int hour, int minutes) {
        double hourDegree = (hour % 12) * 30 + (0.5)*minutes;
        double minDegree = (minutes)*6;

        double diff = Math.abs(hourDegree - minDegree);

        return Math.min(diff, 360-diff);
    }
}