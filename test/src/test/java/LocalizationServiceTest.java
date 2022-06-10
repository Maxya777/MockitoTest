import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceTest {

    @Test
    void localeTest() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

        Assertions.assertEquals("Welcome", localizationService.locale(Country.USA));
        Assertions.assertEquals("Добро пожаловать", localizationService.locale(Country.RUSSIA));
    }
}
