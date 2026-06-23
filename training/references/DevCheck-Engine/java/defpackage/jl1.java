package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* loaded from: classes.dex */
public final class jl1 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SeekBarPreference f487a;

    public jl1(SeekBarPreference seekBarPreference) {
        this.f487a = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        SeekBarPreference seekBarPreference = this.f487a;
        if (!z || (!seekBarPreference.b0 && seekBarPreference.W)) {
            int i2 = i + seekBarPreference.T;
            TextView textView = seekBarPreference.Y;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
                return;
            }
            return;
        }
        int progress = seekBar.getProgress() + seekBarPreference.T;
        if (progress != seekBarPreference.S) {
            seekBarPreference.w(progress, false);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f487a.W = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress;
        SeekBarPreference seekBarPreference = this.f487a;
        seekBarPreference.W = false;
        int progress2 = seekBar.getProgress();
        int i = seekBarPreference.T;
        if (progress2 + i == seekBarPreference.S || (progress = seekBar.getProgress() + i) == seekBarPreference.S) {
            return;
        }
        seekBarPreference.w(progress, false);
    }
}
