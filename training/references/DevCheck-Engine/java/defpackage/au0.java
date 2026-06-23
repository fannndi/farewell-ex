package defpackage;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.manifest.ManifestActivity;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class au0 extends td1 {
    public final ArrayList d = new ArrayList();
    public String e;
    public final int f;

    public au0(ManifestActivity manifestActivity) {
        if (uz1.d(manifestActivity)) {
            this.f = Color.parseColor("#8e261d");
        } else {
            this.f = -256;
        }
    }

    @Override // defpackage.td1
    public final int c() {
        try {
            return this.d.size();
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // defpackage.td1
    public final void l(te1 te1Var, int i) {
        int indexOf;
        int length;
        TextView textView = ((zt0) te1Var).A;
        SpannableString spannableString = (SpannableString) this.d.get(i);
        if (!TextUtils.isEmpty(this.e) && spannableString != null) {
            String spannableString2 = spannableString.toString();
            Locale locale = Locale.ROOT;
            if (spannableString2.toLowerCase(locale).contains(this.e)) {
                String str = this.e;
                int i2 = this.f;
                String str2 = uz1.f1060a;
                if (!TextUtils.isEmpty(str) && (indexOf = spannableString.toString().toLowerCase(locale).indexOf(str)) != -1 && (length = str.length() + indexOf) <= spannableString.length()) {
                    spannableString.setSpan(new BackgroundColorSpan(i2), indexOf, length, 17);
                }
                textView.setText(spannableString);
                return;
            }
        }
        textView.setText(spannableString);
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        View j = d51.j(viewGroup, R.layout.manifest_line, viewGroup, false);
        zt0 zt0Var = new zt0(j);
        zt0Var.A = (TextView) j.findViewById(R.id.line);
        return zt0Var;
    }
}
