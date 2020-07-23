public class Sqrt_X_ {
    public int mySqrt1(int x) {
        if(x == 0) return 0;
        for(int i = 1; i <= x / i; i++) {
            if(i <= x / i && (i + 1) > x / (i + 1))
                return i;
        }
        return -1;
    }

    public int mySqrt(int x) {
        if (x == 0) return 0;
        int start = 1, end = x;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1))// Found the result
                return mid;
            else if (mid > x / mid)// Keep checking the left part
                end = mid;
            else
                start = mid + 1;// Keep checking the right part
        }
        return start;
    }
}
