import java.util.stream.IntStream;

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        return IntStream.range(0, coordinates.length -2)
            .allMatch(i-> isTrue(coordinates[i],coordinates[i+1],coordinates[i+2]));
    }
    
    boolean isTrue(int[] t1, int[] t2, int[] t3){
        return (t2[1] - t1[1]) * (t3[0]- t1[0]) == (t3[1] - t1[1]) * (t2[0]- t1[0]);
    }
}