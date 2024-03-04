package hu.bme.mit.train.sensor;

import com.google.common.collect.Table;
import com.google.common.collect.HashBasedTable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrainTachografTest {
    private TrainTachografImpl tachograf;

    @Before
    public void setUp() {
        tachograf = new TrainTachografImpl();
    }

    @Test
    public void testSaveAndRetrieveData() {
        // Set sample data
        int time = 123;
        int joystickPosition = 456;
        int referenceSpeed = 789;

        // Save data to the table
        tachograf.saveDataToTable(1, 1, time);
        tachograf.saveDataToTable(1, 2, joystickPosition);
        tachograf.saveDataToTable(1, 3, referenceSpeed);

        // Retrieve data from the table
        int retrievedTime = tachograf.getDataFromTable(1, 1);
        int retrievedJoystickPosition = tachograf.getDataFromTable(1, 2);
        int retrievedReferenceSpeed = tachograf.getDataFromTable(1, 3);

        // Check if retrieved data matches the original values
        assertEquals(time, retrievedTime);
        assertEquals(joystickPosition, retrievedJoystickPosition);
        assertEquals(referenceSpeed, retrievedReferenceSpeed);
    }
}