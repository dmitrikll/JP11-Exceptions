import java.util.Arrays;

public class ArrayValueCalculator {

    public static int doCalc(String[][] data) throws ArrayDataException, ArraySizeException {
        if (data.length != 4 || Arrays.stream(data).anyMatch(row -> row.length != 4)) {
            throw new ArraySizeException("The data must be 4x4 in size");
        }

        int sum = 0;
        for (int i = 0; i < data.length; i += 1) {
            for (int j = 0; j < data[i].length; j += 1) {
                try {
                    sum += Integer.parseInt(data[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data in: row " + (i + 1) + ", column " + (j + 1));
                }
            }
        }
        return sum;
    }
}

