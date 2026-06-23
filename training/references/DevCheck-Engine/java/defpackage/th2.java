package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class th2 implements m1 {
    public int g;
    public Object h;

    public th2(int i) {
        switch (i) {
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                this.g = 1;
                this.h = Collections.singletonList(null);
                break;
            default:
                this.g = 4;
                break;
        }
    }

    public /* synthetic */ th2(int i, Object obj) {
        this.h = obj;
        this.g = i;
    }

    public th2(Context context) {
        int g = n3.g(context, 0);
        this.h = new j3(new ContextThemeWrapper(context, n3.g(context, g)));
        this.g = g;
    }

    public th2(ArrayList arrayList, int i) {
        switch (i) {
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                this.h = arrayList;
                break;
            default:
                this.g = 0;
                this.h = arrayList;
                break;
        }
    }

    public th2(uu uuVar, int i) {
        xc1.j(uuVar);
        this.h = uuVar;
        this.g = i;
    }

    public n3 a() {
        ListAdapter listAdapter;
        j3 j3Var = (j3) this.h;
        ContextThemeWrapper contextThemeWrapper = j3Var.f459a;
        ContextThemeWrapper contextThemeWrapper2 = j3Var.f459a;
        n3 n3Var = new n3(contextThemeWrapper, this.g);
        View view = j3Var.f;
        m3 m3Var = n3Var.l;
        if (view != null) {
            m3Var.x = view;
        } else {
            CharSequence charSequence = j3Var.e;
            if (charSequence != null) {
                m3Var.d = charSequence;
                TextView textView = m3Var.v;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = j3Var.d;
            if (drawable != null) {
                m3Var.t = drawable;
                m3Var.s = 0;
                ImageView imageView = m3Var.u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    m3Var.u.setImageDrawable(drawable);
                }
            }
            int i = j3Var.c;
            if (i != 0) {
                m3Var.t = null;
                m3Var.s = i;
                ImageView imageView2 = m3Var.u;
                if (imageView2 != null) {
                    if (i != 0) {
                        imageView2.setVisibility(0);
                        m3Var.u.setImageResource(m3Var.s);
                    } else {
                        imageView2.setVisibility(8);
                    }
                }
            }
        }
        CharSequence charSequence2 = j3Var.g;
        if (charSequence2 != null) {
            m3Var.e = charSequence2;
            TextView textView2 = m3Var.w;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = j3Var.h;
        if (charSequence3 != null) {
            m3Var.c(-1, charSequence3, j3Var.i);
        }
        CharSequence charSequence4 = j3Var.j;
        if (charSequence4 != null) {
            m3Var.c(-2, charSequence4, j3Var.k);
        }
        CharSequence charSequence5 = j3Var.l;
        if (charSequence5 != null) {
            m3Var.c(-3, charSequence5, j3Var.m);
        }
        if (j3Var.p != null || j3Var.q != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) j3Var.b.inflate(m3Var.B, (ViewGroup) null);
            if (j3Var.u) {
                listAdapter = new g3(j3Var, contextThemeWrapper2, m3Var.C, j3Var.p, alertController$RecycleListView);
            } else {
                int i2 = j3Var.v ? m3Var.D : m3Var.E;
                listAdapter = j3Var.q;
                if (listAdapter == null) {
                    listAdapter = new l3(contextThemeWrapper2, i2, R.id.text1, j3Var.p);
                }
            }
            m3Var.y = listAdapter;
            m3Var.z = j3Var.w;
            if (j3Var.r != null) {
                alertController$RecycleListView.setOnItemClickListener(new h3(j3Var, m3Var));
            } else if (j3Var.x != null) {
                alertController$RecycleListView.setOnItemClickListener(new i3(j3Var, alertController$RecycleListView, m3Var));
            }
            if (j3Var.v) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (j3Var.u) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            m3Var.f = alertController$RecycleListView;
        }
        View view2 = j3Var.s;
        if (view2 != null) {
            m3Var.g = view2;
            m3Var.h = false;
        }
        n3Var.setCancelable(j3Var.n);
        if (j3Var.n) {
            n3Var.setCanceledOnTouchOutside(true);
        }
        n3Var.setOnCancelListener(null);
        n3Var.setOnDismissListener(null);
        qw0 qw0Var = j3Var.o;
        if (qw0Var != null) {
            n3Var.setOnKeyListener(qw0Var);
        }
        return n3Var;
    }

    @Override // defpackage.m1
    public boolean b(View view) {
        ((BottomSheetBehavior) this.h).O(this.g);
        return true;
    }

    public void c(int i, aa aaVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            aa aaVar2 = ((aa[]) this.h)[i2];
            aaVar2.getClass();
            long j = aaVar.g - aaVar2.g;
            if (0 < j || 0 == j) {
                break;
            }
            aaVar2.f = i;
            ((aa[]) this.h)[i] = aaVar2;
            i = i2;
        }
        ((aa[]) this.h)[i] = aaVar;
        aaVar.f = i;
    }

    public void d(aa aaVar) {
        aa aaVar2;
        int i = aaVar.f;
        if (i == -1) {
            c.m("Failed requirement.");
            return;
        }
        int i2 = this.g;
        aa aaVar3 = ((aa[]) this.h)[i2];
        aaVar3.getClass();
        aaVar.f = -1;
        aa[] aaVarArr = (aa[]) this.h;
        aaVarArr[i2] = null;
        this.g = i2 - 1;
        if (aaVar == aaVar3) {
            return;
        }
        long j = aaVar3.g - aaVar.g;
        char c = 0 >= j ? 0 == j ? (char) 0 : (char) 1 : (char) 65535;
        if (c == 0) {
            aaVarArr[i] = aaVar3;
            aaVar3.f = i;
            return;
        }
        if (c >= 0) {
            c(i, aaVar3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.g;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                aaVar2 = ((aa[]) this.h)[i3];
                aaVar2.getClass();
            } else {
                aaVar2 = ((aa[]) this.h)[i3];
                aaVar2.getClass();
                aa aaVar4 = ((aa[]) this.h)[i4];
                aaVar4.getClass();
                if (0 >= aaVar4.g - aaVar2.g) {
                    aaVar2 = aaVar4;
                }
            }
            long j2 = aaVar2.g - aaVar3.g;
            if (0 < j2 || 0 == j2) {
                break;
            }
            int i6 = aaVar2.f;
            aaVar2.f = i;
            ((aa[]) this.h)[i] = aaVar2;
            i = i6;
        }
        ((aa[]) this.h)[i] = aaVar3;
        aaVar3.f = i;
    }

    public void e() {
        TypedValue typedValue = new TypedValue();
        j3 j3Var = (j3) this.h;
        j3Var.f459a.getTheme().resolveAttribute(flar2.devcheck.R.attr.ic_shizuku, typedValue, true);
        j3Var.c = typedValue.resourceId;
    }

    public void f(int i) {
        j3 j3Var = (j3) this.h;
        j3Var.g = j3Var.f459a.getText(i);
    }

    public void g(int i, DialogInterface.OnClickListener onClickListener) {
        j3 j3Var = (j3) this.h;
        j3Var.j = j3Var.f459a.getText(i);
        j3Var.k = onClickListener;
    }

    public void h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        j3 j3Var = (j3) this.h;
        j3Var.j = charSequence;
        j3Var.k = onClickListener;
    }

    public void i(int i, DialogInterface.OnClickListener onClickListener) {
        j3 j3Var = (j3) this.h;
        j3Var.h = j3Var.f459a.getText(i);
        j3Var.i = onClickListener;
    }

    public void j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        j3 j3Var = (j3) this.h;
        j3Var.h = charSequence;
        j3Var.i = onClickListener;
    }

    public void k(int i) {
        j3 j3Var = (j3) this.h;
        j3Var.e = j3Var.f459a.getText(i);
    }

    public n3 l() {
        n3 a2 = a();
        a2.show();
        return a2;
    }

    public void m(so2 so2Var) {
        fi2 fi2Var = (fi2) this.h;
        int i = this.g;
        try {
            if (fi2Var.B == null) {
                throw null;
            }
            ih2 ih2Var = fi2Var.B;
            String packageName = fi2Var.z.getPackageName();
            String str = i != 2 ? i != 3 ? i != 6 ? i != 7 ? "QUERY_SKU_DETAILS_ASYNC" : "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION" : "ACKNOWLEDGE_PURCHASE" : "LAUNCH_BILLING_FLOW";
            xh2 xh2Var = new xh2(so2Var);
            gh2 gh2Var = (gh2) ih2Var;
            Parcel a2 = gh2Var.a();
            a2.writeString(packageName);
            a2.writeString(str);
            int i2 = eh2.f234a;
            a2.writeStrongBinder(xh2Var);
            try {
                gh2Var.h.transact(1, a2, null, 1);
                a2.recycle();
            } catch (Throwable th) {
                a2.recycle();
                throw th;
            }
        } catch (Exception unused) {
            fi2Var.C(107, 28, li2.t);
            bk2.g("BillingClientTesting");
            so2Var.d = true;
            wo2 wo2Var = so2Var.b;
            if (wo2Var != null) {
                uo2 uo2Var = wo2Var.h;
                uo2Var.getClass();
                if (ro2.l.P(uo2Var, null, 0)) {
                    ro2.d(uo2Var);
                    so2Var.f948a = null;
                    so2Var.b = null;
                    so2Var.c = null;
                }
            }
        }
    }
}
