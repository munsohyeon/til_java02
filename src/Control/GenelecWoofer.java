package control;

import Control.Woofer;

public class GenelecWoofer implements Woofer {
    @Override
    public void baseSound() {
        System.out.println("Genelec Woofer: 웅!! 웅!! 웅!!");
    }
}