package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class pi {

    /* renamed from: a, reason: collision with root package name */
    public final int f790a;
    public final r30 b;
    public final long c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final List p;
    public final List q;
    public final dn r;

    public pi(mi miVar) {
        this.f790a = miVar.f634a;
        this.b = miVar.b;
        this.c = miVar.c;
        this.d = miVar.d;
        this.e = miVar.e;
        this.f = miVar.f;
        this.g = miVar.g;
        this.h = miVar.h;
        this.i = miVar.i;
        this.j = miVar.j;
        this.k = miVar.k;
        this.l = miVar.l;
        this.m = miVar.m;
        this.n = miVar.n;
        this.o = miVar.o;
        this.p = Collections.unmodifiableList(new ArrayList(miVar.p));
        this.q = Collections.unmodifiableList(new ArrayList(miVar.q));
        this.r = miVar.r;
    }

    public static pi a() {
        mi miVar = new mi();
        miVar.f634a = 1;
        return new pi(miVar);
    }

    public final mi b() {
        mi miVar = new mi();
        miVar.f634a = this.f790a;
        miVar.b = this.b;
        miVar.c = this.c;
        miVar.d = this.d;
        miVar.e = this.e;
        miVar.f = this.f;
        miVar.g = this.g;
        miVar.h = this.h;
        miVar.i = this.i;
        miVar.j = this.j;
        miVar.k = this.k;
        miVar.l = this.l;
        miVar.m = this.m;
        miVar.n = this.n;
        miVar.o = this.o;
        miVar.p = new ArrayList(this.p);
        miVar.q = new ArrayList(this.q);
        miVar.r = this.r;
        return miVar;
    }
}
