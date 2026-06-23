package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import flar2.devcheck.R;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class r11 extends ld {
    public String t0;

    public static boolean E0(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (charAt != ':' && charAt != '.' && charAt != '-' && !Character.isWhitespace(charAt)) {
                if (charAt != '0') {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    public static void F0(View view, int i, int... iArr) {
        TextView textView = (TextView) view.findViewById(i);
        if (textView == null) {
            return;
        }
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                View findViewById = view.findViewById(iArr[i3]);
                if (findViewById != null && findViewById.getVisibility() == 0) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i2 = 8;
                break;
            }
        }
        textView.setVisibility(i2);
    }

    public static void G0(View view, int i, int i2, String str) {
        View findViewById = view.findViewById(i);
        TextView textView = findViewById != null ? (TextView) findViewById.findViewById(i2) : null;
        if (findViewById == null || textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            findViewById.setVisibility(8);
        } else {
            textView.setText(str);
            findViewById.setVisibility(0);
        }
    }

    @Override // defpackage.ld
    public final int B0() {
        return R.layout.bottom_sheet_network_device;
    }

    @Override // defpackage.ld
    public final void C0(View view) {
        a5 t = t();
        if (t == null) {
            A0();
            return;
        }
        Bundle bundle = this.m;
        gp0 gp0Var = null;
        String string = bundle != null ? bundle.getString("arg_ip") : null;
        this.t0 = string;
        if (TextUtils.isEmpty(string)) {
            A0();
            return;
        }
        n72 l = t.l();
        l72 g = t.g();
        gr grVar = new gr(l, g, d51.i(t, l, g));
        vq a2 = af1.a(e21.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        e21 e21Var = (e21) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        String str = this.t0;
        List list = (List) e21Var.k.d();
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                gp0 gp0Var2 = (gp0) it.next();
                if (gp0Var2.k.i == 0 && str.equals(gp0Var2.b)) {
                    gp0Var = gp0Var2;
                    break;
                }
            }
        }
        if (gp0Var == null) {
            A0();
            return;
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.device_icon);
        TextView textView = (TextView) view.findViewById(R.id.device_title);
        TextView textView2 = (TextView) view.findViewById(R.id.chip_access_point);
        TextView textView3 = (TextView) view.findViewById(R.id.chip_gateway);
        textView.setText(gp0Var.f349a);
        cp0 cp0Var = gp0Var.k;
        bp0 bp0Var = cp0Var.A;
        if (bp0Var != null) {
            switch (bp0Var.ordinal()) {
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    imageView.setImageResource(R.drawable.ic_router);
                    break;
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    imageView.setImageResource(R.drawable.ic_lan_nas);
                    break;
                case 3:
                    imageView.setImageResource(R.drawable.ic_printer);
                    break;
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    imageView.setImageResource(R.drawable.ic_lan_tv);
                    break;
                case 5:
                    imageView.setImageResource(R.drawable.ic_computer);
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    imageView.setImageResource(R.drawable.ic_lan_phone);
                    break;
                default:
                    imageView.setImageResource(R.drawable.ic_lan);
                    break;
            }
        } else {
            imageView.setImageResource(R.drawable.ic_lan);
        }
        if (cp0Var.h) {
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (cp0Var.f) {
            textView3.setVisibility(0);
            textView3.setText(R.string.gateway);
        } else {
            textView3.setVisibility(8);
        }
        G0(view, R.id.row_ip, R.id.item_summary_ip, gp0Var.b);
        G0(view, R.id.row_mac, R.id.item_summary_mac, gp0Var.c);
        G0(view, R.id.row_vendor, R.id.item_summary_vendor, cp0Var.d);
        G0(view, R.id.row_latency, R.id.item_summary_latency, gp0Var.j);
        G0(view, R.id.row_host, R.id.item_summary_host, cp0Var.b);
        G0(view, R.id.row_netbios, R.id.item_summary_netbios, cp0Var.y);
        String str2 = cp0Var.f147a;
        boolean z = cp0Var.g;
        if (TextUtils.isEmpty(str2) || !z) {
            view.findViewById(R.id.row_webui).setVisibility(8);
        } else {
            D0(view, R.id.row_webui, R.id.item_summary_webui, str2);
        }
        G0(view, R.id.row_upnp_name, R.id.item_summary_upnp_name, cp0Var.l);
        G0(view, R.id.row_upnp_model, R.id.item_summary_upnp_model, cp0Var.n);
        G0(view, R.id.row_upnp_model_description, R.id.item_summary_upnp_model_description, cp0Var.t);
        String str3 = cp0Var.p;
        if (str3 == null || str3.length() <= 1 || E0(str3)) {
            G0(view, R.id.row_upnp_model_number, R.id.item_summary_upnp_model_number, "");
        } else {
            G0(view, R.id.row_upnp_model_number, R.id.item_summary_upnp_model_number, cp0Var.p);
        }
        String str4 = cp0Var.q;
        if (str4 == null || str4.length() <= 1 || E0(str4)) {
            G0(view, R.id.row_upnp_serial, R.id.item_summary_upnp_serial, "");
        } else {
            G0(view, R.id.row_upnp_serial, R.id.item_summary_upnp_serial, cp0Var.q);
        }
        G0(view, R.id.row_upnp_manufacturer, R.id.item_summary_upnp_manufacturer, cp0Var.m);
        D0(view, R.id.row_upnp_manufacturer_url, R.id.item_summary_upnp_manufacturer_url, cp0Var.s);
        D0(view, R.id.row_upnp_model_url, R.id.item_summary_upnp_model_url, cp0Var.r);
        G0(view, R.id.row_upnp_device_type, R.id.item_summary_upnp_device_type, cp0Var.o);
        F0(view, R.id.section_upnp, R.id.row_upnp_name, R.id.row_upnp_model_url, R.id.row_upnp_manufacturer_url, R.id.row_upnp_device_type, R.id.row_upnp_model, R.id.row_upnp_model_number, R.id.row_upnp_serial, R.id.row_upnp_manufacturer);
        G0(view, R.id.row_bonjour, R.id.item_summary_bonjour, cp0Var.v);
        G0(view, R.id.row_bonjour_services, R.id.item_summary_bonjour_services, cp0Var.w);
        F0(view, R.id.section_services, R.id.row_bonjour_services);
    }

    public final void D0(View view, int i, int i2, String str) {
        View findViewById = view.findViewById(i);
        TextView textView = (TextView) view.findViewById(i2);
        if (str == null || str.trim().isEmpty()) {
            findViewById.setVisibility(8);
            return;
        }
        String trim = str.trim();
        findViewById.setVisibility(0);
        textView.setText(trim);
        textView.setPaintFlags(8 | textView.getPaintFlags());
        findViewById.setClickable(true);
        findViewById.setFocusable(true);
        findViewById.setOnClickListener(new tc(this, trim));
    }
}
