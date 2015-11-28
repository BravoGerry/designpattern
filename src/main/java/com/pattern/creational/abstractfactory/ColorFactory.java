/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.creational.abstractfactory;

import com.pattern.creational.factory.Shape;

public class ColorFactory extends AbstractFactory{

    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();

        } else if (colorType.equalsIgnoreCase("GREEN")) {
            return new Green();

        } else if (colorType.equalsIgnoreCase("RED")) {
            return new Red();
        }

        return null;
    }

    @Override
    Shape getShape(String shape) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
