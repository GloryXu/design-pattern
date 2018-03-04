package chapter11.bridge.implementor;

import chapter11.bridge.advance.Product;

public class IPod extends Product {
    public void beProducted() {
        System.out.println("生产出的iPod是这个样子的...");
    }

    public void beSelled() {
        System.out.println("生产出的iPod卖出去了...");
    }
}