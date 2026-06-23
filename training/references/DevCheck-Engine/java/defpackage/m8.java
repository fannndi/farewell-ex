package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.divider.MaterialDivider;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public class m8 extends te1 implements View.OnClickListener {
    public final TextView A;
    public final TextView B;
    public final ImageView C;
    public final ImageView D;
    public final MaterialDivider E;
    public final /* synthetic */ n8 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(n8 n8Var, View view) {
        super(view);
        this.F = n8Var;
        this.A = (TextView) view.findViewById(R.id.title);
        this.B = (TextView) view.findViewById(R.id.desc);
        this.C = (ImageView) view.findViewById(R.id.icon);
        this.D = (ImageView) view.findViewById(R.id.settings);
        this.E = (MaterialDivider) view.findViewById(R.id.divider);
        view.setOnClickListener(this);
    }

    public void onClick(View view) {
        n8 n8Var = this.F;
        v8 v8Var = n8Var.f;
        if (v8Var != null) {
            String str = ((y61) n8Var.d.get(b())).h;
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + str));
                v8Var.s0(intent);
                v8Var.j0 = true;
            } catch (Exception unused) {
                try {
                    v8Var.s0(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
                } catch (Exception unused2) {
                }
            }
        }
    }
}
