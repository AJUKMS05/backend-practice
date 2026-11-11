package parking.policy;

public class LightCarFee implements FeePolicy {
    @Override
    public int countfee(int time) {
        NormalCarFee normalCarFee = new NormalCarFee();
        return normalCarFee.countfee(time)/2;
    }
}
