package control;

import Control.Woofer;

public class MartenWoofer implements Woofer {
    @Override
    public void baseSound() {
        System.out.println("Marten Woofer: 웅~ 웅~ 웅~");
    }
}