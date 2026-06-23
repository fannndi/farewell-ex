package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class uj {

    /* renamed from: a, reason: collision with root package name */
    public final int f1045a;
    public final CharSequence b;

    public uj(int i, CharSequence charSequence) {
        this.f1045a = i;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uj)) {
            return false;
        }
        uj ujVar = (uj) obj;
        if (this.f1045a != ujVar.f1045a) {
            return false;
        }
        CharSequence charSequence = ujVar.b;
        CharSequence charSequence2 = this.b;
        String charSequence3 = charSequence2 != null ? charSequence2.toString() : null;
        String charSequence4 = charSequence != null ? charSequence.toString() : null;
        if (charSequence3 == null && charSequence4 == null) {
            return true;
        }
        return charSequence3 != null && charSequence3.equals(charSequence4);
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f1045a);
        CharSequence charSequence = this.b;
        return Arrays.hashCode(new Object[]{valueOf, charSequence != null ? charSequence.toString() : null});
    }
}
