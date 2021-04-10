package chapter_5.example_2;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ClientTest {
    private final static Phone MOBILE_PHONE = new Phone("+123456789");
    private final static Phone STATIONARY_PHONE = new Phone("123123123");
    private Client client = new Client();

    @Test
    public void shouldReturnTrueIfClientHasMobile() {
        client.addPhone(MOBILE_PHONE);
        client.addPhone(STATIONARY_PHONE);
        assertTrue(client.hasMobile());
    }
    @Test
    public void shouldReturnFalseIfClientHasNoMobile() {
        client.addPhone(STATIONARY_PHONE);
        assertFalse(client.hasMobile());
    }
}