package chap04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void testAddCoupon() throws Exception {
        User user = new User("area88");
        assertEquals(0, user.getTotalCouponCount());

        ICoupon coupon = new DummyCoupon();

        user.addCoupon(coupon);
        assertEquals(1, user.getTotalCouponCount());
    }

    @Test
    public void testGetLastOccupiedCoupon() throws Exception {
        User user = new User("area88");
        ICoupon eventCoupon = new StubCoupon();
        user.addCoupon(eventCoupon);
        ICoupon lastCoupon = user.getLastOccupiedCoupon();

        assertEquals(7, lastCoupon.getDiscountPercent());
        assertEquals("VIP 쿠폰", lastCoupon.getName());
    }

    @Test
    public void testGetOrderPrice_discountableItem() throws Exception {
        PriceCalculator calculator = new PriceCalculator();
        Item item = new Item("LightSavor", "부엌칼", 100000);
        ICoupon coupon = new StubCoupon();

        assertEquals(93000, calculator.getOrderPrice(item, coupon));
    }

    @Test
    public void testGetOrderPrice_undiscountableItem() throws Exception {
        PriceCalculator calculator = new PriceCalculator();
        Item item = new Item("R2D2", "알람시계", 20000);
        ICoupon coupon = new StubCoupon();

        assertEquals(20000, calculator.getOrderPrice(item, coupon));
    }
}