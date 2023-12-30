import java.util.stream.IntStream;

public class ArraySamples implements IArraySamples{

    @Override
    public int findNthLargestInArray(int[] array, int nValue) {
        if (nValue < 1 || nValue > array.length) {
            throw new IllegalArgumentException("The value of N must be between 1 and the size of the array");
        }
        int arraySize = array.length;
        int[] sortedArray = IntStream.of(array).sorted().toArray();
        return sortedArray[arraySize - nValue];
    }
}