package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import flar2.devcheck.R;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class vk implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1089a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vk(int i, Object obj) {
        this.f1089a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.f1089a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                throw null;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                SearchView searchView = (SearchView) obj;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.v;
                View view2 = searchView.D;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.x.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z = r82.f877a;
                    boolean z2 = searchView.getLayoutDirection() == 1;
                    int dimensionPixelSize = searchView.T ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    int i10 = rect.left;
                    searchAutoComplete.setDropDownHorizontalOffset(z2 ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
            default:
                g02 g02Var = (g02) obj;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                g02Var.Z = iArr[0];
                view.getWindowVisibleDisplayFrame(g02Var.S);
                return;
        }
    }
}
