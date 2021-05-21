public class BonusMilesService {
    public int calculate(int price, int priceOf1Mile) {
        int totalMiles = price / priceOf1Mile;

        return totalMiles;
    }
}
