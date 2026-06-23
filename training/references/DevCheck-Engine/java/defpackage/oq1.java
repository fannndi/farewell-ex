package defpackage;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.telephony.fHMN.BFtDZYxPcpGN;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class oq1 extends Service {
    public static final my1 m;
    public static z92 n;
    public SharedPreferences g;
    public WindowManager h;
    public NotificationManager i;
    public LayoutInflater j;
    public boolean k;
    public w5 l;

    static {
        my1 my1Var = new my1();
        my1Var.g = new HashMap();
        m = my1Var;
        n = null;
    }

    public static void c(Context context, Class cls) {
        Intent action = new Intent(context, (Class<?>) cls).putExtra("id", 0).setAction("CLOSE");
        if (Build.VERSION.SDK_INT < 26) {
            context.startService(action);
            return;
        }
        try {
            context.startForegroundService(action);
        } catch (IllegalStateException unused) {
            context.sendBroadcast(action);
        }
    }

    public static Intent n(Context context, Class cls) {
        SparseArray sparseArray = (SparseArray) ((HashMap) m.g).get(cls);
        Uri uri = null;
        boolean z = (sparseArray == null ? null : (z92) sparseArray.get(0)) != null;
        String str = z ? "RESTORE" : "SHOW";
        if (z) {
            uri = Uri.parse("standout://" + cls + "/0");
        }
        return new Intent(context, (Class<?>) cls).putExtra("id", 0).setAction(str).setData(uri);
    }

    public static void t(z92 z92Var, MotionEvent motionEvent) {
        nq1 layoutParams = z92Var.getLayoutParams();
        o02 o02Var = z92Var.l;
        int action = motionEvent.getAction();
        if (action == 0) {
            o02Var.c = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            o02Var.d = rawY;
            o02Var.f711a = o02Var.c;
            o02Var.b = rawY;
            return;
        }
        if (action != 2) {
            return;
        }
        int rawX = ((int) motionEvent.getRawX()) - o02Var.c;
        int rawY2 = ((int) motionEvent.getRawY()) - o02Var.d;
        int i = ((WindowManager.LayoutParams) layoutParams).width + rawX;
        ((WindowManager.LayoutParams) layoutParams).width = i;
        ((WindowManager.LayoutParams) layoutParams).height += rawY2;
        if (i >= 0 && i <= layoutParams.h) {
            o02Var.c = (int) motionEvent.getRawX();
        }
        int i2 = ((WindowManager.LayoutParams) layoutParams).height;
        if (i2 >= 0 && i2 <= layoutParams.i) {
            o02Var.d = (int) motionEvent.getRawY();
        }
        y92 y92Var = new y92(z92Var);
        y92Var.c(((WindowManager.LayoutParams) layoutParams).width, ((WindowManager.LayoutParams) layoutParams).height);
        y92Var.a();
    }

    public static void v(Context context, Class cls) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(n(context, cls));
        } else {
            context.startService(n(context, cls));
        }
    }

    public final synchronized void a(int i) {
        z92 o = o(i);
        if (o == null) {
            throw new IllegalArgumentException("Tried to bringToFront(" + i + ") a null window.");
        }
        int i2 = o.h;
        if (i2 == 0) {
            throw new IllegalStateException("Tried to bringToFront(" + i + ") a window that is not shown.");
        }
        if (i2 == 2) {
            return;
        }
        nq1 layoutParams = o.getLayoutParams();
        try {
            this.h.removeView(o);
        } catch (Exception unused) {
        }
        try {
            this.h.addView(o, layoutParams);
        } catch (Exception unused2) {
        }
    }

    public final synchronized void b(int i) {
        try {
            z92 o = o(i);
            if (o == null) {
                return;
            }
            if (o.h == 2) {
                return;
            }
            q();
            this.i.cancel(getClass().hashCode() + i);
            w(o);
            o.h = 2;
            Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out);
            try {
                if (loadAnimation != null) {
                    loadAnimation.setAnimationListener(new lq1(i, this, o));
                    o.getChildAt(0).startAnimation(loadAnimation);
                } else {
                    this.h.removeView(o);
                    my1 my1Var = m;
                    Class<?> cls = getClass();
                    HashMap hashMap = (HashMap) my1Var.g;
                    SparseArray sparseArray = (SparseArray) hashMap.get(cls);
                    if (sparseArray != null) {
                        sparseArray.remove(i);
                        if (sparseArray.size() == 0) {
                            hashMap.remove(cls);
                        }
                    }
                    SparseArray sparseArray2 = (SparseArray) ((HashMap) my1Var.g).get(getClass());
                    if ((sparseArray2 == null ? 0 : sparseArray2.size()) == 0 && this.k) {
                        this.k = false;
                        stopForeground(true);
                    }
                }
            } catch (Exception unused) {
            }
        } finally {
        }
    }

    public final synchronized void d() {
        try {
            LinkedList linkedList = new LinkedList();
            Iterator it = i().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                num.getClass();
                linkedList.add(num);
            }
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                b(((Integer) it2.next()).intValue());
            }
            if (this.k) {
                this.k = false;
                stopForeground(true);
            } else {
                try {
                    stopForeground(true);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void e(FrameLayout frameLayout);

    public final synchronized void f(int i) {
        String str = rQcwh.UdpwCaznYSrLsEa;
        synchronized (this) {
            try {
                z92 o = o(i);
                if (o == null) {
                    throw new IllegalArgumentException(str + i + ") a null window.");
                }
                if (ym0.q(o.k, rt0.x)) {
                    return;
                }
                z92 z92Var = n;
                if (z92Var != null) {
                    w(z92Var);
                }
                o.a(true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String g();

    public final PopupWindow h() {
        ArrayList arrayList = new ArrayList();
        String concat = "Quit ".concat(g());
        wa waVar = new wa(23, this);
        mq1 mq1Var = new mq1();
        mq1Var.f650a = concat;
        mq1Var.b = waVar;
        arrayList.add(mq1Var);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        PopupWindow popupWindow = new PopupWindow((View) linearLayout, -2, -2, true);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            mq1 mq1Var2 = (mq1) obj;
            ViewGroup viewGroup = (ViewGroup) this.j.inflate(flar2.devcheck.R.layout.drop_down_list_item, (ViewGroup) null);
            linearLayout.addView(viewGroup);
            ImageView imageView = (ImageView) viewGroup.findViewById(flar2.devcheck.R.id.icon);
            mq1Var2.getClass();
            imageView.setImageResource(R.drawable.ic_menu_close_clear_cancel);
            ((TextView) viewGroup.findViewById(flar2.devcheck.R.id.description)).setText(mq1Var2.f650a);
            viewGroup.setOnClickListener(new jq1(mq1Var2, popupWindow));
        }
        popupWindow.setBackgroundDrawable(getResources().getDrawable(R.drawable.editbox_dropdown_dark_frame));
        return popupWindow;
    }

    public final HashSet i() {
        SparseArray sparseArray = (SparseArray) ((HashMap) m.g).get(getClass());
        if (sparseArray == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < sparseArray.size(); i++) {
            hashSet.add(Integer.valueOf(sparseArray.keyAt(i)));
        }
        return hashSet;
    }

    public abstract int j();

    public final Notification k() {
        NotificationManager notificationManager;
        System.currentTimeMillis();
        Context applicationContext = getApplicationContext();
        String concat = g().concat(" Hidden");
        e31 e31Var = new e31(applicationContext, "DEVCHECK_MONITOR_ID");
        e31Var.f = e31.b(concat);
        e31Var.p.icon = flar2.devcheck.R.drawable.ic_action_monitors;
        e31Var.h = -2;
        e31Var.g = null;
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) getSystemService("notification")) != null) {
            NotificationChannel c = os0.c();
            c.setImportance(1);
            c.setShowBadge(false);
            notificationManager.createNotificationChannel(c);
            e31Var.n = "DEVCHECK_MONITOR_ID";
        }
        e31Var.m = getResources().getColor(flar2.devcheck.R.color.green);
        return e31Var.a();
    }

    public abstract nq1 l(int i);

    public final Notification m() {
        NotificationManager notificationManager;
        Context applicationContext = getApplicationContext();
        Intent intent = new Intent("flar2.devcheck.ACTION_MASTER_MONITOR_TOGGLE");
        intent.setPackage("flar2.devcheck");
        PendingIntent broadcast = PendingIntent.getBroadcast(getApplicationContext(), 0, intent, 201326592);
        String str = "";
        if (this.g.getBoolean("prefMonitorPaused", false)) {
            int identifier = applicationContext.getResources().getIdentifier("tap_to_resume", "string", applicationContext.getPackageName());
            if (identifier != 0) {
                str = applicationContext.getResources().getString(identifier);
            }
        } else {
            int identifier2 = applicationContext.getResources().getIdentifier("tap_to_pause", "string", applicationContext.getPackageName());
            if (identifier2 != 0) {
                str = applicationContext.getResources().getString(identifier2);
            }
        }
        e31 e31Var = new e31(applicationContext, "DEVCHECK_MONITOR_ID");
        e31Var.e = e31.b("Floating Monitors");
        e31Var.f = e31.b(str);
        e31Var.i = false;
        e31Var.p.icon = flar2.devcheck.R.drawable.ic_action_monitors;
        e31Var.h = -2;
        e31Var.g = broadcast;
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) getSystemService("notification")) != null) {
            NotificationChannel c = os0.c();
            c.setImportance(1);
            c.setShowBadge(false);
            notificationManager.createNotificationChannel(c);
            e31Var.n = "DEVCHECK_MONITOR_ID";
        }
        e31Var.m = getResources().getColor(flar2.devcheck.R.color.green);
        Notification a2 = e31Var.a();
        try {
            this.i.notify(22, a2);
        } catch (Exception unused) {
        }
        return a2;
    }

    public final z92 o(int i) {
        SparseArray sparseArray = (SparseArray) ((HashMap) m.g).get(getClass());
        if (sparseArray == null) {
            return null;
        }
        return (z92) sparseArray.get(i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.h = (WindowManager) getSystemService("window");
        this.i = (NotificationManager) getSystemService("notification");
        this.j = (LayoutInflater) getSystemService("layout_inflater");
        this.g = getApplicationContext().getSharedPreferences("monitors", 0);
        this.l = new w5(19, this);
        IntentFilter intentFilter = new IntentFilter("flar2.devcheck.ACTION_MONITOR_TOGGLE");
        int i = Build.VERSION.SDK_INT;
        w5 w5Var = this.l;
        if (i >= 33) {
            registerReceiver(w5Var, intentFilter, 4);
        } else {
            registerReceiver(w5Var, intentFilter);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        d();
        w5 w5Var = this.l;
        if (w5Var != null) {
            unregisterReceiver(w5Var);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        startForeground(22, m());
        this.k = true;
        if (intent == null) {
            u(0);
            return 1;
        }
        String action = intent.getAction();
        int intExtra = intent.getIntExtra("id", 0);
        if (intExtra == 22) {
            c.o("ID cannot equals StandOutWindow.ONGOING_NOTIFICATION_ID");
            return 0;
        }
        if ("SHOW".equals(action) || BFtDZYxPcpGN.WltuO.equals(action)) {
            u(intExtra);
            return 1;
        }
        if ("HIDE".equals(action)) {
            p(intExtra);
            return 1;
        }
        if ("CLOSE".equals(action)) {
            b(intExtra);
            return 1;
        }
        if ("CLOSE_ALL".equals(action)) {
            d();
            return 1;
        }
        if ("SEND_DATA".equals(action)) {
            SparseArray sparseArray = (SparseArray) ((HashMap) m.g).get(getClass());
            if (sparseArray != null) {
            }
            intent.getBundleExtra("wei.mark.standout.data");
            intent.getIntExtra("requestCode", 0);
            intent.getIntExtra("fromId", 0);
        }
        return 1;
    }

    public final synchronized void p(int i) {
        try {
            z92 o = o(i);
            if (o == null) {
                throw new IllegalArgumentException("Tried to hide(" + i + ") a null window.");
            }
            int i2 = o.k;
            int i3 = rt0.r;
            if (ym0.q(i2, 64)) {
                o.h = 2;
                Notification k = k();
                Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out);
                try {
                    if (loadAnimation != null) {
                        loadAnimation.setAnimationListener(new kq1(this, o));
                        o.getChildAt(0).startAnimation(loadAnimation);
                    } else {
                        this.h.removeView(o);
                    }
                } catch (Exception unused) {
                }
                k.flags |= 48;
                this.i.notify(getClass().hashCode() + i, k);
            } else {
                b(i);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void q();

    public abstract void r(z92 z92Var, MotionEvent motionEvent);

    public final void s(int i, z92 z92Var, MotionEvent motionEvent) {
        nq1 layoutParams = z92Var.getLayoutParams();
        int i2 = z92Var.k;
        o02 o02Var = z92Var.l;
        int i3 = o02Var.c - o02Var.f711a;
        int i4 = o02Var.d - o02Var.b;
        int action = motionEvent.getAction();
        if (action == 0) {
            o02Var.c = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            o02Var.d = rawY;
            o02Var.f711a = o02Var.c;
            o02Var.b = rawY;
            return;
        }
        if (action == 1) {
            o02Var.j = false;
            if (motionEvent.getPointerCount() != 1) {
                if (ym0.q(i2, rt0.s)) {
                    a(i);
                    return;
                }
                return;
            } else {
                if (Math.abs(i3) >= layoutParams.g || Math.abs(i4) >= layoutParams.g || !ym0.q(i2, rt0.t)) {
                    return;
                }
                a(i);
                return;
            }
        }
        if (action != 2) {
            return;
        }
        int rawX = ((int) motionEvent.getRawX()) - o02Var.c;
        int rawY2 = ((int) motionEvent.getRawY()) - o02Var.d;
        o02Var.c = (int) motionEvent.getRawX();
        o02Var.d = (int) motionEvent.getRawY();
        if (o02Var.j || Math.abs(i3) >= layoutParams.g || Math.abs(i4) >= layoutParams.g) {
            o02Var.j = true;
            if (ym0.q(i2, rt0.q)) {
                if (motionEvent.getPointerCount() == 1) {
                    ((WindowManager.LayoutParams) layoutParams).x += rawX;
                    ((WindowManager.LayoutParams) layoutParams).y += rawY2;
                }
                y92 y92Var = new y92(z92Var);
                y92Var.b(((WindowManager.LayoutParams) layoutParams).x, ((WindowManager.LayoutParams) layoutParams).y);
                y92Var.a();
            }
        }
    }

    public final synchronized void u(int i) {
        z92 o = o(i);
        if (o == null) {
            o = new z92(this, i);
        }
        if (o.h == 1) {
            f(i);
            return;
        }
        o.h = 1;
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        try {
            this.h.addView(o, o.getLayoutParams());
            if (loadAnimation != null) {
                o.getChildAt(0).startAnimation(loadAnimation);
            }
        } catch (Exception unused) {
        }
        my1 my1Var = m;
        Class<?> cls = getClass();
        HashMap hashMap = (HashMap) my1Var.g;
        SparseArray sparseArray = (SparseArray) hashMap.get(cls);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            hashMap.put(cls, sparseArray);
        }
        sparseArray.put(i, o);
        Notification m2 = m();
        if (m2 != null) {
            m2.flags |= 32;
            try {
                if (this.k) {
                    startForeground(22, m2);
                } else {
                    startForeground(22, m2);
                    this.k = true;
                }
            } catch (Exception unused2) {
            }
        } else if (!this.k) {
            throw new RuntimeException(yFbVsaLCWAtQC.NAB);
        }
        f(i);
    }

    public final synchronized void w(z92 z92Var) {
        if (z92Var == null) {
            throw new IllegalArgumentException("Tried to unfocus a null window.");
        }
        z92Var.a(false);
    }

    public final void x(int i, nq1 nq1Var) {
        z92 o = o(i);
        if (o == null) {
            c.m(d51.p(i, "Tried to updateViewLayout(", ") a null window."));
            return;
        }
        int i2 = o.h;
        if (i2 == 0 || i2 == 2) {
            return;
        }
        try {
            o.setLayoutParams(nq1Var);
            this.h.updateViewLayout(o, nq1Var);
        } catch (Exception unused) {
        }
    }
}
