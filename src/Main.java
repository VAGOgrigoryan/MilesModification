public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int totalMiles = service.calculate( 7500, 20);
        System.out.println(totalMiles);
    }
}

