package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class ia1 implements Parcelable {
    public static final Parcelable.Creator<ia1> CREATOR = new i11(9);
    public int g;
    public int h;
    public String i;
    public String j;
    public float k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public int q;
    public long r;
    public long s;
    public long t;
    public int u;
    public int v;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeFloat(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeLong(this.r);
        parcel.writeLong(this.s);
        parcel.writeLong(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
    }
}
