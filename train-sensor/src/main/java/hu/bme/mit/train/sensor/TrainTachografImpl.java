package hu.bme.mit.train.sensor;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class TrainTachografImpl implements TrainTachograf {
    private int time;
    private int joystickPosition;
    private int referenceSpeed;
    private Table<Integer, Integer, Integer> tachografTable;

    public TrainTachografImpl() {
        // Default constructor (no arguments)
        tachografTable = HashBasedTable.create();
    }

    public TrainTachografImpl(int time, int joystickPosition, int referenceSpeed) {
        this.time = time;
        this.joystickPosition = joystickPosition;
        this.referenceSpeed = referenceSpeed;
        tachografTable = HashBasedTable.create();
    }

    // Getters
    public int getTime() {
        return time;
    }

    public int getJoystickPosition() {
        return joystickPosition;
    }

    public int getReferenceSpeed() {
        return referenceSpeed;
    }

    // Setters
    public void setTime(int time) {
        this.time = time;
    }

    public void setJoystickPosition(int joystickPosition) {
        this.joystickPosition = joystickPosition;
    }

    public void setReferenceSpeed(int referenceSpeed) {
        this.referenceSpeed = referenceSpeed;
    }

    // Save data to the Guava Table
    public void saveDataToTable(int rowKey, int columnKey, int value) {
        tachografTable.put(rowKey, columnKey, value);
    }

    // Retrieve data from the Guava Table
    public int getDataFromTable(int rowKey, int columnKey) {
        return tachografTable.get(rowKey, columnKey);
    }
}

