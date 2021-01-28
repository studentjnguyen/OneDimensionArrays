package org.horizoncolumbus.hs;

import java.awt.*;
import java.net.URI;

public class Main2 {
    public static void main(String[] args) {

        String[] stringArray = new String[3];
        stringArray[0] = "https://classroom.google.com/u/0/h";
        stringArray[1] = "https://zoom.us/signin";
        stringArray[2] = "https://www.youtube.com/watch?v=s49CT4DTAkw";

        for(int i = 0; i < stringArray.length; i++){
            try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI(stringArray[i]);
                desktop.browse(oURL);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

