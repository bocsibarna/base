import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class TrainControllerTest {

    @Test
    void veszfek_shouldSetSpeedLimit() {
        // Arrange
        TrainController kontroller = mock(TrainController.class);
        TrainControllerTest testInstance = new TrainControllerTest();

        // Act
        testInstance.veszfek(kontroller);

        // Assert
        verify(kontroller, times(1)).setSpeedLimit(anyDouble());
    }


}
