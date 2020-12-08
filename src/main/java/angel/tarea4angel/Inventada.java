/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angel.tarea4angel;

/**
 *
 * @author Ángel
 */
public class Inventada {
    int a,b,c;

    public Inventada(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Inventada() {
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Inventada{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    
}
