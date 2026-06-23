package flar2.devcheck.tests;

import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a5;
import defpackage.b9;
import defpackage.c3;
import defpackage.k5;
import defpackage.op0;
import defpackage.pr;
import defpackage.sl;
import defpackage.uz1;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.tests.FlashlightActivity;
import java.util.Objects;

/* loaded from: classes.dex */
public class FlashlightActivity extends a5 {
    public static boolean J;
    public Camera F;
    public int G;
    public ImageView H;
    public String I;

    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c3.z(this);
        pr.m(getWindow());
        super.onCreate(bundle);
        setContentView(R.layout.activity_flashlight);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.root);
        if (relativeLayout != null) {
            op0.a(relativeLayout, true, false, true, true, false, false);
        }
        A((MaterialToolbar) findViewById(R.id.toolbar));
        sl r = r();
        Objects.requireNonNull(r);
        final int i = 1;
        r.j0(true);
        r().m0(getResources().getString(R.string.flashlight));
        final int i2 = 0;
        final SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("testPrefs", 0);
        ((Button) findViewById(R.id.success)).setOnClickListener(new View.OnClickListener(this) { // from class: pb0
            public final /* synthetic */ FlashlightActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                FlashlightActivity flashlightActivity = this.h;
                switch (i3) {
                    case 0:
                        boolean z = FlashlightActivity.J;
                        sharedPreferences2.edit().putBoolean(flashlightActivity.getString(R.string.flashlight), true).commit();
                        flashlightActivity.finish();
                        break;
                    default:
                        boolean z2 = FlashlightActivity.J;
                        sharedPreferences2.edit().putBoolean(flashlightActivity.getString(R.string.flashlight), false).commit();
                        flashlightActivity.finish();
                        break;
                }
            }
        });
        ((Button) findViewById(R.id.fail)).setOnClickListener(new View.OnClickListener(this) { // from class: pb0
            public final /* synthetic */ FlashlightActivity h;

            {
                this.h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                FlashlightActivity flashlightActivity = this.h;
                switch (i3) {
                    case 0:
                        boolean z = FlashlightActivity.J;
                        sharedPreferences2.edit().putBoolean(flashlightActivity.getString(R.string.flashlight), true).commit();
                        flashlightActivity.finish();
                        break;
                    default:
                        boolean z2 = FlashlightActivity.J;
                        sharedPreferences2.edit().putBoolean(flashlightActivity.getString(R.string.flashlight), false).commit();
                        flashlightActivity.finish();
                        break;
                }
            }
        });
        this.H = (ImageView) findViewById(R.id.big_icon);
        this.G = uz1.R(this);
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        String str;
        super.onPause();
        if (pr.g(this, "android.permission.CAMERA") != 0) {
            CameraManager cameraManager = (CameraManager) getSystemService("camera");
            if (cameraManager == null || !J || (str = this.I) == null) {
                return;
            }
            MainApp.h.submit(new k5(cameraManager, 16, str));
            return;
        }
        try {
            Camera camera = this.F;
            if (camera != null) {
                Camera.Parameters parameters = camera.getParameters();
                parameters.setFlashMode("off");
                this.F.setParameters(parameters);
                this.F.stopPreview();
                this.F.release();
                this.F = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (pr.g(this, "android.permission.CAMERA") != 0) {
            CameraManager cameraManager = (CameraManager) getSystemService("camera");
            if (cameraManager != null) {
                try {
                    if (this.I == null) {
                        this.I = cameraManager.getCameraIdList()[0];
                    }
                    MainApp.h.submit(new b9(9, this, cameraManager, this.I));
                    return;
                } catch (Exception unused) {
                    this.H.setImageTintList(ColorStateList.valueOf(getColor(R.color.neutral)));
                    return;
                }
            }
            return;
        }
        try {
            if (this.F == null) {
                this.F = Camera.open();
            }
            Camera.Parameters parameters = this.F.getParameters();
            parameters.setFlashMode("torch");
            this.F.setParameters(parameters);
            this.F.setPreviewTexture(new SurfaceTexture(0));
            this.F.startPreview();
            this.H.setImageTintList(ColorStateList.valueOf(this.G));
        } catch (Exception unused2) {
            this.H.setImageTintList(ColorStateList.valueOf(getColor(R.color.neutral)));
        }
    }
}
