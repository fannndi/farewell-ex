package flar2.devcheck.tools;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.UriPermission;
import android.graphics.drawable.ColorDrawable;
import android.hardware.usb.UsbDevice;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.DocumentsContract;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import android.system.Os;
import android.system.StructStatVfs;
import android.text.format.Formatter;
import android.view.InputDevice;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.behavior.YqV.Gvyagftz;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import defpackage.a5;
import defpackage.af1;
import defpackage.c;
import defpackage.c3;
import defpackage.d01;
import defpackage.d51;
import defpackage.gi;
import defpackage.gr;
import defpackage.hn0;
import defpackage.i02;
import defpackage.j3;
import defpackage.jr1;
import defpackage.l01;
import defpackage.n3;
import defpackage.n72;
import defpackage.nc;
import defpackage.oo1;
import defpackage.op0;
import defpackage.pj;
import defpackage.pr;
import defpackage.py0;
import defpackage.qf;
import defpackage.rj;
import defpackage.sj;
import defpackage.sl;
import defpackage.sq;
import defpackage.th2;
import defpackage.ts0;
import defpackage.uz1;
import defpackage.vq;
import defpackage.w32;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.utils.MyLinearLayoutManager;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class USBActivity extends a5 implements d01 {
    public static final /* synthetic */ int S = 0;
    public ArrayList F;
    public l01 G;
    public View H;
    public View J;
    public n3 K;
    public Handler M;
    public final ArrayList I = new ArrayList();
    public int L = 0;
    public final oo1 N = new oo1(9, this);
    public final w32 O = new w32(this, 0);
    public final sq P = new sq();
    public final DecimalFormat Q = new DecimalFormat("###.#");
    public final w32 R = new w32(this, 1);

    public static String G(String str) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(str.split("\\s+")));
            StringBuilder sb = new StringBuilder();
            Iterator it = linkedHashSet.iterator();
            int i = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (i > 0) {
                    sb.append(" ");
                }
                sb.append(str2);
                i++;
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x02cb, code lost:
    
        if (r8 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02d3, code lost:
    
        r21.F.add(new defpackage.hn0(0, G(r6.getName()), (java.lang.String) null));
        r21.F.add(new defpackage.hn0(1, getString(flar2.devcheck.R.string.input_device), java.lang.String.valueOf(r6.getId())));
        r21.F.add(new defpackage.hn0(1, getString(flar2.devcheck.R.string.product), r6.getName()));
        r21.F.add(new defpackage.hn0(1, getString(flar2.devcheck.R.string.type), r7));
        r21.F.add(new defpackage.hn0(1, getString(flar2.devcheck.R.string.product_id), java.lang.String.valueOf(r6.getProductId())));
        r21.F.add(new defpackage.hn0(1, getString(flar2.devcheck.R.string.vendor_id), java.lang.String.valueOf(r6.getVendorId())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x035d, code lost:
    
        if (r6.getControllerNumber() <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x035f, code lost:
    
        r21.F.add(new defpackage.hn0(1, getString(flar2.devcheck.R.string.controller_number), java.lang.String.valueOf(r6.getControllerNumber())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0378, code lost:
    
        C(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02d1, code lost:
    
        if (r7.equals("skip") == false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.tools.USBActivity.B():void");
    }

    public final void C(InputDevice inputDevice) {
        ArrayList arrayList = new ArrayList();
        for (String str : inputDevice.toString().split("\n")) {
            String str2 = Gvyagftz.cguqjmvqwObLGtZ;
            if (str.contains(str2)) {
                String[] split = str.split(str2);
                String trim = split[0].trim();
                if (trim.contains("Vibrator") && split[1].trim().equals("true")) {
                    arrayList.add(getString(R.string.vibration));
                }
                if (trim.contains("Mic") && split[1].equals("true")) {
                    arrayList.add(getString(R.string.microphone));
                }
                if (trim.contains("battery") && split[1].equals("true")) {
                    arrayList.add(getString(R.string.battery));
                }
                if (trim.contains("Sensor") && split[1].equals("true")) {
                    arrayList.add(getString(R.string.sensor));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                sb.append((String) obj);
                sb.append(", ");
            }
        }
        if (sb.length() > 2) {
            this.F.add(new hn0(33, getString(R.string.features), new StringBuilder(sb.substring(0, sb.length() - 2)).toString()));
        }
    }

    public final String D(InputDevice inputDevice) {
        boolean z = false;
        for (String str : inputDevice.toString().split("\n")) {
            if (str.contains(":")) {
                String[] split = str.split(":");
                String trim = split[0].trim();
                if (trim.contains("Keyboard Type") && split[1].trim().equals(YHJbtPFAANaPQ.WTKZtw)) {
                    z = true;
                }
                if (!trim.equals("Sources")) {
                    continue;
                } else {
                    if (split[1].contains("gamepad")) {
                        return getString(R.string.gamepad);
                    }
                    if (split[1].contains("joystick")) {
                        return getString(R.string.joystick);
                    }
                    if (split[1].contains("stylus")) {
                        return getString(R.string.stylus);
                    }
                    if (split[1].contains("mouse")) {
                        return getString(R.string.mouse);
                    }
                    if (split[1].contains("keyboard") && !z) {
                        return getString(R.string.keyboard);
                    }
                }
            }
        }
        return "skip";
    }

    public final void E(UsbDevice usbDevice) {
        ArrayList arrayList = new ArrayList();
        for (String str : usbDevice.toString().split(",")) {
            if (str.contains("=")) {
                String[] split = str.split("=");
                String trim = split[0].trim();
                if (trim.equals("mHasAudioCapture") && split[1].trim().equals("true")) {
                    arrayList.add(getString(R.string.audio_capture));
                }
                if (trim.equals("mHasAudioPlayback") && split[1].equals("true")) {
                    arrayList.add(getString(R.string.audio_playback));
                }
                if (trim.equals("mHasMidi") && split[1].equals("true")) {
                    arrayList.add(getString(R.string.midi));
                }
                if (trim.equals("mHasVideoCapture") && split[1].equals("true")) {
                    arrayList.add(getString(R.string.video_capture));
                }
                if (trim.equals("mHasVideoPlayback") && split[1].equals("true")) {
                    arrayList.add(getString(R.string.video_playback));
                }
                if (trim.equals("mMaxPower") && !split[1].trim().equals("0")) {
                    this.F.add(new hn0(1, getString(R.string.power), d51.u(new StringBuilder(), split[1], " mA")));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                sb.append((String) obj);
                sb.append(", ");
            }
        }
        if (sb.length() > 2) {
            this.F.add(new hn0(55, getString(R.string.features), new StringBuilder(sb.substring(0, sb.length() - 2)).toString()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList F() {
        String str;
        int i;
        char c;
        char c2;
        int i2;
        String str2;
        ArrayList arrayList;
        String[] strArr;
        int i3;
        int i4;
        Intent intent;
        File file;
        ParcelFileDescriptor openFileDescriptor;
        StructStatVfs fstatvfs;
        long j;
        long j2;
        long j3;
        long j4;
        int i5;
        String str3;
        int i6;
        String str4 = GFUHKHDfiFuPm.FMaEZae;
        String str5 = "/mnt/external_sd";
        ArrayList arrayList2 = new ArrayList();
        try {
            ArrayList arrayList3 = new ArrayList();
            File[] externalFilesDirs = getApplicationContext().getExternalFilesDirs(null);
            int i7 = 1;
            if (externalFilesDirs.length > 1) {
                arrayList3.add(new jr1(externalFilesDirs[1].toString(), null));
            }
            char c3 = 2;
            if (externalFilesDirs.length > 2) {
                arrayList3.add(new jr1(externalFilesDirs[2].toString(), null));
            }
            try {
                ArrayList n = uz1.n("/system/bin/sh -c mount | grep \"/mnt/media_rw/\"");
                int size = n.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = n.get(i8);
                    i8++;
                    String[] split = ((String) obj).split(" ");
                    File file2 = new File(split[c3]);
                    c2 = 4;
                    try {
                        if (file2.getAbsolutePath().contains("/mnt/media_rw")) {
                            int size2 = arrayList3.size();
                            c = c3;
                            int i9 = 0;
                            int i10 = 0;
                            while (i9 < size2) {
                                try {
                                    Object obj2 = arrayList3.get(i9);
                                    i9++;
                                    i2 = 0;
                                    try {
                                        String str6 = ((jr1) obj2).f494a;
                                        i = i7;
                                        try {
                                            if (str6.contains(file2.getName())) {
                                                int size3 = arrayList3.size();
                                                int i11 = 0;
                                                while (i11 < size3) {
                                                    Object obj3 = arrayList3.get(i11);
                                                    i11++;
                                                    jr1 jr1Var = (jr1) obj3;
                                                    str = str5;
                                                    try {
                                                        if (jr1Var.f494a.contains(file2.getName()) && !jr1Var.f494a.equals(file2.getName())) {
                                                            jr1Var.b = split[4];
                                                        }
                                                        str5 = str;
                                                    } catch (Exception unused) {
                                                    }
                                                }
                                                i10 = i;
                                            }
                                            i7 = i;
                                            str5 = str5;
                                        } catch (Exception unused2) {
                                            str = str5;
                                        }
                                    } catch (Exception unused3) {
                                        str = str5;
                                        i = i7;
                                    }
                                } catch (Exception unused4) {
                                    str = str5;
                                    i = i7;
                                }
                            }
                            str3 = str5;
                            i6 = i7;
                            if (i10 == 0) {
                                arrayList3.add(new jr1(split[c], split[4]));
                            }
                        } else {
                            str3 = str5;
                            i6 = i7;
                            c = c3;
                        }
                        c3 = c;
                        i7 = i6;
                        str5 = str3;
                    } catch (Exception unused5) {
                        str = str5;
                        i = i7;
                        c = c3;
                    }
                }
            } catch (Exception unused6) {
            }
            str = str5;
            i = i7;
            c = c3;
            c2 = 4;
            i2 = 0;
            String[] strArr2 = new String[10];
            strArr2[i2] = "/sdcard2";
            strArr2[i] = str;
            strArr2[c] = str;
            char c4 = 3;
            strArr2[3] = "/storage/extSdCard";
            strArr2[c2] = "/storage/sdcard1/";
            strArr2[5] = "/storage/usbcard1/";
            strArr2[6] = "/storage/external_SD/";
            strArr2[7] = "/mnt/extsdcard/";
            strArr2[8] = bOxzFZXgEkjph.utKEOSAUlTvsAUs;
            strArr2[9] = "/storage/extsdcard/";
            for (int i12 = i2; i12 < 10; i12++) {
                arrayList3.add(new jr1(strArr2[i12], null));
            }
            int size4 = arrayList3.size();
            int i13 = i2;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                jr1 jr1Var2 = (jr1) obj4;
                String str7 = jr1Var2.f494a;
                String str8 = uz1.f1060a;
                char c5 = c4;
                if ((str7 != null ? new File(str7).exists() : i2) != 0) {
                    String[] G = sl.G(getApplicationContext(), new File(jr1Var2.f494a));
                    if (!G[i2].equals("0.00B") && !G[i2].equals("NA")) {
                        arrayList2.add(new hn0(60, (String) null, (String) null));
                        arrayList2.add(new hn0(27, ts0.b(getApplication(), R.string.ext_sdcard), (String) null));
                        try {
                            String str9 = jr1Var2.b;
                            if (str9 != null && str9.length() > 0) {
                                arrayList2.add(new hn0(i, ts0.b(getApplication(), R.string.filesystem), jr1Var2.b));
                            }
                        } catch (Exception unused7) {
                        }
                        try {
                            String V = uz1.V(jr1Var2.f494a);
                            if (V != null) {
                                arrayList2.add(new hn0(1, ts0.b(getApplication(), R.string.block_size), V));
                            }
                        } catch (Exception unused8) {
                        }
                        String str10 = jr1Var2.f494a;
                        try {
                            if (str10.contains(str4)) {
                                String str11 = jr1Var2.f494a;
                                str10 = str11.substring(i2, str11.indexOf(str4));
                            }
                        } catch (Exception unused9) {
                        }
                        String str12 = str10;
                        i2 = 0;
                        arrayList2.add(new hn0(str12, G[0], G[1] + " " + ts0.b(getApplication(), R.string.used), G[c] + " " + ts0.b(getApplication(), R.string.free), Integer.parseInt(G[c5]), 8));
                    }
                    str2 = str4;
                    arrayList = arrayList3;
                    strArr = strArr2;
                    i3 = size4;
                    i4 = 1;
                } else {
                    for (int i14 = i2; i14 < 10; i14++) {
                        if (strArr2[i14].equals(jr1Var2.f494a)) {
                            c4 = c5;
                            i = 1;
                            break;
                        }
                    }
                    arrayList2.add(new hn0(60, (String) null, (String) null));
                    arrayList2.add(new hn0(27, ts0.b(getApplication(), R.string.ext_sdcard), (String) null));
                    arrayList2.add(new hn0(1, ts0.b(getApplication(), R.string.directory), jr1Var2.f494a.trim()));
                    try {
                        String str13 = jr1Var2.b;
                        if (str13 != null && str13.length() > 0) {
                            arrayList2.add(new hn0(1, ts0.b(getApplication(), R.string.filesystem), jr1Var2.b));
                        }
                    } catch (Exception unused10) {
                    }
                    try {
                        String V2 = uz1.V(jr1Var2.f494a);
                        if (V2 != null) {
                            arrayList2.add(new hn0(1, ts0.b(getApplication(), R.string.block_size), V2));
                        }
                    } catch (Exception unused11) {
                    }
                    StorageManager storageManager = (StorageManager) getApplicationContext().getSystemService("storage");
                    if (storageManager != null) {
                        intent = null;
                        for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                            if (!storageVolume.isPrimary() && storageVolume.toString().toLowerCase().contains(new File(jr1Var2.f494a).getName().toLowerCase())) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    intent = storageVolume.createOpenDocumentTreeIntent();
                                    intent.putExtra("volume_label", storageVolume.getDescription(getApplicationContext()));
                                }
                                arrayList2.add(new hn0(1, ts0.b(getApplication(), R.string.state), storageVolume.getState()));
                                arrayList2.add(new hn0(1, ts0.b(getApplication(), R.string.volume_label), storageVolume.getDescription(getApplicationContext())));
                            }
                        }
                    } else {
                        intent = null;
                    }
                    i4 = 1;
                    if (intent != null) {
                        try {
                            file = new File(jr1Var2.f494a);
                            Uri uri = null;
                            for (UriPermission uriPermission : getApplicationContext().getContentResolver().getPersistedUriPermissions()) {
                                if (uriPermission.getUri().toString().toLowerCase().contains(file.getName().toLowerCase())) {
                                    uri = uriPermission.getUri();
                                }
                            }
                            openFileDescriptor = getApplicationContext().getContentResolver().openFileDescriptor(DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)), "r");
                            fstatvfs = Os.fstatvfs(openFileDescriptor.getFileDescriptor());
                            long j5 = fstatvfs.f_blocks;
                            j = fstatvfs.f_bsize;
                            str2 = str4;
                            j2 = j5 * j;
                            arrayList = arrayList3;
                            strArr = strArr2;
                        } catch (Exception unused12) {
                            str2 = str4;
                            arrayList = arrayList3;
                            strArr = strArr2;
                        }
                        try {
                            j3 = fstatvfs.f_bavail * j;
                            openFileDescriptor.close();
                            j4 = j2 - j3;
                            i3 = size4;
                            i5 = (int) (((j4 * 100.0d) / j2) + 0.5d);
                        } catch (Exception unused13) {
                            i3 = size4;
                            arrayList2.add(new hn0(ts0.b(getApplication(), R.string.disk_usage), ts0.b(getApplication(), R.string.show), intent));
                            size4 = i3;
                            str4 = str2;
                            c4 = c5;
                            arrayList3 = arrayList;
                            strArr2 = strArr;
                            i = i4;
                        }
                        try {
                            arrayList2.add(new hn0(file.getName(), Formatter.formatFileSize(getApplicationContext(), j2) + " " + ts0.b(getApplication(), R.string.total).toLowerCase(), Formatter.formatFileSize(getApplicationContext(), j4) + " " + ts0.b(getApplication(), R.string.used), Formatter.formatFileSize(getApplicationContext(), j3) + " " + ts0.b(getApplication(), R.string.free), i5, 8));
                        } catch (Exception unused14) {
                            arrayList2.add(new hn0(ts0.b(getApplication(), R.string.disk_usage), ts0.b(getApplication(), R.string.show), intent));
                            size4 = i3;
                            str4 = str2;
                            c4 = c5;
                            arrayList3 = arrayList;
                            strArr2 = strArr;
                            i = i4;
                        }
                    } else {
                        str2 = str4;
                        arrayList = arrayList3;
                        strArr = strArr2;
                        i3 = size4;
                    }
                }
                size4 = i3;
                str4 = str2;
                c4 = c5;
                arrayList3 = arrayList;
                strArr2 = strArr;
                i = i4;
            }
        } catch (Exception unused15) {
        }
        return arrayList2;
    }

    public final void H(Intent intent) {
        th2 th2Var = new th2(this);
        String stringExtra = intent.getStringExtra("volume_label");
        String string = getString(R.string.disk_usage);
        j3 j3Var = (j3) th2Var.h;
        j3Var.e = string;
        j3Var.g = getString(R.string.usb_disk_access, stringExtra);
        th2Var.h(getString(R.string.cancel), new qf(11, this));
        th2Var.j(getString(R.string.okay), new gi(this, 5, intent));
        n3 n3Var = this.K;
        if (n3Var != null && n3Var.isShowing()) {
            this.K.dismiss();
        }
        n3 a2 = th2Var.a();
        this.K = a2;
        a2.show();
        this.K.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        try {
            int i = (getResources().getDisplayMetrics().widthPixels * 90) / 100;
            if (getResources().getConfiguration().orientation == 2 || getResources().getBoolean(R.bool.isTablet)) {
                i = (getResources().getDisplayMetrics().widthPixels * 60) / 100;
            }
            this.K.getWindow().setLayout(i, -2);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.d01
    public final void d(String str) {
    }

    @Override // defpackage.d01
    public final void j(String str) {
    }

    @Override // defpackage.d01
    public final void n(Intent intent, String str) {
        if (str.equals(getString(R.string.disk_usage)) || str.equals("Disk usage")) {
            try {
                H(intent);
            } catch (Exception unused) {
            }
        }
    }

    @Override // defpackage.a5, defpackage.zt, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 215) {
            if (intent.getData() != null) {
                getApplicationContext().getContentResolver().takePersistableUriPermission(intent.getData(), 1);
            }
            B();
        }
    }

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_usb);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coord_layout);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        if (coordinatorLayout != null && recyclerView != null) {
            op0.a(coordinatorLayout, true, false, true, false, false, false);
            op0.a(recyclerView, false, false, false, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        r.j0(true);
        this.M = new Handler();
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        collapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);
        collapsingToolbarLayout.setTitle(getString(R.string.usb_check));
        getWindow().setStatusBarColor(getColor(android.R.color.transparent));
        pr.U(getWindow(), false);
        this.H = findViewById(R.id.placeholder);
        this.J = findViewById(R.id.charging_container);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.recyclerview);
        getBaseContext();
        recyclerView2.setLayoutManager(new MyLinearLayoutManager(1));
        ArrayList arrayList = new ArrayList();
        this.F = arrayList;
        l01 l01Var = new l01((Context) this, (List) arrayList);
        this.G = l01Var;
        l01Var.j = this;
        recyclerView2.setAdapter(l01Var);
        ((ExtendedFloatingActionButton) findViewById(R.id.refresh)).setOnClickListener(new i02(1, this));
        ArrayList arrayList2 = this.I;
        arrayList2.add("gf_input");
        arrayList2.add("sec_touchscreen");
        arrayList2.add("stmpe_keypad");
        arrayList2.add("hbtp_vm");
        arrayList2.add("sec_touchpad");
        B();
        rj rjVar = new rj((pj) ((MainApp) getApplication()).g.g, 0);
        n72 l = l();
        py0 h = h();
        l.getClass();
        gr grVar = new gr(l, rjVar, h);
        vq a2 = af1.a(sj.class);
        String b = a2.b();
        if (b != null) {
            ((sj) grVar.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).c().e(this, new nc(28, this));
        } else {
            c.m("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        oo1 oo1Var;
        super.onPause();
        unregisterReceiver(this.R);
        unregisterReceiver(this.O);
        Handler handler = this.M;
        if (handler != null && (oo1Var = this.N) != null) {
            handler.removeCallbacks(oo1Var);
        }
        n3 n3Var = this.K;
        if (n3Var == null || !n3Var.isShowing()) {
            return;
        }
        this.K.dismiss();
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        registerReceiver(this.R, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        registerReceiver(this.O, intentFilter);
    }
}
