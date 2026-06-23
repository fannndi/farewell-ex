package defpackage;

import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class qs {

    /* renamed from: a, reason: collision with root package name */
    public final ps f859a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final boolean j;
    public final int k;
    public final int l;

    public qs(boolean z, String... strArr) {
        byte[] bArr;
        this.j = z;
        int i = 0;
        for (String str : strArr) {
            if (this.j) {
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                byte[][] bArr2 = {kk1.r((short) str.length()), kk1.r((short) bytes.length), bytes, new byte[]{0}};
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    i2 += bArr2[i3].length;
                }
                bArr = new byte[i2];
                int i4 = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    byte[] bArr3 = bArr2[i5];
                    System.arraycopy(bArr3, 0, bArr, i4, bArr3.length);
                    i4 += bArr3.length;
                }
            } else {
                char[] charArray = str.toCharArray();
                int length = charArray.length * 2;
                byte[] bArr4 = new byte[length + 4];
                byte[] P = kk1.P((short) charArray.length);
                bArr4[0] = P[0];
                bArr4[1] = P[1];
                for (int i6 = 0; i6 < charArray.length; i6++) {
                    byte[] i7 = kk1.i(charArray[i6]);
                    int i8 = i6 * 2;
                    bArr4[i8 + 2] = i7[0];
                    bArr4[i8 + 3] = i7[1];
                }
                bArr4[length + 2] = 0;
                bArr4[length + 3] = 0;
                bArr = bArr4;
            }
            Pair pair = new Pair(bArr, Collections.EMPTY_LIST);
            this.f.add(Integer.valueOf(i));
            byte[] bArr5 = (byte[]) pair.first;
            i += bArr5.length;
            this.h.add(bArr5);
            this.i.add((List) pair.second);
        }
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            List list = (List) obj;
            Iterator it = list.iterator();
            if (it.hasNext()) {
                if (it.next() == null) {
                    this.f.add(Integer.valueOf(i));
                    throw null;
                }
                rw.b();
                throw null;
            }
            this.g.add(Integer.valueOf(i9));
            i9 += (list.size() * 12) + 4;
        }
        int i11 = i % 4;
        int i12 = i11 == 0 ? 0 : 4 - i11;
        this.k = i12;
        int size2 = this.h.size();
        this.b = size2;
        this.c = this.h.size() - strArr.length;
        boolean z2 = this.h.size() - strArr.length > 0;
        if (!z2) {
            this.g.clear();
            this.i.clear();
        }
        int size3 = (this.g.size() * 4) + (size2 * 4) + 28;
        this.d = size3;
        int i13 = i + i12;
        this.e = z2 ? size3 + i13 : 0;
        int i14 = size3 + i13 + (z2 ? i9 : 0);
        this.l = i14;
        this.f859a = new ps((short) 1, (short) 28, i14);
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream) {
        this.f859a.a(byteArrayOutputStream);
        byteArrayOutputStream.write(kk1.a(this.b));
        byteArrayOutputStream.write(kk1.a(this.c));
        int i = 0;
        byteArrayOutputStream.write(kk1.a(this.j ? rt0.t : 0));
        byteArrayOutputStream.write(kk1.a(this.d));
        byteArrayOutputStream.write(kk1.a(this.e));
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            byteArrayOutputStream.write(kk1.a(((Integer) obj).intValue()));
        }
        ArrayList arrayList2 = this.g;
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            byteArrayOutputStream.write(kk1.a(((Integer) obj2).intValue()));
        }
        ArrayList arrayList3 = this.h;
        int size3 = arrayList3.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList3.get(i4);
            i4++;
            byteArrayOutputStream.write((byte[]) obj3);
        }
        int i5 = this.k;
        if (i5 > 0) {
            byteArrayOutputStream.write(new byte[i5]);
        }
        ArrayList arrayList4 = this.i;
        int size4 = arrayList4.size();
        while (i < size4) {
            Object obj4 = arrayList4.get(i);
            i++;
            Iterator it = ((List) obj4).iterator();
            if (it.hasNext()) {
                throw d51.l(it);
            }
            byteArrayOutputStream.write(kk1.a(-1));
        }
    }
}
