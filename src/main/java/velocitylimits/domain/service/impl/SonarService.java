package velocitylimits.domain.service.impl;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class SonarService {

    public Long getTime() {
        return System.nanoTime();
    }

    public Long getEndTime(Long startTime) {
        return (System.nanoTime() - startTime) / 1000000000;
    }
}
