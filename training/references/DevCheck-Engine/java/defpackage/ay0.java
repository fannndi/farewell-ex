package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ay0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<ay0> CREATOR = new d(27);
    public final Calendar g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final long l;
    public String m;

    public ay0(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = l52.a(calendar);
        this.g = a2;
        this.h = a2.get(2);
        this.i = a2.get(1);
        this.j = a2.getMaximum(7);
        this.k = a2.getActualMaximum(5);
        this.l = a2.getTimeInMillis();
    }

    public static ay0 a(int i, int i2) {
        Calendar c = l52.c(null);
        c.set(1, i);
        c.set(2, i2);
        return new ay0(c);
    }

    public static ay0 b(long j) {
        Calendar c = l52.c(null);
        c.setTimeInMillis(j);
        return new ay0(c);
    }

    public final String c() {
        if (this.m == null) {
            long timeInMillis = this.g.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = l52.f574a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.m = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.m;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.g.compareTo(((ay0) obj).g);
    }

    public final int d(ay0 ay0Var) {
        if (this.g instanceof GregorianCalendar) {
            return (ay0Var.h - this.h) + ((ay0Var.i - this.i) * 12);
        }
        c.m("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay0)) {
            return false;
        }
        ay0 ay0Var = (ay0) obj;
        return this.h == ay0Var.h && this.i == ay0Var.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.i);
        parcel.writeInt(this.h);
    }
}
