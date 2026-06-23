package defpackage;

import android.content.Context;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class go1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f347a;
    public final Context b;
    public final CopyOnWriteArrayList c;
    public volatile Boolean d;

    public go1(Context context, int i) {
        this.f347a = i;
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                this.c = new CopyOnWriteArrayList();
                this.b = context.getApplicationContext();
                try {
                    do1.a(new io1(this));
                    jo1 jo1Var = new jo1(this);
                    synchronized (do1.i) {
                        do1.j.add(new bo1(jo1Var));
                    }
                } catch (Throwable unused) {
                }
                try {
                    do1.b(new ho1(0, this));
                } catch (Throwable unused2) {
                }
                if (d()) {
                    fo1.a(this.b);
                    break;
                }
                break;
            default:
                this.c = new CopyOnWriteArrayList();
                this.b = context.getApplicationContext();
                break;
        }
    }

    private final void e() {
    }

    public void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean b() {
        switch (this.f347a) {
            case 0:
                return c();
            default:
                try {
                    if (do1.f203a == null) {
                        if (!do1.i()) {
                            return false;
                        }
                    }
                    return true;
                } catch (Throwable unused) {
                    return false;
                }
        }
    }

    public final boolean c() {
        int i = this.f347a;
        boolean z = true;
        String str = ILBLnlCHDVqsSN.fYUvVzuEDaP;
        String str2 = bOxzFZXgEkjph.csxVTxoUxTu;
        switch (i) {
            case 0:
                Boolean bool = this.d;
                if (bool == null) {
                    try {
                        try {
                            try {
                                this.b.getPackageManager().getPackageInfo("moe.shizuku.privileged.api", 0);
                            } catch (Exception unused) {
                                this.b.getPackageManager().getPackageInfo(str, 0);
                            }
                        } catch (Exception unused2) {
                            z = false;
                        }
                    } catch (Exception unused3) {
                        this.b.getPackageManager().getPackageInfo(str2, 0);
                    }
                    this.d = Boolean.valueOf(z);
                    break;
                } else {
                    break;
                }
            default:
                Boolean bool2 = this.d;
                if (bool2 == null) {
                    try {
                        try {
                            try {
                                this.b.getPackageManager().getPackageInfo("moe.shizuku.privileged.api", 0);
                            } catch (Exception unused4) {
                                this.b.getPackageManager().getPackageInfo(str, 0);
                            }
                        } catch (Exception unused5) {
                            z = false;
                        }
                    } catch (Exception unused6) {
                        this.b.getPackageManager().getPackageInfo(str2, 0);
                    }
                    this.d = Boolean.valueOf(z);
                    break;
                } else {
                    break;
                }
        }
        return z;
    }

    public final boolean d() {
        switch (this.f347a) {
            case 0:
                break;
            default:
                if (b()) {
                    try {
                        if (do1.f() == 0) {
                        }
                    } catch (Throwable unused) {
                        return false;
                    }
                }
                break;
        }
        return false;
    }
}
