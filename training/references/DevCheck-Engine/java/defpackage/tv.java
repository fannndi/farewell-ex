package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.logging.impl.SimpleLog;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class tv {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1009a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(jd jdVar, String str) {
        int i;
        String[] split = str.split(CDsMEtnUjndKau.wgcQTBUwHBYn);
        Context context = jdVar.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = mb1.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && jdVar.isInEditMode() && (jdVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) jdVar.getParent();
                if (trim != null) {
                    HashMap hashMap = constraintLayout.s;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.s.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static ov d(Context context, AttributeSet attributeSet, boolean z) {
        ov ovVar = new ov();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? rb1.c : rb1.f882a);
        String[] strArr = rt0.e;
        rv rvVar = ovVar.b;
        sv svVar = ovVar.e;
        qv qvVar = ovVar.c;
        pv pvVar = ovVar.d;
        int[] iArr = d;
        SparseIntArray sparseIntArray = e;
        int i = 3;
        if (z) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            nv nvVar = new nv();
            nvVar.f702a = new int[10];
            nvVar.b = new int[10];
            nvVar.c = 0;
            nvVar.d = new int[10];
            nvVar.e = new float[10];
            nvVar.f = 0;
            nvVar.g = new int[5];
            nvVar.h = new String[5];
            nvVar.i = 0;
            nvVar.j = new int[4];
            nvVar.k = new boolean[4];
            nvVar.l = 0;
            qvVar.getClass();
            pvVar.getClass();
            svVar.getClass();
            int i2 = 0;
            while (i2 < indexCount) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (f.get(index)) {
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        nvVar.b(2, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.I));
                        continue;
                    case 3:
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    case rt0.o /* 9 */:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case rt0.q /* 32 */:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case 5:
                        nvVar.c(5, obtainStyledAttributes.getString(index));
                        continue;
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        nvVar.b(6, obtainStyledAttributes.getDimensionPixelOffset(index, pvVar.C));
                        break;
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        nvVar.b(7, obtainStyledAttributes.getDimensionPixelOffset(index, pvVar.D));
                        break;
                    case 8:
                        nvVar.b(8, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.J));
                        break;
                    case 11:
                        nvVar.b(11, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.P));
                        break;
                    case 12:
                        nvVar.b(12, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.Q));
                        break;
                    case 13:
                        nvVar.b(13, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.M));
                        break;
                    case 14:
                        nvVar.b(14, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.O));
                        break;
                    case 15:
                        nvVar.b(15, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.R));
                        break;
                    case 16:
                        nvVar.b(16, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.N));
                        break;
                    case rt0.p /* 17 */:
                        nvVar.b(17, obtainStyledAttributes.getDimensionPixelOffset(index, pvVar.d));
                        break;
                    case 18:
                        nvVar.b(18, obtainStyledAttributes.getDimensionPixelOffset(index, pvVar.e));
                        break;
                    case 19:
                        nvVar.a(19, obtainStyledAttributes.getFloat(index, pvVar.f));
                        break;
                    case 20:
                        nvVar.a(20, obtainStyledAttributes.getFloat(index, pvVar.w));
                        break;
                    case 21:
                        nvVar.b(21, obtainStyledAttributes.getLayoutDimension(index, pvVar.c));
                        break;
                    case 22:
                        nvVar.b(22, iArr[obtainStyledAttributes.getInt(index, rvVar.f909a)]);
                        break;
                    case 23:
                        nvVar.b(23, obtainStyledAttributes.getLayoutDimension(index, pvVar.b));
                        break;
                    case 24:
                        nvVar.b(24, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.F));
                        break;
                    case 27:
                        nvVar.b(27, obtainStyledAttributes.getInt(index, pvVar.E));
                        break;
                    case 28:
                        nvVar.b(28, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.G));
                        break;
                    case 31:
                        nvVar.b(31, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.K));
                        break;
                    case 34:
                        nvVar.b(34, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.H));
                        break;
                    case 37:
                        nvVar.a(37, obtainStyledAttributes.getFloat(index, pvVar.x));
                        break;
                    case 38:
                        int resourceId = obtainStyledAttributes.getResourceId(index, ovVar.f760a);
                        ovVar.f760a = resourceId;
                        nvVar.b(38, resourceId);
                        break;
                    case 39:
                        nvVar.a(39, obtainStyledAttributes.getFloat(index, pvVar.U));
                        break;
                    case 40:
                        nvVar.a(40, obtainStyledAttributes.getFloat(index, pvVar.T));
                        break;
                    case 41:
                        nvVar.b(41, obtainStyledAttributes.getInt(index, pvVar.V));
                        break;
                    case 42:
                        nvVar.b(42, obtainStyledAttributes.getInt(index, pvVar.W));
                        break;
                    case 43:
                        nvVar.a(43, obtainStyledAttributes.getFloat(index, rvVar.c));
                        break;
                    case 44:
                        nvVar.d(44, true);
                        nvVar.a(44, obtainStyledAttributes.getDimension(index, svVar.m));
                        break;
                    case 45:
                        nvVar.a(45, obtainStyledAttributes.getFloat(index, svVar.b));
                        break;
                    case 46:
                        nvVar.a(46, obtainStyledAttributes.getFloat(index, svVar.c));
                        break;
                    case 47:
                        nvVar.a(47, obtainStyledAttributes.getFloat(index, svVar.d));
                        break;
                    case 48:
                        nvVar.a(48, obtainStyledAttributes.getFloat(index, svVar.e));
                        break;
                    case 49:
                        nvVar.a(49, obtainStyledAttributes.getDimension(index, svVar.f));
                        break;
                    case 50:
                        nvVar.a(50, obtainStyledAttributes.getDimension(index, svVar.g));
                        break;
                    case 51:
                        nvVar.a(51, obtainStyledAttributes.getDimension(index, svVar.i));
                        break;
                    case 52:
                        nvVar.a(52, obtainStyledAttributes.getDimension(index, svVar.j));
                        break;
                    case 53:
                        nvVar.a(53, obtainStyledAttributes.getDimension(index, svVar.k));
                        break;
                    case 54:
                        nvVar.b(54, obtainStyledAttributes.getInt(index, pvVar.X));
                        break;
                    case 55:
                        nvVar.b(55, obtainStyledAttributes.getInt(index, pvVar.Y));
                        break;
                    case 56:
                        nvVar.b(56, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.Z));
                        break;
                    case 57:
                        nvVar.b(57, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.a0));
                        break;
                    case 58:
                        nvVar.b(58, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.b0));
                        break;
                    case 59:
                        nvVar.b(59, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.c0));
                        break;
                    case 60:
                        nvVar.a(60, obtainStyledAttributes.getFloat(index, svVar.f956a));
                        break;
                    case 62:
                        nvVar.b(62, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.A));
                        break;
                    case 63:
                        nvVar.a(63, obtainStyledAttributes.getFloat(index, pvVar.B));
                        break;
                    case rt0.r /* 64 */:
                        nvVar.b(64, f(obtainStyledAttributes, index, qvVar.f863a));
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            nvVar.c(65, obtainStyledAttributes.getString(index));
                            break;
                        } else {
                            nvVar.c(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        nvVar.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        nvVar.a(67, obtainStyledAttributes.getFloat(index, qvVar.e));
                        break;
                    case 68:
                        nvVar.a(68, obtainStyledAttributes.getFloat(index, rvVar.d));
                        break;
                    case 69:
                        nvVar.a(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        nvVar.a(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        break;
                    case 72:
                        nvVar.b(72, obtainStyledAttributes.getInt(index, pvVar.f0));
                        break;
                    case 73:
                        nvVar.b(73, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.g0));
                        break;
                    case 74:
                        nvVar.c(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        nvVar.d(75, obtainStyledAttributes.getBoolean(index, pvVar.n0));
                        break;
                    case 76:
                        nvVar.b(76, obtainStyledAttributes.getInt(index, qvVar.c));
                        break;
                    case 77:
                        nvVar.c(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        nvVar.b(78, obtainStyledAttributes.getInt(index, rvVar.b));
                        break;
                    case 79:
                        nvVar.a(79, obtainStyledAttributes.getFloat(index, qvVar.d));
                        break;
                    case 80:
                        nvVar.d(80, obtainStyledAttributes.getBoolean(index, pvVar.l0));
                        break;
                    case 81:
                        nvVar.d(81, obtainStyledAttributes.getBoolean(index, pvVar.m0));
                        break;
                    case 82:
                        nvVar.b(82, obtainStyledAttributes.getInteger(index, qvVar.b));
                        break;
                    case 83:
                        nvVar.b(83, f(obtainStyledAttributes, index, svVar.h));
                        break;
                    case 84:
                        nvVar.b(84, obtainStyledAttributes.getInteger(index, qvVar.g));
                        break;
                    case 85:
                        nvVar.a(85, obtainStyledAttributes.getFloat(index, qvVar.f));
                        break;
                    case 86:
                        int i3 = obtainStyledAttributes.peekValue(index).type;
                        if (i3 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            qvVar.i = resourceId2;
                            nvVar.b(89, resourceId2);
                            if (qvVar.i != -1) {
                                nvVar.b(88, -2);
                                break;
                            }
                        } else if (i3 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            qvVar.h = string;
                            nvVar.c(90, string);
                            if (qvVar.h.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                qvVar.i = resourceId3;
                                nvVar.b(89, resourceId3);
                                nvVar.b(88, -2);
                                break;
                            } else {
                                nvVar.b(88, -1);
                                break;
                            }
                        } else {
                            nvVar.b(88, obtainStyledAttributes.getInteger(index, qvVar.i));
                            break;
                        }
                        break;
                    case 87:
                        Integer.toHexString(index);
                        sparseIntArray.get(index);
                        break;
                    case 93:
                        nvVar.b(93, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.L));
                        break;
                    case 94:
                        nvVar.b(94, obtainStyledAttributes.getDimensionPixelSize(index, pvVar.S));
                        break;
                    case 95:
                        g(nvVar, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        g(nvVar, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        nvVar.b(97, obtainStyledAttributes.getInt(index, pvVar.o0));
                        break;
                    case 98:
                        int i4 = cy0.w;
                        if (obtainStyledAttributes.peekValue(index).type == i) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            ovVar.f760a = obtainStyledAttributes.getResourceId(index, ovVar.f760a);
                            break;
                        }
                    case 99:
                        nvVar.d(99, obtainStyledAttributes.getBoolean(index, pvVar.g));
                        break;
                }
                i2++;
                i = 3;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount2; i5++) {
                int index2 = obtainStyledAttributes.getIndex(i5);
                if (index2 != 1 && 23 != index2 && 24 != index2) {
                    qvVar.getClass();
                    pvVar.getClass();
                    svVar.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        pvVar.p = f(obtainStyledAttributes, index2, pvVar.p);
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        pvVar.I = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.I);
                        break;
                    case 3:
                        pvVar.o = f(obtainStyledAttributes, index2, pvVar.o);
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        pvVar.n = f(obtainStyledAttributes, index2, pvVar.n);
                        break;
                    case 5:
                        pvVar.y = obtainStyledAttributes.getString(index2);
                        break;
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        pvVar.C = obtainStyledAttributes.getDimensionPixelOffset(index2, pvVar.C);
                        break;
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        pvVar.D = obtainStyledAttributes.getDimensionPixelOffset(index2, pvVar.D);
                        break;
                    case 8:
                        pvVar.J = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.J);
                        break;
                    case rt0.o /* 9 */:
                        pvVar.v = f(obtainStyledAttributes, index2, pvVar.v);
                        break;
                    case 10:
                        pvVar.u = f(obtainStyledAttributes, index2, pvVar.u);
                        break;
                    case 11:
                        pvVar.P = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.P);
                        break;
                    case 12:
                        pvVar.Q = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.Q);
                        break;
                    case 13:
                        pvVar.M = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.M);
                        break;
                    case 14:
                        pvVar.O = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.O);
                        break;
                    case 15:
                        pvVar.R = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.R);
                        break;
                    case 16:
                        pvVar.N = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.N);
                        break;
                    case rt0.p /* 17 */:
                        pvVar.d = obtainStyledAttributes.getDimensionPixelOffset(index2, pvVar.d);
                        break;
                    case 18:
                        pvVar.e = obtainStyledAttributes.getDimensionPixelOffset(index2, pvVar.e);
                        break;
                    case 19:
                        pvVar.f = obtainStyledAttributes.getFloat(index2, pvVar.f);
                        break;
                    case 20:
                        pvVar.w = obtainStyledAttributes.getFloat(index2, pvVar.w);
                        break;
                    case 21:
                        pvVar.c = obtainStyledAttributes.getLayoutDimension(index2, pvVar.c);
                        break;
                    case 22:
                        int i6 = obtainStyledAttributes.getInt(index2, rvVar.f909a);
                        rvVar.f909a = i6;
                        rvVar.f909a = iArr[i6];
                        break;
                    case 23:
                        pvVar.b = obtainStyledAttributes.getLayoutDimension(index2, pvVar.b);
                        break;
                    case 24:
                        pvVar.F = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.F);
                        break;
                    case 25:
                        pvVar.h = f(obtainStyledAttributes, index2, pvVar.h);
                        break;
                    case 26:
                        pvVar.i = f(obtainStyledAttributes, index2, pvVar.i);
                        break;
                    case 27:
                        pvVar.E = obtainStyledAttributes.getInt(index2, pvVar.E);
                        break;
                    case 28:
                        pvVar.G = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.G);
                        break;
                    case 29:
                        pvVar.j = f(obtainStyledAttributes, index2, pvVar.j);
                        break;
                    case 30:
                        pvVar.k = f(obtainStyledAttributes, index2, pvVar.k);
                        break;
                    case 31:
                        pvVar.K = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.K);
                        break;
                    case rt0.q /* 32 */:
                        pvVar.s = f(obtainStyledAttributes, index2, pvVar.s);
                        break;
                    case 33:
                        pvVar.t = f(obtainStyledAttributes, index2, pvVar.t);
                        break;
                    case 34:
                        pvVar.H = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.H);
                        break;
                    case 35:
                        pvVar.m = f(obtainStyledAttributes, index2, pvVar.m);
                        break;
                    case 36:
                        pvVar.l = f(obtainStyledAttributes, index2, pvVar.l);
                        break;
                    case 37:
                        pvVar.x = obtainStyledAttributes.getFloat(index2, pvVar.x);
                        break;
                    case 38:
                        ovVar.f760a = obtainStyledAttributes.getResourceId(index2, ovVar.f760a);
                        break;
                    case 39:
                        pvVar.U = obtainStyledAttributes.getFloat(index2, pvVar.U);
                        break;
                    case 40:
                        pvVar.T = obtainStyledAttributes.getFloat(index2, pvVar.T);
                        break;
                    case 41:
                        pvVar.V = obtainStyledAttributes.getInt(index2, pvVar.V);
                        break;
                    case 42:
                        pvVar.W = obtainStyledAttributes.getInt(index2, pvVar.W);
                        break;
                    case 43:
                        rvVar.c = obtainStyledAttributes.getFloat(index2, rvVar.c);
                        break;
                    case 44:
                        svVar.l = true;
                        svVar.m = obtainStyledAttributes.getDimension(index2, svVar.m);
                        break;
                    case 45:
                        svVar.b = obtainStyledAttributes.getFloat(index2, svVar.b);
                        break;
                    case 46:
                        svVar.c = obtainStyledAttributes.getFloat(index2, svVar.c);
                        break;
                    case 47:
                        svVar.d = obtainStyledAttributes.getFloat(index2, svVar.d);
                        break;
                    case 48:
                        svVar.e = obtainStyledAttributes.getFloat(index2, svVar.e);
                        break;
                    case 49:
                        svVar.f = obtainStyledAttributes.getDimension(index2, svVar.f);
                        break;
                    case 50:
                        svVar.g = obtainStyledAttributes.getDimension(index2, svVar.g);
                        break;
                    case 51:
                        svVar.i = obtainStyledAttributes.getDimension(index2, svVar.i);
                        break;
                    case 52:
                        svVar.j = obtainStyledAttributes.getDimension(index2, svVar.j);
                        break;
                    case 53:
                        svVar.k = obtainStyledAttributes.getDimension(index2, svVar.k);
                        break;
                    case 54:
                        pvVar.X = obtainStyledAttributes.getInt(index2, pvVar.X);
                        break;
                    case 55:
                        pvVar.Y = obtainStyledAttributes.getInt(index2, pvVar.Y);
                        break;
                    case 56:
                        pvVar.Z = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.Z);
                        break;
                    case 57:
                        pvVar.a0 = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.a0);
                        break;
                    case 58:
                        pvVar.b0 = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.b0);
                        break;
                    case 59:
                        pvVar.c0 = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.c0);
                        break;
                    case 60:
                        svVar.f956a = obtainStyledAttributes.getFloat(index2, svVar.f956a);
                        break;
                    case 61:
                        pvVar.z = f(obtainStyledAttributes, index2, pvVar.z);
                        break;
                    case 62:
                        pvVar.A = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.A);
                        break;
                    case 63:
                        pvVar.B = obtainStyledAttributes.getFloat(index2, pvVar.B);
                        break;
                    case rt0.r /* 64 */:
                        qvVar.f863a = f(obtainStyledAttributes, index2, qvVar.f863a);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            qvVar.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            qvVar.getClass();
                            break;
                        }
                    case 66:
                        obtainStyledAttributes.getInt(index2, 0);
                        qvVar.getClass();
                        break;
                    case 67:
                        qvVar.e = obtainStyledAttributes.getFloat(index2, qvVar.e);
                        break;
                    case 68:
                        rvVar.d = obtainStyledAttributes.getFloat(index2, rvVar.d);
                        break;
                    case 69:
                        pvVar.d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        pvVar.e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        break;
                    case 72:
                        pvVar.f0 = obtainStyledAttributes.getInt(index2, pvVar.f0);
                        break;
                    case 73:
                        pvVar.g0 = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.g0);
                        break;
                    case 74:
                        pvVar.j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        pvVar.n0 = obtainStyledAttributes.getBoolean(index2, pvVar.n0);
                        break;
                    case 76:
                        qvVar.c = obtainStyledAttributes.getInt(index2, qvVar.c);
                        break;
                    case 77:
                        pvVar.k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        rvVar.b = obtainStyledAttributes.getInt(index2, rvVar.b);
                        break;
                    case 79:
                        qvVar.d = obtainStyledAttributes.getFloat(index2, qvVar.d);
                        break;
                    case 80:
                        pvVar.l0 = obtainStyledAttributes.getBoolean(index2, pvVar.l0);
                        break;
                    case 81:
                        pvVar.m0 = obtainStyledAttributes.getBoolean(index2, pvVar.m0);
                        break;
                    case 82:
                        qvVar.b = obtainStyledAttributes.getInteger(index2, qvVar.b);
                        break;
                    case 83:
                        svVar.h = f(obtainStyledAttributes, index2, svVar.h);
                        break;
                    case 84:
                        qvVar.g = obtainStyledAttributes.getInteger(index2, qvVar.g);
                        break;
                    case 85:
                        qvVar.f = obtainStyledAttributes.getFloat(index2, qvVar.f);
                        break;
                    case 86:
                        int i7 = obtainStyledAttributes.peekValue(index2).type;
                        if (i7 == 1) {
                            qvVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i7 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            qvVar.h = string2;
                            if (string2.indexOf("/") > 0) {
                                qvVar.i = obtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, qvVar.i);
                        }
                        break;
                    case 87:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Integer.toHexString(index2);
                        sparseIntArray.get(index2);
                        break;
                    case 91:
                        pvVar.q = f(obtainStyledAttributes, index2, pvVar.q);
                        break;
                    case 92:
                        pvVar.r = f(obtainStyledAttributes, index2, pvVar.r);
                        break;
                    case 93:
                        pvVar.L = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.L);
                        break;
                    case 94:
                        pvVar.S = obtainStyledAttributes.getDimensionPixelSize(index2, pvVar.S);
                        break;
                    case 95:
                        g(pvVar, obtainStyledAttributes, index2, 0);
                        break;
                    case 96:
                        g(pvVar, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        pvVar.o0 = obtainStyledAttributes.getInt(index2, pvVar.o0);
                        break;
                }
            }
            if (pvVar.j0 != null) {
                pvVar.i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return ovVar;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(jv jvVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        jvVar.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        tv tvVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = tvVar.c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                try {
                    childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                }
            } else {
                if (tvVar.b && id == -1) {
                    c.o("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1 && hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    ov ovVar = (ov) hashMap.get(Integer.valueOf(id));
                    if (ovVar != null) {
                        rv rvVar = ovVar.b;
                        pv pvVar = ovVar.d;
                        sv svVar = ovVar.e;
                        if (childAt instanceof jd) {
                            pvVar.h0 = 1;
                            jd jdVar = (jd) childAt;
                            jdVar.setId(id);
                            jdVar.setType(pvVar.f0);
                            jdVar.setMargin(pvVar.g0);
                            jdVar.setAllowsGoneWidget(pvVar.n0);
                            int[] iArr = pvVar.i0;
                            if (iArr != null) {
                                jdVar.setReferencedIds(iArr);
                            } else {
                                String str = pvVar.j0;
                                if (str != null) {
                                    int[] c = c(jdVar, str);
                                    pvVar.i0 = c;
                                    jdVar.setReferencedIds(c);
                                }
                            }
                        }
                        jv jvVar = (jv) childAt.getLayoutParams();
                        jvVar.a();
                        ovVar.a(jvVar);
                        HashMap hashMap2 = ovVar.f;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : hashMap2.keySet()) {
                            fv fvVar = (fv) hashMap2.get(str2);
                            if (!fvVar.f305a) {
                                str2 = "set" + str2;
                            }
                            try {
                                int A = d51.A(fvVar.b);
                                Class cls2 = Float.TYPE;
                                Class cls3 = Integer.TYPE;
                                switch (A) {
                                    case 0:
                                        cls.getMethod(str2, cls3).invoke(childAt, Integer.valueOf(fvVar.c));
                                        break;
                                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                        cls.getMethod(str2, cls2).invoke(childAt, Float.valueOf(fvVar.d));
                                        break;
                                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                                        cls.getMethod(str2, cls3).invoke(childAt, Integer.valueOf(fvVar.g));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(str2, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(fvVar.g);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                                        cls.getMethod(str2, CharSequence.class).invoke(childAt, fvVar.e);
                                        break;
                                    case 5:
                                        cls.getMethod(str2, Boolean.TYPE).invoke(childAt, Boolean.valueOf(fvVar.f));
                                        break;
                                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                                        cls.getMethod(str2, cls2).invoke(childAt, Float.valueOf(fvVar.d));
                                        break;
                                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                                        cls.getMethod(str2, cls3).invoke(childAt, Integer.valueOf(fvVar.c));
                                        break;
                                }
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                            }
                        }
                        childAt.setLayoutParams(jvVar);
                        if (rvVar.b == 0) {
                            childAt.setVisibility(rvVar.f909a);
                        }
                        childAt.setAlpha(rvVar.c);
                        childAt.setRotation(svVar.f956a);
                        childAt.setRotationX(svVar.b);
                        childAt.setRotationY(svVar.c);
                        childAt.setScaleX(svVar.d);
                        childAt.setScaleY(svVar.e);
                        if (svVar.h != -1) {
                            if (((View) childAt.getParent()).findViewById(svVar.h) != null) {
                                float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(svVar.f)) {
                                childAt.setPivotX(svVar.f);
                            }
                            if (!Float.isNaN(svVar.g)) {
                                childAt.setPivotY(svVar.g);
                            }
                        }
                        childAt.setTranslationX(svVar.i);
                        childAt.setTranslationY(svVar.j);
                        childAt.setTranslationZ(svVar.k);
                        if (svVar.l) {
                            childAt.setElevation(svVar.m);
                        }
                    }
                }
            }
            i++;
            tvVar = this;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ov ovVar2 = (ov) hashMap.get(num);
            if (ovVar2 != null) {
                pv pvVar2 = ovVar2.d;
                if (pvVar2.h0 == 1) {
                    Context context = constraintLayout.getContext();
                    jd jdVar2 = new jd(context);
                    jdVar2.g = new int[32];
                    jdVar2.m = new HashMap();
                    jdVar2.i = context;
                    kd kdVar = new kd();
                    kdVar.s0 = 0;
                    kdVar.t0 = true;
                    kdVar.u0 = 0;
                    kdVar.v0 = false;
                    jdVar2.p = kdVar;
                    jdVar2.j = kdVar;
                    jdVar2.i();
                    jdVar2.setVisibility(8);
                    jdVar2.setId(num.intValue());
                    int[] iArr2 = pvVar2.i0;
                    if (iArr2 != null) {
                        jdVar2.setReferencedIds(iArr2);
                    } else {
                        String str3 = pvVar2.j0;
                        if (str3 != null) {
                            int[] c2 = c(jdVar2, str3);
                            pvVar2.i0 = c2;
                            jdVar2.setReferencedIds(c2);
                        }
                    }
                    jdVar2.setType(pvVar2.f0);
                    jdVar2.setMargin(pvVar2.g0);
                    jv g = ConstraintLayout.g();
                    jdVar2.i();
                    ovVar2.a(g);
                    constraintLayout.addView(jdVar2, g);
                }
                if (pvVar2.f810a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    jv g2 = ConstraintLayout.g();
                    ovVar2.a(g2);
                    constraintLayout.addView(guideline, g2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof hv) {
                ((hv) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i2;
        int i3;
        tv tvVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = tvVar.c;
        hashMap2.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            jv jvVar = (jv) childAt.getLayoutParams();
            int id = childAt.getId();
            if (tvVar.b && id == -1) {
                c.o(XmJDY.HXxWhkeaogngPOm);
                return;
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new ov());
            }
            ov ovVar = (ov) hashMap2.get(Integer.valueOf(id));
            if (ovVar == null) {
                i = childCount;
                hashMap = hashMap2;
                i2 = i4;
            } else {
                rv rvVar = ovVar.b;
                pv pvVar = ovVar.d;
                sv svVar = ovVar.e;
                HashMap hashMap3 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap hashMap4 = tvVar.f1009a;
                for (String str : hashMap4.keySet()) {
                    int i5 = childCount;
                    fv fvVar = (fv) hashMap4.get(str);
                    HashMap hashMap5 = hashMap2;
                    try {
                        if (str.equals("BackgroundColor")) {
                            i3 = i4;
                            try {
                                hashMap3.put(str, new fv(fvVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                            }
                        } else {
                            i3 = i4;
                            hashMap3.put(str, new fv(fvVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                        i3 = i4;
                    }
                    hashMap2 = hashMap5;
                    childCount = i5;
                    i4 = i3;
                }
                i = childCount;
                hashMap = hashMap2;
                i2 = i4;
                ovVar.f = hashMap3;
                ovVar.f760a = id;
                pvVar.h = jvVar.e;
                pvVar.i = jvVar.f;
                pvVar.j = jvVar.g;
                pvVar.k = jvVar.h;
                pvVar.l = jvVar.i;
                pvVar.m = jvVar.j;
                pvVar.n = jvVar.k;
                pvVar.o = jvVar.l;
                pvVar.p = jvVar.m;
                pvVar.q = jvVar.n;
                pvVar.r = jvVar.o;
                pvVar.s = jvVar.s;
                pvVar.t = jvVar.t;
                pvVar.u = jvVar.u;
                pvVar.v = jvVar.v;
                pvVar.w = jvVar.E;
                pvVar.x = jvVar.F;
                pvVar.y = jvVar.G;
                pvVar.z = jvVar.p;
                pvVar.A = jvVar.q;
                pvVar.B = jvVar.r;
                pvVar.C = jvVar.T;
                pvVar.D = jvVar.U;
                pvVar.E = jvVar.V;
                pvVar.f = jvVar.c;
                pvVar.d = jvVar.f498a;
                pvVar.e = jvVar.b;
                pvVar.b = ((ViewGroup.MarginLayoutParams) jvVar).width;
                pvVar.c = ((ViewGroup.MarginLayoutParams) jvVar).height;
                pvVar.F = ((ViewGroup.MarginLayoutParams) jvVar).leftMargin;
                pvVar.G = ((ViewGroup.MarginLayoutParams) jvVar).rightMargin;
                pvVar.H = ((ViewGroup.MarginLayoutParams) jvVar).topMargin;
                pvVar.I = ((ViewGroup.MarginLayoutParams) jvVar).bottomMargin;
                pvVar.L = jvVar.D;
                pvVar.T = jvVar.I;
                pvVar.U = jvVar.H;
                pvVar.W = jvVar.K;
                pvVar.V = jvVar.J;
                pvVar.l0 = jvVar.W;
                pvVar.m0 = jvVar.X;
                pvVar.X = jvVar.L;
                pvVar.Y = jvVar.M;
                pvVar.Z = jvVar.P;
                pvVar.a0 = jvVar.Q;
                pvVar.b0 = jvVar.N;
                pvVar.c0 = jvVar.O;
                pvVar.d0 = jvVar.R;
                pvVar.e0 = jvVar.S;
                pvVar.k0 = jvVar.Y;
                pvVar.N = jvVar.x;
                pvVar.P = jvVar.z;
                pvVar.M = jvVar.w;
                pvVar.O = jvVar.y;
                pvVar.R = jvVar.A;
                pvVar.Q = jvVar.B;
                pvVar.S = jvVar.C;
                pvVar.o0 = jvVar.Z;
                pvVar.J = jvVar.getMarginEnd();
                pvVar.K = jvVar.getMarginStart();
                rvVar.f909a = childAt.getVisibility();
                rvVar.c = childAt.getAlpha();
                svVar.f956a = childAt.getRotation();
                svVar.b = childAt.getRotationX();
                svVar.c = childAt.getRotationY();
                svVar.d = childAt.getScaleX();
                svVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    svVar.f = pivotX;
                    svVar.g = pivotY;
                }
                svVar.i = childAt.getTranslationX();
                svVar.j = childAt.getTranslationY();
                svVar.k = childAt.getTranslationZ();
                if (svVar.l) {
                    svVar.m = childAt.getElevation();
                }
                if (childAt instanceof jd) {
                    jd jdVar = (jd) childAt;
                    pvVar.n0 = jdVar.getAllowsGoneWidget();
                    pvVar.i0 = jdVar.getReferencedIds();
                    pvVar.f0 = jdVar.getType();
                    pvVar.g0 = jdVar.getMargin();
                }
            }
            i4 = i2 + 1;
            tvVar = this;
            hashMap2 = hashMap;
            childCount = i;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    ov d2 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d2.d.f810a = true;
                    }
                    this.c.put(Integer.valueOf(d2.f760a), d2);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}
