public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if((first < 10) || (second < 10)) {
            return -1;
        }

        int i = 2, x, k, j = -1;
        while(i <= first && i <= second) {
            x = first % i;
            k = second % i;

            if(x == 0 && k == 0) {
                j = i;
            }
            i++;
        }

        return j;
    }
}