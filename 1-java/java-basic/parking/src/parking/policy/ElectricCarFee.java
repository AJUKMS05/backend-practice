package parking.policy;

public class ElectricCarFee implements FeePolicy{
    @Override
    public int countfee(int time) {
        time -= 60;
        if(time <= 0) {
            return 0;
        }
        else{
            NormalCarFee normalCarFee = new NormalCarFee();
            return normalCarFee.countfee(time);
        }
    }
}
