package parking;


import parking.policy.FeePolicy;

public class ParkingCashier {
    public static int process(FeePolicy feePolicy, int time){
        return feePolicy.countfee(time);
    }
}
