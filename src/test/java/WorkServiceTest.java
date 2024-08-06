import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class WorkServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/work.csv")
    public void WorkAndRest(int expected, int income, int expenses, int threshold) {
        WorkService service = new WorkService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}