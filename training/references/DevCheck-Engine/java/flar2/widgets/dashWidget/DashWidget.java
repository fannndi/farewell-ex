package flar2.devcheck.widgets.dashWidget;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.c3;
import defpackage.je2;
import defpackage.kc;
import defpackage.lc;
import defpackage.sl;
import defpackage.tl2;
import flar2.devcheck.MainApp;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.util.Calendar;

/* loaded from: classes.dex */
public class DashWidget extends AppWidgetProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f294a = 0;

    public static void a(Context context) {
        if (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) DashWidget.class)).length > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            long timeInMillis = calendar.getTimeInMillis() + 300000;
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) DashWidget.class));
            Intent intent = new Intent(context, (Class<?>) DashWidget.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra(XmJDY.XRzcr, appWidgetIds);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 154222119, intent, 335544320);
            AlarmManager alarmManager = (AlarmManager) context.getApplicationContext().getSystemService("alarm");
            if (alarmManager != null) {
                alarmManager.set(1, timeInMillis, broadcast);
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        MainApp.h.execute(new lc(context, i, appWidgetManager));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        for (int i : iArr) {
            sl.n(i, "dash_clock_");
            sl.n(i, "dash_opacity_");
            sl.n(i, "dash_onclick_");
            tl2.j(context, i);
            je2.n(context, i);
            c3.f(context, i);
        }
        a(context);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        super.onDisabled(context);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager != null) {
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) DashWidget.class));
            Intent intent = new Intent(context, (Class<?>) DashWidget.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", appWidgetIds);
            alarmManager.cancel(PendingIntent.getBroadcast(context, 154222119, intent, 335544320));
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (intent.getAction() == null || !intent.getAction().equals("flar2.devcheck.widgets.AUTO_UPDATE")) {
            return;
        }
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        onUpdate(context, appWidgetManager, appWidgetManager.getAppWidgetIds(new ComponentName(context.getPackageName(), getClass().getName())));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        MainApp.h.execute(new kc(this, iArr, context, appWidgetManager, 2));
    }
}
