package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class rz0 extends xz0 {
    public final LinearLayout A;
    public final TextView B;
    public final TextView C;

    public rz0(View view, int i) {
        super(view);
        this.A = (LinearLayout) view.findViewById(R.id.item_packageinfo_card);
        this.B = (TextView) view.findViewById(R.id.item_title);
        TextView textView = (TextView) view.findViewById(R.id.item_summary);
        this.C = textView;
        zv0 v = l01.v(view.getContext());
        try {
            v.setLayoutParams(textView.getLayoutParams());
            v.setTypeface(textView.getTypeface(), 1);
            v.setTextColor(l01.D);
            if (i == 37) {
                v.setTextSize(16.0f);
            } else {
                v.setTextSize(14.0f);
            }
        } catch (Exception unused) {
        }
        try {
            this.A.removeView(this.C);
            this.A.addView(v);
        } catch (Exception unused2) {
        }
        this.C = v;
    }
}
