package defpackage;

import java.text.DecimalFormat;

/* loaded from: classes.dex */
public final class e10 extends q52 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215a;
    public DecimalFormat b;

    public e10(int i) {
        this.f215a = 2;
        b(i);
    }

    @Override // defpackage.q52
    public final String a(float f) {
        switch (this.f215a) {
        }
        return this.b.format(f);
    }

    public void b(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.b = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}
