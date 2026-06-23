package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class nu0 extends n {
    public final /* synthetic */ fh g;

    public nu0(fh fhVar) {
        this.g = fhVar;
    }

    @Override // defpackage.n
    public final int b() {
        return ((Matcher) this.g.h).groupCount() + 1;
    }

    public final lu0 c(int i) {
        Matcher matcher = (Matcher) this.g.h;
        rm0 K = tl2.K(matcher.start(i), matcher.end(i));
        if (K.g < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new lu0(group, K);
    }

    @Override // defpackage.n, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof lu0) {
            return super.contains((lu0) obj);
        }
        return false;
    }

    @Override // defpackage.n, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new w02(new u20(new fs(0, new rm0(0, b() - 1, 1)), new m(1, this)));
    }
}
