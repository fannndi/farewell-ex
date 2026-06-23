package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import com.google.android.material.internal.CheckableImageButton;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import flar2.devcheck.sensors.JCZI.nyGJ;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class rv0<S> extends i40 {
    public CharSequence A0;
    public boolean B0;
    public int C0;
    public int D0;
    public CharSequence E0;
    public int F0;
    public CharSequence G0;
    public int H0;
    public CharSequence I0;
    public int J0;
    public CharSequence K0;
    public TextView L0;
    public CheckableImageButton M0;
    public vv0 N0;
    public boolean O0;
    public CharSequence P0;
    public CharSequence Q0;
    public final LinkedHashSet t0;
    public final LinkedHashSet u0;
    public int v0;
    public g71 w0;
    public zm x0;
    public jv0 y0;
    public int z0;

    public rv0() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.t0 = new LinkedHashSet();
        this.u0 = new LinkedHashSet();
    }

    public static int B0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b = l52.b();
        b.set(5, 1);
        Calendar a2 = l52.a(b);
        a2.get(2);
        a2.get(1);
        int maximum = a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean C0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(md2.u(R.attr.materialCalendarStyle, context, jv0.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public final void A0() {
        if (this.m.getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        rw.b();
    }

    @Override // defpackage.i40, defpackage.ld0
    public final void M(Bundle bundle) {
        super.M(bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        this.v0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            rw.b();
            return;
        }
        this.x0 = (zm) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            rw.b();
            return;
        }
        this.z0 = bundle.getInt(nyGJ.PpTTAgfgMHhRrTn);
        this.A0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.C0 = bundle.getInt("INPUT_MODE_KEY");
        this.D0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.E0 = bundle.getCharSequence(RIhTGWkqQvGL.WnTVTE);
        this.F0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.G0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.H0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.I0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.J0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.K0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.A0;
        if (charSequence == null) {
            charSequence = i0().getResources().getText(this.z0);
        }
        this.P0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.Q0 = charSequence;
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.B0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.B0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(B0(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(B0(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.M0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.L0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.M0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.M0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, k32.x(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], k32.x(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.M0.setChecked(this.C0 != 0);
        y62.o(this.M0, null);
        CheckableImageButton checkableImageButton2 = this.M0;
        this.M0.setContentDescription(this.C0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        CheckableImageButton checkableImageButton3 = this.M0;
        ym0.z(this.M0, this.C0 == 1 ? checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
        this.M0.setOnClickListener(new tc(16, this));
        A0();
        throw null;
    }

    @Override // defpackage.i40, defpackage.ld0
    public final void Z(Bundle bundle) {
        super.Z(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.v0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        zm zmVar = this.x0;
        ym ymVar = new ym();
        long j = zmVar.g.l;
        long j2 = zmVar.h.l;
        ymVar.f1237a = Long.valueOf(zmVar.j.l);
        int i = zmVar.k;
        a10 a10Var = zmVar.i;
        jv0 jv0Var = this.y0;
        ay0 ay0Var = jv0Var == null ? null : jv0Var.g0;
        if (ay0Var != null) {
            ymVar.f1237a = Long.valueOf(ay0Var.l);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", a10Var);
        ay0 b = ay0.b(j);
        ay0 b2 = ay0.b(j2);
        a10 a10Var2 = (a10) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = ymVar.f1237a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new zm(b, b2, a10Var2, l == null ? null : ay0.b(l.longValue()), i));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.z0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.A0);
        bundle.putInt("INPUT_MODE_KEY", this.C0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.D0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.E0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.F0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.G0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.H0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.I0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.J0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.K0);
    }

    @Override // defpackage.i40, defpackage.ld0
    public final void a0() {
        g71 g71Var;
        super.a0();
        Dialog dialog2 = this.o0;
        if (dialog2 == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog2.getWindow();
        if (this.B0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.N0);
            if (!this.O0) {
                View findViewById = j0().findViewById(R.id.fullscreen_header);
                ColorStateList D = ju0.D(findViewById.getBackground());
                Integer valueOf = D != null ? Integer.valueOf(D.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int s = je2.s(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    valueOf = Integer.valueOf(s);
                }
                pr.U(window, false);
                window.getContext();
                Context context = window.getContext();
                int i = Build.VERSION.SDK_INT;
                int e = i < 27 ? ts.e(je2.s(context, android.R.attr.navigationBarColor, -16777216), rt0.s) : 0;
                if (i < 35) {
                    window.setStatusBarColor(0);
                }
                if (i < 35) {
                    window.setNavigationBarColor(e);
                }
                boolean z3 = je2.H(0) || je2.H(valueOf.intValue());
                pg0 pg0Var = new pg0(window.getDecorView());
                (i >= 35 ? new lb2(window, pg0Var) : i >= 30 ? new kb2(window, pg0Var) : i >= 26 ? new ib2(window, pg0Var) : new hb2(window, pg0Var)).L(z3);
                boolean H = je2.H(s);
                if (je2.H(e) || (e == 0 && H)) {
                    z = true;
                }
                pg0 pg0Var2 = new pg0(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new lb2(window, pg0Var2) : i2 >= 30 ? new kb2(window, pg0Var2) : i2 >= 26 ? new ib2(window, pg0Var2) : new hb2(window, pg0Var2)).K(z);
                int paddingTop = findViewById.getPaddingTop();
                int paddingLeft = findViewById.getPaddingLeft();
                int paddingRight = findViewById.getPaddingRight();
                int i3 = findViewById.getLayoutParams().height;
                xh xhVar = new xh();
                xhVar.g = i3;
                xhVar.k = findViewById;
                xhVar.h = paddingLeft;
                xhVar.i = paddingTop;
                xhVar.j = paddingRight;
                WeakHashMap weakHashMap = y62.f1215a;
                p62.c(findViewById, xhVar);
                this.O0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = z().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.N0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog3 = this.o0;
            if (dialog3 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new lm0(dialog3, rect));
        }
        i0();
        int i4 = this.v0;
        if (i4 == 0) {
            A0();
            throw null;
        }
        ld0 C = u().C(this.C0 == 1 ? qJTtDWNCVUDjB.pgVac : "CALENDAR_FRAGMENT_TAG");
        g71 g71Var2 = C instanceof g71 ? (g71) C : null;
        if (g71Var2 == null) {
            if (this.C0 == 1) {
                A0();
                zm zmVar = this.x0;
                yv0 yv0Var = new yv0();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i4);
                bundle.putParcelable("DATE_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", zmVar);
                yv0Var.m0(bundle);
                g71Var = yv0Var;
            } else {
                A0();
                zm zmVar2 = this.x0;
                jv0 jv0Var = new jv0();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i4);
                bundle2.putParcelable("GRID_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", zmVar2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle2.putParcelable("CURRENT_MONTH_KEY", zmVar2.j);
                jv0Var.m0(bundle2);
                this.y0 = jv0Var;
                g71Var = jv0Var;
            }
            g71Var2 = g71Var;
        }
        this.w0 = g71Var2;
        g71Var2.u0(new j70(21));
        this.L0.setText((this.C0 == 1 && z().getConfiguration().orientation == 2) ? this.Q0 : this.P0);
        A0();
        throw null;
    }

    @Override // defpackage.i40, defpackage.ld0
    public final void b0() {
        this.w0.d0.clear();
        super.b0();
    }

    @Override // defpackage.i40, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.t0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.i40, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.M;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.i40
    public final Dialog x0() {
        Context i0 = i0();
        i0();
        int i = this.v0;
        if (i == 0) {
            A0();
            throw null;
        }
        Dialog dialog2 = new Dialog(i0, i);
        Context context = dialog2.getContext();
        this.B0 = C0(context, android.R.attr.windowFullscreen);
        this.N0 = new vv0(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, yb1.z, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.N0.p(context);
        this.N0.t(ColorStateList.valueOf(color));
        this.N0.s(dialog2.getWindow().getDecorView().getElevation());
        return dialog2;
    }
}
