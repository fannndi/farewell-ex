package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class a62 extends r52 {
    public static final PorterDuff.Mode p = PorterDuff.Mode.SRC_IN;
    public y52 h;
    public PorterDuffColorFilter i;
    public ColorFilter j;
    public boolean k;
    public boolean l;
    public final float[] m;
    public final Matrix n;
    public final Rect o;

    public a62() {
        this.l = true;
        this.m = new float[9];
        this.n = new Matrix();
        this.o = new Rect();
        y52 y52Var = new y52();
        y52Var.c = null;
        y52Var.d = p;
        y52Var.b = new x52();
        this.h = y52Var;
    }

    public a62(y52 y52Var) {
        this.l = true;
        this.m = new float[9];
        this.n = new Matrix();
        this.o = new Rect();
        this.h = y52Var;
        this.i = a(y52Var.c, y52Var.d);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.g;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.o;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.j;
        if (colorFilter == null) {
            colorFilter = this.i;
        }
        Matrix matrix = this.n;
        canvas.getMatrix(matrix);
        float[] fArr = this.m;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(rt0.w, width);
        int min2 = Math.min(rt0.w, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        y52 y52Var = this.h;
        Bitmap bitmap = y52Var.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != y52Var.f.getHeight()) {
            y52Var.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            y52Var.k = true;
        }
        boolean z = this.l;
        y52 y52Var2 = this.h;
        if (!z) {
            y52Var2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(y52Var2.f);
            x52 x52Var = y52Var2.b;
            x52Var.a(x52Var.g, x52.p, canvas2, min, min2);
        } else if (y52Var2.k || y52Var2.g != y52Var2.c || y52Var2.h != y52Var2.d || y52Var2.j != y52Var2.e || y52Var2.i != y52Var2.b.getRootAlpha()) {
            y52 y52Var3 = this.h;
            y52Var3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(y52Var3.f);
            x52 x52Var2 = y52Var3.b;
            x52Var2.a(x52Var2.g, x52.p, canvas3, min, min2);
            y52 y52Var4 = this.h;
            y52Var4.g = y52Var4.c;
            y52Var4.h = y52Var4.d;
            y52Var4.i = y52Var4.b.getRootAlpha();
            y52Var4.j = y52Var4.e;
            y52Var4.k = false;
        }
        y52 y52Var5 = this.h;
        if (y52Var5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (y52Var5.l == null) {
                Paint paint2 = new Paint();
                y52Var5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            y52Var5.l.setAlpha(y52Var5.b.getRootAlpha());
            y52Var5.l.setColorFilter(colorFilter);
            paint = y52Var5.l;
        }
        canvas.drawBitmap(y52Var5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.g;
        return drawable != null ? drawable.getAlpha() : this.h.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.g;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.h.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.g;
        return drawable != null ? drawable.getColorFilter() : this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.g != null) {
            return new z52(this.g.getConstantState());
        }
        this.h.f1213a = getChangingConfigurations();
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.g;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.h.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.g;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.h.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.g;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        char c;
        int i2;
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        y52 y52Var = this.h;
        y52Var.b = new x52();
        TypedArray F = op0.F(resources, theme, attributeSet, sl.h);
        y52 y52Var2 = this.h;
        x52 x52Var = y52Var2.b;
        int i3 = !op0.z(xmlPullParser, "tintMode") ? -1 : F.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        y52Var2.d = mode;
        ColorStateList colorStateList = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            F.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 < 28 || i5 > 31) {
                Resources resources2 = F.getResources();
                int resourceId = F.getResourceId(1, 0);
                ThreadLocal threadLocal = ss.f951a;
                try {
                    colorStateList = ss.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            y52Var2.c = colorStateList2;
        }
        boolean z = y52Var2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = F.getBoolean(5, z);
        }
        y52Var2.e = z;
        float f = x52Var.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = F.getFloat(7, f);
        }
        x52Var.j = f;
        float f2 = x52Var.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = F.getFloat(8, f2);
        }
        x52Var.k = f2;
        if (x52Var.j <= 0.0f) {
            throw new XmlPullParserException(F.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(F.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        x52Var.h = F.getDimension(3, x52Var.h);
        float dimension = F.getDimension(2, x52Var.i);
        x52Var.i = dimension;
        if (x52Var.h <= 0.0f) {
            throw new XmlPullParserException(F.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(F.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = x52Var.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = F.getFloat(4, alpha);
        }
        x52Var.setAlpha(alpha);
        String string = F.getString(0);
        if (string != null) {
            x52Var.m = string;
            x52Var.o.put(string, x52Var);
        }
        F.recycle();
        y52Var.f1213a = getChangingConfigurations();
        y52Var.k = true;
        y52 y52Var3 = this.h;
        x52 x52Var2 = y52Var3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        u52 u52Var = x52Var2.g;
        p9 p9Var = x52Var2.o;
        arrayDeque.push(u52Var);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                u52 u52Var2 = (u52) arrayDeque.peek();
                if (u52Var2 != null) {
                    ArrayList arrayList = u52Var2.b;
                    i = depth;
                    if ("path".equals(name)) {
                        t52 t52Var = new t52();
                        t52Var.e = 0.0f;
                        t52Var.g = 1.0f;
                        t52Var.h = 1.0f;
                        t52Var.i = 0.0f;
                        t52Var.j = 1.0f;
                        t52Var.k = 0.0f;
                        Paint.Cap cap = Paint.Cap.BUTT;
                        t52Var.l = cap;
                        Paint.Join join = Paint.Join.MITER;
                        t52Var.m = join;
                        t52Var.n = 4.0f;
                        TypedArray F2 = op0.F(resources, theme, attributeSet, sl.j);
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            String string2 = F2.getString(0);
                            if (string2 != null) {
                                t52Var.b = string2;
                            }
                            String string3 = F2.getString(2);
                            if (string3 != null) {
                                t52Var.f1116a = sl.m(string3);
                            }
                            t52Var.f = op0.q(F2, xmlPullParser, theme, "fillColor", 1);
                            float f3 = t52Var.h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                f3 = F2.getFloat(12, f3);
                            }
                            t52Var.h = f3;
                            int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? F2.getInt(8, -1) : -1;
                            t52Var.l = i6 != 0 ? i6 != 1 ? i6 != 2 ? t52Var.l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                            int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? F2.getInt(9, -1) : -1;
                            t52Var.m = i7 != 0 ? i7 != 1 ? i7 != 2 ? t52Var.m : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                            float f4 = t52Var.n;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                f4 = F2.getFloat(10, f4);
                            }
                            t52Var.n = f4;
                            t52Var.d = op0.q(F2, xmlPullParser, theme, "strokeColor", 3);
                            float f5 = t52Var.g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                f5 = F2.getFloat(11, f5);
                            }
                            t52Var.g = f5;
                            float f6 = t52Var.e;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                f6 = F2.getFloat(4, f6);
                            }
                            t52Var.e = f6;
                            float f7 = t52Var.j;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", IGQCApxXGMWo.EPHZWTgeXJ) != null) {
                                f7 = F2.getFloat(6, f7);
                            }
                            t52Var.j = f7;
                            float f8 = t52Var.k;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                f8 = F2.getFloat(7, f8);
                            }
                            t52Var.k = f8;
                            float f9 = t52Var.i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                f9 = F2.getFloat(5, f9);
                            }
                            t52Var.i = f9;
                            int i8 = t52Var.c;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                i8 = F2.getInt(13, i8);
                            }
                            t52Var.c = i8;
                        }
                        F2.recycle();
                        arrayList.add(t52Var);
                        if (t52Var.getPathName() != null) {
                            p9Var.put(t52Var.getPathName(), t52Var);
                        }
                        y52Var3.f1213a = y52Var3.f1213a;
                        z2 = false;
                    } else {
                        c = '\b';
                        if ("clip-path".equals(name)) {
                            s52 s52Var = new s52();
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                TypedArray F3 = op0.F(resources, theme, attributeSet, sl.k);
                                String string4 = F3.getString(0);
                                if (string4 != null) {
                                    s52Var.b = string4;
                                }
                                String string5 = F3.getString(1);
                                if (string5 != null) {
                                    s52Var.f1116a = sl.m(string5);
                                }
                                s52Var.c = !op0.z(xmlPullParser, "fillType") ? 0 : F3.getInt(2, 0);
                                F3.recycle();
                            }
                            arrayList.add(s52Var);
                            if (s52Var.getPathName() != null) {
                                p9Var.put(s52Var.getPathName(), s52Var);
                            }
                            y52Var3.f1213a = y52Var3.f1213a;
                        } else if ("group".equals(name)) {
                            u52 u52Var3 = new u52();
                            TypedArray F4 = op0.F(resources, theme, attributeSet, sl.i);
                            float f10 = u52Var3.c;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                                f10 = F4.getFloat(5, f10);
                            }
                            u52Var3.c = f10;
                            u52Var3.d = F4.getFloat(1, u52Var3.d);
                            u52Var3.e = F4.getFloat(2, u52Var3.e);
                            float f11 = u52Var3.f;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                f11 = F4.getFloat(3, f11);
                            }
                            u52Var3.f = f11;
                            float f12 = u52Var3.g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", qJTtDWNCVUDjB.hfKcL) != null) {
                                f12 = F4.getFloat(4, f12);
                            }
                            u52Var3.g = f12;
                            float f13 = u52Var3.h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                f13 = F4.getFloat(6, f13);
                            }
                            u52Var3.h = f13;
                            float f14 = u52Var3.i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                f14 = F4.getFloat(7, f14);
                            }
                            u52Var3.i = f14;
                            String string6 = F4.getString(0);
                            if (string6 != null) {
                                u52Var3.k = string6;
                            }
                            u52Var3.c();
                            F4.recycle();
                            arrayList.add(u52Var3);
                            arrayDeque.push(u52Var3);
                            if (u52Var3.getGroupName() != null) {
                                p9Var.put(u52Var3.getGroupName(), u52Var3);
                            }
                            y52Var3.f1213a = y52Var3.f1213a;
                            i2 = 1;
                        }
                        i2 = 1;
                    }
                } else {
                    i = depth;
                }
                c = '\b';
                i2 = 1;
            } else {
                i = depth;
                c = '\b';
                i2 = 1;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i4 = i2;
            depth = i;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.i = a(y52Var.c, y52Var.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.g;
        return drawable != null ? drawable.isAutoMirrored() : this.h.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.g;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        y52 y52Var = this.h;
        if (y52Var == null) {
            return false;
        }
        x52 x52Var = y52Var.b;
        if (x52Var.n == null) {
            x52Var.n = Boolean.valueOf(x52Var.g.a());
        }
        if (x52Var.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.h.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.k && super.mutate() == this) {
            y52 y52Var = this.h;
            y52 y52Var2 = new y52();
            y52Var2.c = null;
            y52Var2.d = p;
            if (y52Var != null) {
                y52Var2.f1213a = y52Var.f1213a;
                x52 x52Var = new x52(y52Var.b);
                y52Var2.b = x52Var;
                if (y52Var.b.e != null) {
                    x52Var.e = new Paint(y52Var.b.e);
                }
                if (y52Var.b.d != null) {
                    y52Var2.b.d = new Paint(y52Var.b.d);
                }
                y52Var2.c = y52Var.c;
                y52Var2.d = y52Var.d;
                y52Var2.e = y52Var.e;
            }
            this.h = y52Var2;
            this.k = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.g;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        y52 y52Var = this.h;
        ColorStateList colorStateList = y52Var.c;
        if (colorStateList == null || (mode = y52Var.d) == null) {
            z = false;
        } else {
            this.i = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        x52 x52Var = y52Var.b;
        if (x52Var.n == null) {
            x52Var.n = Boolean.valueOf(x52Var.g.a());
        }
        if (x52Var.n.booleanValue()) {
            boolean b = y52Var.b.g.b(iArr);
            y52Var.k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.h.b.getRootAlpha() != i) {
            this.h.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.h.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.j = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        y52 y52Var = this.h;
        if (y52Var.c != colorStateList) {
            y52Var.c = colorStateList;
            this.i = a(colorStateList, y52Var.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        y52 y52Var = this.h;
        if (y52Var.d != mode) {
            y52Var.d = mode;
            this.i = a(y52Var.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.g;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
