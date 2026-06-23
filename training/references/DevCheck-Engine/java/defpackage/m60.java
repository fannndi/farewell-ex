package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.preference.DropDownPreference;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class m60 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ m60(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        l60 l60Var;
        int i2 = this.g;
        Object obj = this.h;
        switch (i2) {
            case 0:
                DropDownPreference dropDownPreference = (DropDownPreference) obj;
                if (i >= 0) {
                    String charSequence = dropDownPreference.Z[i].toString();
                    if (!charSequence.equals(dropDownPreference.a0)) {
                        dropDownPreference.x(charSequence);
                        break;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                if (i != -1 && (l60Var = ((wr0) obj).i) != null) {
                    l60Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).o(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.g;
    }
}
