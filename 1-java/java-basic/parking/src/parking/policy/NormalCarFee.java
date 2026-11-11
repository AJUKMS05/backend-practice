package parking.policy;

public class NormalCarFee implements FeePolicy{
    @Override
    public int countfee(int time) {
        if(time <= 30){
            return 2000;
        }
        else{
            return ((((time-30)/10-(time%10==0?1:0))+1)*500+2000);
        }
    }
}
