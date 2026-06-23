package flar2.devcheck.colorPicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import defpackage.js;
import defpackage.m01;

/* loaded from: classes.dex */
public class ColorPickerPalette extends TableLayout {
    public String g;
    public String h;
    public int i;
    public int j;
    public m01 k;
    public int l;

    public ColorPickerPalette(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int[] iArr, int i) {
        if (iArr == null) {
            return;
        }
        removeAllViews();
        TableRow tableRow = new TableRow(getContext());
        tableRow.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr[i5];
            i3++;
            View jsVar = new js(getContext(), i6, i6 == i, this.k);
            int i7 = this.l;
            TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(i7, i7);
            int i8 = this.i;
            layoutParams.setMargins(i8, i8, i8, i8);
            jsVar.setLayoutParams(layoutParams);
            boolean z = i6 == i;
            int i9 = i4 % 2;
            int i10 = i9 == 0 ? i3 : ((i4 + 1) * this.j) - i2;
            jsVar.setContentDescription(z ? String.format(this.h, Integer.valueOf(i10)) : String.format(this.g, Integer.valueOf(i10)));
            if (i9 == 0) {
                tableRow.addView(jsVar);
            } else {
                tableRow.addView(jsVar, 0);
            }
            i2++;
            if (i2 == this.j) {
                addView(tableRow);
                tableRow = new TableRow(getContext());
                tableRow.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                i4++;
                i2 = 0;
            }
        }
        if (i2 > 0) {
            while (i2 != this.j) {
                View imageView = new ImageView(getContext());
                int i11 = this.l;
                TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(i11, i11);
                int i12 = this.i;
                layoutParams2.setMargins(i12, i12, i12, i12);
                imageView.setLayoutParams(layoutParams2);
                if (i4 % 2 == 0) {
                    tableRow.addView(imageView);
                } else {
                    tableRow.addView(imageView, 0);
                }
                i2++;
            }
            addView(tableRow);
        }
    }
}
