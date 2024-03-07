package BackToSenderRaider;

public class LogisticsServices {
    int basePay = 5000;

    public int riderWageForTheDay(int successfulDelivery) {
        if(successfulDelivery<0 || successfulDelivery>100){
            throw new IllegalArgumentException("Invalid delivery");
        }
        if(successfulDelivery < 50){
            int rider = (160 *successfulDelivery) + basePay;
            return  rider;

        }else if(successfulDelivery >50 && successfulDelivery<=59){
            int rider1 =(200 *successfulDelivery) + basePay;
            return rider1;
        }else if(successfulDelivery> 60 && successfulDelivery<=69){
            int rider2 =(250 * successfulDelivery) + basePay;
            return rider2;
        }else if(successfulDelivery >= 70){
            int rider3 =(500 * successfulDelivery) + basePay;
            return rider3;
        }
        return 0;

    }
}
