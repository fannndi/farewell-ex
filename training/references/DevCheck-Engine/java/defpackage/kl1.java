package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* loaded from: classes.dex */
public final class kl1 implements View.OnKeyListener {
    public final /* synthetic */ SeekBarPreference g;

    public kl1(SeekBarPreference seekBarPreference) {
        this.g = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.g;
        if ((!seekBarPreference.Z && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = seekBarPreference.X) == null) {
            return false;
        }
        return seekBar.onKeyDown(i, keyEvent);
    }
}
