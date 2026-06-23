package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class s32 extends k32 {
    public static Font E(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int H = H(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int H2 = H(fontStyle, font2.getStyle());
            if (H2 < H) {
                font = font2;
                H = H2;
            }
        }
        return font;
    }

    public static int H(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final FontFamily F(yc0[] yc0VarArr, ContentResolver contentResolver) {
        Font font;
        String str;
        ParcelFileDescriptor openFileDescriptor;
        FontFamily.Builder builder = null;
        for (yc0 yc0Var : yc0VarArr) {
            if (Objects.equals(yc0Var.f1225a.getScheme(), "systemfont")) {
                font = G(yc0Var);
            } else {
                try {
                    Uri uri = yc0Var.f1225a;
                    str = yc0Var.e;
                    openFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    font = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(openFileDescriptor).setWeight(yc0Var.c).setSlant(yc0Var.d ? 1 : 0).setTtcIndex(yc0Var.b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        font = ttcIndex.build();
                        openFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (font != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(font);
                } else {
                    builder.addFont(font);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font G(yc0 yc0Var) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.k32
    public final Typeface m(Context context, vc0 vc0Var, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (wc0 wc0Var : vc0Var.f1080a) {
                try {
                    Font build = new Font.Builder(resources, wc0Var.f).setWeight(wc0Var.b).setSlant(wc0Var.c ? 1 : 0).setTtcIndex(wc0Var.e).setFontVariationSettings(wc0Var.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(E(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // defpackage.k32
    public final Typeface n(Context context, yc0[] yc0VarArr, int i) {
        try {
            FontFamily F = F(yc0VarArr, context.getContentResolver());
            if (F == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(F).setStyle(E(F, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.k32
    public final Typeface o(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily F = F((yc0[]) list.get(0), contentResolver);
            if (F == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(F);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily F2 = F((yc0[]) list.get(i2), contentResolver);
                if (F2 != null) {
                    customFallbackBuilder.addCustomFallback(F2);
                }
            }
            return customFallbackBuilder.setStyle(E(F, i).getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.k32
    public final Typeface p(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
