import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class AnimalLegCountTest {

    @Test
    public void testAllFourLeggedAnimals() {
        List<String> inputAnimals = Arrays.asList("lion", "dog", "cat", "horse", "deer");
        List<String> expectedOutput = Arrays.asList("lion", "dog", "cat", "horse", "deer");

        assertEquals(expectedOutput, AnimalLegCount.filterFourLeggedAnimals(inputAnimals));
        assertEquals(5, AnimalLegCount.countFourLeggedAnimals(inputAnimals));
    }

    @Test
    public void testSomeFourLeggedAnimals() {
        List<String> inputAnimals = Arrays.asList("lion", "monkey", "deer", "snake", "elephant");
        List<String> expectedOutput = Arrays.asList("lion", "deer", "elephant");

        assertEquals(expectedOutput, AnimalLegCount.filterFourLeggedAnimals(inputAnimals));
        assertEquals(3, AnimalLegCount.countFourLeggedAnimals(inputAnimals));
    }

    @Test
    public void testNoFourLeggedAnimals() {
        List<String> inputAnimals = Arrays.asList("parrot", "snake", "worm", "spider", "ant");
        List<String> expectedOutput = Arrays.asList();

        assertEquals(expectedOutput, AnimalLegCount.filterFourLeggedAnimals(inputAnimals));
        assertEquals(0, AnimalLegCount.countFourLeggedAnimals(inputAnimals));
    }

    @Test
    public void testDuplicateFourLeggedAnimals() {
        List<String> inputAnimals = Arrays.asList("lion", "lion", "cat", "cat", "dog");
        List<String> expectedOutput = Arrays.asList("lion", "lion", "cat", "cat", "dog");

        assertEquals(expectedOutput, AnimalLegCount.filterFourLeggedAnimals(inputAnimals));
        assertEquals(5, AnimalLegCount.countFourLeggedAnimals(inputAnimals));
    }

    @Test
    public void testMixedAnimals() {
        List<String> inputAnimals = Arrays.asList("lion", "snake", "cat", "parrot", "horse");
        List<String> expectedOutput = Arrays.asList("lion", "cat", "horse");

        assertEquals(expectedOutput, AnimalLegCount.filterFourLeggedAnimals(inputAnimals));
        assertEquals(3, AnimalLegCount.countFourLeggedAnimals(inputAnimals));
    }

    @Test
    public void testEmptyList() {
        List<String> inputAnimals = Arrays.asList();
        List<String> expectedOutput = Arrays.asList();

        assertEquals(expectedOutput, AnimalLegCount.filterFourLeggedAnimals(inputAnimals));
        assertEquals(0, AnimalLegCount.countFourLeggedAnimals(inputAnimals));
    }
}
