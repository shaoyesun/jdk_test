package design_pattern.chain;

/**
 * Created by Administrator on 2017/7/7.
 */
public class CEO extends PriceHandle {
    public void process(float discount) {
        if(discount <= 0.3) {
            System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(), discount);
        } else {
            System.out.format("%s拒绝了折扣：%.2f%n",this.getClass().getName(), discount);
        }
    }
}
