package defpackage;

import com.google.android.material.behavior.YqV.Gvyagftz;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public final class cu extends a82 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153a;
    public final Object b;

    public cu() {
        this.f153a = 0;
        this.b = new ArrayList(3);
    }

    public cu(ie0 ie0Var) {
        this.f153a = 1;
        this.b = ie0Var;
    }

    @Override // defpackage.a82
    public final void a(int i) {
        int i2 = this.f153a;
        int i3 = 0;
        Object obj = this.b;
        switch (i2) {
            case 0:
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        ((a82) obj2).a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException(Gvyagftz.EWXtnzidig, e);
                }
            default:
                ((ie0) obj).b(false);
                return;
        }
    }

    @Override // defpackage.a82
    public void b(int i, float f, int i2) {
        switch (this.f153a) {
            case 0:
                try {
                    ArrayList arrayList = (ArrayList) this.b;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ((a82) obj).b(i, f, i2);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            default:
                return;
        }
    }

    @Override // defpackage.a82
    public final void c(int i) {
        int i2 = this.f153a;
        int i3 = 0;
        Object obj = this.b;
        switch (i2) {
            case 0:
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        ((a82) obj2).c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            default:
                ((ie0) obj).b(false);
                return;
        }
    }
}
