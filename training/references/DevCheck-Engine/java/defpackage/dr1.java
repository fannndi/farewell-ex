package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import flar2.devcheck.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class dr1 implements an1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f206a;
    public final cn1 b;
    public final int[][] c;
    public final cn1[] d;
    public final cr1 e;
    public final cr1 f;
    public final cr1 g;
    public final cr1 h;

    public dr1(eu euVar) {
        this.f206a = euVar.b;
        this.b = (cn1) euVar.e;
        this.c = (int[][]) euVar.f;
        this.d = (cn1[]) euVar.c;
        this.e = (cr1) euVar.d;
        this.f = (cr1) euVar.g;
        this.g = (cr1) euVar.h;
        this.h = (cr1) euVar.i;
    }

    public static void g(eu euVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = yb1.F;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                cn1 a2 = cn1.g(context, obtainAttributes.getResourceId(0, 0), obtainAttributes.getResourceId(1, 0)).a();
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                euVar.b(StateSet.trimStateSet(iArr2, i), a2);
            }
        }
    }

    public static dr1 h(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        eu euVar = new eu(2);
        euVar.j();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            euVar.j();
        }
        try {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (xml.getName().equals("selector")) {
                g(euVar, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            return euVar.d();
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.an1
    public final cn1 a(float f) {
        return i().a(f);
    }

    @Override // defpackage.an1
    public final cn1 b(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            i2 = this.f206a;
            iArr2 = this.c;
            if (i4 >= i2) {
                i4 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i3], iArr3)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            i4 = i;
        }
        cn1[] cn1VarArr = this.d;
        cr1 cr1Var = this.h;
        cr1 cr1Var2 = this.g;
        cr1 cr1Var3 = this.f;
        cr1 cr1Var4 = this.e;
        if (cr1Var4 == null && cr1Var3 == null && cr1Var2 == null && cr1Var == null) {
            return cn1VarArr[i4];
        }
        bn1 l = cn1VarArr[i4].l();
        if (cr1Var4 != null) {
            l.e = cr1Var4.c(iArr);
        }
        if (cr1Var3 != null) {
            l.f = cr1Var3.c(iArr);
        }
        if (cr1Var2 != null) {
            l.h = cr1Var2.c(iArr);
        }
        if (cr1Var != null) {
            l.g = cr1Var.c(iArr);
        }
        return l.a();
    }

    @Override // defpackage.an1
    public final cn1[] c() {
        return this.d;
    }

    @Override // defpackage.an1
    public final cn1 d() {
        return i();
    }

    @Override // defpackage.an1
    public final cn1 e(of1 of1Var) {
        return i().e(of1Var);
    }

    @Override // defpackage.an1
    public final boolean f() {
        cr1 cr1Var;
        cr1 cr1Var2;
        cr1 cr1Var3;
        cr1 cr1Var4;
        return this.f206a > 1 || ((cr1Var = this.e) != null && cr1Var.f152a > 1) || (((cr1Var2 = this.f) != null && cr1Var2.f152a > 1) || (((cr1Var3 = this.g) != null && cr1Var3.f152a > 1) || ((cr1Var4 = this.h) != null && cr1Var4.f152a > 1)));
    }

    public final cn1 i() {
        cn1 cn1Var = this.b;
        cr1 cr1Var = this.h;
        cr1 cr1Var2 = this.g;
        cr1 cr1Var3 = this.f;
        cr1 cr1Var4 = this.e;
        if (cr1Var4 == null && cr1Var3 == null && cr1Var2 == null && cr1Var == null) {
            return cn1Var;
        }
        bn1 l = cn1Var.l();
        if (cr1Var4 != null) {
            l.e = cr1Var4.b;
        }
        if (cr1Var3 != null) {
            l.f = cr1Var3.b;
        }
        if (cr1Var2 != null) {
            l.h = cr1Var2.b;
        }
        if (cr1Var != null) {
            l.g = cr1Var.b;
        }
        return l.a();
    }

    public final eu j() {
        eu euVar = new eu(2);
        int i = this.f206a;
        euVar.b = i;
        euVar.e = this.b;
        int[][] iArr = this.c;
        int[][] iArr2 = new int[iArr.length][];
        euVar.f = iArr2;
        cn1[] cn1VarArr = this.d;
        euVar.c = new cn1[cn1VarArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        System.arraycopy(cn1VarArr, 0, (cn1[]) euVar.c, 0, euVar.b);
        euVar.d = this.e;
        euVar.g = this.f;
        euVar.h = this.g;
        euVar.i = this.h;
        return euVar;
    }
}
