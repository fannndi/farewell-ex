package defpackage;

import android.location.GnssStatus;
import android.widget.ImageView;
import android.widget.TextView;
import flar2.devcheck.R;
import flar2.devcheck.tools.GpsActivity;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class sg0 extends GnssStatus.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f935a;
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ DecimalFormat c;
    public final /* synthetic */ GpsActivity d;

    public sg0(GpsActivity gpsActivity, TextView textView, ImageView imageView, DecimalFormat decimalFormat) {
        this.d = gpsActivity;
        this.f935a = textView;
        this.b = imageView;
        this.c = decimalFormat;
    }

    @Override // android.location.GnssStatus.Callback
    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        int satelliteCount = gnssStatus.getSatelliteCount();
        TextView textView = this.f935a;
        GpsActivity gpsActivity = this.d;
        if (satelliteCount > 0) {
            textView.setText(gpsActivity.getString(R.string.satellites) + " " + gnssStatus.getSatelliteCount());
        } else {
            textView.setText(R.string.gps_no_fix);
            this.b.setImageDrawable(gpsActivity.getDrawable(R.drawable.ic_gps_nofix));
            boolean z = GpsActivity.V;
            gpsActivity.B();
        }
        gpsActivity.J.clear();
        int i = 0;
        gpsActivity.J.add(new nj1(0));
        gpsActivity.J.add(new nj1("Id", "C/N0", gpsActivity.getString(R.string.elevation_abbr), gpsActivity.getString(R.string.azimuth_abbr), null, 99));
        while (true) {
            int satelliteCount2 = gnssStatus.getSatelliteCount();
            ArrayList arrayList = gpsActivity.J;
            if (i >= satelliteCount2) {
                Collections.sort(arrayList, Comparator.comparingInt(new t8(1)));
                Collections.reverse(gpsActivity.J);
                gpsActivity.J.add(new nj1(2));
                gpsActivity.K.f();
                return;
            }
            String valueOf = String.valueOf(gnssStatus.getSvid(i));
            StringBuilder sb = new StringBuilder();
            double cn0DbHz = gnssStatus.getCn0DbHz(i);
            DecimalFormat decimalFormat = this.c;
            String v = d51.v(decimalFormat, cn0DbHz, sb, " dB-Hz");
            String v2 = d51.v(decimalFormat, gnssStatus.getElevationDegrees(i), new StringBuilder(), "°");
            String v3 = d51.v(decimalFormat, gnssStatus.getAzimuthDegrees(i), new StringBuilder(), "°");
            String.valueOf(gnssStatus.getConstellationType(i));
            int constellationType = gnssStatus.getConstellationType(i);
            arrayList.add(new nj1(valueOf, v, v2, v3, constellationType != 1 ? constellationType != 3 ? constellationType != 4 ? constellationType != 5 ? constellationType != 6 ? constellationType != 7 ? null : gpsActivity.getDrawable(R.drawable.india) : gpsActivity.getDrawable(R.drawable.eu) : gpsActivity.getDrawable(R.drawable.china) : gpsActivity.getDrawable(R.drawable.japan) : gpsActivity.getDrawable(R.drawable.russia) : gpsActivity.getDrawable(R.drawable.usa), (int) gnssStatus.getCn0DbHz(i)));
            i++;
        }
    }

    @Override // android.location.GnssStatus.Callback
    public final void onStarted() {
    }

    @Override // android.location.GnssStatus.Callback
    public final void onStopped() {
    }
}
