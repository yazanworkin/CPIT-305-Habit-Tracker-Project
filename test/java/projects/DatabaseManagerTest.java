
package projects;

import org.junit.jupiter.api.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DatabaseManagerTest {

    private static int testHabitId;

    @BeforeAll
    public static void setupDatabase() {
        DatabaseManager.initializeDB();
        DatabaseManager.deleteAllHabits(); // Ensure clean DB
    }

    @Test
    @Order(1)
    public void testAddHabit() {
        DatabaseManager.addHabit("Test Habit", 3, "Mon,Tue");
        List<Habit> habits = DatabaseManager.getAllHabits();
        assertEquals(1, habits.size(), "Should have one habit added");

        Habit h = habits.get(0);
        testHabitId = h.getId(); // Store for later tests
        assertEquals("Test Habit", h.getName());
        assertEquals(3, h.getTargetPerWeek());
        assertEquals(0, h.getCurrentCount());
        assertEquals("Mon,Tue", h.getReminderDays());
    }

    @Test
    @Order(2)
    public void testUpdateHabit() {
        DatabaseManager.updateHabit(testHabitId, "Updated Habit", 5, "Wed,Thu");
        Habit h = DatabaseManager.getAllHabits().get(0);

        assertEquals("Updated Habit", h.getName());
        assertEquals(5, h.getTargetPerWeek());
        assertEquals("Wed,Thu", h.getReminderDays());
    }

    @Test
    @Order(3)
    public void testIncrementHabit() {
        DatabaseManager.incrementHabit(testHabitId);
        Habit h = DatabaseManager.getAllHabits().get(0);
        assertEquals(1, h.getCurrentCount(), "Habit count should be incremented to 1");
    }

    @Test
    @Order(4)
    public void testResetHabitProgress() {
        DatabaseManager.resetHabitProgress(testHabitId);
        Habit h = DatabaseManager.getAllHabits().get(0);
        assertEquals(0, h.getCurrentCount(), "Habit count should be reset to 0");
    }

    @Test
    @Order(5)
    public void testDeleteHabit() {
        DatabaseManager.deleteHabit(testHabitId);
        List<Habit> habits = DatabaseManager.getAllHabits();
        assertTrue(habits.isEmpty(), "Habit should be deleted");
    }

    @AfterAll
    public static void cleanup() {
        DatabaseManager.deleteAllHabits();
    }
}
