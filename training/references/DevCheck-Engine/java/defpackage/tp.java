package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class tp {

    /* renamed from: a, reason: collision with root package name */
    public boolean f999a;
    public boolean b;
    public final Object c;
    public final Serializable d;
    public Object e;

    public tp() {
        this.c = new HashMap();
        this.d = new HashSet();
    }

    public tp(Context context, String str, ko koVar, boolean z, boolean z2) {
        context.getClass();
        koVar.getClass();
        this.c = context;
        this.d = str;
        this.e = koVar;
        this.f999a = z;
        this.b = z2;
    }

    public boolean a(qv0 qv0Var) {
        int id = qv0Var.getId();
        HashSet hashSet = (HashSet) this.d;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        qv0 qv0Var2 = (qv0) ((HashMap) this.c).get(Integer.valueOf(c()));
        if (qv0Var2 != null) {
            e(qv0Var2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id));
        if (!qv0Var.isChecked()) {
            qv0Var.setChecked(true);
        }
        return add;
    }

    public ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet((HashSet) this.d);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof qv0) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int c() {
        HashSet hashSet = (HashSet) this.d;
        if (!this.f999a || hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public void d() {
        gq gqVar = (gq) this.e;
        if (gqVar != null) {
            new HashSet((HashSet) this.d);
            ChipGroup chipGroup = gqVar.g;
            jq jqVar = chipGroup.m;
            if (jqVar != null) {
                jqVar.f(chipGroup, chipGroup.n.b(chipGroup));
            }
        }
    }

    public boolean e(qv0 qv0Var, boolean z) {
        int id = qv0Var.getId();
        HashSet hashSet = (HashSet) this.d;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            qv0Var.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id));
        if (qv0Var.isChecked()) {
            qv0Var.setChecked(false);
        }
        return remove;
    }
}
