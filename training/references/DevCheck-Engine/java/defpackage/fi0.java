package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.PowerManager$OnThermalStatusChangedListener;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfo;
import android.telephony.CellInfoNr;

/* loaded from: classes.dex */
public abstract /* synthetic */ class fi0 {
    public static /* bridge */ /* synthetic */ boolean C(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoNr;
    }

    public static /* synthetic */ Typeface.CustomFallbackBuilder g(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    public static /* synthetic */ FontFamily.Builder i(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* bridge */ /* synthetic */ PowerManager$OnThermalStatusChangedListener j(Object obj) {
        return (PowerManager$OnThermalStatusChangedListener) obj;
    }

    public static /* bridge */ /* synthetic */ CellIdentityNr l(Object obj) {
        return (CellIdentityNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellInfoNr m(CellInfo cellInfo) {
        return (CellInfoNr) cellInfo;
    }

    public static /* bridge */ /* synthetic */ boolean w(CellInfo cellInfo) {
        return cellInfo instanceof CellInfoNr;
    }

    public static /* synthetic */ FontFamily.Builder z(Font font) {
        return new FontFamily.Builder(font);
    }
}
