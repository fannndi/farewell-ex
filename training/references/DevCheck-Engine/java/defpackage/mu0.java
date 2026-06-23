package defpackage;

import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class mu0 extends u {
    public final /* synthetic */ fh g;

    public mu0(fh fhVar) {
        this.g = fhVar;
    }

    @Override // defpackage.n
    public final int b() {
        return ((Matcher) this.g.h).groupCount() + 1;
    }

    @Override // defpackage.n, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String group = ((Matcher) this.g.h).group(i);
        return group == null ? "" : group;
    }

    @Override // defpackage.u, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // defpackage.u, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
