package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e31 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f218a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public int h;
    public kp j;
    public Bundle l;
    public String n;
    public final boolean o;
    public final Notification p;
    public final ArrayList q;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean i = true;
    public boolean k = false;
    public int m = 0;

    public e31(Context context, String str) {
        Notification notification = new Notification();
        this.p = notification;
        this.f218a = context;
        this.n = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.h = 0;
        this.q = new ArrayList();
        this.o = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0248  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Notification a() {
        /*
            Method dump skipped, instructions count: 1226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e31.a():android.app.Notification");
    }

    public final void c(int i) {
        Notification notification = this.p;
        notification.flags = i | notification.flags;
    }

    public final void d(kp kpVar) {
        if (this.j != kpVar) {
            this.j = kpVar;
            if (((e31) kpVar.h) != this) {
                kpVar.h = this;
                d(kpVar);
            }
        }
    }
}
