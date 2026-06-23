package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class qv {
    public static final SparseIntArray j;

    /* renamed from: a, reason: collision with root package name */
    public int f863a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public int g;
    public String h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rb1.f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (j.get(index)) {
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = rt0.e[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f863a = tv.f(obtainStyledAttributes, index, this.f863a);
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    this.b = obtainStyledAttributes.getInteger(index, this.b);
                    break;
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 8:
                    this.g = obtainStyledAttributes.getInteger(index, this.g);
                    break;
                case rt0.o /* 9 */:
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 10:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.h = string;
                        if (string.indexOf("/") > 0) {
                            this.i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
