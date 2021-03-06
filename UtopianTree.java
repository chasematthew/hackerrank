/* 
The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after growth cycles?

Input Format

The first line contains an integer, , the number of test cases. 
 subsequent lines each contain an integer, , denoting the number of cycles for that test case.

Constraints 
 

Output Format

For each test case, print the height of the Utopian Tree after  cycles. Each height must be printed on a new line.
*/

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int height = 1;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            for(int i = 0; i < n; ++i) {
                height = 1;
                for(int j = 0; j < n; ++j) {
                    if ( j % 2 == 0) {
                        height *= 2;
                    } else {
                        ++height;
                    }
                }
            }
            System.out.println(height);
        }

    }
}
