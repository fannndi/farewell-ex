package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class q1 implements View.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ q1(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i = this.g;
        Message message4 = null;
        message4 = null;
        Object obj = this.h;
        switch (i) {
            case 0:
                ((j2) obj).a();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                m3 m3Var = (m3) obj;
                if (view == m3Var.i && (message3 = m3Var.k) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == m3Var.l && (message2 = m3Var.n) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == m3Var.o && (message = m3Var.q) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                m3Var.G.obtainMessage(1, m3Var.b).sendToTarget();
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ol olVar = (ol) obj;
                if (olVar.p && olVar.isShowing()) {
                    if (!olVar.r) {
                        TypedArray obtainStyledAttributes = olVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        olVar.q = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        olVar.r = true;
                    }
                    if (olVar.q) {
                        olVar.cancel();
                        break;
                    }
                }
                break;
            case 3:
                jv0 jv0Var = (jv0) obj;
                int i2 = jv0Var.h0;
                if (i2 == 2) {
                    jv0Var.x0(1);
                } else if (i2 == 1) {
                    jv0Var.x0(2);
                }
                jv0Var.y0(jv0Var.M);
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                sw0 itemData = ((t01) view).getItemData();
                fl flVar = (fl) obj;
                boolean q = flVar.S.f1062a.q(itemData, flVar.R, 0);
                if (itemData != null && itemData.isCheckable()) {
                    if (!q || itemData.isChecked()) {
                        flVar.setCheckedItem(itemData);
                        break;
                    }
                }
                break;
            case 5:
                ((Preference) obj).r(view);
                break;
            default:
                mz1 mz1Var = ((Toolbar) obj).S;
                sw0 sw0Var = mz1Var != null ? mz1Var.h : null;
                if (sw0Var != null) {
                    sw0Var.collapseActionView();
                    break;
                }
                break;
        }
    }
}
