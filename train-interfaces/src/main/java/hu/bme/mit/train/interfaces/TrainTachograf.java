package hu.bme.mit.train.sensor;

import com.google.common.collect.Table;

public interface TrainTachograf {
    // Getters
    int getTime();
    int getJoystickPosition();
    int getReferenceSpeed();

    // Setters
    void setTime(int time);
    void setJoystickPosition(int joystickPosition);
    void setReferenceSpeed(int referenceSpeed);

    // Save data to the Guava Table
    void saveDataToTable(int rowKey, int columnKey, int value);

    // Retrieve data from the Guava Table
    int getDataFromTable(int rowKey, int columnKey);
}