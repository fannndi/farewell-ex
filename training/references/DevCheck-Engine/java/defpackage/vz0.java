package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class vz0 extends xz0 {
    public final TextView A;
    public final TextView B;

    public vz0(View view) {
        super(view);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.framelayout);
        this.A = (TextView) view.findViewById(R.id.item_title);
        TextView textView = (TextView) view.findViewById(R.id.item_summary);
        this.B = textView;
        zv0 v = l01.v(view.getContext());
        try {
            v.setLayoutParams(textView.getLayoutParams());
            v.setTextColor(l01.D);
            v.setTypeface(textView.getTypeface(), 1);
            v.setTextSize(16.0f);
            frameLayout.removeView(textView);
            frameLayout.addView(v);
        } catch (Exception unused) {
        }
        this.B = v;
    }
}
