package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public class bl extends c6 {
    public final al l;

    public bl(Context context) {
        super(context, R.style.BottomDialogTheme);
        Context context2 = getContext();
        context2.getClass();
        this.l = new al(context2, this);
        d().i(1);
    }

    @Override // defpackage.bu, android.app.Dialog
    public final void onBackPressed() {
        BottomSheetBehavior bottomSheetBehavior = this.l.c;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.O(5);
        }
    }

    @Override // defpackage.c6, defpackage.bu, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(1280);
            window.clearFlags(2);
            window.setStatusBarColor(0);
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (!uz1.h0(getContext())) {
                systemUiVisibility ^= rt0.y;
            }
            if (Build.VERSION.SDK_INT >= 26 && !uz1.h0(getContext())) {
                systemUiVisibility ^= 16;
            }
            window.getDecorView().setSystemUiVisibility(systemUiVisibility);
        }
    }

    @Override // android.app.Dialog
    public final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onRestoreInstanceState(bundle);
        al alVar = this.l;
        alVar.getClass();
        alVar.g = bundle.getFloat("offset");
        alVar.b();
    }

    @Override // defpackage.bu, android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        al alVar = this.l;
        alVar.getClass();
        onSaveInstanceState.putFloat("offset", alVar.g);
        return onSaveInstanceState;
    }

    @Override // defpackage.bu, android.app.Dialog
    public void onStart() {
        super.onStart();
        al alVar = this.l;
        alVar.getClass();
        new Handler(Looper.getMainLooper()).postDelayed(new l2(17, alVar), 50L);
    }

    @Override // defpackage.c6, defpackage.bu, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(this.l.c(null, i, null));
    }

    @Override // defpackage.c6, defpackage.bu, android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        super.setContentView(this.l.c(view, 0, null));
    }

    @Override // defpackage.c6, defpackage.bu, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        super.setContentView(this.l.c(view, 0, layoutParams));
    }
}
