// Megan Wheeler
// Assignment 6.2
// 1 February 2025

// Follow the directions below:
// Write a program with a class titled Fan. This class is to contain:
// 1. Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to hold the
// values of 0, 1, 2, and 3 respectively. 
// 2. A private field named speed that holds one of the constant values with the default
// being STOPPED. 
// 3. A private Boolean field titled on that specifies whether the fan is on or off. 
// 4. A private field named radius that holds the radius of the fan with a default value of 6. 
// 5. A String field that holds the color, with the default being white. 
// 6. Setter and getter methods for all mutable fields. 
// 7. A no-argument constructor that sets all fields with a default value. 
// 8. A constructor takes arguments and sets values. 
// 9. Write a toString() method that returns a description of the Fans state.

// 10. Write test code that creates two instances of the Fan class, one using the default
// constructor and the other using the argument constructor. Write code that displays
// the functionality of the Fan class methods.

public class Fan {
    // Declare constants
    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    // Declare private variables
    private int speed;
    private boolean isOn;
    private int radius;
    private String color;

    // Default value constructor

    // Method to describe the state of the fan

    // Getter and setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // Getter and setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    // Getter and setter for isOn
    public boolean isIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }
    // Getter and setter for radius
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Fan() {
        this.speed = STOPPED;
        this.isOn = false;
        this.radius = 6;
        this.color = "white";
    }

    public Fan(int speed, boolean isOn, int radius, String color) {
        this.speed = speed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        String speedStr = null;
        if (this.speed == STOPPED && this.isOn == false) {
            speedStr = "stopped";
        }
        else if(this.speed == SLOW && this.isOn == true) {
            speedStr = "slow";
        }
        else if (this.speed == MEDIUM && this.isOn == true) {
            speedStr = "medium";
        }
        else if (this.speed == FAST && this.isOn == true) {
            speedStr = "fast";
        }

        return "speed: " + speedStr + ", is on: " + String.valueOf(this.isOn) + ", radius: " + String.valueOf(this.radius) + ", and color: " + this.color;
    }
}