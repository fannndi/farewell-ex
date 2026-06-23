package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.tests.TestActivity;

/* loaded from: classes.dex */
public class jx1 extends te1 implements View.OnClickListener {
    public final TextView A;
    public final ImageView B;
    public final ImageView C;
    public final /* synthetic */ kx1 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx1(kx1 kx1Var, View view) {
        super(view);
        this.D = kx1Var;
        this.A = (TextView) view.findViewById(R.id.title);
        this.B = (ImageView) view.findViewById(R.id.icon);
        this.C = (ImageView) view.findViewById(R.id.status);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            hx1 hx1Var = this.D.f;
            if (hx1Var != null) {
                TestActivity testActivity = (TestActivity) hx1Var;
                testActivity.D(b(), this.A.getText().toString());
            }
        } catch (NullPointerException unused) {
        }
    }
}
