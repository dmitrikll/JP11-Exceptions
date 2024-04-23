public class Main {
    public static void main(String[] args) {

        String[][] inputData = {
                {"2", "3", "1", "4"},
                {"8", "10", "12", "35"},
                {"46", "5", "7", "11"},
                {"31", "28", "75", "16"}
        };

        try {
            System.out.println("The sum of all array elements: " + ArrayValueCalculator.doCalc(inputData));
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}