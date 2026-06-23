package defpackage;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Handler;
import flar2.devcheck.MainApp;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public class s61 extends a4 {
    public static final Collator k = Collator.getInstance();
    public final ew0 c;
    public final ArrayList d;
    public final y7 e;
    public final ExecutorService f;
    public final Handler g;
    public boolean h;
    public final PackageManager i;
    public final qy0 j;

    public s61(Application application) {
        super(application);
        this.d = new ArrayList();
        qy0 qy0Var = new qy0();
        this.j = qy0Var;
        Application application2 = this.b;
        application2.getClass();
        this.i = application2.getPackageManager();
        this.f = MainApp.h;
        Application application3 = this.b;
        application3.getClass();
        if (l61.s == null) {
            l61.s = new l61(application3);
        }
        l61 l61Var = l61.s;
        Application application4 = this.b;
        application4.getClass();
        this.e = y7.l(application4);
        this.g = new Handler(application.getMainLooper());
        final int i = 0;
        ew0 ew0Var = new ew0(0);
        this.c = ew0Var;
        ew0Var.l(l61Var, new v31(this) { // from class: q61
            public final /* synthetic */ s61 b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i2 = i;
                s61 s61Var = this.b;
                switch (i2) {
                    case 0:
                        synchronized (s61Var.d) {
                            s61Var.f.submit(new r61(s61Var, 1));
                        }
                        return;
                    default:
                        s61Var.f.submit(new r61(s61Var, 0));
                        return;
                }
            }
        });
        final int i2 = 1;
        ew0Var.l(qy0Var, new v31(this) { // from class: q61
            public final /* synthetic */ s61 b;

            {
                this.b = this;
            }

            @Override // defpackage.v31
            public final void a(Object obj) {
                int i22 = i2;
                s61 s61Var = this.b;
                switch (i22) {
                    case 0:
                        synchronized (s61Var.d) {
                            s61Var.f.submit(new r61(s61Var, 1));
                        }
                        return;
                    default:
                        s61Var.f.submit(new r61(s61Var, 0));
                        return;
                }
            }
        });
    }

    public final void d() {
        String trim = ((String) this.j.d()).toLowerCase().trim();
        int i = 2;
        if (trim.isEmpty()) {
            this.g.post(new r61(this, i));
            return;
        }
        if (trim.equals("*")) {
            this.g.post(new r61(this, 3));
            return;
        }
        synchronized (this.d) {
            this.g.post(new n51(this, i, (List) this.d.stream().filter(new z8(1, trim)).collect(Collectors.toList())));
        }
    }
}
