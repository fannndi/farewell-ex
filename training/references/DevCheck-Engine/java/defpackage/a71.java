package defpackage;

import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class a71 {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f13a;
    public final String b;
    public HashMap c;
    public final z61 d;
    public final int e;
    public final int f;
    public final String g;
    public HashSet h;

    public a71(Drawable drawable, String str, int i) {
        this.f13a = drawable;
        this.b = str;
        this.f = i;
        this.e = 3;
        this.c = new HashMap();
    }

    public a71(Drawable drawable, String str, String str2) {
        this.f13a = drawable;
        this.b = str;
        this.g = str2;
        this.e = 5;
        this.c = new HashMap();
    }

    public a71(Drawable drawable, String str, z61 z61Var) {
        this.f13a = drawable;
        this.b = str;
        this.d = z61Var;
        this.e = 0;
        this.c = new HashMap();
    }

    public a71(Drawable drawable, String str, z61 z61Var, int i) {
        this.f13a = drawable;
        this.b = str;
        this.d = z61Var;
        this.e = i;
        this.c = new HashMap();
    }

    public final HashMap a() {
        if (this.c == null) {
            this.c = new HashMap();
        }
        return this.c;
    }

    public final z61 b() {
        return this.d;
    }
}
