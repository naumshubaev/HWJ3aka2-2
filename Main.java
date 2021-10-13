public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int priceKopeiks = 40000_00;
        int milesCount = service.calculate(priceKopeiks);
        System.out.println(milesCount);
    }
}
