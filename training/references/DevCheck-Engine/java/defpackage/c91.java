package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class c91 extends te1 {
    public final Drawable A;
    public final ColorStateList B;
    public final SparseArray C;
    public boolean D;
    public boolean E;

    public c91(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.C = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(flar2.devcheck.R.id.icon_frame, view.findViewById(flar2.devcheck.R.id.icon_frame));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.A = view.getBackground();
        if (textView != null) {
            this.B = textView.getTextColors();
        }
    }

    public final View r(int i) {
        SparseArray sparseArray = this.C;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.g.findViewById(i);
        if (findViewById != null) {
            sparseArray.put(i, findViewById);
        }
        return findViewById;
    }
}
