package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import flar2.devcheck.MainApp;
import flar2.devcheck.widgets.barDetailWidget.BarDetailWidget;
import flar2.devcheck.widgets.batteryWidget.BatteryWidget;
import flar2.devcheck.widgets.dashWidget.DashWidget;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class kc implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ int[] h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ AppWidgetManager j;

    public /* synthetic */ kc(AppWidgetProvider appWidgetProvider, int[] iArr, Context context, AppWidgetManager appWidgetManager, int i) {
        this.g = i;
        this.h = iArr;
        this.i = context;
        this.j = appWidgetManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        AppWidgetManager appWidgetManager = this.j;
        Context context = this.i;
        int[] iArr = this.h;
        int i2 = 0;
        switch (i) {
            case 0:
                int i3 = BarDetailWidget.f292a;
                for (int i4 : iArr) {
                    MainApp.h.execute(new lc(i4, context, appWidgetManager, 0));
                }
                BarDetailWidget.a(context);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int i5 = BatteryWidget.f293a;
                int length = iArr.length;
                while (i2 < length) {
                    MainApp.h.execute(new lc(iArr[i2], context, appWidgetManager, 1));
                    i2++;
                }
                BatteryWidget.a(context, uz1.g0(context));
                break;
            default:
                int i6 = DashWidget.f294a;
                int length2 = iArr.length;
                while (i2 < length2) {
                    MainApp.h.execute(new lc(context, iArr[i2], appWidgetManager));
                    i2++;
                }
                DashWidget.a(context);
                break;
        }
    }
}
