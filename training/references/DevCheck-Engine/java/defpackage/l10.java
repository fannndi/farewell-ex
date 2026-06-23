package defpackage;

import Cwd.YSHrxiHkAFcciU;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class l10 extends c22 {
    public static final i10 c = new i10();

    /* renamed from: a, reason: collision with root package name */
    public final k10 f563a;
    public final ArrayList b;

    public l10(k10 k10Var, int i, int i2) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(k10Var);
        this.f563a = k10Var;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (qn0.f853a >= 9) {
            StringBuilder sb = new StringBuilder();
            if (i == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i == 1) {
                str = "MMMM d, yyyy";
            } else if (i == 2) {
                str = "MMM d, yyyy";
            } else {
                if (i != 3) {
                    c.m(d51.q("Unknown DateFormat style: ", i));
                    throw null;
                }
                str = "M/d/yy";
            }
            sb.append(str);
            sb.append(" ");
            if (i2 == 0 || i2 == 1) {
                str2 = YSHrxiHkAFcciU.Zto;
            } else if (i2 == 2) {
                str2 = "h:mm:ss a";
            } else {
                if (i2 != 3) {
                    c.m(d51.q("Unknown DateFormat style: ", i2));
                    throw null;
                }
                str2 = "h:mm a";
            }
            sb.append(str2);
            arrayList.add(new SimpleDateFormat(sb.toString(), locale));
        }
    }

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        Date b;
        if (ro0Var.Q() == 9) {
            ro0Var.M();
            return null;
        }
        String O = ro0Var.O();
        synchronized (this.b) {
            try {
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        try {
                            b = hl0.b(O, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder w = d51.w("Failed parsing '", O, YHJbtPFAANaPQ.LXBQztYUHbeF);
                            w.append(ro0Var.v(true));
                            throw new no0(w.toString(), e);
                        }
                    }
                    Object obj = arrayList.get(i);
                    i++;
                    DateFormat dateFormat = (DateFormat) obj;
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            b = dateFormat.parse(O);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f563a.a(b);
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            to0Var.D();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            format = dateFormat.format(date);
        }
        to0Var.K(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
