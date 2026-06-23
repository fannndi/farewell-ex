package defpackage;

import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c9 implements Comparable {
    public Drawable g;
    public String h;
    public long i;
    public boolean j;
    public ApplicationInfo k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(((c9) obj).i, this.i);
    }
}
