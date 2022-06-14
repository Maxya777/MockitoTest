package geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.geo.GeoServiceImpl;


public class GeoServiceTest {

        @Test
        void byIpTestForTheCountryRussia() {
                GeoServiceImpl geoService = new GeoServiceImpl();
                String ip = "172.132.13.13";

                Assertions.assertNotNull(ip);
                Assertions.assertEquals(Country.RUSSIA, geoService.byIp(ip).getCountry());
        }

        @Test
        void byIpTestForTheCountryUsa() {
                GeoServiceImpl geoService = new GeoServiceImpl();
                String ip = "96.0.33.33";

                Assertions.assertNotNull(ip);
                Assertions.assertEquals(Country.USA, geoService.byIp(ip).getCountry());
        }

        @Test
        void byCoordinatesTest() {
                GeoServiceImpl geo = new GeoServiceImpl();

                Assertions.assertThrows(RuntimeException.class,
                        () -> geo.byCoordinates(1.23, 3), "Not Implemented");

        }
}
