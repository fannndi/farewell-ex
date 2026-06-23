package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class jz0 extends xz0 {
    public final TextView A;
    public final ImageView B;

    public jz0(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.item_summary);
        this.A = textView;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linearlayout);
        this.B = (ImageView) view.findViewById(R.id.item_icon);
        zv0 v = l01.v(view.getContext());
        try {
            v.setLayoutParams(textView.getLayoutParams());
            v.setTextColor(textView.getTextColors().getDefaultColor());
            v.setTypeface(textView.getTypeface(), 1);
            v.setTextSize(uz1.o0(view.getContext(), view.getResources().getDimension(R.dimen.header_font_size)));
            linearLayout.removeView(textView);
            linearLayout.addView(v);
        } catch (Exception unused) {
        }
        this.A = v;
    }
}
