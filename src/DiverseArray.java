

public class DiverseArray {
    static int arraySum(int[] array) {
        int sum = 0;
        for (int i: array)
            sum += i;
        return sum;
    }

    static int[] rowSums(int[][] array2D) {
        int[] rowSum = new int[array2D.length];
        int i = 0;
        for (int[] row : array2D)
        {
            rowSum[i++] = arraySum(row);
        }
        return rowSum;
    }

    static boolean isDiverse(int[][] array2D)
    {
        int[] rowSum = rowSums(array2D);
        for (int i = 0; i < rowSum.length; i++)
        {
            for (int j = i+1; j < rowSum.length; j++)
            {
                if (rowSum[i] == rowSum[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}