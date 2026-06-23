package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import flar2.devcheck.taskmgr.TaskManagerActivity;

/* loaded from: classes.dex */
public final class ca1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f116a;
    public final PackageManager b;
    public final Handler c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final qy0 e = new qy0();
    public final LruCache f = new LruCache(rt0.t);
    public volatile boolean g = false;
    public final SparseIntArray h = new SparseIntArray();

    public ca1(TaskManagerActivity taskManagerActivity) {
        this.f116a = taskManagerActivity.getApplicationContext();
        this.b = taskManagerActivity.getPackageManager();
        HandlerThread handlerThread = new HandlerThread("ProcSampler");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
    }
}
