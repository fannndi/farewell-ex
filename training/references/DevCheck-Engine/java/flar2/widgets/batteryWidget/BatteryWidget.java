package flar2.devcheck.widgets.batteryWidget;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SizeF;
import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import defpackage.c3;
import defpackage.je2;
import defpackage.kc;
import defpackage.lc;
import defpackage.sl;
import defpackage.tl2;
import flar2.devcheck.MainApp;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes.dex */
public class BatteryWidget extends AppWidgetProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f293a = 0;

    public static void a(Context context, boolean z) {
        long timeInMillis;
        long j;
        if (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) BatteryWidget.class)).length > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            if (z) {
                timeInMillis = calendar.getTimeInMillis();
                j = 7000000;
            } else {
                timeInMillis = calendar.getTimeInMillis();
                j = 100000;
            }
            long j2 = timeInMillis + j;
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) BatteryWidget.class));
            Intent intent = new Intent(context, (Class<?>) BatteryWidget.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", appWidgetIds);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, -1111596947, intent, 335544320);
            AlarmManager alarmManager = (AlarmManager) context.getApplicationContext().getSystemService("alarm");
            if (alarmManager != null) {
                alarmManager.set(1, j2, broadcast);
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            parcelableArrayList = null;
        }
        String str = yFbVsaLCWAtQC.axAk;
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            sl.h0(i, str, "MEDIUM");
        } else if (((SizeF) parcelableArrayList.get(0)).getWidth() > 110.0f) {
            sl.h0(i, str, "MEDIUM");
        } else {
            sl.h0(i, str, UQdsoaJMID.pxuaCWAPu);
        }
        MainApp.h.execute(new lc(i, context, appWidgetManager, 1));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        for (int i : iArr) {
            sl.n(i, "battery_opacity_");
            sl.n(i, "battery_size_");
            tl2.j(context, i);
            je2.n(context, i);
            c3.f(context, i);
        }
        a(context, false);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        super.onDisabled(context);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager != null) {
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) BatteryWidget.class));
            Intent intent = new Intent(context, (Class<?>) BatteryWidget.class);
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("appWidgetIds", appWidgetIds);
            alarmManager.cancel(PendingIntent.getBroadcast(context, -1111596947, intent, 335544320));
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
        MainApp.h.execute(new kc(this, iArr, context, appWidgetManager, 1));
    }
}
