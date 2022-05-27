package mediaDB;

import java.math.BigDecimal;
import java.time.Duration;

public interface MediaContent extends Content {
    //falscher Typ, wird hier aus didaktischen Gründen verwendet
    BigDecimal getBitrate();
    BigDecimal getSize();
    Duration getLength();
}
