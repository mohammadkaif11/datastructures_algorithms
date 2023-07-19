package GFG;

import java.util.ArrayList;
import java.util.List;

public class Day1 {

    static List<Long> minimumSquares(long L, long B)
    {
        List<Long> result=new ArrayList<Long>();
        Long Width=GcdofTwo(L,B);
        Long numberofSqaure=L/Width * B/Width;
        result.add(Width);
        result.add(numberofSqaure);

        return result;

    }

    static long GcdofTwo(long a,long b)
    {
        if (b == 0)
            return a;
        return GcdofTwo(b, a % b);
    }

    public static void main(String[] args) {

    }
}
