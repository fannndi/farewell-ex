package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class sp implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f949a;
    public final /* synthetic */ TwoStatePreference b;

    public /* synthetic */ sp(TwoStatePreference twoStatePreference, int i) {
        this.f949a = i;
        this.b = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f949a;
        TwoStatePreference twoStatePreference = this.b;
        switch (i) {
            case 0:
                ((CheckBoxPreference) twoStatePreference).w(z);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((SwitchPreference) twoStatePreference).w(z);
                break;
            default:
                ((SwitchPreferenceCompat) twoStatePreference).w(z);
                break;
        }
    }
}
