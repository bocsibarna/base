package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    @Before
    void setUp() {
        mockController = mock(TrainController.class);
        mockUser = mock(TrainUser.class);
        trainSensor = new TrainSensorImpl(mockController, mockUser);
    }

    @Test
    void getSpeedLimit_shouldReturnInitialSpeedLimit() {
        // Arrange
        int expectedSpeedLimit = 5;

        // Act
        int actualSpeedLimit = trainSensor.getSpeedLimit();

        // Assert
        assertEquals(expectedSpeedLimit, actualSpeedLimit);
    }

    
}
