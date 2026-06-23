package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class py implements mj1 {

    /* renamed from: a, reason: collision with root package name */
    public final kp f813a;
    public final ku1 b;
    public final int c;
    public final ArrayList d;
    public final int e;
    public final long[] f;
    public final long[] g;
    public final long[] h;
    public boolean i;
    public RandomAccessFile j;
    public boolean k;
    public final StringBuilder l = new StringBuilder(rt0.t);

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[Catch: all -> 0x00b9, TryCatch #1 {all -> 0x00b9, blocks: (B:3:0x0021, B:5:0x0027, B:7:0x002f, B:8:0x0037, B:10:0x003d, B:12:0x004d, B:13:0x005a, B:16:0x0060, B:19:0x0066, B:20:0x0070, B:22:0x0074, B:25:0x007a, B:26:0x0084, B:28:0x0088, B:30:0x008e, B:32:0x00a6, B:33:0x0091, B:41:0x0055), top: B:2:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public py(defpackage.kp r10, defpackage.ku1 r11) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py.<init>(kp, ku1):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f4, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x020a, code lost:
    
        if (r9 >= 4) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    @Override // defpackage.mj1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py.a():void");
    }

    @Override // defpackage.mj1
    public final void close() {
        RandomAccessFile randomAccessFile = this.j;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
            this.j = null;
        }
    }
}
