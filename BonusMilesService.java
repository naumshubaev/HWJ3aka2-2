public class BonusMilesService {
    public int calculate(int priceKopeiks){
        int kopeiksPerMile = 20_00;
        int milesCount = priceKopeiks / kopeiksPerMile;
        return milesCount;
    }
}
