public class Ex1 {
    public static long calculateGaussSum(long start, long step, int count) {
        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum += start + i * step;
        }
        return sum;
    }

    public static void main(String[] args) {
        long start = 81297;
        long step = 198;
        int count = 100;
        long result = calculateGaussSum(start, step, count);
        System.out.println("The sum is: " + result);
    }
}
