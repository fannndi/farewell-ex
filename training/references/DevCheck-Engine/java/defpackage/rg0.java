package defpackage;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.tools.GpsActivity;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
public final class rg0 implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f892a;
    public final /* synthetic */ DecimalFormat b;
    public final /* synthetic */ DecimalFormat c;
    public final /* synthetic */ SimpleDateFormat d;
    public final /* synthetic */ GpsActivity e;

    public rg0(GpsActivity gpsActivity, ImageView imageView, DecimalFormat decimalFormat, DecimalFormat decimalFormat2, SimpleDateFormat simpleDateFormat) {
        this.e = gpsActivity;
        this.f892a = imageView;
        this.b = decimalFormat;
        this.c = decimalFormat2;
        this.d = simpleDateFormat;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = GpsActivity.V;
        GpsActivity gpsActivity = this.e;
        if (!z) {
            gpsActivity.S.setText(gpsActivity.getString(R.string.gps_time_to_first_fix) + " " + uz1.B(gpsActivity, currentTimeMillis - GpsActivity.U));
            GpsActivity.V = true;
        }
        this.f892a.setImageDrawable(gpsActivity.getDrawable(R.drawable.ic_gps_fix));
        TextView textView = gpsActivity.L;
        double latitude = location.getLatitude();
        DecimalFormat decimalFormat = this.b;
        textView.setText(decimalFormat.format(latitude) + "°");
        gpsActivity.M.setText(decimalFormat.format(location.getLongitude()) + "°");
        TextView textView2 = gpsActivity.N;
        double altitude = location.getAltitude();
        DecimalFormat decimalFormat2 = this.c;
        textView2.setText(decimalFormat2.format(altitude) + " m");
        gpsActivity.O.setText(decimalFormat2.format((double) location.getSpeed()) + " m/s");
        boolean hasBearing = location.hasBearing();
        TextView textView3 = gpsActivity.P;
        if (hasBearing) {
            textView3.setText(decimalFormat2.format(location.getBearing()) + "°");
            gpsActivity.Q.setVisibility(0);
        } else {
            textView3.setText("");
            gpsActivity.Q.setVisibility(4);
        }
        gpsActivity.R.setText(gpsActivity.getString(R.string.accuracy) + " " + decimalFormat2.format(location.getAccuracy()) + " m");
        gpsActivity.T.setText(this.d.format(Long.valueOf(currentTimeMillis)));
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        boolean z = GpsActivity.V;
        final GpsActivity gpsActivity = this.e;
        th2 th2Var = new th2(gpsActivity);
        String string = gpsActivity.getString(R.string.location_off);
        j3 j3Var = (j3) th2Var.h;
        j3Var.e = string;
        j3Var.g = gpsActivity.getString(R.string.location_off_msg);
        final int i = 0;
        th2Var.h(gpsActivity.getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: qg0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                int i3 = i;
                GpsActivity gpsActivity2 = gpsActivity;
                switch (i3) {
                    case 0:
                        boolean z2 = GpsActivity.V;
                        try {
                            gpsActivity2.H.dismiss();
                            break;
                        } catch (IllegalStateException unused) {
                            return;
                        }
                    default:
                        boolean z3 = GpsActivity.V;
                        try {
                            gpsActivity2.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                            break;
                        } catch (ActivityNotFoundException unused2) {
                            return;
                        }
                }
            }
        });
        final int i2 = 1;
        th2Var.j(gpsActivity.getString(R.string.settings), new DialogInterface.OnClickListener() { // from class: qg0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i22) {
                int i3 = i2;
                GpsActivity gpsActivity2 = gpsActivity;
                switch (i3) {
                    case 0:
                        boolean z2 = GpsActivity.V;
                        try {
                            gpsActivity2.H.dismiss();
                            break;
                        } catch (IllegalStateException unused) {
                            return;
                        }
                    default:
                        boolean z3 = GpsActivity.V;
                        try {
                            gpsActivity2.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                            break;
                        } catch (ActivityNotFoundException unused2) {
                            return;
                        }
                }
            }
        });
        n3 n3Var = gpsActivity.H;
        if (n3Var != null && n3Var.isShowing()) {
            gpsActivity.H.dismiss();
        }
        n3 a2 = th2Var.a();
        gpsActivity.H = a2;
        a2.show();
        gpsActivity.H.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        try {
            int i3 = (gpsActivity.getResources().getDisplayMetrics().widthPixels * 90) / 100;
            if (gpsActivity.getResources().getConfiguration().orientation == 2 || gpsActivity.getResources().getBoolean(R.bool.isTablet)) {
                i3 = (gpsActivity.getResources().getDisplayMetrics().widthPixels * 60) / 100;
            }
            gpsActivity.H.getWindow().setLayout(i3, -2);
        } catch (Exception unused) {
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
