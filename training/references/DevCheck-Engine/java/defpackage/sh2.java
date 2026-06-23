package defpackage;

import java.util.ArrayList;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class sh2 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f938a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sh2(int i, Object obj) {
        this.f938a = i;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f938a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((wb) obj2).g((qj) obj, new ArrayList());
                break;
            default:
                ((tb) obj2).d((qj) obj);
                break;
        }
    }
}
