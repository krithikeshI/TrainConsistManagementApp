

import main.UseCase9TrainConsistMgmt;
import main.UseCase9TrainConsistMgmt.Bogie;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase9TrainConsistMgmtTest {

    @Test
    void testGrouping() {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60)
        );

        Map<String, List<Bogie>> result =
                UseCase9TrainConsistMgmt.groupBogiesByType(bogies);

        assertEquals(2, result.get("Sleeper").size());
        assertTrue(result.containsKey("AC Chair"));
    }
}