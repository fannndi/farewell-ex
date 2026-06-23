package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.tools.ToolsActivity;

/* loaded from: classes.dex */
public class a02 extends te1 implements View.OnClickListener {
    public TextView A;
    public final TextView B;
    public final ImageView C;
    public final /* synthetic */ b02 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a02(b02 b02Var, View view) {
        super(view);
        this.D = b02Var;
        this.A = (TextView) view.findViewById(R.id.title);
        this.C = (ImageView) view.findViewById(R.id.icon);
        this.B = (TextView) view.findViewById(R.id.pro_badge);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ToolsActivity toolsActivity = this.D.f;
        if (toolsActivity != null) {
            toolsActivity.B(b(), this.A.getText().toString());
        }
    }
}
