package defpackage;

import android.animation.TimeInterpolator;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import flar2.devcheck.circleprogress.CircleProgressView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l4 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f570a;
    public float b;
    public long c;
    public long d;
    public TimeInterpolator e;
    public TimeInterpolator f;
    public double g;
    public long h;

    public l4(CircleProgressView circleProgressView) {
        super(circleProgressView.getContext().getMainLooper());
        this.e = new DecelerateInterpolator();
        this.f = new AccelerateDecelerateInterpolator();
        this.h = 0L;
        this.f570a = new WeakReference(circleProgressView);
    }

    public static void d(Message message, CircleProgressView circleProgressView) {
        circleProgressView.t = circleProgressView.s;
        float f = ((float[]) message.obj)[0];
        circleProgressView.s = f;
        circleProgressView.r = f;
        circleProgressView.O0 = 1;
        circleProgressView.invalidate();
    }

    public final boolean a(CircleProgressView circleProgressView) {
        float currentTimeMillis = (float) ((System.currentTimeMillis() - this.c) / circleProgressView.C);
        if (currentTimeMillis > 1.0f) {
            currentTimeMillis = 1.0f;
        }
        float interpolation = this.f.getInterpolation(currentTimeMillis);
        float f = circleProgressView.t;
        circleProgressView.r = ((circleProgressView.s - f) * interpolation) + f;
        return currentTimeMillis >= 1.0f;
    }

    public final void b(Message message, CircleProgressView circleProgressView) {
        circleProgressView.O0 = 4;
        circleProgressView.t = 0.0f;
        circleProgressView.s = ((float[]) message.obj)[1];
        this.d = System.currentTimeMillis();
        this.b = circleProgressView.x;
        sendEmptyMessageDelayed(4, circleProgressView.D - (SystemClock.uptimeMillis() - this.h));
    }

    public final void c(CircleProgressView circleProgressView) {
        circleProgressView.O0 = 2;
        float f = (360.0f / circleProgressView.u) * circleProgressView.r;
        circleProgressView.x = f;
        circleProgressView.z = f;
        this.d = System.currentTimeMillis();
        this.b = circleProgressView.x;
        float f2 = circleProgressView.y / circleProgressView.A;
        int i = circleProgressView.D;
        this.g = f2 * i * 2.0f;
        sendEmptyMessageDelayed(4, i - (SystemClock.uptimeMillis() - this.h));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        CircleProgressView circleProgressView = (CircleProgressView) this.f570a.get();
        if (circleProgressView == null) {
            return;
        }
        int i = d51.D(5)[message.what];
        if (i == 5) {
            removeMessages(4);
        }
        this.h = SystemClock.uptimeMillis();
        int A = d51.A(circleProgressView.O0);
        if (A == 0) {
            int A2 = d51.A(i);
            if (A2 == 0) {
                c(circleProgressView);
                return;
            }
            if (A2 == 2) {
                d(message, circleProgressView);
                return;
            }
            if (A2 != 3) {
                if (A2 != 4) {
                    return;
                }
                removeMessages(4);
                return;
            } else {
                float[] fArr = (float[]) message.obj;
                circleProgressView.t = fArr[0];
                circleProgressView.s = fArr[1];
                this.c = System.currentTimeMillis();
                circleProgressView.O0 = 6;
                sendEmptyMessageDelayed(4, circleProgressView.D - (SystemClock.uptimeMillis() - this.h));
                return;
            }
        }
        if (A == 1) {
            int A3 = d51.A(i);
            if (A3 == 1) {
                circleProgressView.O0 = 3;
                this.g = (circleProgressView.x / circleProgressView.A) * circleProgressView.D * 2.0f;
                this.d = System.currentTimeMillis();
                this.b = circleProgressView.x;
                sendEmptyMessageDelayed(4, circleProgressView.D - (SystemClock.uptimeMillis() - this.h));
                return;
            }
            if (A3 == 2) {
                d(message, circleProgressView);
                return;
            }
            if (A3 == 3) {
                b(message, circleProgressView);
                return;
            }
            if (A3 != 4) {
                return;
            }
            float f = circleProgressView.x - circleProgressView.y;
            float currentTimeMillis = (float) ((System.currentTimeMillis() - this.d) / this.g);
            if (currentTimeMillis > 1.0f) {
                currentTimeMillis = 1.0f;
            }
            float interpolation = this.e.getInterpolation(currentTimeMillis);
            if (Math.abs(f) < 1.0f) {
                circleProgressView.x = circleProgressView.y;
            } else {
                float f2 = circleProgressView.x;
                float f3 = circleProgressView.y;
                float f4 = this.b;
                if (f2 < f3) {
                    circleProgressView.x = ((f3 - f4) * interpolation) + f4;
                } else {
                    circleProgressView.x = f4 - ((f4 - f3) * interpolation);
                }
            }
            float f5 = circleProgressView.z + circleProgressView.A;
            circleProgressView.z = f5;
            if (f5 > 360.0f) {
                circleProgressView.z = 0.0f;
            }
            sendEmptyMessageDelayed(4, circleProgressView.D - (SystemClock.uptimeMillis() - this.h));
            circleProgressView.invalidate();
            return;
        }
        if (A == 2) {
            int A4 = d51.A(i);
            if (A4 == 0) {
                circleProgressView.O0 = 2;
                sendEmptyMessageDelayed(4, circleProgressView.D - (SystemClock.uptimeMillis() - this.h));
                return;
            }
            if (A4 == 2) {
                d(message, circleProgressView);
                return;
            }
            if (A4 == 3) {
                b(message, circleProgressView);
                return;
            }
            if (A4 != 4) {
                return;
            }
            float currentTimeMillis2 = (float) ((System.currentTimeMillis() - this.d) / this.g);
            if (currentTimeMillis2 > 1.0f) {
                currentTimeMillis2 = 1.0f;
            }
            float interpolation2 = (1.0f - this.e.getInterpolation(currentTimeMillis2)) * this.b;
            circleProgressView.x = interpolation2;
            circleProgressView.z += circleProgressView.A;
            if (interpolation2 < 0.01f) {
                circleProgressView.O0 = 1;
            }
            sendEmptyMessageDelayed(4, circleProgressView.D - (SystemClock.uptimeMillis() - this.h));
            circleProgressView.invalidate();
            return;
        }
        if (A != 3) {
            if (A != 5) {
                return;
            }
            int A5 = d51.A(i);
            if (A5 == 0) {
                c(circleProgressView);
                return;
            }
            if (A5 == 2) {
                d(message, circleProgressView);
                return;
            }
            if (A5 == 3) {
                this.c = System.currentTimeMillis();
                circleProgressView.t = circleProgressView.r;
                circleProgressView.s = ((float[]) message.obj)[1];
                return;
            } else {
                if (A5 != 4) {
                    return;
                }
                if (a(circleProgressView)) {
                    circleProgressView.O0 = 1;
                    circleProgressView.r = circleProgressView.s;
                }
                sendEmptyMessageDelayed(4, circleProgressView.D - (SystemClock.uptimeMillis() - this.h));
                circleProgressView.invalidate();
                return;
            }
        }
        int A6 = d51.A(i);
        if (A6 == 0) {
            circleProgressView.E = false;
            c(circleProgressView);
            return;
        }
        if (A6 == 2) {
            circleProgressView.E = false;
            d(message, circleProgressView);
            return;
        }
        if (A6 == 3) {
            circleProgressView.t = 0.0f;
            circleProgressView.s = ((float[]) message.obj)[1];
            sendEmptyMessageDelayed(4, circleProgressView.D - (SystemClock.uptimeMillis() - this.h));
            return;
        }
        if (A6 != 4) {
            return;
        }
        if (circleProgressView.x > circleProgressView.y && !circleProgressView.E) {
            float currentTimeMillis3 = (float) ((System.currentTimeMillis() - this.d) / this.g);
            if (currentTimeMillis3 > 1.0f) {
                currentTimeMillis3 = 1.0f;
            }
            circleProgressView.x = (1.0f - this.e.getInterpolation(currentTimeMillis3)) * this.b;
        }
        float f6 = circleProgressView.z + circleProgressView.A;
        circleProgressView.z = f6;
        if (f6 > 360.0f && !circleProgressView.E) {
            this.c = System.currentTimeMillis();
            circleProgressView.E = true;
            this.g = (circleProgressView.x / circleProgressView.A) * circleProgressView.D * 2.0f;
            this.d = System.currentTimeMillis();
            this.b = circleProgressView.x;
        }
        if (circleProgressView.E) {
            circleProgressView.z = 360.0f;
            circleProgressView.x -= circleProgressView.A;
            a(circleProgressView);
            float currentTimeMillis4 = (float) ((System.currentTimeMillis() - this.d) / this.g);
            if (currentTimeMillis4 > 1.0f) {
                currentTimeMillis4 = 1.0f;
            }
            circleProgressView.x = (1.0f - this.e.getInterpolation(currentTimeMillis4)) * this.b;
        }
        if (circleProgressView.x < 0.1d) {
            circleProgressView.O0 = 6;
            circleProgressView.invalidate();
            circleProgressView.E = false;
            circleProgressView.x = circleProgressView.y;
        } else {
            circleProgressView.invalidate();
        }
        sendEmptyMessageDelayed(4, circleProgressView.D - (SystemClock.uptimeMillis() - this.h));
    }
}
