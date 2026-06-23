package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class gg1 {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f338a;
    public final Configuration b;
    public final int c;

    public gg1(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f338a = colorStateList;
        this.b = configuration;
        this.c = theme == null ? 0 : theme.hashCode();
    }
}
