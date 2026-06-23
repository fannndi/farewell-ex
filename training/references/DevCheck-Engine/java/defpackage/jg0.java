package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
public final class jg0 extends kg0 {
    public static final Object b = new Object();
    public static final jg0 c = new jg0();

    public static AlertDialog d(Activity activity, int i, bg2 bg2Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(qf2.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(flar2.devcheck.R.string.common_google_play_services_enable_button) : resources.getString(flar2.devcheck.R.string.common_google_play_services_update_button) : resources.getString(flar2.devcheck.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, bg2Var);
        }
        String c2 = qf2.c(activity, i);
        if (c2 != null) {
            builder.setTitle(c2);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static void e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof a5) {
                ae0 s = ((a5) activity).s();
                xs1 xs1Var = new xs1();
                xc1.k("Cannot display null dialog", alertDialog);
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                xs1Var.t0 = alertDialog;
                if (onCancelListener != null) {
                    xs1Var.u0 = onCancelListener;
                }
                xs1Var.z0(s, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        k90 k90Var = new k90();
        xc1.k("Cannot display null dialog", alertDialog);
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        k90Var.g = alertDialog;
        if (onCancelListener != null) {
            k90Var.h = onCancelListener;
        }
        k90Var.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog d = d(googleApiActivity, i, new wf2(super.a(i, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (d == null) {
            return;
        }
        e(googleApiActivity, d, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void f(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        NotificationChannel notificationChannel;
        CharSequence name;
        new IllegalArgumentException();
        if (i == 18) {
            new yf2(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String e = i == 6 ? qf2.e(context, "common_google_play_services_resolution_required_title") : qf2.c(context, i);
        if (e == null) {
            e = context.getResources().getString(flar2.devcheck.R.string.common_google_play_services_notification_ticker);
        }
        String d = (i == 6 || i == 19) ? qf2.d(context, "common_google_play_services_resolution_required_text", qf2.a(context)) : qf2.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        xc1.j(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        e31 e31Var = new e31(context, null);
        e31Var.k = true;
        e31Var.c(16);
        e31Var.e = e31.b(e);
        kp kpVar = new kp(8, false);
        kpVar.i = e31.b(d);
        e31Var.d(kpVar);
        PackageManager packageManager = context.getPackageManager();
        if (bw0.h == null) {
            bw0.h = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (bw0.h.booleanValue()) {
            e31Var.p.icon = context.getApplicationInfo().icon;
            e31Var.h = 2;
            if (bw0.r(context)) {
                e31Var.b.add(new d31(resources.getString(flar2.devcheck.R.string.common_open_on_phone), pendingIntent));
            } else {
                e31Var.g = pendingIntent;
            }
        } else {
            e31Var.p.icon = R.drawable.stat_sys_warning;
            e31Var.p.tickerText = e31.b(resources.getString(flar2.devcheck.R.string.common_google_play_services_notification_ticker));
            e31Var.p.when = System.currentTimeMillis();
            e31Var.g = pendingIntent;
            e31Var.f = e31.b(d);
        }
        if (om0.F()) {
            if (!om0.F()) {
                throw new IllegalStateException();
            }
            synchronized (b) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(flar2.devcheck.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(ig0.f(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            e31Var.n = "com.google.android.gms.availability";
        }
        Notification a2 = e31Var.a();
        if (i == 1 || i == 2 || i == 3) {
            og0.f731a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, a2);
    }

    public final void g(Activity activity, cq0 cq0Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d = d(activity, i, new ag2(super.a(i, activity, "d"), cq0Var), onCancelListener);
        if (d == null) {
            return;
        }
        e(activity, d, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
