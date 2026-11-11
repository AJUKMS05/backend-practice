package parking.policy;

public class TruckCarFee implements FeePolicy{

    @Override
    public int countfee(int time) {
        NormalCarFee normalCarFee = new NormalCarFee();
        return normalCarFee.countfee(time)*2;
    }
}
