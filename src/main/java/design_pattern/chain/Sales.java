package design_pattern.chain;

/**
 * Created by Administrator on 2017/7/7.
 */
public class Sales extends PriceHandle {
    public void process(float discount) {
        if(discount <= 0.1) {
            System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(), discount);
        } else {
            successor.process(discount);
        }
    }
}
