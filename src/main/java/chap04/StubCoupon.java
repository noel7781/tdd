package chap04;

public class StubCoupon implements ICoupon {
    @Override
    public int getDiscountPercent() {
        return 7;
    }

    @Override
    public boolean isAppliable(Item item) {
        if(item.getCategory().equals("부엌칼")) {
            return true;
        } else if(item.getCategory().equals("알람시계")) {
            return false;
        }
        return false;
    }

    @Override
    public void doExpire() {

    }

    @Override
    public String getName() {
        return "VIP 쿠폰";
    }

    @Override
    public boolean isValid() {
        return true;
    }
}
