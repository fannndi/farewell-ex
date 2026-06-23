package defpackage;

import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseArray;
import android.util.SparseIntArray;
import flar2.devcheck.taskmgr2.TaskManager2Activity;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ba1 {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f74a;
    public final Handler b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final qy0 d = new qy0();
    public final LruCache e = new LruCache(rt0.t);
    public volatile boolean f = false;
    public final SparseIntArray g = new SparseIntArray();
    public volatile SparseArray h = new SparseArray();
    public volatile long i = 30000;
    public volatile long j = 0;
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final ExecutorService l = Executors.newSingleThreadExecutor(new xf(2));
    public boolean m = true;

    public ba1(TaskManager2Activity taskManager2Activity) {
        taskManager2Activity.getApplicationContext();
        this.f74a = taskManager2Activity.getPackageManager();
        HandlerThread handlerThread = new HandlerThread("ProcSampler2");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
    }

    public static int[] b(List list) {
        int i;
        int size = list.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            ia1 ia1Var = (ia1) list.get(i3);
            if (ia1Var != null && (i = ia1Var.g) > 0) {
                iArr[i2] = i;
                i2++;
            }
        }
        return i2 == size ? iArr : Arrays.copyOf(iArr, i2);
    }

    public final void a(int[] iArr, List list) {
        int i;
        if (list == null || list.isEmpty()) {
            return;
        }
        SparseArray sparseArray = new SparseArray(iArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p91 p91Var = (p91) it.next();
            if (p91Var != null && (i = p91Var.g) > 0 && p91Var.h > 0) {
                sparseArray.put(i, p91Var);
            }
        }
        this.h = sparseArray;
        this.j = System.currentTimeMillis();
    }
}
