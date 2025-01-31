package io.xpring;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for {@link Utils}.
 */
public class UtilsTest {

    @Test
    public void testIsValidAddressValidAddress() {
        assertTrue(Utils.isValidAddress("rU6K7V3Po4snVhBBaU29sesqs2qTQJWDw1"));
    }

    @Test
    public void testIsValidAddressInvalidAlphabet() {
        assertFalse(Utils.isValidAddress("1EAG1MwmzkG6gRZcYqcRMfC17eMt8TDTit"));
    }

    @Test
    public void testIsvValidAddressInvlalidChecksum() {
        assertFalse(Utils.isValidAddress("rU6K7V3Po4sBBBBBaU29sesqs2qTQJWDw1"));
    }

    @Test
    public void testIsValidAddressInvalidCharacters() {
        assertFalse(Utils.isValidAddress("rU6K7V3Po4sBBBBBaU@#$%qs2qTQJWDw1"));
    }

    @Test
    public void testIsValidAddressTooLong() {
        assertFalse(Utils.isValidAddress("rU6K7V3Po4snVhBBaU29sesqs2qTQJWDw1rU6K7V3Po4snVhBBaU29sesqs2qTQJWDw1"));
    }

    @Test
    public void testIsValidAddressTooShort() {
        assertFalse(Utils.isValidAddress("rU6K7V3Po4s2qTQJWDw1"));
    }
}
