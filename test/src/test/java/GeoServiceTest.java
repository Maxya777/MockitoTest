import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.geo.GeoServiceImpl;


public class GeoServiceTest {

        @Test
        void byIpTest() {
                GeoServiceImpl geoService = new GeoServiceImpl();
                String ip = "172.132.13.13";

                Assertions.assertNotNull(ip);
                Assertions.assertEquals(Country.RUSSIA, geoService.byIp(ip).getCountry());
        }

        @Test
        void byCoordinatesTest() {
                GeoServiceImpl geo = new GeoServiceImpl();

                Assertions.assertThrows(RuntimeException.class,
                        () -> geo.byCoordinates(1.23, 3), "Not Implemented");

        }
}
