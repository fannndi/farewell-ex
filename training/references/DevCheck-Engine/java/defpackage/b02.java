package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.tools.ToolsActivity;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class b02 extends td1 {
    public final List d;
    public final LayoutInflater e;
    public ToolsActivity f;
    public final Context g;
    public final boolean h;

    public b02(Context context, ArrayList arrayList, boolean z) {
        this.e = LayoutInflater.from(context);
        this.d = arrayList;
        this.g = context;
        this.h = z;
    }

    @Override // defpackage.td1
    public final int c() {
        List list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.td1
    public final int e(int i) {
        try {
            return ((c02) this.d.get(i)).f;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // defpackage.td1
    public final void l(te1 te1Var, int i) {
        final a02 a02Var = (a02) te1Var;
        int i2 = a02Var.l;
        ImageView imageView = a02Var.C;
        final int i3 = 1;
        boolean z = this.h;
        Context context = this.g;
        List list = this.d;
        final int i4 = 0;
        switch (i2) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                zz1 zz1Var = (zz1) a02Var;
                ImageView imageView2 = zz1Var.K;
                TextView textView = zz1Var.I;
                TextView textView2 = zz1Var.G;
                TextView textView3 = zz1Var.F;
                if (!((c02) list.get(a02Var.b())).g) {
                    textView3.setText(context.getString(R.string.not_rooted));
                    imageView2.setVisibility(8);
                    textView2.setVisibility(8);
                    textView.setVisibility(8);
                    textView3.setGravity(1);
                    break;
                } else {
                    textView3.setText(context.getString(R.string.rooted));
                    textView2.setText(((c02) list.get(a02Var.b())).c);
                    textView.setText(((c02) list.get(a02Var.b())).d);
                    zz1Var.H.setText(((c02) list.get(a02Var.b())).e);
                    imageView2.setImageDrawable(((c02) list.get(a02Var.b())).f103a);
                    break;
                }
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
            default:
                a02Var.A.setText(((c02) list.get(a02Var.b())).b);
                imageView.setImageDrawable(((c02) list.get(a02Var.b())).f103a);
                TextView textView4 = a02Var.A;
                if (!z) {
                    textView4.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_pro, 0);
                    break;
                } else {
                    textView4.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                    break;
                }
            case 3:
                xz1 xz1Var = (xz1) a02Var;
                xz1Var.F.setOnClickListener(new View.OnClickListener(this) { // from class: wz1
                    public final /* synthetic */ b02 h;

                    {
                        this.h = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i4;
                        a02 a02Var2 = a02Var;
                        b02 b02Var = this.h;
                        switch (i5) {
                            case 0:
                                b02Var.f.B(a02Var2.b(), b02Var.g.getString(R.string.paired_devices));
                                break;
                            default:
                                b02Var.f.B(a02Var2.b(), b02Var.g.getString(R.string.nearby_devices));
                                break;
                        }
                    }
                });
                xz1Var.G.setOnClickListener(new View.OnClickListener(this) { // from class: wz1
                    public final /* synthetic */ b02 h;

                    {
                        this.h = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i5 = i3;
                        a02 a02Var2 = a02Var;
                        b02 b02Var = this.h;
                        switch (i5) {
                            case 0:
                                b02Var.f.B(a02Var2.b(), b02Var.g.getString(R.string.paired_devices));
                                break;
                            default:
                                b02Var.f.B(a02Var2.b(), b02Var.g.getString(R.string.nearby_devices));
                                break;
                        }
                    }
                });
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                yz1 yz1Var = (yz1) a02Var;
                View view = yz1Var.K;
                View view2 = yz1Var.J;
                TextView textView5 = yz1Var.H;
                TextView textView6 = yz1Var.G;
                TextView textView7 = yz1Var.F;
                View view3 = yz1Var.M;
                if (((c02) list.get(a02Var.b())).i) {
                    view2.setVisibility(0);
                    view3.setVisibility(4);
                    if (((c02) list.get(a02Var.b())).j) {
                        view.setVisibility(0);
                    }
                } else {
                    view.setVisibility(0);
                    view2.setVisibility(8);
                    view3.setVisibility(0);
                    boolean z2 = ((c02) list.get(a02Var.b())).h;
                    View view4 = yz1Var.L;
                    if (z2) {
                        view4.setVisibility(0);
                        view3.setVisibility(8);
                    } else {
                        view4.setVisibility(8);
                        view3.setVisibility(0);
                        if (((c02) list.get(a02Var.b())).k) {
                            textView7.setText(context.getString(R.string.pass));
                            textView7.setTextColor(uz1.R(context));
                        } else {
                            textView7.setText(context.getString(R.string.fail));
                            textView7.setTextColor(context.getColor(R.color.red_text));
                        }
                        if (((c02) list.get(a02Var.b())).l) {
                            textView6.setText(context.getString(R.string.pass));
                            textView6.setTextColor(uz1.R(context));
                        } else {
                            textView6.setText(context.getString(R.string.fail));
                            textView6.setTextColor(context.getColor(R.color.red_text));
                        }
                        if (((c02) list.get(a02Var.b())).m) {
                            textView5.setText(context.getString(R.string.pass));
                            textView5.setTextColor(uz1.R(context));
                        } else {
                            textView5.setText(context.getString(R.string.fail));
                            textView5.setTextColor(context.getColor(R.color.red_text));
                        }
                    }
                }
                TextView textView8 = a02Var.A;
                if (!z) {
                    textView8.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_safetynet, 0, R.drawable.ic_pro, 0);
                    break;
                } else {
                    textView8.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ic_safetynet, 0, 0, 0);
                    break;
                }
            case 5:
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                a02Var.A.setText(((c02) list.get(a02Var.b())).b);
                imageView.setImageDrawable(((c02) list.get(a02Var.b())).f103a);
                a02Var.A.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                a02Var.A.setText(((c02) list.get(a02Var.b())).b);
                a02Var.A.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                imageView.setImageDrawable(((c02) list.get(a02Var.b())).f103a);
                TextView textView9 = a02Var.B;
                if (!z) {
                    textView9.setVisibility(0);
                    break;
                } else {
                    textView9.setVisibility(8);
                    break;
                }
            case 8:
                a02Var.A.setText(((c02) list.get(a02Var.b())).b);
                break;
        }
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.e;
        return i != 1 ? i != 3 ? i != 4 ? (i == 6 || i == 7) ? new a02(this, layoutInflater.inflate(R.layout.tools_list_item_grid, viewGroup, false)) : i != 8 ? new a02(this, layoutInflater.inflate(R.layout.tools_list_item, viewGroup, false)) : new yz1(this, layoutInflater.inflate(R.layout.tools_list_header, viewGroup, false)) : new yz1(this, layoutInflater.inflate(R.layout.integrity_check_card, viewGroup, false)) : new xz1(this, layoutInflater.inflate(R.layout.bluetooth_card, viewGroup, false)) : new zz1(this, layoutInflater.inflate(R.layout.root_check_card, viewGroup, false));
    }
}
