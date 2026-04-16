package test;

// ✅ IMPORTANT IMPORTS
import main.UseCase8TrainConsisntMgmt;
import main.UseCase8TrainConsisntMgmt.Bogie;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistMgmtTest {

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60),
                new Bogie("First Class", 40)
        );

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogies(bogies, 60);

        assertEquals(1, result.size());
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("First Class", 30),
                new Bogie("AC Chair", 50)
        );

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogies(bogies, 60);

        assertTrue(result.isEmpty());
    }
}