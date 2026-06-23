package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* loaded from: classes.dex */
public abstract class s81 extends i40 implements DialogInterface.OnClickListener {
    public int A0;
    public DialogPreference t0;
    public CharSequence u0;
    public CharSequence v0;
    public CharSequence w0;
    public CharSequence x0;
    public int y0;
    public BitmapDrawable z0;

    public final DialogPreference A0() {
        PreferenceScreen preferenceScreen;
        if (this.t0 == null) {
            String string = h0().getString("key");
            a91 a91Var = ((u81) C(true)).e0;
            Preference preference = null;
            if (a91Var != null && (preferenceScreen = a91Var.g) != null) {
                preference = preferenceScreen.w(string);
            }
            this.t0 = (DialogPreference) preference;
        }
        return this.t0;
    }

    public void B0(View view) {
        int i;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.x0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public abstract void C0(boolean z);

    public void D0(th2 th2Var) {
    }

    @Override // defpackage.i40, defpackage.ld0
    public void M(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        super.M(bundle);
        ld0 C = C(true);
        if (!(C instanceof u81)) {
            c.n("Target fragment must implement TargetFragment interface");
            return;
        }
        u81 u81Var = (u81) C;
        String string = h0().getString("key");
        if (bundle != null) {
            this.u0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.v0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.w0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.x0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.y0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.z0 = new BitmapDrawable(z(), bitmap);
                return;
            }
            return;
        }
        a91 a91Var = u81Var.e0;
        Preference preference = null;
        if (a91Var != null && (preferenceScreen = a91Var.g) != null) {
            preference = preferenceScreen.w(string);
        }
        DialogPreference dialogPreference = (DialogPreference) preference;
        this.t0 = dialogPreference;
        this.u0 = dialogPreference.S;
        this.v0 = dialogPreference.V;
        this.w0 = dialogPreference.W;
        this.x0 = dialogPreference.T;
        this.y0 = dialogPreference.X;
        Drawable drawable = dialogPreference.U;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.z0 = (BitmapDrawable) drawable;
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.z0 = new BitmapDrawable(z(), createBitmap);
    }

    @Override // defpackage.i40, defpackage.ld0
    public void Z(Bundle bundle) {
        super.Z(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.u0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.v0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.w0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.x0);
        bundle.putInt("PreferenceDialogFragment.layout", this.y0);
        BitmapDrawable bitmapDrawable = this.z0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A0 = i;
    }

    @Override // defpackage.i40, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C0(this.A0 == -1);
    }

    @Override // defpackage.i40
    public final Dialog x0() {
        this.A0 = -2;
        th2 th2Var = new th2(i0());
        CharSequence charSequence = this.u0;
        j3 j3Var = (j3) th2Var.h;
        j3Var.e = charSequence;
        j3Var.d = this.z0;
        th2Var.j(this.v0, this);
        th2Var.h(this.w0, this);
        i0();
        int i = this.y0;
        View inflate = i != 0 ? w().inflate(i, (ViewGroup) null) : null;
        if (inflate != null) {
            B0(inflate);
            j3Var.s = inflate;
        } else {
            j3Var.g = this.x0;
        }
        D0(th2Var);
        n3 a2 = th2Var.a();
        if (this instanceof l70) {
            Window window = a2.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                r81.a(window);
                return a2;
            }
            l70 l70Var = (l70) this;
            l70Var.E0 = SystemClock.currentThreadTimeMillis();
            l70Var.E0();
        }
        return a2;
    }
}
