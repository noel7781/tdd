package chap04;

public class DummyCoupon implements ICoupon {
    @Override
    public int getDiscountPercent() {
        return 0;
    }

    @Override
    public boolean isAppliable(Item item) {
        return false;
    }

    @Override
    public void doExpire() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isValid() {
        return false;
    }
}
