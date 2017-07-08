package design_pattern.chain;

/**
 * Created by Administrator on 2017/7/7.
 */
public abstract class PriceHandle {

    protected PriceHandle successor;

    public void setSuccessor(PriceHandle successor) {
        this.successor = successor;
    }

    public abstract void process(float discount);

    public static PriceHandle createPriceHandle() {
        PriceHandle sales = new Sales();
        PriceHandle direct = new Direct();
        PriceHandle ceo = new CEO();

        sales.setSuccessor(direct);
        direct.setSuccessor(ceo);
        return sales;
    }
}
