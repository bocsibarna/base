import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class TrainSensorImplTest {

    private TrainController mockController;
    private TrainUser mockUser;
    private TrainSensorImpl trainSensor;

    @BeforeEach
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

    @Test
    void overrideSpeedLimit_shouldUpdateSpeedLimitAndCallController() {
        // Arrange
        int newSpeedLimit = 10;

        // Act
        trainSensor.overrideSpeedLimit(newSpeedLimit);

        // Assert
        assertEquals(newSpeedLimit, trainSensor.getSpeedLimit());
        verify(mockController, times(1)).setSpeedLimit(newSpeedLimit);
    }

    // Additional tests can be added here if needed
}
