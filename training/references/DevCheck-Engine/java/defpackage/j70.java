package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.work.WorkerParameters;
import com.google.android.material.tabs.TabLayout;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class j70 implements jm2, px, o82, o81, sa0 {
    public static final j70 h = new j70(1);
    public static final /* synthetic */ j70 i = new j70(2);
    public static final j70 j = new j70(3);
    public static final j70 k = new j70(4);
    public static final j70 l = new j70(5);
    public static final j70 m = new j70(6);
    public static final j70 n = new j70(7);
    public static j70 o;
    public final /* synthetic */ int g;

    public /* synthetic */ j70(int i2) {
        this.g = i2;
    }

    public j70(View view) {
        this.g = 26;
    }

    public static final String a(km kmVar, km[] kmVarArr, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        km kmVar2 = fb1.b;
        int a2 = kmVar.a();
        int i6 = 0;
        while (i6 < a2) {
            int i7 = (i6 + a2) / 2;
            while (i7 > -1 && kmVar.d(i7) != 10) {
                i7--;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i3 = i8 + i9;
                if (kmVar.d(i3) == 10) {
                    break;
                }
                i9++;
            }
            int i10 = i3 - i8;
            int i11 = i2;
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z2) {
                    i4 = 46;
                    z = false;
                } else {
                    byte d = kmVarArr[i11].d(i12);
                    byte[] bArr = pd2.f785a;
                    int i14 = d & 255;
                    z = z2;
                    i4 = i14;
                }
                byte d2 = kmVar.d(i8 + i13);
                byte[] bArr2 = pd2.f785a;
                i5 = i4 - (d2 & 255);
                if (i5 != 0) {
                    break;
                }
                i13++;
                i12++;
                if (i13 == i10) {
                    break;
                }
                if (kmVarArr[i11].a() != i12) {
                    z2 = z;
                } else {
                    if (i11 == kmVarArr.length - 1) {
                        break;
                    }
                    i11++;
                    i12 = -1;
                    z2 = true;
                }
            }
            if (i5 >= 0) {
                if (i5 <= 0) {
                    int i15 = i10 - i13;
                    int a3 = kmVarArr[i11].a() - i12;
                    int length = kmVarArr.length;
                    for (int i16 = i11 + 1; i16 < length; i16++) {
                        a3 += kmVarArr[i16].a();
                    }
                    if (a3 >= i15) {
                        if (a3 <= i15) {
                            return kmVar.h(i8, i10 + i8).g(lp.f601a);
                        }
                    }
                }
                i6 = i3 + 1;
            }
            a2 = i7;
        }
        return null;
    }

    public static ArrayList e(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((cb1) obj) != cb1.i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(as.U(arrayList));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add(((cb1) obj2).g);
        }
        return arrayList2;
    }

    public static RectF g(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.K || !(view instanceof fv1)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        fv1 fv1Var = (fv1) view;
        int contentWidth = fv1Var.getContentWidth();
        int contentHeight = fv1Var.getContentHeight();
        int r = (int) ju0.r(fv1Var.getContext(), 24);
        if (contentWidth < r) {
            contentWidth = r;
        }
        int right = (fv1Var.getRight() + fv1Var.getLeft()) / 2;
        int bottom = (fv1Var.getBottom() + fv1Var.getTop()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(right - i2, bottom - (contentHeight / 2), i2 + right, (right / 2) + bottom);
    }

    public static byte[] h(List list) {
        list.getClass();
        wl wlVar = new wl();
        ArrayList e = e(list);
        int size = e.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = e.get(i2);
            i2++;
            String str = (String) obj;
            wlVar.I(str.length());
            wlVar.O(str);
        }
        return wlVar.m(wlVar.h);
    }

    @Override // defpackage.o82
    public gb2 b(View view, gb2 gb2Var, p82 p82Var) {
        p82Var.d = gb2Var.a() + p82Var.d;
        boolean z = view.getLayoutDirection() == 1;
        int b = gb2Var.b();
        int c = gb2Var.c();
        int i2 = p82Var.f777a + (z ? c : b);
        p82Var.f777a = i2;
        int i3 = p82Var.c;
        if (!z) {
            b = c;
        }
        int i4 = i3 + b;
        p82Var.c = i4;
        view.setPaddingRelative(i2, p82Var.b, i4, p82Var.d);
        return gb2Var;
    }

    @Override // defpackage.o81
    public CharSequence c(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.Y) ? editTextPreference.g.getString(R.string.not_set) : editTextPreference.Y;
    }

    @Override // defpackage.jm2
    public qm2 d(Class cls) {
        if (!vl2.class.isAssignableFrom(cls)) {
            c.m(CDsMEtnUjndKau.lgkWOzXTXYWBb.concat(cls.getName()));
            return null;
        }
        try {
            return (qm2) vl2.h(cls.asSubclass(vl2.class)).d(3);
        } catch (Exception e) {
            jw0.l("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // defpackage.jm2
    public boolean f(Class cls) {
        return vl2.class.isAssignableFrom(cls);
    }

    @Override // defpackage.db1
    public Object get() {
        return new kj1(0, Executors.newSingleThreadExecutor());
    }

    public is0 i(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(is0.class);
            asSubclass.getClass();
            try {
                Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                newInstance.getClass();
                is0 is0Var = (is0) newInstance;
                if (!is0Var.d) {
                    return is0Var;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } finally {
            }
        } finally {
        }
    }

    public boolean j() {
        return this instanceof ku0;
    }

    public void k(float f, float f2, float f3, mn1 mn1Var) {
        mn1Var.c(f, 0.0f);
    }

    public void l(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF g = g(tabLayout, view);
        RectF g2 = g(tabLayout, view2);
        drawable.setBounds(o4.c((int) g.left, f, (int) g2.left), drawable.getBounds().top, o4.c((int) g.right, f, (int) g2.right), drawable.getBounds().bottom);
    }

    public String toString() {
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return "{}";
            default:
                return super.toString();
        }
    }
}
