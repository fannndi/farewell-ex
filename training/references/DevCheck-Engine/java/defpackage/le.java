package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import flar2.devcheck.R;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class le extends o0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ le(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.o0
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) obj).j);
                break;
            case rt0.o /* 9 */:
                g82 g82Var = (g82) obj;
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(g82.class.getName());
                accessibilityEvent.setScrollable(g82Var.k != null);
                if (accessibilityEvent.getEventType() == 4096 && g82Var.k != null) {
                    accessibilityEvent.setItemCount(8);
                    accessibilityEvent.setFromIndex(g82Var.l);
                    accessibilityEvent.setToIndex(g82Var.l);
                    break;
                }
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.o0
    public final void d(View view, c1 c1Var) {
        RecyclerView recyclerView;
        int i = this.d;
        int i2 = -1;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.f709a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c1Var.f104a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                c1Var.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                view.getClass();
                AccessibilityNodeInfo accessibilityNodeInfo2 = c1Var.f104a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setDismissable(true);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                AccessibilityNodeInfo accessibilityNodeInfo3 = c1Var.f104a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                if (!((ol) obj).p) {
                    accessibilityNodeInfo3.setDismissable(false);
                    break;
                } else {
                    c1Var.a(1048576);
                    accessibilityNodeInfo3.setDismissable(true);
                    break;
                }
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo4 = c1Var.f104a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) obj;
                int i3 = BottomSheetDragHandleView.t;
                if (bottomSheetDragHandleView.k != null) {
                    CharSequence contentDescription = bottomSheetDragHandleView.getContentDescription();
                    int i4 = bottomSheetDragHandleView.k.P;
                    String string = i4 != 3 ? i4 != 4 ? i4 != 6 ? null : bottomSheetDragHandleView.getResources().getString(R.string.bottomsheet_state_half_expanded) : bottomSheetDragHandleView.getResources().getString(R.string.bottomsheet_state_collapsed) : bottomSheetDragHandleView.getResources().getString(R.string.bottomsheet_state_expanded);
                    if (!TextUtils.isEmpty(string)) {
                        if (!TextUtils.isEmpty(contentDescription)) {
                            string = string + ". " + ((Object) contentDescription);
                        }
                        accessibilityNodeInfo4.setContentDescription(string);
                        break;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                AccessibilityNodeInfo accessibilityNodeInfo5 = c1Var.f104a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo5.setCheckable(checkableImageButton.k);
                accessibilityNodeInfo5.setChecked(checkableImageButton.j);
                break;
            case 5:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c1Var.f104a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i5 = MaterialButtonToggleGroup.y;
                if (view instanceof MaterialButton) {
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i6 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i6) == view) {
                                i2 = i7;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i6) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i6).getVisibility() != 8) {
                                    i7++;
                                }
                                i6++;
                            }
                        }
                    }
                }
                c1Var.j(b1.b(((MaterialButton) view).A, 0, 1, i2, 1));
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c1Var.f104a);
                jv0 jv0Var = (jv0) obj;
                c1Var.b(new v0(16, jv0Var.o0.getVisibility() == 0 ? jv0Var.A(R.string.mtrl_picker_toggle_to_year_selection) : jv0Var.A(R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                AccessibilityNodeInfo accessibilityNodeInfo6 = c1Var.f104a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo6);
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) obj;
                accessibilityNodeInfo6.setCheckable(navigationMenuItemView.D);
                accessibilityNodeInfo6.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(R.string.item_view_role_description));
                break;
            case 8:
                b91 b91Var = (b91) obj;
                b91Var.g.d(view, c1Var);
                RecyclerView recyclerView2 = b91Var.f;
                recyclerView2.getClass();
                te1 N = RecyclerView.N(view);
                if (N != null && (recyclerView = N.x) != null) {
                    i2 = recyclerView.K(N);
                }
                td1 adapter = recyclerView2.getAdapter();
                if (adapter instanceof x81) {
                    ((x81) adapter).x(i2);
                    break;
                }
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c1Var.f104a);
                c1Var.i(g82.class.getName());
                g82 g82Var = (g82) obj;
                c1Var.l(g82Var.k != null);
                if (g82Var.canScrollHorizontally(1)) {
                    c1Var.a(rt0.x);
                }
                if (g82Var.canScrollHorizontally(-1)) {
                    c1Var.a(rt0.y);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.o0
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 3:
                super.e(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.e;
                    int i = BottomSheetDragHandleView.t;
                    bottomSheetDragHandleView.c();
                    break;
                }
                break;
            default:
                super.e(view, accessibilityEvent);
                break;
        }
    }

    @Override // defpackage.o0
    public boolean g(View view, int i, Bundle bundle) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                if (i != 1048576) {
                    return super.g(view, i, bundle);
                }
                ((cp1) ((pe) obj)).a(3);
                return true;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                view.getClass();
                if (i != 1048576) {
                    return super.g(view, i, bundle);
                }
                ((al) obj).b.cancel();
                return true;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                if (i == 1048576) {
                    ol olVar = (ol) obj;
                    if (olVar.p) {
                        olVar.cancel();
                        return true;
                    }
                }
                return super.g(view, i, bundle);
            case 8:
                return ((b91) obj).g.g(view, i, bundle);
            case rt0.o /* 9 */:
                g82 g82Var = (g82) obj;
                if (super.g(view, i, bundle)) {
                    return true;
                }
                if (i != 4096) {
                    if (i == 8192 && g82Var.canScrollHorizontally(-1)) {
                        g82Var.setCurrentItem(g82Var.l - 1);
                        return true;
                    }
                } else if (g82Var.canScrollHorizontally(1)) {
                    g82Var.setCurrentItem(g82Var.l + 1);
                    return true;
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
