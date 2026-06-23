package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class kt1 extends mt1 {
    public int[] j;
    public long[] k;
    public double[] l;
    public String[] m;
    public byte[][] n;
    public Cursor o;

    public static void l(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            kk1.S(25, "column index out of range");
            throw null;
        }
    }

    @Override // defpackage.aj1
    public final void b(int i) {
        a();
        e(5, i);
        this.j[i] = 5;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.i) {
            a();
            this.j = new int[0];
            this.k = new long[0];
            this.l = new double[0];
            this.m = new String[0];
            this.n = new byte[0][];
            reset();
        }
        this.i = true;
    }

    @Override // defpackage.aj1
    public final void d(int i, long j) {
        a();
        e(1, i);
        this.j[i] = 1;
        this.k[i] = j;
    }

    public final void e(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.j;
        if (iArr.length < i3) {
            this.j = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.k;
            if (jArr.length < i3) {
                this.k = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.l;
            if (dArr.length < i3) {
                this.l = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.m;
            if (strArr.length < i3) {
                this.m = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.n;
        if (bArr.length < i3) {
            this.n = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // defpackage.aj1
    public final void f(int i, byte[] bArr) {
        a();
        e(4, i);
        this.j[i] = 4;
        this.n[i] = bArr;
    }

    @Override // defpackage.aj1
    public final byte[] getBlob(int i) {
        a();
        Cursor m = m();
        l(m, i);
        byte[] blob = m.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // defpackage.aj1
    public final int getColumnCount() {
        a();
        j();
        Cursor cursor = this.o;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.aj1
    public final String getColumnName(int i) {
        a();
        j();
        Cursor cursor = this.o;
        if (cursor == null) {
            c.n("Required value was null.");
            return null;
        }
        l(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.aj1
    public final long getLong(int i) {
        a();
        Cursor m = m();
        l(m, i);
        return m.getLong(i);
    }

    @Override // defpackage.aj1
    public final String h(int i) {
        a();
        Cursor m = m();
        l(m, i);
        String string = m.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.aj1
    public final boolean isNull(int i) {
        a();
        Cursor m = m();
        l(m, i);
        return m.isNull(i);
    }

    public final void j() {
        if (this.o == null) {
            this.o = this.g.v(new h70(this));
        }
    }

    public final Cursor m() {
        Cursor cursor = this.o;
        if (cursor != null) {
            return cursor;
        }
        kk1.S(21, "no row");
        throw null;
    }

    @Override // defpackage.aj1
    public final void reset() {
        a();
        Cursor cursor = this.o;
        if (cursor != null) {
            cursor.close();
        }
        this.o = null;
    }

    @Override // defpackage.aj1
    public final void s(int i, String str) {
        str.getClass();
        a();
        e(3, i);
        this.j[i] = 3;
        this.m[i] = str;
    }

    @Override // defpackage.aj1
    public final boolean w() {
        a();
        j();
        Cursor cursor = this.o;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        c.n("Required value was null.");
        return false;
    }
}
