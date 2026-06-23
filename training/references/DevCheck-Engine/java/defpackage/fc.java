package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import flar2.devcheck.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class fc {

    /* renamed from: a, reason: collision with root package name */
    public final ec f275a;
    public final ec b = new ec();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public int l;

    public fc(Context context, ec ecVar) {
        AttributeSet attributeSet;
        int i;
        int next;
        ec ecVar2 = ecVar == null ? new ec() : ecVar;
        int i2 = ecVar2.g;
        if (i2 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i2);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = asAttributeSet;
                i = asAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i2));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray J = d10.J(context, attributeSet, yb1.c, R.attr.badgeStyle, i == 0 ? R.style.Widget_MaterialComponents_Badge : i, new int[0]);
        Resources resources = context.getResources();
        this.c = J.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = J.getDimensionPixelSize(15, -1);
        this.e = J.getDimension(13, resources.getDimension(R.dimen.m3_badge_size));
        this.g = J.getDimension(18, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = J.getDimension(4, resources.getDimension(R.dimen.m3_badge_size));
        this.h = J.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = J.getInt(25, 1);
        this.l = J.getInt(2, 0);
        ec ecVar3 = this.b;
        int i3 = ecVar2.o;
        ecVar3.o = i3 == -2 ? 255 : i3;
        int i4 = ecVar2.q;
        if (i4 != -2) {
            ecVar3.q = i4;
        } else {
            boolean hasValue = J.hasValue(24);
            ec ecVar4 = this.b;
            if (hasValue) {
                ecVar4.q = J.getInt(24, 0);
            } else {
                ecVar4.q = -1;
            }
        }
        String str = ecVar2.p;
        if (str != null) {
            this.b.p = str;
        } else if (J.hasValue(8)) {
            this.b.p = J.getString(8);
        }
        ec ecVar5 = this.b;
        ecVar5.u = ecVar2.u;
        CharSequence charSequence = ecVar2.v;
        ecVar5.v = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        ec ecVar6 = this.b;
        int i5 = ecVar2.w;
        ecVar6.w = i5 == 0 ? R.plurals.mtrl_badge_content_description : i5;
        int i6 = ecVar2.x;
        ecVar6.x = i6 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i6;
        Boolean bool = ecVar2.z;
        ecVar6.z = Boolean.valueOf(bool == null || bool.booleanValue());
        ec ecVar7 = this.b;
        int i7 = ecVar2.r;
        ecVar7.r = i7 == -2 ? J.getInt(22, -2) : i7;
        ec ecVar8 = this.b;
        int i8 = ecVar2.s;
        ecVar8.s = i8 == -2 ? J.getInt(23, -2) : i8;
        ec ecVar9 = this.b;
        Integer num = ecVar2.k;
        ecVar9.k = Integer.valueOf(num == null ? J.getResourceId(6, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        ec ecVar10 = this.b;
        Integer num2 = ecVar2.l;
        ecVar10.l = Integer.valueOf(num2 == null ? J.getResourceId(7, 0) : num2.intValue());
        ec ecVar11 = this.b;
        Integer num3 = ecVar2.m;
        ecVar11.m = Integer.valueOf(num3 == null ? J.getResourceId(16, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        ec ecVar12 = this.b;
        Integer num4 = ecVar2.n;
        ecVar12.n = Integer.valueOf(num4 == null ? J.getResourceId(17, 0) : num4.intValue());
        ec ecVar13 = this.b;
        Integer num5 = ecVar2.h;
        ecVar13.h = Integer.valueOf(num5 == null ? tl2.o(context, J, 1).getDefaultColor() : num5.intValue());
        ec ecVar14 = this.b;
        Integer num6 = ecVar2.j;
        ecVar14.j = Integer.valueOf(num6 == null ? J.getResourceId(9, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = ecVar2.i;
        if (num7 != null) {
            this.b.i = num7;
        } else {
            boolean hasValue2 = J.hasValue(10);
            ec ecVar15 = this.b;
            if (hasValue2) {
                ecVar15.i = Integer.valueOf(tl2.o(context, J, 10).getDefaultColor());
            } else {
                int intValue = ecVar15.j.intValue();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, zb1.x);
                obtainStyledAttributes.getDimension(0, 0.0f);
                ColorStateList o = tl2.o(context, obtainStyledAttributes, 3);
                tl2.o(context, obtainStyledAttributes, 4);
                tl2.o(context, obtainStyledAttributes, 5);
                obtainStyledAttributes.getInt(2, 0);
                obtainStyledAttributes.getInt(1, 1);
                int i9 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
                obtainStyledAttributes.getResourceId(i9, 0);
                obtainStyledAttributes.getString(i9);
                obtainStyledAttributes.getBoolean(14, false);
                tl2.o(context, obtainStyledAttributes, 6);
                obtainStyledAttributes.getFloat(7, 0.0f);
                obtainStyledAttributes.getFloat(8, 0.0f);
                obtainStyledAttributes.getFloat(9, 0.0f);
                obtainStyledAttributes.recycle();
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, yb1.H);
                obtainStyledAttributes2.hasValue(0);
                obtainStyledAttributes2.getFloat(0, 0.0f);
                if (Build.VERSION.SDK_INT >= 26) {
                    obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
                }
                obtainStyledAttributes2.recycle();
                this.b.i = Integer.valueOf(o.getDefaultColor());
            }
        }
        ec ecVar16 = this.b;
        Integer num8 = ecVar2.y;
        ecVar16.y = Integer.valueOf(num8 == null ? J.getInt(3, 8388661) : num8.intValue());
        ec ecVar17 = this.b;
        Integer num9 = ecVar2.A;
        ecVar17.A = Integer.valueOf(num9 == null ? J.getDimensionPixelSize(12, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        ec ecVar18 = this.b;
        Integer num10 = ecVar2.B;
        ecVar18.B = Integer.valueOf(num10 == null ? J.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        ec ecVar19 = this.b;
        Integer num11 = ecVar2.C;
        ecVar19.C = Integer.valueOf(num11 == null ? J.getDimensionPixelOffset(19, 0) : num11.intValue());
        ec ecVar20 = this.b;
        Integer num12 = ecVar2.D;
        ecVar20.D = Integer.valueOf(num12 == null ? J.getDimensionPixelOffset(26, 0) : num12.intValue());
        ec ecVar21 = this.b;
        Integer num13 = ecVar2.E;
        ecVar21.E = Integer.valueOf(num13 == null ? J.getDimensionPixelOffset(20, ecVar21.C.intValue()) : num13.intValue());
        ec ecVar22 = this.b;
        Integer num14 = ecVar2.F;
        ecVar22.F = Integer.valueOf(num14 == null ? J.getDimensionPixelOffset(27, ecVar22.D.intValue()) : num14.intValue());
        ec ecVar23 = this.b;
        Integer num15 = ecVar2.I;
        ecVar23.I = Integer.valueOf(num15 == null ? J.getDimensionPixelOffset(21, 0) : num15.intValue());
        ec ecVar24 = this.b;
        Integer num16 = ecVar2.G;
        ecVar24.G = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        ec ecVar25 = this.b;
        Integer num17 = ecVar2.H;
        ecVar25.H = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        ec ecVar26 = this.b;
        Boolean bool2 = ecVar2.J;
        ecVar26.J = Boolean.valueOf(bool2 == null ? J.getBoolean(0, false) : bool2.booleanValue());
        J.recycle();
        Locale locale = ecVar2.t;
        ec ecVar27 = this.b;
        if (locale == null) {
            ecVar27.t = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            ecVar27.t = locale;
        }
        this.f275a = ecVar2;
    }
}
