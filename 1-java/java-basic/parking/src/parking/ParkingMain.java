package parking;

import parking.policy.*;

import java.util.Calendar;
import java.util.Scanner;

public class ParkingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Total = 0;
        for (int i = 0; i < n; i++) {
            String carType = sc.next();
            int carTime = sc.nextInt();
            FeePolicy feePolicy;
            int tem=0;
            if(carType.equals("LIGHT")){
                feePolicy = new LightCarFee();
                tem = ParkingCashier.process(feePolicy, carTime);
            }
            else if (carType.equals("NORMAL")){
                feePolicy = new NormalCarFee();
                tem = ParkingCashier.process(feePolicy, carTime);
            }
            else if(carType.equals("ELECTRIC")){
                feePolicy = new ElectricCarFee();
                tem = ParkingCashier.process(feePolicy, carTime);
            }
            else{
                feePolicy = new TruckCarFee();
                tem = ParkingCashier.process(feePolicy, carTime);
            }
            Total += tem;
            System.out.println(tem);
        }
        System.out.println("TOTAL " + Total);
    }
}
