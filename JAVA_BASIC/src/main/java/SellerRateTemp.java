/**
 * Created by zshen on 4/19/16.
 */
public class SellerRateTemp {
    private String paramA;
    private String paramB;

    public String getParamA() {
        return paramA;
    }

    public void setParamA(String paramA) {
        this.paramA = paramA;
    }

    public String getParamB() {
        return paramB;
    }

    public void setParamB(String paramB) {
        this.paramB = paramB;
    }

    public static void main(String[] args) {
        double lowerBoundOffset = 2 / 99d;

        double cancellation2 = factorCancellationValue(0.015);
        double deliveryNPS2 = (0.2+ 1 + lowerBoundOffset) / (2 + lowerBoundOffset);
        double customerFeedback2 = 0.4;
        double ontimeDelivery2 = 1;
        double lateshipment2 = 1-0.0781;
        double inquiry = 0.14285714285714285;
        double inquirylate = 1-0.8571428571428571/2.0;
        double inquiryslow = factorInquirySlowValue(0.8571428571428571);

        System.out.println((deliveryNPS2*4+
                cancellation2*2+
                customerFeedback2*2+
                ontimeDelivery2*2+
                lateshipment2*2+

                inquiry*2+
                inquirylate*1+
                inquiryslow*4
        )/(4+2+2+2+2+2+1+4));

//        System.out.println(1f/8);
    }

    private static double factorInquirySlowValue(double value) {
        if (value <= 0.01) {
            value = 0;
        } else {
            value = Math.ceil(value * 10) / 100.0;
        }
        return 1 - value;
    }

    private static double factorCancellationValue(double v) {
        if (v > 0.025) {
            v = (v + 1) / 2.0;
        }
        return 1 - v;
    }
}
