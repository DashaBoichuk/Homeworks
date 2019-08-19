package com.company.practical.tasks.task2;


import static javafx.scene.input.KeyCode.T;

public class Plants {
    int size;
    Color color;
    Type type;

    public Plants(int size, Color color, Type type) throws ColorException {
        if (color.equals(Color.BLUE)) throw new ColorException("Color is not allowed");
        this.size = size;
        this.color = color;
        this.type = type;

    }

    public boolean containsColor(String test) {
        for ( Color color : Color.values()) {
            if (color.name().equals(test)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsType(String test) {
        for ( Type color : Type.values()) {
            if (color.name().equals(test)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Plants{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
