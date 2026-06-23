package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import flar2.devcheck.R;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class ig1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f428a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Drawable a(Resources resources) {
        return resources.getDrawable(R.drawable.ic_about, null);
    }

    public static Typeface b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i, new TypedValue(), 0, null, false, false);
    }

    public static Typeface c(Context context, int i, TypedValue typedValue, int i2, sl slVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException(gXdyRQCGVlHW.zdGAEa + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            gt0 gt0Var = n32.b;
            Typeface typeface2 = (Typeface) gt0Var.f(n32.b(resources, i, charSequence2, i3, i2));
            int i4 = 9;
            if (typeface2 != null) {
                if (slVar != null) {
                    new Handler(Looper.getMainLooper()).post(new n51(slVar, i4, typeface2));
                }
                typeface = typeface2;
            } else if (!z2) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        uc0 o = md2.o(resources.getXml(i), resources);
                        if (o != null) {
                            typeface = n32.a(context, o, resources, i, charSequence2, typedValue.assetCookie, i2, slVar, z);
                        } else if (slVar != null) {
                            slVar.c(-3);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        Typeface p = n32.f663a.p(context, resources, i, charSequence2, i2);
                        if (p != null) {
                            gt0Var.j(n32.b(resources, i, charSequence2, i5, i2), p);
                        }
                        if (slVar != null) {
                            if (p != null) {
                                new Handler(Looper.getMainLooper()).post(new n51(slVar, i4, p));
                            } else {
                                slVar.c(-3);
                            }
                        }
                        typeface = p;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (slVar != null) {
                        slVar.c(-3);
                    }
                }
            }
        } else if (slVar != null) {
            slVar.c(-3);
        }
        if (typeface != null || slVar != null || z2) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
