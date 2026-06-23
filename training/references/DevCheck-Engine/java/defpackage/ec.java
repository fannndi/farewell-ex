package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ec implements Parcelable {
    public static final Parcelable.Creator<ec> CREATOR = new d(7);
    public Integer A;
    public Integer B;
    public Integer C;
    public Integer D;
    public Integer E;
    public Integer F;
    public Integer G;
    public Integer H;
    public Integer I;
    public Boolean J;
    public Integer K;
    public int g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Integer n;
    public String p;
    public Locale t;
    public CharSequence u;
    public CharSequence v;
    public int w;
    public int x;
    public Integer y;
    public int o = 255;
    public int q = -2;
    public int r = -2;
    public int s = -2;
    public Boolean z = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.g);
        parcel.writeSerializable(this.h);
        parcel.writeSerializable(this.i);
        parcel.writeSerializable(this.j);
        parcel.writeSerializable(this.k);
        parcel.writeSerializable(this.l);
        parcel.writeSerializable(this.m);
        parcel.writeSerializable(this.n);
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        CharSequence charSequence = this.u;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.v;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.w);
        parcel.writeSerializable(this.y);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.E);
        parcel.writeSerializable(this.F);
        parcel.writeSerializable(this.I);
        parcel.writeSerializable(this.G);
        parcel.writeSerializable(this.H);
        parcel.writeSerializable(this.z);
        parcel.writeSerializable(this.t);
        parcel.writeSerializable(this.J);
        parcel.writeSerializable(this.K);
    }
}
