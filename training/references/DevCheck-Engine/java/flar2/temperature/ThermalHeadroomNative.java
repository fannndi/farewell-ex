package flar2.devcheck.temperature;

/* loaded from: classes.dex */
public abstract class ThermalHeadroomNative {
    static {
        System.loadLibrary("devcheck");
    }

    public static native float getThermalHeadroom(int i);
}
