package defpackage;

import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;

/* loaded from: classes.dex */
public final class l50 {

    /* renamed from: a, reason: collision with root package name */
    public final k50 f573a;

    static {
        new l50(0, "", 0);
    }

    public l50(int i, String str, int i2) {
        this.f573a = new k50(i, str, i2);
    }

    public static l50 a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String sb;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            StringBuilder sb2 = new StringBuilder("M0,");
            sb2.append(i8);
            String str = GFUHKHDfiFuPm.phRAnipQNdnn;
            sb2.append(str);
            sb2.append(i7);
            sb2.append(",");
            sb2.append(i8);
            sb2.append(" 0 1,1 ");
            sb2.append(i);
            sb2.append(",");
            sb2.append(i8);
            sb2.append(str);
            sb2.append(i7);
            sb2.append(",");
            sb2.append(i8);
            sb2.append(bPnJ.xquKozmhwoVUxRK);
            sb2.append(i8);
            sb2.append(" Z");
            sb = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder("M ");
            int min = Math.min(i / 2, i2 / 2);
            int min2 = Math.min(min, i3);
            int min3 = Math.min(min, i4);
            int min4 = Math.min(min, i5);
            int min5 = Math.min(min, i6);
            sb3.append(min2);
            sb3.append(",0 L ");
            sb3.append(i - min3);
            sb3.append(",0");
            if (min3 > 0) {
                sb3.append(" A ");
                sb3.append(min3);
                sb3.append(",");
                sb3.append(min3);
                sb3.append(" 0 0,1 ");
                sb3.append(i);
                sb3.append(",");
                sb3.append(min3);
            }
            sb3.append(" L ");
            sb3.append(i);
            sb3.append(",");
            sb3.append(i2 - min4);
            if (min4 > 0) {
                sb3.append(" A ");
                sb3.append(min4);
                sb3.append(",");
                sb3.append(min4);
                sb3.append(" 0 0,1 ");
                sb3.append(i - min4);
                sb3.append(",");
                sb3.append(i2);
            }
            sb3.append(" L ");
            sb3.append(min5);
            sb3.append(",");
            sb3.append(i2);
            if (min5 > 0) {
                sb3.append(" A ");
                sb3.append(min5);
                sb3.append(",");
                sb3.append(min5);
                sb3.append(" 0 0,1 0,");
                sb3.append(i2 - min5);
            }
            if (min2 > 0) {
                sb3.append(" L 0,");
                sb3.append(min2);
                sb3.append(" A ");
                sb3.append(min2);
                sb3.append(",");
                sb3.append(min2);
                sb3.append(" 0 0,1 ");
                sb3.append(min2);
                sb3.append(",0");
            }
            sb3.append(" Z");
            sb = sb3.toString();
        }
        return new l50(i, sb, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l50) {
            return this.f573a.equals(((l50) obj).f573a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f573a.hashCode();
    }

    public final String toString() {
        return this.f573a.toString();
    }
}
