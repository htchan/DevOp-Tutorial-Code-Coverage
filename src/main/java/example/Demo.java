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
}