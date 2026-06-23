package defpackage;

import Cwd.ynLVXgis;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a6 extends m5 implements LayoutInflater.Factory2, ow0 {
    public static final yo1 n0 = new yo1(0);
    public static final int[] o0 = {R.attr.windowBackground};
    public static final boolean p0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView A;
    public PopupWindow B;
    public n5 C;
    public boolean F;
    public ViewGroup G;
    public TextView H;
    public View I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public z5[] R;
    public z5 S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public Configuration X;
    public final int Y;
    public int Z;
    public int a0;
    public boolean b0;
    public v5 c0;
    public v5 d0;
    public boolean e0;
    public int f0;
    public boolean h0;
    public Rect i0;
    public Rect j0;
    public r7 k0;
    public OnBackInvokedDispatcher l0;
    public OnBackInvokedCallback m0;
    public final Object p;
    public final Context q;
    public Window r;
    public u5 s;
    public sl t;
    public at1 u;
    public CharSequence v;
    public ActionBarOverlayLayout w;
    public o5 x;
    public o5 y;
    public j2 z;
    public j82 D = null;
    public final boolean E = true;
    public final n5 g0 = new n5(this, 0);

    public a6(Context context, Window window, d5 d5Var, Object obj) {
        a5 a5Var = null;
        this.Y = -100;
        this.q = context;
        this.p = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof a5)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        a5Var = (a5) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (a5Var != null) {
                this.Y = ((a6) a5Var.p()).Y;
            }
        }
        if (this.Y == -100) {
            String name = this.p.getClass().getName();
            yo1 yo1Var = n0;
            Integer num = (Integer) yo1Var.get(name);
            if (num != null) {
                this.Y = num.intValue();
                yo1Var.remove(this.p.getClass().getName());
            }
        }
        if (window != null) {
            q(window);
        }
        e6.d();
    }

    public static rs0 r(Context context) {
        rs0 rs0Var;
        rs0 rs0Var2;
        if (Build.VERSION.SDK_INT >= 33 || (rs0Var = m5.i) == null) {
            return null;
        }
        ss0 ss0Var = rs0Var.f904a;
        rs0 b = r5.b(context.getApplicationContext().getResources().getConfiguration());
        if (rs0Var.b()) {
            rs0Var2 = rs0.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b.f904a.f952a.size() + ss0Var.f952a.size()) {
                Locale locale = i < ss0Var.f952a.size() ? ss0Var.f952a.get(i) : b.f904a.f952a.get(i - ss0Var.f952a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            rs0Var2 = new rs0(new ss0(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return rs0Var2.b() ? b : rs0Var2;
    }

    public static Configuration v(Context context, int i, rs0 rs0Var, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (rs0Var != null) {
            r5.d(configuration2, rs0Var);
        }
        return configuration2;
    }

    public final void A() {
        if (this.r == null) {
            Object obj = this.p;
            if (obj instanceof Activity) {
                q(((Activity) obj).getWindow());
            }
        }
        if (this.r != null) {
            return;
        }
        c.n("We have not been given a Window");
    }

    public final x5 B(Context context) {
        if (this.c0 == null) {
            if (z12.e == null) {
                Context applicationContext = context.getApplicationContext();
                z12.e = new z12(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.c0 = new v5(this, z12.e);
        }
        return this.c0;
    }

    public final z5 C(int i) {
        z5[] z5VarArr = this.R;
        if (z5VarArr == null || z5VarArr.length <= i) {
            z5[] z5VarArr2 = new z5[i + 1];
            if (z5VarArr != null) {
                System.arraycopy(z5VarArr, 0, z5VarArr2, 0, z5VarArr.length);
            }
            this.R = z5VarArr2;
            z5VarArr = z5VarArr2;
        }
        z5 z5Var = z5VarArr[i];
        if (z5Var != null) {
            return z5Var;
        }
        z5 z5Var2 = new z5();
        z5Var2.f1260a = i;
        z5Var2.n = false;
        z5VarArr[i] = z5Var2;
        return z5Var2;
    }

    public final void D() {
        z();
        if (this.L && this.t == null) {
            Object obj = this.p;
            if (obj instanceof Activity) {
                this.t = new fa2((Activity) obj, this.M);
            } else if (obj instanceof Dialog) {
                this.t = new fa2((Dialog) obj);
            }
            sl slVar = this.t;
            if (slVar != null) {
                slVar.i0(this.h0);
            }
        }
    }

    public final void E(int i) {
        this.f0 = (1 << i) | this.f0;
        if (this.e0) {
            return;
        }
        View decorView = this.r.getDecorView();
        WeakHashMap weakHashMap = y62.f1215a;
        decorView.postOnAnimation(this.g0);
        this.e0 = true;
    }

    public final int F(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            c.n("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.d0 == null) {
                            this.d0 = new v5(this, context);
                        }
                        return this.d0.g();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return B(context).g();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean G() {
        boolean z = this.T;
        this.T = false;
        z5 C = C(0);
        if (!C.m) {
            j2 j2Var = this.z;
            if (j2Var != null) {
                j2Var.a();
                return true;
            }
            D();
            sl slVar = this.t;
            if (slVar == null || !slVar.i()) {
                return false;
            }
        } else if (!z) {
            u(C, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // defpackage.ow0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(androidx.appcompat.view.menu.MenuBuilder r6) {
        /*
            r5 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r5.w
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Lc9
            r6.k()
            f10 r6 = r6.k
            tz1 r6 = (defpackage.tz1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f1015a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Lc9
            androidx.appcompat.widget.ActionMenuView r6 = r6.g
            if (r6 == 0) goto Lc9
            boolean r6 = r6.y
            if (r6 == 0) goto Lc9
            android.content.Context r6 = r5.q
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L46
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r5.w
            r6.k()
            f10 r6 = r6.k
            tz1 r6 = (defpackage.tz1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f1015a
            androidx.appcompat.widget.ActionMenuView r6 = r6.g
            if (r6 == 0) goto Lc9
            d2 r6 = r6.z
            if (r6 == 0) goto Lc9
            hk2 r2 = r6.B
            if (r2 != 0) goto L46
            boolean r6 = r6.i()
            if (r6 == 0) goto Lc9
        L46:
            android.view.Window r6 = r5.r
            android.view.Window$Callback r6 = r6.getCallback()
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r5.w
            r2.k()
            f10 r2 = r2.k
            tz1 r2 = (defpackage.tz1) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f1015a
            boolean r2 = r2.o()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L84
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r5.w
            r0.k()
            f10 r0 = r0.k
            tz1 r0 = (defpackage.tz1) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f1015a
            androidx.appcompat.widget.ActionMenuView r0 = r0.g
            if (r0 == 0) goto L76
            d2 r0 = r0.z
            if (r0 == 0) goto L76
            boolean r0 = r0.d()
        L76:
            boolean r0 = r5.W
            if (r0 != 0) goto Lc8
            z5 r5 = r5.C(r1)
            androidx.appcompat.view.menu.MenuBuilder r5 = r5.h
            r6.onPanelClosed(r3, r5)
            return
        L84:
            if (r6 == 0) goto Lc8
            boolean r2 = r5.W
            if (r2 != 0) goto Lc8
            boolean r2 = r5.e0
            if (r2 == 0) goto La1
            int r2 = r5.f0
            r0 = r0 & r2
            if (r0 == 0) goto La1
            android.view.Window r0 = r5.r
            android.view.View r0 = r0.getDecorView()
            n5 r2 = r5.g0
            r0.removeCallbacks(r2)
            r2.run()
        La1:
            z5 r0 = r5.C(r1)
            androidx.appcompat.view.menu.MenuBuilder r2 = r0.h
            if (r2 == 0) goto Lc8
            boolean r4 = r0.o
            if (r4 != 0) goto Lc8
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Lc8
            androidx.appcompat.view.menu.MenuBuilder r0 = r0.h
            r6.onMenuOpened(r3, r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = r5.w
            r5.k()
            f10 r5 = r5.k
            tz1 r5 = (defpackage.tz1) r5
            androidx.appcompat.widget.Toolbar r5 = r5.f1015a
            r5.u()
        Lc8:
            return
        Lc9:
            z5 r6 = r5.C(r1)
            r6.n = r0
            r5.u(r6, r1)
            r0 = 0
            r5.I(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6.H(androidx.appcompat.view.menu.MenuBuilder):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r2.l.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(defpackage.z5 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6.I(z5, android.view.KeyEvent):void");
    }

    public final boolean J(z5 z5Var, int i, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((z5Var.k || K(z5Var, keyEvent)) && (menuBuilder = z5Var.h) != null) {
            return menuBuilder.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d3, code lost:
    
        if (r13.h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K(defpackage.z5 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6.K(z5, android.view.KeyEvent):boolean");
    }

    public final void L() {
        if (this.F) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void M() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.l0 != null && (C(0).m || this.z != null)) {
                z = true;
            }
            if (z && this.m0 == null) {
                this.m0 = t5.b(this.l0, this);
            } else {
                if (z || (onBackInvokedCallback = this.m0) == null) {
                    return;
                }
                t5.c(this.l0, onBackInvokedCallback);
                this.m0 = null;
            }
        }
    }

    @Override // defpackage.m5
    public final void d() {
        if (this.t != null) {
            D();
            if (this.t.K()) {
                return;
            }
            E(0);
        }
    }

    @Override // defpackage.m5
    public final void f() {
        String str;
        this.U = true;
        p(false, true);
        A();
        Object obj = this.p;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = op0.u(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                sl slVar = this.t;
                if (slVar == null) {
                    this.h0 = true;
                } else {
                    slVar.i0(true);
                }
            }
            synchronized (m5.n) {
                m5.h(this);
                m5.m.add(new WeakReference(this));
            }
        }
        this.X = new Configuration(this.q.getResources().getConfiguration());
        this.V = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.m5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.p
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.m5.n
            monitor-enter(r0)
            defpackage.m5.h(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.e0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.r
            android.view.View r0 = r0.getDecorView()
            n5 r1 = r3.g0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.W = r0
            int r0 = r3.Y
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.p
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            yo1 r0 = defpackage.a6.n0
            java.lang.Object r1 = r3.p
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.Y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            yo1 r0 = defpackage.a6.n0
            java.lang.Object r1 = r3.p
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            sl r0 = r3.t
            if (r0 == 0) goto L63
            r0.S()
        L63:
            v5 r0 = r3.c0
            if (r0 == 0) goto L6a
            r0.d()
        L6a:
            v5 r3 = r3.d0
            if (r3 == 0) goto L71
            r3.d()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6.g():void");
    }

    @Override // defpackage.m5
    public final boolean i(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.P && i == 108) {
            return false;
        }
        if (this.L && i == 1) {
            this.L = false;
        }
        if (i == 1) {
            L();
            this.P = true;
            return true;
        }
        if (i == 2) {
            L();
            this.J = true;
            return true;
        }
        if (i == 5) {
            L();
            this.K = true;
            return true;
        }
        if (i == 10) {
            L();
            this.N = true;
            return true;
        }
        if (i == 108) {
            L();
            this.L = true;
            return true;
        }
        if (i != 109) {
            return this.r.requestFeature(i);
        }
        L();
        this.M = true;
        return true;
    }

    @Override // defpackage.m5
    public final void j(int i) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.q).inflate(i, viewGroup);
        this.s.a(this.r.getCallback());
    }

    @Override // defpackage.m5
    public final void k(View view) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.s.a(this.r.getCallback());
    }

    @Override // defpackage.m5
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        ViewGroup viewGroup = (ViewGroup) this.G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.s.a(this.r.getCallback());
    }

    @Override // defpackage.m5
    public final void m(CharSequence charSequence) {
        this.v = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.w;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        sl slVar = this.t;
        if (slVar != null) {
            slVar.n0(charSequence);
            return;
        }
        TextView textView = this.H;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.m5
    public final j2 n(h2 h2Var) {
        ViewGroup viewGroup;
        if (h2Var == null) {
            c.m("ActionMode callback can not be null.");
            return null;
        }
        j2 j2Var = this.z;
        if (j2Var != null) {
            j2Var.a();
        }
        i8 i8Var = new i8(this, h2Var);
        D();
        sl slVar = this.t;
        if (slVar != null) {
            this.z = slVar.o0(i8Var);
        }
        if (this.z == null) {
            j82 j82Var = this.D;
            if (j82Var != null) {
                j82Var.b();
            }
            j2 j2Var2 = this.z;
            if (j2Var2 != null) {
                j2Var2.a();
            }
            int i = 1;
            if (this.A == null) {
                boolean z = this.O;
                Context context = this.q;
                if (z) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(flar2.devcheck.R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        cx cxVar = new cx(context, 0);
                        cxVar.getTheme().setTo(newTheme);
                        context = cxVar;
                    }
                    this.A = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, flar2.devcheck.R.attr.actionModePopupWindowStyle);
                    this.B = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    this.B.setContentView(this.A);
                    this.B.setWidth(-1);
                    context.getTheme().resolveAttribute(flar2.devcheck.R.attr.actionBarSize, typedValue, true);
                    this.A.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    this.B.setHeight(-2);
                    this.C = new n5(this, i);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.G.findViewById(flar2.devcheck.R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        D();
                        sl slVar2 = this.t;
                        Context J = slVar2 != null ? slVar2.J() : null;
                        if (J != null) {
                            context = J;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        this.A = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.A != null) {
                j82 j82Var2 = this.D;
                if (j82Var2 != null) {
                    j82Var2.b();
                }
                this.A.e();
                Context context2 = this.A.getContext();
                ActionBarContextView actionBarContextView = this.A;
                pq1 pq1Var = new pq1();
                pq1Var.i = context2;
                pq1Var.j = actionBarContextView;
                pq1Var.k = i8Var;
                MenuBuilder menuBuilder = new MenuBuilder(actionBarContextView.getContext());
                menuBuilder.l = 1;
                pq1Var.n = menuBuilder;
                menuBuilder.e = pq1Var;
                if (((h2) i8Var.g).c(pq1Var, menuBuilder)) {
                    pq1Var.g();
                    this.A.c(pq1Var);
                    this.z = pq1Var;
                    boolean z2 = this.F && (viewGroup = this.G) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = this.A;
                    if (z2) {
                        actionBarContextView2.setAlpha(0.0f);
                        j82 b = y62.b(this.A);
                        b.a(1.0f);
                        this.D = b;
                        b.d(new p5(i, this));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        this.A.setVisibility(0);
                        if (this.A.getParent() instanceof View) {
                            View view = (View) this.A.getParent();
                            WeakHashMap weakHashMap = y62.f1215a;
                            view.requestApplyInsets();
                        }
                    }
                    if (this.B != null) {
                        this.r.getDecorView().post(this.C);
                    }
                } else {
                    this.z = null;
                }
            }
            M();
            this.z = this.z;
        }
        M();
        return this.z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ec, code lost:
    
        if (r10.equals("ImageButton") == false) goto L20;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6.p(boolean, boolean):boolean");
    }

    public final void q(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.r != null) {
            c.n("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof u5) {
            c.n("AppCompat has already installed itself into the Window");
            return;
        }
        u5 u5Var = new u5(this, callback);
        this.s = u5Var;
        window.setCallback(u5Var);
        Context context = this.q;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, o0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            e6 a2 = e6.a();
            synchronized (a2) {
                drawable = a2.f222a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.r = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.l0) != null) {
            return;
        }
        Object obj = this.p;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.m0) != null) {
            t5.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.m0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.l0 = t5.a(activity);
                M();
            }
        }
        this.l0 = null;
        M();
    }

    public final void s(int i, z5 z5Var, MenuBuilder menuBuilder) {
        if (menuBuilder == null) {
            if (z5Var == null && i >= 0) {
                z5[] z5VarArr = this.R;
                if (i < z5VarArr.length) {
                    z5Var = z5VarArr[i];
                }
            }
            if (z5Var != null) {
                menuBuilder = z5Var.h;
            }
        }
        if ((z5Var == null || z5Var.m) && !this.W) {
            u5 u5Var = this.s;
            Window.Callback callback = this.r.getCallback();
            u5Var.getClass();
            try {
                u5Var.k = true;
                callback.onPanelClosed(i, menuBuilder);
            } finally {
                u5Var.k = false;
            }
        }
    }

    public final void t(MenuBuilder menuBuilder) {
        d2 d2Var;
        if (this.Q) {
            return;
        }
        this.Q = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.w;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((tz1) actionBarOverlayLayout.k).f1015a.g;
        if (actionMenuView != null && (d2Var = actionMenuView.z) != null) {
            d2Var.d();
            z1 z1Var = d2Var.A;
            if (z1Var != null && z1Var.b()) {
                z1Var.j.dismiss();
            }
        }
        Window.Callback callback = this.r.getCallback();
        if (callback != null && !this.W) {
            callback.onPanelClosed(108, menuBuilder);
        }
        this.Q = false;
    }

    public final void u(z5 z5Var, boolean z) {
        y5 y5Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && z5Var.f1260a == 0 && (actionBarOverlayLayout = this.w) != null) {
            actionBarOverlayLayout.k();
            if (((tz1) actionBarOverlayLayout.k).f1015a.o()) {
                t(z5Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.q.getSystemService("window");
        if (windowManager != null && z5Var.m && (y5Var = z5Var.e) != null) {
            windowManager.removeView(y5Var);
            if (z) {
                s(z5Var.f1260a, z5Var, null);
            }
        }
        z5Var.k = false;
        z5Var.l = false;
        z5Var.m = false;
        z5Var.f = null;
        z5Var.n = true;
        if (this.S == z5Var) {
            this.S = null;
        }
        if (z5Var.f1260a == 0) {
            M();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e8, code lost:
    
        if (r6.d() != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6.w(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.ow0
    public final boolean x(MenuBuilder menuBuilder, MenuItem menuItem) {
        z5 z5Var;
        Window.Callback callback = this.r.getCallback();
        if (callback != null && !this.W) {
            MenuBuilder k = menuBuilder.k();
            z5[] z5VarArr = this.R;
            int length = z5VarArr != null ? z5VarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    z5Var = z5VarArr[i];
                    if (z5Var != null && z5Var.h == k) {
                        break;
                    }
                    i++;
                } else {
                    z5Var = null;
                    break;
                }
            }
            if (z5Var != null) {
                return callback.onMenuItemSelected(z5Var.f1260a, menuItem);
            }
        }
        return false;
    }

    public final void y(int i) {
        z5 C = C(i);
        if (C.h != null) {
            Bundle bundle = new Bundle();
            C.h.t(bundle);
            if (bundle.size() > 0) {
                C.p = bundle;
            }
            C.h.w();
            C.h.clear();
        }
        C.o = true;
        C.n = true;
        if ((i == 108 || i == 0) && this.w != null) {
            z5 C2 = C(0);
            C2.k = false;
            K(C2, null);
        }
    }

    public final void z() {
        ViewGroup viewGroup;
        if (this.F) {
            return;
        }
        Context context = this.q;
        int[] iArr = zb1.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            c.n(CGvJMCDBOmCdj.GgRzsMYEGx);
            return;
        }
        int i = 0;
        int i2 = 1;
        if (obtainStyledAttributes.getBoolean(126, false)) {
            i(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            i(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            i(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            i(10);
        }
        this.O = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        A();
        this.r.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.P) {
            viewGroup = this.N ? (ViewGroup) from.inflate(flar2.devcheck.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(flar2.devcheck.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.O) {
            viewGroup = (ViewGroup) from.inflate(flar2.devcheck.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.M = false;
            this.L = false;
        } else if (this.L) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(flar2.devcheck.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new cx(context, typedValue.resourceId) : context).inflate(flar2.devcheck.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(flar2.devcheck.R.id.decor_content_parent);
            this.w = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.r.getCallback());
            if (this.M) {
                this.w.j(109);
            }
            if (this.J) {
                this.w.j(2);
            }
            if (this.K) {
                this.w.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.L + ", windowActionBarOverlay: " + this.M + ynLVXgis.KuED + this.O + ", windowActionModeOverlay: " + this.N + ", windowNoTitle: " + this.P + " }");
        }
        o5 o5Var = new o5(this, i);
        WeakHashMap weakHashMap = y62.f1215a;
        p62.c(viewGroup, o5Var);
        if (this.w == null) {
            this.H = (TextView) viewGroup.findViewById(flar2.devcheck.R.id.title);
        }
        boolean z = r82.f877a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(flar2.devcheck.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.r.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.r.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new o5(this, i2));
        this.G = viewGroup;
        Object obj = this.p;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.v;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.w;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                sl slVar = this.t;
                if (slVar != null) {
                    slVar.n0(title);
                } else {
                    TextView textView = this.H;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.G.findViewById(R.id.content);
        View decorView = this.r.getDecorView();
        contentFrameLayout2.m.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.F = true;
        z5 C = C(0);
        if (this.W || C.h != null) {
            return;
        }
        E(108);
    }
}
