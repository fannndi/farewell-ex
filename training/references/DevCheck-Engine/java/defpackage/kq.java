package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class kq implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener g;
    public final /* synthetic */ ChipGroup h;

    public kq(ChipGroup chipGroup) {
        this.h = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.h;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            tp tpVar = chipGroup.n;
            Chip chip = (Chip) view2;
            ((HashMap) tpVar.c).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                tpVar.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new gm2(19, tpVar));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.g;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.h;
        if (view == chipGroup && (view2 instanceof Chip)) {
            tp tpVar = chipGroup.n;
            Chip chip = (Chip) view2;
            tpVar.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            ((HashMap) tpVar.c).remove(Integer.valueOf(chip.getId()));
            ((HashSet) tpVar.d).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.g;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
