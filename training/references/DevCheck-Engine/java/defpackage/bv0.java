package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import flar2.devcheck.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class bv0 extends LinearLayout {
    public static final Object r = null;
    public int g;
    public final ArrayList h;
    public final h70 i;
    public final iy j;
    public Integer[] k;
    public cr1 l;
    public dr1 m;
    public int n;
    public er1 o;
    public boolean p;
    public final ArrayList q;

    public bv0(Context context, AttributeSet attributeSet) {
        super(ym0.D(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        cr1 b;
        XmlResourceParser xml;
        int next;
        int next2;
        this.g = 0;
        this.h = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.i = new h70(materialButtonToggleGroup);
        this.j = new iy(1, materialButtonToggleGroup);
        this.p = true;
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        this.q = new ArrayList();
        Context context2 = getContext();
        TypedArray J = d10.J(context2, attributeSet, yb1.w, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (J.hasValue(2)) {
            int resourceId = J.getResourceId(2, 0);
            er1 er1Var = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        er1 er1Var2 = new er1();
                        er1Var2.c = new int[10][];
                        er1Var2.d = new h70[10];
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            er1Var2.a(context2, xml, asAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        er1Var = er1Var2;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.o = er1Var;
        }
        if (J.hasValue(6)) {
            dr1 h = dr1.h(context2, J, 6);
            this.m = h;
            if (h == null) {
                this.m = new eu(cn1.g(context2, J.getResourceId(6, 0), J.getResourceId(7, 0)).a()).d();
            }
        }
        if (J.hasValue(3)) {
            l lVar = new l(0.0f);
            int resourceId2 = J.getResourceId(3, 0);
            if (resourceId2 == 0) {
                b = cr1.b(cn1.j(J, 3, lVar));
            } else if (context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        b = new cr1();
                        AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml);
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
                            b.d(context2, xml, asAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b = cr1.b(lVar);
                }
            } else {
                b = cr1.b(cn1.j(J, 3, lVar));
            }
            this.l = b;
        }
        this.n = J.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(J.getBoolean(0, true));
        setOverflowMode(J.getInt(5, 0));
        getResources().getDimensionPixelOffset(R.dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        J.recycle();
    }

    public static LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new av0(layoutParams.width, layoutParams.height);
    }

    public static av0 f(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new av0((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new av0((ViewGroup.MarginLayoutParams) layoutParams) : new av0(layoutParams);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (i(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (i(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r10 = this;
            int r0 = r10.getFirstVisibleChildIndex()
            r1 = -1
            if (r0 != r1) goto L9
            goto L96
        L9:
            int r2 = r0 + 1
        Lb:
            int r3 = r10.getChildCount()
            r4 = 1
            r5 = 0
            if (r2 >= r3) goto L6e
            android.view.View r3 = r10.getChildAt(r2)
            int r6 = r2 + (-1)
            android.view.View r6 = r10.getChildAt(r6)
            boolean r7 = r3 instanceof com.google.android.material.button.MaterialButton
            if (r7 == 0) goto L47
            boolean r7 = r6 instanceof com.google.android.material.button.MaterialButton
            if (r7 == 0) goto L47
            r7 = r3
            com.google.android.material.button.MaterialButton r7 = (com.google.android.material.button.MaterialButton) r7
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            int r8 = r10.n
            if (r8 > 0) goto L41
            int r8 = r7.getStrokeWidth()
            int r9 = r6.getStrokeWidth()
            int r8 = java.lang.Math.min(r8, r9)
            r7.setShouldDrawSurfaceColorStroke(r4)
            r6.setShouldDrawSurfaceColorStroke(r4)
            goto L48
        L41:
            r7.setShouldDrawSurfaceColorStroke(r5)
            r6.setShouldDrawSurfaceColorStroke(r5)
        L47:
            r8 = r5
        L48:
            android.widget.LinearLayout$LayoutParams r4 = d(r3)
            int r6 = r10.getOrientation()
            if (r6 != 0) goto L5e
            r4.setMarginEnd(r5)
            int r6 = r10.n
            int r6 = r6 - r8
            r4.setMarginStart(r6)
            r4.topMargin = r5
            goto L68
        L5e:
            r4.bottomMargin = r5
            int r6 = r10.n
            int r6 = r6 - r8
            r4.topMargin = r6
            r4.setMarginStart(r5)
        L68:
            r3.setLayoutParams(r4)
            int r2 = r2 + 1
            goto Lb
        L6e:
            int r2 = r10.getChildCount()
            if (r2 == 0) goto L96
            if (r0 != r1) goto L77
            goto L96
        L77:
            android.view.View r0 = r10.getChildAt(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            android.widget.LinearLayout$LayoutParams r0 = d(r0)
            int r10 = r10.getOrientation()
            if (r10 != r4) goto L8c
            r0.topMargin = r5
            r0.bottomMargin = r5
            return
        L8c:
            r0.setMarginEnd(r5)
            r0.setMarginStart(r5)
            r0.leftMargin = r5
            r0.rightMargin = r5
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv0.a():void");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            j();
            this.p = true;
            int indexOfChild = indexOfChild(null);
            if (indexOfChild < 0 || i != -1) {
                super.addView(view, i, layoutParams);
            } else {
                super.addView(view, indexOfChild, layoutParams);
            }
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            materialButton.setOnPressedChangeListenerInternal(this.i);
            this.h.add(materialButton.getShapeAppearance());
            materialButton.setEnabled(isEnabled());
        }
    }

    public final void b() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.o == null) {
            return;
        }
        if (this.g != 2) {
            c(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.q;
            if (i >= arrayList.size()) {
                return;
            }
            c(((Integer) arrayList.get(i)).intValue(), (i == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i + 1)).intValue()) - 1);
            i++;
        }
    }

    public final void c(int i, int i2) {
        float max;
        if (i == i2) {
            ((MaterialButton) getChildAt(i)).setWidthChangeDirection(zu0.g);
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = i;
        while (i4 <= i2) {
            if (i(i4)) {
                ((MaterialButton) getChildAt(i4)).setWidthChangeDirection(i4 == i ? zu0.i : i4 == i2 ? zu0.h : zu0.j);
                if (i(i4) && this.o != null) {
                    MaterialButton materialButton = (MaterialButton) getChildAt(i4);
                    er1 er1Var = this.o;
                    int width = materialButton.getWidth();
                    int i5 = -width;
                    for (int i6 = 0; i6 < er1Var.f246a; i6++) {
                        fh0 fh0Var = (fh0) er1Var.d[i6].g;
                        int i7 = fh0Var.f281a;
                        float f = fh0Var.b;
                        if (i7 == 2) {
                            max = Math.max(i5, f);
                        } else if (i7 == 1) {
                            max = Math.max(i5, width * f);
                        }
                        i5 = (int) max;
                    }
                    int max2 = Math.max(0, i5);
                    MaterialButton h = h(i4);
                    int allowedWidthDecrease = h == null ? 0 : h.getAllowedWidthDecrease();
                    MaterialButton g = g(i4);
                    r4 = Math.min(max2, allowedWidthDecrease + (g != null ? g.getAllowedWidthDecrease() : 0));
                }
                if (i4 != i && i4 != i2) {
                    r4 /= 2;
                }
                i3 = Math.min(i3, r4);
            }
            i4++;
        }
        while (i <= i2) {
            if (i(i)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i);
                materialButton2.setSizeChange(this.o);
                materialButton2.setWidthChangeMax(i3 * 2);
            }
            i++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof av0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.j);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.k = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final av0 generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        av0 av0Var = new av0(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yb1.x);
        obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.getText(1);
        obtainStyledAttributes.recycle();
        return av0Var;
    }

    public final MaterialButton g(int i) {
        int childCount = getChildCount();
        int i2 = i + 1;
        while (true) {
            if (i2 >= childCount) {
                i2 = -1;
                break;
            }
            if (i(i2)) {
                break;
            }
            i2++;
        }
        ArrayList arrayList = this.q;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i3)).intValue();
                int intValue2 = i3 == arrayList.size() + (-1) ? childCount - 1 : ((Integer) arrayList.get(i3 + 1)).intValue() - 1;
                if (i >= intValue && i <= intValue2 && (i2 < intValue || i2 > intValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new av0(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new av0(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return f(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return f(layoutParams);
    }

    public er1 getButtonSizeChange() {
        return this.o;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.k;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public nx getInnerCornerSize() {
        return this.l.b;
    }

    public cr1 getInnerCornerSizeStateList() {
        return this.l;
    }

    public Drawable getOverflowButtonIcon() {
        throw null;
    }

    public int getOverflowMode() {
        return this.g;
    }

    public cn1 getShapeAppearance() {
        dr1 dr1Var = this.m;
        if (dr1Var == null) {
            return null;
        }
        return dr1Var.i();
    }

    public int getSpacing() {
        return this.n;
    }

    public dr1 getStateListShapeAppearance() {
        return this.m;
    }

    public final MaterialButton h(int i) {
        int childCount = getChildCount();
        int i2 = i - 1;
        while (true) {
            if (i2 < 0) {
                i2 = -1;
                break;
            }
            if (i(i2)) {
                break;
            }
            i2--;
        }
        ArrayList arrayList = this.q;
        if (!arrayList.isEmpty()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i3)).intValue();
                int intValue2 = i3 == arrayList.size() + (-1) ? childCount : ((Integer) arrayList.get(i3 + 1)).intValue();
                if (i >= intValue && i < intValue2 && (i2 < intValue || i2 >= intValue2)) {
                    return null;
                }
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i2);
    }

    public final boolean i(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void j() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.I;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.I = null;
                materialButton.F = -2.1474836E9f;
            }
        }
    }

    public final void k() {
        int i;
        if (!(this.l == null && this.m == null) && this.p) {
            this.p = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    an1 an1Var = this.m;
                    ArrayList arrayList = this.h;
                    if (an1Var == null || (!z && !z2)) {
                        an1Var = (an1) arrayList.get(i2);
                    }
                    eu euVar = !(an1Var instanceof dr1) ? new eu((cn1) arrayList.get(i2)) : ((dr1) an1Var).j();
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 5) << 1) | ((i & 10) >> 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i3 = ~i;
                    cr1 cr1Var = this.l;
                    if ((i3 | 1) == i3) {
                        euVar.d = cr1Var;
                    }
                    if ((i3 | 2) == i3) {
                        euVar.g = cr1Var;
                    }
                    if ((i3 | 4) == i3) {
                        euVar.h = cr1Var;
                    }
                    if ((i3 | 8) == i3) {
                        euVar.i = cr1Var;
                    }
                    dr1 d = euVar.d();
                    boolean f = d.f();
                    cn1 cn1Var = d;
                    if (!f) {
                        cn1Var = d.i();
                    }
                    materialButton.setShapeAppearance(cn1Var);
                }
                i2++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            j();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        a();
        if (this.g != 2) {
            i3 = 0;
        } else {
            if (getOrientation() == 1) {
                c.m("The wrap overflow mode is not compatible to the vertical orientation.");
                return;
            }
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                c.m("The wrap overflow mode is not compatible with wrap_content layout width.");
                return;
            }
            ArrayList arrayList = this.q;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                if (i(i7)) {
                    View view = (MaterialButton) getChildAt(i7);
                    measureChild(view, i, i2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams d = d(view);
                        if (i4 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.n) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i4));
                            }
                            i6 += i5 + (arrayList.isEmpty() ? 0 : this.n);
                            arrayList.add(Integer.valueOf(i7));
                            d.setMarginStart(-i4);
                            arrayList2.clear();
                            i4 = 0;
                            i5 = 0;
                        }
                        i4 += measuredWidth + (i4 == 0 ? 0 : this.n);
                        i5 = Math.max(i5, measuredHeight);
                        arrayList2.add(Integer.valueOf(i7));
                        d.topMargin += i6;
                        view.setLayoutParams(d);
                    }
                }
            }
            arrayList3.add(Integer.valueOf(i4));
            int intValue = ((Integer) Collections.max(arrayList3)).intValue();
            int i8 = 0;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                int intValue2 = ((Integer) arrayList.get(i9)).intValue();
                int intValue3 = ((Integer) arrayList3.get(i9)).intValue();
                MaterialButton materialButton = (MaterialButton) getChildAt(intValue2);
                LinearLayout.LayoutParams d2 = d(materialButton);
                int i10 = d2.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
                int i11 = intValue - intValue3;
                if (i10 != 8388611) {
                    if (absoluteGravity == 1) {
                        i11 /= 2;
                    }
                    d2.setMarginStart((d2.getMarginStart() + i11) - i8);
                    materialButton.setLayoutParams(d2);
                    i8 = i11;
                }
            }
            i3 = getPaddingBottom() + getPaddingTop() + i6 + i5;
        }
        k();
        super.onMeasure(i, i2);
        if (this.g != 2 || i3 == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.h.remove(indexOfChild);
        }
        this.p = true;
        k();
        j();
        a();
    }

    public void setButtonSizeChange(er1 er1Var) {
        if (this.o != er1Var) {
            this.o = er1Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(nx nxVar) {
        this.l = cr1.b(nxVar);
        this.p = true;
        k();
        invalidate();
    }

    public void setInnerCornerSizeStateList(cr1 cr1Var) {
        this.l = cr1Var;
        this.p = true;
        k();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.p = true;
        }
        super.setOrientation(i);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        throw null;
    }

    public void setOverflowButtonIconResource(int i) {
        throw null;
    }

    public void setOverflowMode(int i) {
        if (this.g != i) {
            this.g = i;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(cn1 cn1Var) {
        this.m = new eu(cn1Var).d();
        this.p = true;
        k();
        invalidate();
    }

    public void setSpacing(int i) {
        this.n = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(dr1 dr1Var) {
        this.m = dr1Var;
        this.p = true;
        k();
        invalidate();
    }
}
