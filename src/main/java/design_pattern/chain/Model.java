package design_pattern.chain;

import java.util.Random;

/**
 * @要点：
 * @ 1.抽象处理者角色：定义处理请求接口及设定下家引用
 * @ 2.具体处理者角色：具体处理请求或选择将请求传给下家
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
