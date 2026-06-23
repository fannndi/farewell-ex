package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import flar2.devcheck.MainApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class l61 extends ew0 {
    public static l61 s;
    public final WeakReference n;
    public final ExecutorService o;
    public final y7 p;
    public final PackageManager q;
    public final qy0 r;

    public l61(Context context) {
        super(0);
        WeakReference weakReference = new WeakReference(context);
        this.n = weakReference;
        this.o = MainApp.h;
        y7 l = y7.l((Context) weakReference.get());
        this.p = l;
        this.q = ((Context) weakReference.get()).getPackageManager();
        this.r = new qy0();
        l(l, new nc(21, this));
    }

    public static int n(ArrayList arrayList, z61 z61Var) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (z61Var.equals(((a71) arrayList.get(i)).d)) {
                return i;
            }
        }
        return -1;
    }

    public final void m(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.o.submit(new ej(this, hashMap2, list, arrayList, hashMap, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:507:0x0c63 A[Catch: Exception -> 0x0cf9, TryCatch #28 {Exception -> 0x0cf9, blocks: (B:3:0x0062, B:6:0x00c8, B:7:0x00e8, B:10:0x012f, B:11:0x014d, B:63:0x049b, B:65:0x04a6, B:67:0x04d1, B:69:0x04d7, B:70:0x04df, B:72:0x04e5, B:75:0x04fb, B:83:0x0506, B:85:0x0517, B:87:0x051d, B:92:0x0522, B:93:0x0528, B:95:0x052e, B:97:0x053a, B:100:0x0547, B:104:0x056b, B:106:0x0581, B:107:0x05a0, B:112:0x05bc, B:478:0x0b44, B:479:0x0b4c, B:481:0x0b52, B:483:0x0b64, B:485:0x0ba0, B:486:0x0baf, B:488:0x0be0, B:490:0x0bf5, B:491:0x0c0a, B:493:0x0c10, B:495:0x0c24, B:497:0x0c30, B:500:0x0c3c, B:503:0x0c48, B:505:0x0c59, B:507:0x0c63, B:508:0x0c6a, B:509:0x0c70, B:511:0x0c76, B:513:0x0c7f, B:515:0x0c85, B:518:0x0ca6, B:520:0x0cb5, B:521:0x0cb7, B:531:0x0cd4), top: B:2:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0c76 A[Catch: Exception -> 0x0cf9, LOOP:8: B:509:0x0c70->B:511:0x0c76, LOOP_END, TryCatch #28 {Exception -> 0x0cf9, blocks: (B:3:0x0062, B:6:0x00c8, B:7:0x00e8, B:10:0x012f, B:11:0x014d, B:63:0x049b, B:65:0x04a6, B:67:0x04d1, B:69:0x04d7, B:70:0x04df, B:72:0x04e5, B:75:0x04fb, B:83:0x0506, B:85:0x0517, B:87:0x051d, B:92:0x0522, B:93:0x0528, B:95:0x052e, B:97:0x053a, B:100:0x0547, B:104:0x056b, B:106:0x0581, B:107:0x05a0, B:112:0x05bc, B:478:0x0b44, B:479:0x0b4c, B:481:0x0b52, B:483:0x0b64, B:485:0x0ba0, B:486:0x0baf, B:488:0x0be0, B:490:0x0bf5, B:491:0x0c0a, B:493:0x0c10, B:495:0x0c24, B:497:0x0c30, B:500:0x0c3c, B:503:0x0c48, B:505:0x0c59, B:507:0x0c63, B:508:0x0c6a, B:509:0x0c70, B:511:0x0c76, B:513:0x0c7f, B:515:0x0c85, B:518:0x0ca6, B:520:0x0cb5, B:521:0x0cb7, B:531:0x0cd4), top: B:2:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0c85 A[Catch: Exception -> 0x0cf9, TryCatch #28 {Exception -> 0x0cf9, blocks: (B:3:0x0062, B:6:0x00c8, B:7:0x00e8, B:10:0x012f, B:11:0x014d, B:63:0x049b, B:65:0x04a6, B:67:0x04d1, B:69:0x04d7, B:70:0x04df, B:72:0x04e5, B:75:0x04fb, B:83:0x0506, B:85:0x0517, B:87:0x051d, B:92:0x0522, B:93:0x0528, B:95:0x052e, B:97:0x053a, B:100:0x0547, B:104:0x056b, B:106:0x0581, B:107:0x05a0, B:112:0x05bc, B:478:0x0b44, B:479:0x0b4c, B:481:0x0b52, B:483:0x0b64, B:485:0x0ba0, B:486:0x0baf, B:488:0x0be0, B:490:0x0bf5, B:491:0x0c0a, B:493:0x0c10, B:495:0x0c24, B:497:0x0c30, B:500:0x0c3c, B:503:0x0c48, B:505:0x0c59, B:507:0x0c63, B:508:0x0c6a, B:509:0x0c70, B:511:0x0c76, B:513:0x0c7f, B:515:0x0c85, B:518:0x0ca6, B:520:0x0cb5, B:521:0x0cb7, B:531:0x0cd4), top: B:2:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0ca6 A[Catch: Exception -> 0x0cf9, TryCatch #28 {Exception -> 0x0cf9, blocks: (B:3:0x0062, B:6:0x00c8, B:7:0x00e8, B:10:0x012f, B:11:0x014d, B:63:0x049b, B:65:0x04a6, B:67:0x04d1, B:69:0x04d7, B:70:0x04df, B:72:0x04e5, B:75:0x04fb, B:83:0x0506, B:85:0x0517, B:87:0x051d, B:92:0x0522, B:93:0x0528, B:95:0x052e, B:97:0x053a, B:100:0x0547, B:104:0x056b, B:106:0x0581, B:107:0x05a0, B:112:0x05bc, B:478:0x0b44, B:479:0x0b4c, B:481:0x0b52, B:483:0x0b64, B:485:0x0ba0, B:486:0x0baf, B:488:0x0be0, B:490:0x0bf5, B:491:0x0c0a, B:493:0x0c10, B:495:0x0c24, B:497:0x0c30, B:500:0x0c3c, B:503:0x0c48, B:505:0x0c59, B:507:0x0c63, B:508:0x0c6a, B:509:0x0c70, B:511:0x0c76, B:513:0x0c7f, B:515:0x0c85, B:518:0x0ca6, B:520:0x0cb5, B:521:0x0cb7, B:531:0x0cd4), top: B:2:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:534:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04a6 A[Catch: Exception -> 0x0cf9, TryCatch #28 {Exception -> 0x0cf9, blocks: (B:3:0x0062, B:6:0x00c8, B:7:0x00e8, B:10:0x012f, B:11:0x014d, B:63:0x049b, B:65:0x04a6, B:67:0x04d1, B:69:0x04d7, B:70:0x04df, B:72:0x04e5, B:75:0x04fb, B:83:0x0506, B:85:0x0517, B:87:0x051d, B:92:0x0522, B:93:0x0528, B:95:0x052e, B:97:0x053a, B:100:0x0547, B:104:0x056b, B:106:0x0581, B:107:0x05a0, B:112:0x05bc, B:478:0x0b44, B:479:0x0b4c, B:481:0x0b52, B:483:0x0b64, B:485:0x0ba0, B:486:0x0baf, B:488:0x0be0, B:490:0x0bf5, B:491:0x0c0a, B:493:0x0c10, B:495:0x0c24, B:497:0x0c30, B:500:0x0c3c, B:503:0x0c48, B:505:0x0c59, B:507:0x0c63, B:508:0x0c6a, B:509:0x0c70, B:511:0x0c76, B:513:0x0c7f, B:515:0x0c85, B:518:0x0ca6, B:520:0x0cb5, B:521:0x0cb7, B:531:0x0cd4), top: B:2:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0506 A[Catch: Exception -> 0x0cf9, TryCatch #28 {Exception -> 0x0cf9, blocks: (B:3:0x0062, B:6:0x00c8, B:7:0x00e8, B:10:0x012f, B:11:0x014d, B:63:0x049b, B:65:0x04a6, B:67:0x04d1, B:69:0x04d7, B:70:0x04df, B:72:0x04e5, B:75:0x04fb, B:83:0x0506, B:85:0x0517, B:87:0x051d, B:92:0x0522, B:93:0x0528, B:95:0x052e, B:97:0x053a, B:100:0x0547, B:104:0x056b, B:106:0x0581, B:107:0x05a0, B:112:0x05bc, B:478:0x0b44, B:479:0x0b4c, B:481:0x0b52, B:483:0x0b64, B:485:0x0ba0, B:486:0x0baf, B:488:0x0be0, B:490:0x0bf5, B:491:0x0c0a, B:493:0x0c10, B:495:0x0c24, B:497:0x0c30, B:500:0x0c3c, B:503:0x0c48, B:505:0x0c59, B:507:0x0c63, B:508:0x0c6a, B:509:0x0c70, B:511:0x0c76, B:513:0x0c7f, B:515:0x0c85, B:518:0x0ca6, B:520:0x0cb5, B:521:0x0cb7, B:531:0x0cd4), top: B:2:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0522 A[Catch: Exception -> 0x0cf9, TryCatch #28 {Exception -> 0x0cf9, blocks: (B:3:0x0062, B:6:0x00c8, B:7:0x00e8, B:10:0x012f, B:11:0x014d, B:63:0x049b, B:65:0x04a6, B:67:0x04d1, B:69:0x04d7, B:70:0x04df, B:72:0x04e5, B:75:0x04fb, B:83:0x0506, B:85:0x0517, B:87:0x051d, B:92:0x0522, B:93:0x0528, B:95:0x052e, B:97:0x053a, B:100:0x0547, B:104:0x056b, B:106:0x0581, B:107:0x05a0, B:112:0x05bc, B:478:0x0b44, B:479:0x0b4c, B:481:0x0b52, B:483:0x0b64, B:485:0x0ba0, B:486:0x0baf, B:488:0x0be0, B:490:0x0bf5, B:491:0x0c0a, B:493:0x0c10, B:495:0x0c24, B:497:0x0c30, B:500:0x0c3c, B:503:0x0c48, B:505:0x0c59, B:507:0x0c63, B:508:0x0c6a, B:509:0x0c70, B:511:0x0c76, B:513:0x0c7f, B:515:0x0c85, B:518:0x0ca6, B:520:0x0cb5, B:521:0x0cb7, B:531:0x0cd4), top: B:2:0x0062 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.util.HashMap r46, java.util.List r47, java.util.ArrayList r48, java.util.HashMap r49) {
        /*
            Method dump skipped, instructions count: 3322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l61.o(java.util.HashMap, java.util.List, java.util.ArrayList, java.util.HashMap):void");
    }
}
