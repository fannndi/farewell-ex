package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import flar2.devcheck.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class o0 {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f709a;
    public final n0 b;

    public o0() {
        this(c);
    }

    public o0(View.AccessibilityDelegate accessibilityDelegate) {
        this.f709a = accessibilityDelegate;
        this.b = new n0(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f709a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public gm2 b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f709a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new gm2(1, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f709a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, c1 c1Var) {
        this.f709a.onInitializeAccessibilityNodeInfo(view, c1Var.f104a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f709a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f709a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            v0 v0Var = (v0) list.get(i2);
            if (v0Var.a() == i) {
                Class cls = v0Var.c;
                m1 m1Var = v0Var.d;
                if (m1Var != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception unused) {
                        }
                    }
                    z = m1Var.b(view);
                }
            } else {
                i2++;
            }
        }
        z = false;
        if (!z) {
            z = this.f709a.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
                i4++;
            }
        }
        return z2;
    }

    public void h(View view, int i) {
        this.f709a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f709a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
