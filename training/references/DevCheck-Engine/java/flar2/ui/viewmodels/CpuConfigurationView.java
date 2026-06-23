package flar2.devcheck.ui.viewmodels;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public class CpuConfigurationView extends LinearLayout {
    public final LinearLayout g;
    public final LayoutInflater h;

    public CpuConfigurationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        LayoutInflater from = LayoutInflater.from(context);
        this.h = from;
        from.inflate(R.layout.view_cpu_configuration, (ViewGroup) this, true);
        this.g = (LinearLayout) findViewById(R.id.cpu_config_cluster_list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setClusters(java.util.List<defpackage.ji0> r21) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.ui.viewmodels.CpuConfigurationView.setClusters(java.util.List):void");
    }
}
