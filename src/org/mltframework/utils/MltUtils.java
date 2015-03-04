/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mltframework.utils;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jmrunge
 */
public class MltUtils {
     public static void init() {
        try {
            NativeUtils.loadLibraryFromJar("/org/mltframework/lib/" + System.mapLibraryName("mlt_java"));
        } catch (IOException ex) {
            Logger.getLogger(MltUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
