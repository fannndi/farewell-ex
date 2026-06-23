package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class js extends FrameLayout implements View.OnClickListener {
    public final ImageView g;
    public final int h;
    public final is i;
    public final ImageView j;

    public js(Context context, int i, boolean z, m01 m01Var) {
        super(context);
        this.h = i;
        this.i = m01Var;
        LayoutInflater.from(context).inflate(R.layout.color_picker_swatch, this);
        this.j = (ImageView) findViewById(R.id.color_picker_swatch);
        this.g = (ImageView) findViewById(R.id.color_picker_checkmark);
        setColor(i);
        setChecked(z);
        setOnClickListener(this);
    }

    private void setChecked(boolean z) {
        ImageView imageView = this.g;
        if (z) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        is isVar = this.i;
        if (isVar != null) {
            isVar.k(this.h);
        }
    }

    public void setColor(int i) {
        this.j.setImageDrawable(new rs(new Drawable[]{getContext().getResources().getDrawable(R.drawable.color_picker_swatch)}, i));
    }
}
