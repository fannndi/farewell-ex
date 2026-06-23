package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;

/* loaded from: classes.dex */
public final class qd0 implements LayoutInflater.Factory2 {
    public final ae0 g;

    public qd0(ae0 ae0Var) {
        this.g = ae0Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        je0 f;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        ae0 ae0Var = this.g;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, ae0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ub1.f1032a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = ld0.class.isAssignableFrom(vd0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    ld0 B = resourceId != -1 ? ae0Var.B(resourceId) : null;
                    if (B == null && string != null) {
                        B = ae0Var.C(string);
                    }
                    if (B == null && id != -1) {
                        B = ae0Var.B(id);
                    }
                    if (B == null) {
                        vd0 F = ae0Var.F();
                        context.getClassLoader();
                        B = F.a(attributeValue);
                        B.t = true;
                        B.C = resourceId != 0 ? resourceId : id;
                        B.D = id;
                        B.E = string;
                        B.u = true;
                        B.y = ae0Var;
                        nd0 nd0Var = ae0Var.t;
                        B.z = nd0Var;
                        a5 a5Var = nd0Var.o;
                        B.K = true;
                        if ((nd0Var == null ? null : nd0Var.n) != null) {
                            B.K = true;
                        }
                        f = ae0Var.a(B);
                        if (ae0.H(2)) {
                            B.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (B.u) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + hTYJVDOvZnZlYL.NWgDlewunPLjQbV + attributeValue);
                        }
                        B.u = true;
                        B.y = ae0Var;
                        nd0 nd0Var2 = ae0Var.t;
                        B.z = nd0Var2;
                        a5 a5Var2 = nd0Var2.o;
                        B.K = true;
                        if ((nd0Var2 == null ? null : nd0Var2.n) != null) {
                            B.K = true;
                        }
                        f = ae0Var.f(B);
                        if (ae0.H(2)) {
                            B.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    ke0 ke0Var = le0.f584a;
                    le0.b(new fe0(B, "Attempting to use <fragment> tag to add fragment " + B + " to container " + viewGroup));
                    le0.a(B).getClass();
                    B.L = viewGroup;
                    f.k();
                    f.j();
                    View view2 = B.M;
                    if (view2 == null) {
                        c.n(d51.y("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (B.M.getTag() == null) {
                        B.M.setTag(string);
                    }
                    B.M.addOnAttachStateChangeListener(new pd0(this, f));
                    return B.M;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
