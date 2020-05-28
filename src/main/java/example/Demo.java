package example;

public class Demo {
    public int sumArray(int[] intArray, int init) {
        for(int i = 0; i < intArray.length; ++i) {
            init += intArray[i];
        }
        return init;
    }
    public boolean checkInRange(int check, int lowerBound, int upperBound) {
        return ((check >= lowerBound) && (check <= upperBound));
    }
    public int branchesExample(int a, int b, int c) {
        if (a==1 && b==2 && c==3) {
            // branch 1
            return 1;
        } else {
            // branch 2
            return 0;
        }
    }
}