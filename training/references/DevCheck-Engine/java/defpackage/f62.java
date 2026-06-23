package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class f62 extends e62 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public f62(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new p9(0), new p9(0), new p9(0));
    }

    public f62(Parcel parcel, int i, int i2, String str, p9 p9Var, p9 p9Var2, p9 p9Var3) {
        super(p9Var, p9Var2, p9Var3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }

    @Override // defpackage.e62
    public final f62 a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new f62(parcel, dataPosition, i, d51.u(new StringBuilder(), this.h, "  "), this.f224a, this.b, this.c);
    }

    @Override // defpackage.e62
    public final boolean e(int i) {
        while (true) {
            int i2 = this.j;
            int i3 = this.k;
            if (i2 >= this.g) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
    }

    @Override // defpackage.e62
    public final void i(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }
}
