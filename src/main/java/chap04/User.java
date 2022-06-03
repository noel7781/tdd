package chap04;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    List<ICoupon> coupons;
    public User(String name) {
        this.name = name;
        this.coupons = new ArrayList<>();
    }

    public int getTotalCouponCount() {
        return coupons.size();
    }

    public void addCoupon(ICoupon coupon) {
        coupons.add(coupon);
    }

    public ICoupon getLastOccupiedCoupon() {
        return coupons.get(coupons.size() - 1);
    }
}
