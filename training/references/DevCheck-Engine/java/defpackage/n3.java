package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import flar2.devcheck.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class n3 extends c6 implements DialogInterface {
    public final m3 l;

    public n3(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, g(contextThemeWrapper, i));
        this.l = new m3(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button f(int i) {
        m3 m3Var = this.l;
        if (i == -3) {
            return m3Var.o;
        }
        if (i == -2) {
            return m3Var.l;
        }
        if (i == -1) {
            return m3Var.i;
        }
        m3Var.getClass();
        return null;
    }

    @Override // defpackage.c6, defpackage.bu, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        m3 m3Var = this.l;
        m3Var.b.setContentView(m3Var.A);
        Context context = m3Var.f615a;
        Window window = m3Var.c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view = m3Var.g;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !m3.a(view)) {
            window.setFlags(rt0.C, rt0.C);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (m3Var.h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (m3Var.f != null) {
                ((LinearLayout.LayoutParams) ((vq0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b = m3.b(findViewById6, findViewById3);
        ViewGroup b2 = m3.b(findViewById7, findViewById4);
        ViewGroup b3 = m3.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        m3Var.r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        m3Var.r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(android.R.id.message);
        m3Var.w = textView;
        if (textView != null) {
            CharSequence charSequence = m3Var.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                m3Var.r.removeView(m3Var.w);
                if (m3Var.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) m3Var.r.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(m3Var.r);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(m3Var.f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) b3.findViewById(android.R.id.button1);
        m3Var.i = button;
        q1 q1Var = m3Var.H;
        button.setOnClickListener(q1Var);
        boolean isEmpty = TextUtils.isEmpty(m3Var.j);
        Button button2 = m3Var.i;
        if (isEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(m3Var.j);
            m3Var.i.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) b3.findViewById(android.R.id.button2);
        m3Var.l = button3;
        button3.setOnClickListener(q1Var);
        boolean isEmpty2 = TextUtils.isEmpty(m3Var.m);
        Button button4 = m3Var.l;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(m3Var.m);
            m3Var.l.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) b3.findViewById(android.R.id.button3);
        m3Var.o = button5;
        button5.setOnClickListener(q1Var);
        boolean isEmpty3 = TextUtils.isEmpty(m3Var.p);
        Button button6 = m3Var.o;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(m3Var.p);
            m3Var.o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = m3Var.i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = m3Var.l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = m3Var.o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            b3.setVisibility(8);
        }
        if (m3Var.x != null) {
            b.addView(m3Var.x, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            m3Var.u = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(m3Var.d) || !m3Var.F) {
                window.findViewById(R.id.title_template).setVisibility(8);
                m3Var.u.setVisibility(8);
                b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                m3Var.v = textView2;
                textView2.setText(m3Var.d);
                int i2 = m3Var.s;
                if (i2 != 0) {
                    m3Var.u.setImageResource(i2);
                } else {
                    Drawable drawable = m3Var.t;
                    if (drawable != null) {
                        m3Var.u.setImageDrawable(drawable);
                    } else {
                        m3Var.v.setPadding(m3Var.u.getPaddingLeft(), m3Var.u.getPaddingTop(), m3Var.u.getPaddingRight(), m3Var.u.getPaddingBottom());
                        m3Var.u.setVisibility(8);
                    }
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i3 = (b == null || b.getVisibility() == 8) ? 0 : 1;
        boolean z3 = b3.getVisibility() != 8;
        if (!z3 && (findViewById = b2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = m3Var.r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (m3Var.e == null && m3Var.f == null) ? null : b.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = b2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = m3Var.f;
        if (alertController$RecycleListView != null && (!z3 || i3 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.g, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.h);
        }
        if (!z2) {
            View view2 = m3Var.f;
            if (view2 == null) {
                view2 = m3Var.r;
            }
            if (view2 != null) {
                int i4 = z3 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = y62.f1215a;
                view2.setScrollIndicators(i3 | i4, 3);
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = m3Var.f;
        if (alertController$RecycleListView2 == null || (listAdapter = m3Var.y) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i5 = m3Var.z;
        if (i5 > -1) {
            alertController$RecycleListView2.setItemChecked(i5, true);
            alertController$RecycleListView2.setSelection(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.l.r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.l.r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.c6, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m3 m3Var = this.l;
        m3Var.d = charSequence;
        TextView textView = m3Var.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
