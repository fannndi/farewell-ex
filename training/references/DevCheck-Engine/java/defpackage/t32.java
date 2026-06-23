package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t32 extends s32 {
    @Override // defpackage.s32
    public final Font G(yc0 yc0Var) {
        Font d;
        Uri uri = yc0Var.f1225a;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str = yc0Var.e;
        String authority = equals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface create = Typeface.create(authority, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (d = n32.d(create)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return d;
                }
                try {
                    return new Font.Builder(d).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                }
            }
        }
        return null;
    }
}
