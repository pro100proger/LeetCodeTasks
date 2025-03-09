
import static Tasks.HIndex.hIndex;
import static Tasks.IIJumpGame.jump;

public class Main {

    public static void main(String[] args) {
        int[] citations = {2,9,7,3,2,6};
        int h = hIndex(citations);
        System.out.println(h);
    }
}