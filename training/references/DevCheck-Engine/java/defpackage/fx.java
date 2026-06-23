package defpackage;

import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import flar2.devcheck.usage.GgP.rlfWzcx;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class fx {
    public static final Pattern k = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern m = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern n = Pattern.compile(ILBLnlCHDVqsSN.rXbGDIuUL);

    /* renamed from: a, reason: collision with root package name */
    public final String f307a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public fx(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.f307a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fx)) {
            return false;
        }
        fx fxVar = (fx) obj;
        return fxVar.f307a.equals(this.f307a) && fxVar.b.equals(this.b) && fxVar.c == this.c && fxVar.d.equals(this.d) && fxVar.e.equals(this.e) && fxVar.f == this.f && fxVar.g == this.g && fxVar.h == this.h && fxVar.i == this.i && ym0.b(fxVar.j, this.j);
    }

    public final int hashCode() {
        int hashCode = (Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.g) + ((Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.c) + ((this.b.hashCode() + ((this.f307a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.j;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f307a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            long j = this.c;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) z00.f1251a.get()).format(new Date(j));
                format.getClass();
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append(rlfWzcx.MwLIkxAwY);
        }
        String str = this.j;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        return sb.toString();
    }
}
