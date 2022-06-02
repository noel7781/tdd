package Accounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @BeforeEach
    public void testAccount() throws Exception {
        Account account = new Account();
        if(account == null) {
            throw new Exception("Account is null");
        }
    }

    @Test
    public void 잔금조회_테스트() {

    }

    @Test
    public void 입금_테스트() {

    }

    @Test
    public void 출금_테스트() {

    }
}
