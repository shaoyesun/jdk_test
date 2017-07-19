package design_pattern.chain;

import java.util.Random;

/**
 * Created by Administrator on 2017/7/7.
 */
public class Model {

    private PriceHandle priceHandle;

    public void setPriceHandle(PriceHandle priceHandle) {
        this.priceHandle = priceHandle;
    }

    public void requestDiscount(float discount) {
        priceHandle.process(discount);
    }

    public static void main(String[] args) {
        Model customer = new Model();
        customer.setPriceHandle(PriceHandle.createPriceHandle());
        Random random = new Random();
        for(int i = 0; i < 100; i++) {
            System.out.print(i + ":");
            customer.requestDiscount(random.nextFloat());
        }
    }

}
