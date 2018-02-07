/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gydo194.animalkingdom;

/**
 *
 * @author gydo194
 */
public class Test<T extends Animal> {
    private T t;
    public void setValue(T t) {
        this.t = t;
    }
    public T getValue() {
        return t;
    }
    
    
    
    
}