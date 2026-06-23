package defpackage;

import flar2.devcheck.tools.WifiActivity;
import flar2.devcheck.vulkanInfo.VulkanInfoActivity;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class p92 implements v31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f778a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ p92(a5 a5Var, int i) {
        this.f778a = i;
        this.b = a5Var;
    }

    @Override // defpackage.v31
    public final void a(Object obj) {
        int i = this.f778a;
        a5 a5Var = this.b;
        switch (i) {
            case 0:
                WifiActivity wifiActivity = (WifiActivity) a5Var;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i2 = WifiActivity.R;
                if (!booleanValue) {
                    wifiActivity.finish();
                    break;
                }
                break;
            default:
                VulkanInfoActivity vulkanInfoActivity = (VulkanInfoActivity) a5Var;
                List list = (List) obj;
                if (list != null) {
                    int i3 = VulkanInfoActivity.J;
                    list.isEmpty();
                }
                vulkanInfoActivity.G.x(list);
                break;
        }
    }
}
