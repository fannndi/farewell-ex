package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ff extends uv {
    public final w5 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(Context context, gr grVar, int i) {
        super(context, grVar);
        this.g = i;
        this.f = new w5(6, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r8.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L20;
     */
    @Override // defpackage.uv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a() {
        /*
            r8 = this;
            int r0 = r8.g
            java.lang.String r1 = "status"
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r3 = -1
            r4 = 0
            android.content.Context r5 = r8.b
            r6 = 1
            r7 = 0
            switch(r0) {
                case 0: goto L84;
                case 1: goto L4a;
                default: goto Lf;
            }
        Lf:
            android.content.IntentFilter r8 = r8.e()
            android.content.Intent r8 = r5.registerReceiver(r4, r8)
            if (r8 == 0) goto L45
            java.lang.String r0 = r8.getAction()
            if (r0 != 0) goto L20
            goto L45
        L20:
            java.lang.String r8 = r8.getAction()
            if (r8 == 0) goto L44
            int r0 = r8.hashCode()
            r1 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r0 == r1) goto L3e
            r1 = -730838620(0xffffffffd47049a4, float:-4.1281105E12)
            if (r0 == r1) goto L35
            goto L44
        L35:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L45
            goto L44
        L3e:
            java.lang.String r0 = "android.intent.action.DEVICE_STORAGE_LOW"
            boolean r8 = r8.equals(r0)
        L44:
            r6 = r7
        L45:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            return r8
        L4a:
            android.content.IntentFilter r8 = new android.content.IntentFilter
            r8.<init>(r2)
            android.content.Intent r8 = r5.registerReceiver(r4, r8)
            if (r8 != 0) goto L61
            ai1 r8 = defpackage.ai1.h()
            int r0 = defpackage.wf.f1131a
            r8.getClass()
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto L83
        L61:
            int r0 = r8.getIntExtra(r1, r3)
            java.lang.String r1 = "level"
            int r1 = r8.getIntExtra(r1, r3)
            java.lang.String r2 = "scale"
            int r8 = r8.getIntExtra(r2, r3)
            float r1 = (float) r1
            float r8 = (float) r8
            float r1 = r1 / r8
            if (r0 == r6) goto L7f
            r8 = 1041865114(0x3e19999a, float:0.15)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 <= 0) goto L7e
            goto L7f
        L7e:
            r6 = r7
        L7f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
        L83:
            return r8
        L84:
            android.content.IntentFilter r8 = new android.content.IntentFilter
            r8.<init>(r2)
            android.content.Intent r8 = r5.registerReceiver(r4, r8)
            if (r8 != 0) goto L9b
            ai1 r8 = defpackage.ai1.h()
            int r0 = defpackage.gf.f336a
            r8.getClass()
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto Lab
        L9b:
            int r8 = r8.getIntExtra(r1, r3)
            r0 = 2
            if (r8 == r0) goto La7
            r0 = 5
            if (r8 != r0) goto La6
            goto La7
        La6:
            r6 = r7
        La7:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
        Lab:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff.a():java.lang.Object");
    }

    @Override // defpackage.uv
    public final void c() {
        ai1 h = ai1.h();
        int i = vl.f1090a;
        h.getClass();
        this.b.registerReceiver(this.f, e());
    }

    @Override // defpackage.uv
    public final void d() {
        ai1 h = ai1.h();
        int i = vl.f1090a;
        h.getClass();
        this.b.unregisterReceiver(this.f);
    }

    public final IntentFilter e() {
        switch (this.g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(bOxzFZXgEkjph.HhbmyFHNjOjfduH);
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
