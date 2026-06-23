package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ScrollView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import flar2.devcheck.R;
import flar2.devcheck.usage.GgP.rlfWzcx;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class gr implements gp1, co, h2, sa0 {
    public static gr l;
    public final /* synthetic */ int g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public gr(int i) {
        this.g = i;
        switch (i) {
            case 3:
                this.h = new f81(10);
                this.j = new yo1(0);
                this.i = new ArrayList();
                this.k = new HashSet();
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                this.i = new ArrayDeque();
                this.j = new ArrayDeque();
                this.k = new ArrayDeque();
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                this.i = new ArrayList();
                this.h = new HashMap();
                this.j = new HashMap();
                break;
            case 8:
                this.h = new Object();
                this.i = new Handler(Looper.getMainLooper(), new dp1(0, this));
                break;
            case 11:
                this.h = new p9(0);
                this.i = new SparseArray();
                this.j = new ft0();
                this.k = new p9(0);
                break;
        }
    }

    public gr(Context context, ActionMode.Callback callback) {
        this.g = 9;
        this.j = context;
        this.h = callback;
        this.i = new ArrayList();
        this.k = new yo1(0);
    }

    public gr(Typeface typeface, lx0 lx0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.g = 7;
        this.k = typeface;
        this.h = lx0Var;
        this.j = new mx0(rt0.v);
        int a2 = lx0Var.a(6);
        if (a2 != 0) {
            int i5 = a2 + lx0Var.g;
            i = ((ByteBuffer) lx0Var.j).getInt(((ByteBuffer) lx0Var.j).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.i = new char[i * 2];
        int a3 = lx0Var.a(6);
        if (a3 != 0) {
            int i6 = a3 + lx0Var.g;
            i2 = ((ByteBuffer) lx0Var.j).getInt(((ByteBuffer) lx0Var.j).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            u32 u32Var = new u32(this, i7);
            kx0 b = u32Var.b();
            int a4 = b.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) b.j).getInt(a4 + b.g) : 0, (char[]) this.i, i7 * 2);
            kx0 b2 = u32Var.b();
            int a5 = b2.a(16);
            if (a5 != 0) {
                int i8 = a5 + b2.g;
                i3 = ((ByteBuffer) b2.j).getInt(((ByteBuffer) b2.j).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            op0.c("invalid metadata codepoint length", i3 > 0);
            mx0 mx0Var = (mx0) this.j;
            kx0 b3 = u32Var.b();
            int a6 = b3.a(16);
            if (a6 != 0) {
                int i9 = a6 + b3.g;
                i4 = ((ByteBuffer) b3.j).getInt(((ByteBuffer) b3.j).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            mx0Var.a(u32Var, 0, i4 - 1);
        }
    }

    public gr(ViewGroup viewGroup) {
        this.g = 5;
        this.h = viewGroup;
        Context context = viewGroup.getContext();
        this.i = k32.x(context, R.drawable.afs_track);
        this.j = k32.x(context, R.drawable.afs_thumb);
        this.k = k32.d;
    }

    public gr(ViewPager2 viewPager2) {
        this.g = 13;
        this.k = viewPager2;
        this.h = new b82(this, 0);
        this.i = new b82(this, 1);
    }

    public gr(gm2 gm2Var, kp kpVar) {
        this.g = 10;
        gm2Var.getClass();
        this.h = gm2Var;
        this.i = kpVar;
        this.j = new Object();
        this.k = new LinkedHashMap();
    }

    public /* synthetic */ gr(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
    }

    public gr(Socket socket) {
        this.g = 1;
        this.h = socket;
        this.i = new AtomicInteger();
        this.j = new f20(this);
        this.k = new e20(this);
    }

    public gr(ExecutorService executorService) {
        this.g = 17;
        this.j = new Handler(Looper.getMainLooper());
        this.k = new kj1(1, this);
        lm1 lm1Var = new lm1(executorService, 0);
        this.h = lm1Var;
        this.i = xc1.p(lm1Var);
    }

    public gr(n72 n72Var, l72 l72Var, uy uyVar) {
        this.g = 12;
        n72Var.getClass();
        l72Var.getClass();
        uyVar.getClass();
        this.h = n72Var;
        this.i = l72Var;
        this.j = uyVar;
        this.k = new pg0();
    }

    public gr(th2 th2Var, f11 f11Var) {
        this.g = 14;
        this.k = th2Var;
        this.h = new SparseIntArray(1);
        this.i = new SparseIntArray(1);
        this.j = f11Var;
    }

    public static gr s() {
        if (l == null) {
            l = new gr(8);
        }
        return l;
    }

    public static void z(gr grVar, ad1 ad1Var, ad1 ad1Var2, int i) {
        gm2 gm2Var;
        if ((i & 1) != 0) {
            ad1Var = null;
        }
        if ((i & 4) != 0) {
            ad1Var2 = null;
        }
        grVar.getClass();
        TimeZone timeZone = rd2.f888a;
        boolean isShutdown = ((ThreadPoolExecutor) grVar.i()).isShutdown();
        synchronized (grVar) {
            if (ad1Var2 != null) {
                try {
                    ad1Var2.h.decrementAndGet();
                    if (!((ArrayDeque) grVar.j).remove(ad1Var2)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (ad1Var != null) {
                ((ArrayDeque) grVar.i).add(ad1Var);
                ad1 k = grVar.k(((ok0) ad1Var.i.h.b).d);
                if (k != null) {
                    ad1Var.h = k.h;
                }
            }
            if (ad1Var2 != null && (isShutdown || ((ArrayDeque) grVar.j).isEmpty())) {
                ((ArrayDeque) grVar.k).isEmpty();
            }
            int i2 = 29;
            if (isShutdown) {
                List g0 = yr.g0((ArrayDeque) grVar.i);
                ((ArrayDeque) grVar.i).clear();
                gm2Var = new gm2(i2, g0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) grVar.i).iterator();
                it.getClass();
                while (it.hasNext()) {
                    ad1 ad1Var3 = (ad1) it.next();
                    if (((ArrayDeque) grVar.j).size() >= 64) {
                        break;
                    }
                    if (ad1Var3.h.get() < 5) {
                        it.remove();
                        ad1Var3.h.incrementAndGet();
                        arrayList.add(ad1Var3);
                        ((ArrayDeque) grVar.j).add(ad1Var3);
                    }
                }
                gm2Var = new gm2(i2, arrayList);
            }
        }
        int size = ((List) gm2Var.h).size();
        boolean z = true;
        for (int i3 = 0; i3 < size; i3++) {
            ad1 ad1Var4 = (ad1) ((List) gm2Var.h).get(i3);
            if (ad1Var4 == ad1Var) {
                z = false;
            } else {
                ad1Var4.i.j.getClass();
            }
            if (isShutdown) {
                ad1Var4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                ad1Var4.i.i(interruptedIOException);
                ad1Var4.g.h(interruptedIOException);
            } else {
                ExecutorService i4 = grVar.i();
                ad1Var4.getClass();
                dd1 dd1Var = ad1Var4.i;
                dd1Var.g.f8a.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) i4).execute(ad1Var4);
                    } catch (Throwable th2) {
                        gr grVar2 = dd1Var.g.f8a;
                        grVar2.getClass();
                        z(grVar2, null, ad1Var4, 3);
                        throw th2;
                    }
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e);
                    ad1Var4.i.i(interruptedIOException2);
                    ad1Var4.g.h(interruptedIOException2);
                    gr grVar3 = dd1Var.g.f8a;
                    grVar3.getClass();
                    z(grVar3, null, ad1Var4, 3);
                }
            }
        }
        if (!z || ad1Var == null) {
            return;
        }
        ad1Var.i.j.getClass();
    }

    public void A(me meVar) {
        synchronized (this.h) {
            try {
                if (v(meVar)) {
                    ep1 ep1Var = (ep1) this.j;
                    if (ep1Var.c) {
                        ep1Var.c = false;
                        B(ep1Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void B(ep1 ep1Var) {
        Handler handler = (Handler) this.i;
        int i = ep1Var.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(ep1Var);
        handler.sendMessageDelayed(Message.obtain(handler, 0, ep1Var), i);
    }

    public void C() {
        ep1 ep1Var = (ep1) this.k;
        if (ep1Var != null) {
            this.j = ep1Var;
            this.k = null;
            me meVar = (me) ep1Var.f244a.get();
            if (meVar == null) {
                this.j = null;
            } else {
                Handler handler = pe.x;
                handler.sendMessage(handler.obtainMessage(0, meVar.f628a));
            }
        }
    }

    public void D(vq1 vq1Var) {
        vq1Var.getClass();
        n51 n51Var = new n51(this, 19, vq1Var);
        synchronized (this.j) {
        }
        ((Handler) ((gm2) this.h).h).postDelayed(n51Var, 5400000L);
    }

    public void E() {
        int c;
        b82 b82Var = (b82) this.i;
        b82 b82Var2 = (b82) this.h;
        ViewPager2 viewPager2 = (ViewPager2) this.k;
        int i = android.R.id.accessibilityActionPageLeft;
        y62.l(viewPager2, android.R.id.accessibilityActionPageLeft);
        y62.i(viewPager2, 0);
        y62.l(viewPager2, android.R.id.accessibilityActionPageRight);
        y62.i(viewPager2, 0);
        y62.l(viewPager2, android.R.id.accessibilityActionPageUp);
        y62.i(viewPager2, 0);
        y62.l(viewPager2, android.R.id.accessibilityActionPageDown);
        y62.i(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (c = viewPager2.getAdapter().c()) == 0 || !viewPager2.x) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.j < c - 1) {
                y62.m(viewPager2, new v0(android.R.id.accessibilityActionPageDown, (String) null), null, b82Var2);
            }
            if (viewPager2.j > 0) {
                y62.m(viewPager2, new v0(android.R.id.accessibilityActionPageUp, (String) null), null, b82Var);
                return;
            }
            return;
        }
        boolean z = viewPager2.m.b.getLayoutDirection() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (viewPager2.j < c - 1) {
            y62.m(viewPager2, new v0(i2, (String) null), null, b82Var2);
        }
        if (viewPager2.j > 0) {
            y62.m(viewPager2, new v0(i, (String) null), null, b82Var);
        }
    }

    public void F() {
        Context context = ((ViewGroup) this.h).getContext();
        this.i = k32.x(context, R.drawable.afs_md2_track);
        this.j = k32.x(context, R.drawable.afs_md2_thumb);
        this.k = k32.e;
    }

    public void a(ld0 ld0Var) {
        if (((ArrayList) this.i).contains(ld0Var)) {
            rw.n(rlfWzcx.UVhsARgYlwVFGZ, ld0Var);
            return;
        }
        synchronized (((ArrayList) this.i)) {
            ((ArrayList) this.i).add(ld0Var);
        }
        ld0Var.r = true;
    }

    @Override // defpackage.gp1
    public lp1 b() {
        return (f20) this.j;
    }

    @Override // defpackage.h2
    public boolean c(j2 j2Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.h;
        ws1 m = m(j2Var);
        yo1 yo1Var = (yo1) this.k;
        Menu menu2 = (Menu) yo1Var.get(menu);
        if (menu2 == null) {
            menu2 = new ix0((Context) this.j, (MenuBuilder) menu);
            yo1Var.put(menu, menu2);
        }
        return callback.onCreateActionMode(m, menu2);
    }

    public void d() {
        ViewGroup viewGroup = (ViewGroup) this.h;
        if (viewGroup instanceof RecyclerView) {
            xi0 xi0Var = new xi0();
            xi0Var.h = new Rect();
            xi0Var.g = (RecyclerView) viewGroup;
            new hb0(viewGroup, xi0Var, (Drawable) this.i, (Drawable) this.j, (sw) this.k, new g10(viewGroup));
            return;
        }
        if (viewGroup instanceof NestedScrollView) {
            throw new UnsupportedOperationException("Please use " + bb0.class.getSimpleName() + " instead of NestedScrollViewfor fast scroll");
        }
        if (viewGroup instanceof ScrollView) {
            throw new UnsupportedOperationException("Please use " + cb0.class.getSimpleName() + " instead of ScrollViewfor fast scroll");
        }
        if (!(viewGroup instanceof WebView)) {
            rw.l(viewGroup.getClass().getSimpleName().concat(" is not supported for fast scroll"));
            return;
        }
        throw new UnsupportedOperationException("Please use " + db0.class.getSimpleName() + " instead of WebViewfor fast scroll");
    }

    public void e(vq1 vq1Var) {
        Runnable runnable;
        vq1Var.getClass();
        synchronized (this.j) {
            runnable = (Runnable) ((LinkedHashMap) this.k).remove(vq1Var);
        }
        if (runnable != null) {
            ((Handler) ((gm2) this.h).h).removeCallbacks(runnable);
        }
    }

    public boolean f(ep1 ep1Var, int i) {
        me meVar = (me) ep1Var.f244a.get();
        if (meVar == null) {
            return false;
        }
        ((Handler) this.i).removeCallbacksAndMessages(ep1Var);
        Handler handler = pe.x;
        handler.sendMessage(handler.obtainMessage(1, i, 0, meVar.f628a));
        return true;
    }

    @Override // defpackage.h2
    public boolean g(j2 j2Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.h).onActionItemClicked(m(j2Var), new ww0((Context) this.j, (bt1) menuItem));
    }

    @Override // defpackage.db1
    public Object get() {
        return new gr((Executor) ((db1) this.h).get(), (zi1) ((db1) this.i).get(), (fh) ((fh) this.j).get(), (zi1) ((db1) this.k).get(), 15);
    }

    public void h(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            c.o("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((yo1) this.j).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                h(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public synchronized ExecutorService i() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.h) == null) {
                this.h = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new qd2(rd2.b + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.h;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public ld0 j(String str) {
        je0 je0Var = (je0) ((HashMap) this.h).get(str);
        if (je0Var != null) {
            return je0Var.c;
        }
        return null;
    }

    public ad1 k(String str) {
        Iterator it = ((ArrayDeque) this.j).iterator();
        it.getClass();
        while (it.hasNext()) {
            ad1 ad1Var = (ad1) it.next();
            if (ym0.b(((ok0) ad1Var.i.h.b).d, str)) {
                return ad1Var;
            }
        }
        Iterator it2 = ((ArrayDeque) this.i).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            ad1 ad1Var2 = (ad1) it2.next();
            if (ym0.b(((ok0) ad1Var2.i.h.b).d, str)) {
                return ad1Var2;
            }
        }
        return null;
    }

    public ld0 l(String str) {
        for (je0 je0Var : ((HashMap) this.h).values()) {
            if (je0Var != null) {
                ld0 ld0Var = je0Var.c;
                if (!str.equals(ld0Var.l)) {
                    ld0Var = ld0Var.A.c.l(str);
                }
                if (ld0Var != null) {
                    return ld0Var;
                }
            }
        }
        return null;
    }

    public ws1 m(j2 j2Var) {
        ArrayList arrayList = (ArrayList) this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ws1 ws1Var = (ws1) arrayList.get(i);
            if (ws1Var != null && ws1Var.b == j2Var) {
                return ws1Var;
            }
        }
        ws1 ws1Var2 = new ws1((Context) this.j, j2Var);
        arrayList.add(ws1Var2);
        return ws1Var2;
    }

    @Override // defpackage.gp1
    public ap1 n() {
        return (e20) this.k;
    }

    public ArrayList o() {
        ArrayList arrayList = new ArrayList();
        for (je0 je0Var : ((HashMap) this.h).values()) {
            if (je0Var != null) {
                arrayList.add(je0Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.co
    public void onCancel() {
        View view = (View) this.h;
        view.clearAnimation();
        ((ViewGroup) this.i).endViewTransition(view);
        ((i20) this.j).e();
        if (ae0.H(2)) {
            Objects.toString((up1) this.k);
        }
    }

    @Override // defpackage.h2
    public boolean p(j2 j2Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.h;
        ws1 m = m(j2Var);
        yo1 yo1Var = (yo1) this.k;
        Menu menu2 = (Menu) yo1Var.get(menu);
        if (menu2 == null) {
            menu2 = new ix0((Context) this.j, (MenuBuilder) menu);
            yo1Var.put(menu, menu2);
        }
        return callback.onPrepareActionMode(m, menu2);
    }

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (je0 je0Var : ((HashMap) this.h).values()) {
            if (je0Var != null) {
                arrayList.add(je0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List r() {
        ArrayList arrayList;
        if (((ArrayList) this.i).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.i)) {
            arrayList = new ArrayList((ArrayList) this.i);
        }
        return arrayList;
    }

    public i72 t(vq vqVar, String str) {
        i72 i72Var;
        i72 a2;
        synchronized (((pg0) this.k)) {
            try {
                n72 n72Var = (n72) this.h;
                n72Var.getClass();
                i72Var = (i72) n72Var.f668a.get(str);
                if (vqVar.d(i72Var)) {
                    l72 l72Var = (l72) this.i;
                    if (l72Var instanceof zj1) {
                        zj1 zj1Var = (zj1) l72Var;
                        i72Var.getClass();
                        gq0 gq0Var = zj1Var.j;
                        if (gq0Var != null) {
                            zf zfVar = zj1Var.k;
                            zfVar.getClass();
                            om0.b(i72Var, zfVar, gq0Var);
                        }
                    }
                    i72Var.getClass();
                } else {
                    py0 py0Var = new py0((uy) this.j);
                    py0Var.f1057a.put(m72.f619a, str);
                    l72 l72Var2 = (l72) this.i;
                    l72Var2.getClass();
                    try {
                        try {
                            a2 = l72Var2.e(vqVar, py0Var);
                        } catch (AbstractMethodError unused) {
                            Class cls = vqVar.f1097a;
                            cls.getClass();
                            a2 = l72Var2.b(cls, py0Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls2 = vqVar.f1097a;
                        cls2.getClass();
                        a2 = l72Var2.a(cls2);
                    }
                    i72Var = a2;
                    n72 n72Var2 = (n72) this.h;
                    n72Var2.getClass();
                    i72Var.getClass();
                    i72 i72Var2 = (i72) n72Var2.f668a.put(str, i72Var);
                    if (i72Var2 != null) {
                        i72Var2.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i72Var;
    }

    public String toString() {
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                String socket = ((Socket) this.h).toString();
                socket.getClass();
                return socket;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.h2
    public void u(j2 j2Var) {
        ((ActionMode.Callback) this.h).onDestroyActionMode(m(j2Var));
    }

    public boolean v(me meVar) {
        ep1 ep1Var = (ep1) this.j;
        return (ep1Var == null || meVar == null || ep1Var.f244a.get() != meVar) ? false : true;
    }

    public void w(je0 je0Var) {
        ld0 ld0Var = je0Var.c;
        String str = ld0Var.l;
        HashMap hashMap = (HashMap) this.h;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(ld0Var.l, je0Var);
        if (ae0.H(2)) {
            ld0Var.toString();
        }
    }

    public void x(je0 je0Var) {
        ld0 ld0Var = je0Var.c;
        if (ld0Var.H) {
            ((de0) this.k).d(ld0Var);
        }
        if (((je0) ((HashMap) this.h).put(ld0Var.l, null)) != null && ae0.H(2)) {
            ld0Var.toString();
        }
    }

    public void y(me meVar) {
        synchronized (this.h) {
            try {
                if (v(meVar)) {
                    ep1 ep1Var = (ep1) this.j;
                    if (!ep1Var.c) {
                        ep1Var.c = true;
                        ((Handler) this.i).removeCallbacksAndMessages(ep1Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
