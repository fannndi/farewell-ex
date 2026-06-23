package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a5 extends zt implements d5 {
    public boolean B;
    public boolean C;
    public a6 E;
    public final h70 z = new h70(new nd0(this));
    public final gq0 A = new gq0(this);
    public boolean D = true;

    public a5() {
        ((zf) this.k.i).K("android:support:lifecycle", new rt(1, this));
        final int i = 0;
        f(new sw(this) { // from class: md0
            public final /* synthetic */ a5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sw
            public final void accept(Object obj) {
                int i2 = i;
                a5 a5Var = this.b;
                switch (i2) {
                    case 0:
                        a5Var.z.q();
                        break;
                    default:
                        a5Var.z.q();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.u.add(new sw(this) { // from class: md0
            public final /* synthetic */ a5 b;

            {
                this.b = this;
            }

            @Override // defpackage.sw
            public final void accept(Object obj) {
                int i22 = i2;
                a5 a5Var = this.b;
                switch (i22) {
                    case 0:
                        a5Var.z.q();
                        break;
                    default:
                        a5Var.z.q();
                        break;
                }
            }
        });
        i(new st(this, 1));
        ((zf) this.k.i).K("androidx:appcompat", new y4(this));
        i(new z4(this));
    }

    public static boolean t(ae0 ae0Var) {
        boolean z = false;
        for (ld0 ld0Var : ae0Var.c.r()) {
            if (ld0Var != null) {
                nd0 nd0Var = ld0Var.z;
                if ((nd0Var == null ? null : nd0Var.r) != null) {
                    z |= t(ld0Var.u());
                }
                oe0 oe0Var = ld0Var.W;
                yp0 yp0Var = yp0.i;
                yp0 yp0Var2 = yp0.j;
                if (oe0Var != null) {
                    oe0Var.c();
                    if (oe0Var.j.c.compareTo(yp0Var2) >= 0) {
                        gq0 gq0Var = ld0Var.W.j;
                        gq0Var.c("setCurrentState");
                        gq0Var.e(yp0Var);
                        z = true;
                    }
                }
                if (ld0Var.V.c.compareTo(yp0Var2) >= 0) {
                    gq0 gq0Var2 = ld0Var.V;
                    gq0Var2.c("setCurrentState");
                    gq0Var2.e(yp0Var);
                    z = true;
                }
            }
        }
        return z;
    }

    public final void A(Toolbar toolbar) {
        a6 a6Var = (a6) p();
        if (a6Var.p instanceof Activity) {
            a6Var.D();
            sl slVar = a6Var.t;
            if (slVar instanceof fa2) {
                c.n("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            a6Var.u = null;
            if (slVar != null) {
                slVar.S();
            }
            a6Var.t = null;
            if (toolbar != null) {
                Object obj = a6Var.p;
                rz1 rz1Var = new rz1(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : a6Var.v, a6Var.s);
                a6Var.t = rz1Var;
                a6Var.s.h = rz1Var.w;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                a6Var.s.h = null;
            }
            a6Var.d();
        }
    }

    @Override // defpackage.zt, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        a6 a6Var = (a6) p();
        a6Var.z();
        ((ViewGroup) a6Var.G.findViewById(R.id.content)).addView(view, layoutParams);
        a6Var.s.a(a6Var.r.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        a6 a6Var = (a6) p();
        a6Var.U = true;
        int i9 = a6Var.Y;
        if (i9 == -100) {
            i9 = m5.h;
        }
        int F = a6Var.F(context, i9);
        if (m5.e(context)) {
            m5.o(context);
        }
        rs0 r = a6.r(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(a6.v(context, F, r, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof cx) {
            try {
                ((cx) context).a(a6.v(context, F, r, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (a6.p0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i10 = configuration3.mcc;
                    int i11 = configuration4.mcc;
                    if (i10 != i11) {
                        configuration.mcc = i11;
                    }
                    int i12 = configuration3.mnc;
                    int i13 = configuration4.mnc;
                    if (i12 != i13) {
                        configuration.mnc = i13;
                    }
                    r5.a(configuration3, configuration4, configuration);
                    int i14 = configuration3.touchscreen;
                    int i15 = configuration4.touchscreen;
                    if (i14 != i15) {
                        configuration.touchscreen = i15;
                    }
                    int i16 = configuration3.keyboard;
                    int i17 = configuration4.keyboard;
                    if (i16 != i17) {
                        configuration.keyboard = i17;
                    }
                    int i18 = configuration3.keyboardHidden;
                    int i19 = configuration4.keyboardHidden;
                    if (i18 != i19) {
                        configuration.keyboardHidden = i19;
                    }
                    int i20 = configuration3.navigation;
                    int i21 = configuration4.navigation;
                    if (i20 != i21) {
                        configuration.navigation = i21;
                    }
                    int i22 = configuration3.navigationHidden;
                    int i23 = configuration4.navigationHidden;
                    if (i22 != i23) {
                        configuration.navigationHidden = i23;
                    }
                    int i24 = configuration3.orientation;
                    int i25 = configuration4.orientation;
                    if (i24 != i25) {
                        configuration.orientation = i25;
                    }
                    int i26 = configuration3.screenLayout & 15;
                    int i27 = configuration4.screenLayout & 15;
                    if (i26 != i27) {
                        configuration.screenLayout |= i27;
                    }
                    int i28 = configuration3.screenLayout & 192;
                    int i29 = configuration4.screenLayout & 192;
                    if (i28 != i29) {
                        configuration.screenLayout |= i29;
                    }
                    int i30 = configuration3.screenLayout & 48;
                    int i31 = configuration4.screenLayout & 48;
                    if (i30 != i31) {
                        configuration.screenLayout |= i31;
                    }
                    int i32 = configuration3.screenLayout & 768;
                    int i33 = configuration4.screenLayout & 768;
                    if (i32 != i33) {
                        configuration.screenLayout |= i33;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        i = configuration3.colorMode;
                        int i34 = i & 3;
                        i2 = configuration4.colorMode;
                        if (i34 != (i2 & 3)) {
                            i7 = configuration.colorMode;
                            i8 = configuration4.colorMode;
                            configuration.colorMode = i7 | (i8 & 3);
                        }
                        i3 = configuration3.colorMode;
                        int i35 = i3 & 12;
                        i4 = configuration4.colorMode;
                        if (i35 != (i4 & 12)) {
                            i5 = configuration.colorMode;
                            i6 = configuration4.colorMode;
                            configuration.colorMode = i5 | (i6 & 12);
                        }
                    }
                    int i36 = configuration3.uiMode & 15;
                    int i37 = configuration4.uiMode & 15;
                    if (i36 != i37) {
                        configuration.uiMode |= i37;
                    }
                    int i38 = configuration3.uiMode & 48;
                    int i39 = configuration4.uiMode & 48;
                    if (i38 != i39) {
                        configuration.uiMode |= i39;
                    }
                    int i40 = configuration3.screenWidthDp;
                    int i41 = configuration4.screenWidthDp;
                    if (i40 != i41) {
                        configuration.screenWidthDp = i41;
                    }
                    int i42 = configuration3.screenHeightDp;
                    int i43 = configuration4.screenHeightDp;
                    if (i42 != i43) {
                        configuration.screenHeightDp = i43;
                    }
                    int i44 = configuration3.smallestScreenWidthDp;
                    int i45 = configuration4.smallestScreenWidthDp;
                    if (i44 != i45) {
                        configuration.smallestScreenWidthDp = i45;
                    }
                    int i46 = configuration3.densityDpi;
                    int i47 = configuration4.densityDpi;
                    if (i46 != i47) {
                        configuration.densityDpi = i47;
                    }
                }
            }
            Configuration v = a6.v(context, F, r, configuration, true);
            cx cxVar = new cx(context, flar2.devcheck.R.style.Theme_AppCompat_Empty);
            cxVar.a(v);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = cxVar.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        b8.d(theme);
                    } else {
                        synchronized (tl2.i) {
                            if (!tl2.k) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    tl2.j = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException unused3) {
                                }
                                tl2.k = true;
                            }
                            Method method = tl2.j;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                    tl2.j = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused5) {
            }
            context = cxVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        sl r = r();
        if (getWindow().hasFeature(0)) {
            if (r == null || !r.h()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.yt, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        sl r = r();
        if (keyCode == 82 && r != null && r.W(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a5.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        a6 a6Var = (a6) p();
        a6Var.z();
        return a6Var.r.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        a6 a6Var = (a6) p();
        if (a6Var.u == null) {
            a6Var.D();
            sl slVar = a6Var.t;
            a6Var.u = new at1(slVar != null ? slVar.J() : a6Var.q);
        }
        return a6Var.u;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = b62.f67a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        p().d();
    }

    @Override // defpackage.zt, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.z.q();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.zt, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a6 a6Var = (a6) p();
        if (a6Var.L && a6Var.F) {
            a6Var.D();
            sl slVar = a6Var.t;
            if (slVar != null) {
                slVar.R();
            }
        }
        e6 a2 = e6.a();
        Context context = a6Var.q;
        synchronized (a2) {
            fg1 fg1Var = a2.f222a;
            synchronized (fg1Var) {
                ft0 ft0Var = (ft0) fg1Var.b.get(context);
                if (ft0Var != null) {
                    ft0Var.a();
                }
            }
        }
        a6Var.X = new Configuration(a6Var.q.getResources().getConfiguration());
        a6Var.p(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // defpackage.zt, defpackage.yt, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A.d(xp0.ON_CREATE);
        ae0 ae0Var = ((nd0) this.z.g).q;
        ae0Var.E = false;
        ae0Var.F = false;
        ae0Var.L.g = false;
        ae0Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((nd0) this.z.g).q.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((nd0) this.z.g).q.f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        u();
        p().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.zt, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (v(i, menuItem)) {
            return true;
        }
        sl r = r();
        if (menuItem.getItemId() != 16908332 || r == null || (r.y() & 4) == 0) {
            return false;
        }
        return z();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.C = false;
        ((nd0) this.z.g).q.t(5);
        this.A.d(xp0.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((a6) p()).z();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        w();
        a6 a6Var = (a6) p();
        a6Var.D();
        sl slVar = a6Var.t;
        if (slVar != null) {
            slVar.k0(true);
        }
    }

    @Override // defpackage.zt, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.z.q();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        h70 h70Var = this.z;
        h70Var.q();
        super.onResume();
        this.C = true;
        ((nd0) h70Var.g).q.y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        x();
        ((a6) p()).p(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.z.q();
    }

    @Override // android.app.Activity
    public void onStop() {
        y();
        a6 a6Var = (a6) p();
        a6Var.D();
        sl slVar = a6Var.t;
        if (slVar != null) {
            slVar.k0(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        p().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        sl r = r();
        if (getWindow().hasFeature(0)) {
            if (r == null || !r.X()) {
                super.openOptionsMenu();
            }
        }
    }

    public final m5 p() {
        if (this.E == null) {
            lm1 lm1Var = m5.g;
            this.E = new a6(this, null, this, this);
        }
        return this.E;
    }

    public final sl r() {
        a6 a6Var = (a6) p();
        a6Var.D();
        return a6Var.t;
    }

    public final ae0 s() {
        return ((nd0) this.z.g).q;
    }

    @Override // defpackage.zt, android.app.Activity
    public final void setContentView(int i) {
        m();
        p().j(i);
    }

    @Override // defpackage.zt, android.app.Activity
    public void setContentView(View view) {
        m();
        p().k(view);
    }

    @Override // defpackage.zt, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        p().l(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((a6) p()).Z = i;
    }

    public final void u() {
        super.onDestroy();
        ((nd0) this.z.g).q.k();
        this.A.d(xp0.ON_DESTROY);
    }

    public final boolean v(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((nd0) this.z.g).q.i();
        }
        return false;
    }

    public final void w() {
        super.onPostResume();
        this.A.d(xp0.ON_RESUME);
        ae0 ae0Var = ((nd0) this.z.g).q;
        ae0Var.E = false;
        ae0Var.F = false;
        ae0Var.L.g = false;
        ae0Var.t(7);
    }

    public final void x() {
        h70 h70Var = this.z;
        h70Var.q();
        nd0 nd0Var = (nd0) h70Var.g;
        super.onStart();
        this.D = false;
        if (!this.B) {
            this.B = true;
            ae0 ae0Var = nd0Var.q;
            ae0Var.E = false;
            ae0Var.F = false;
            ae0Var.L.g = false;
            ae0Var.t(4);
        }
        nd0Var.q.y(true);
        this.A.d(xp0.ON_START);
        ae0 ae0Var2 = nd0Var.q;
        ae0Var2.E = false;
        ae0Var2.F = false;
        ae0Var2.L.g = false;
        ae0Var2.t(5);
    }

    public final void y() {
        super.onStop();
        this.D = true;
        while (t(s())) {
        }
        ae0 ae0Var = ((nd0) this.z.g).q;
        ae0Var.F = true;
        ae0Var.L.g = true;
        ae0Var.t(4);
        this.A.d(xp0.ON_STOP);
    }

    public boolean z() {
        Intent s = op0.s(this);
        if (s == null) {
            return false;
        }
        if (!shouldUpRecreateTask(s)) {
            navigateUpTo(s);
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Intent s2 = op0.s(this);
        if (s2 == null) {
            s2 = op0.s(this);
        }
        if (s2 != null) {
            ComponentName component = s2.getComponent();
            if (component == null) {
                component = s2.resolveActivity(getPackageManager());
            }
            int size = arrayList.size();
            try {
                Intent t = op0.t(this, component);
                while (t != null) {
                    arrayList.add(size, t);
                    t = op0.t(this, t.getComponent());
                }
                arrayList.add(s2);
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            }
        }
        if (arrayList.isEmpty()) {
            c.n("No intents added to TaskStackBuilder; cannot startActivities");
            return false;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }
}
