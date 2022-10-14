public class Main {
    public static void main(String[] args) {
    float amountOfBricksNasennik = 55;
    float containerCapacityNasennik = 8;
    float abcNasennik;
    float pelnyNasennik = amountOfBricksNasennik/containerCapacityNasennik;
    System.out.println("Number of full Boxes: " + pelnyNasennik);
    float allNasennik = pelnyNasennik+1;
    System.out.println("Amount of Boxes: " + allNasennik);
    // Need to continue this program
    abcNasennik = amountOfBricksNasennik%containerCapacityNasennik;
    System.out.println("Amount of pieces in Last Box: " + abcNasennik);
    }
}