package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.Fk.Iyrs;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d51 implements nn {
    public static final /* synthetic */ int[] g = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static /* synthetic */ int A(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String B(int i) {
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "BEGIN_ARRAY";
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return "STRING";
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case rt0.o /* 9 */:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int C(String str) {
        if (str == null) {
            jw0.f("Name is null");
            return 0;
        }
        if (str.equals("IDLE")) {
            return 1;
        }
        if (str.equals("RUNNING")) {
            return 2;
        }
        if (str.equals("COOLDOWN")) {
            return 3;
        }
        if (str.equals("DONE")) {
            return 4;
        }
        if (str.equals("CANCELLED")) {
            return 5;
        }
        if (str.equals("ERROR")) {
            return 6;
        }
        c.m("No enum constant flar2.devcheck.benchmarkSuite.runtime.BenchmarkRunState.Phase.".concat(str));
        return 0;
    }

    public static /* synthetic */ int[] D(int i) {
        int[] iArr = new int[i];
        System.arraycopy(g, 0, iArr, 0, i);
        return iArr;
    }

    public static final void b(View view, int i) {
        int A = A(i);
        if (A == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (ae0.H(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (A == 1) {
            if (ae0.H(2)) {
                Objects.toString(view);
            }
            view.setVisibility(0);
        } else if (A == 2) {
            if (ae0.H(2)) {
                Objects.toString(view);
            }
            view.setVisibility(8);
        } else {
            if (A != 3) {
                return;
            }
            if (ae0.H(2)) {
                Objects.toString(view);
            }
            view.setVisibility(4);
        }
    }

    public static int c(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        c.m(q(Iyrs.XBybFPmObmgYGGx, i));
        return 0;
    }

    public static int d(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return c(view.getVisibility());
    }

    public static String e(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String f(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (!Character.isLetter(charAt)) {
                i++;
            } else if (!Character.isUpperCase(charAt)) {
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static /* synthetic */ boolean g(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ long h(String str) {
        int length = str.length();
        if (length == 0) {
            throw new NumberFormatException("empty string");
        }
        int i = 0;
        if (str.charAt(0) == '+' && length > 1) {
            i = 1;
        }
        long j = 0;
        while (i < length) {
            int digit = Character.digit(str.charAt(i), 10);
            if (digit == -1) {
                throw new NumberFormatException(str.toString());
            }
            if (j < 0 || j > 1844674407370955161L || (j == 1844674407370955161L && digit > 5)) {
                throw new NumberFormatException("Too large for unsigned long: ".concat(str.toString()));
            }
            j = (j * 10) + digit;
            i++;
        }
        return j;
    }

    public static py0 i(a5 a5Var, n72 n72Var, l72 l72Var) {
        py0 h = a5Var.h();
        n72Var.getClass();
        l72Var.getClass();
        return h;
    }

    public static View j(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    public static ClassCastException k(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static ClassCastException l(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object m(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String n(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String o(int i, String str) {
        return i + str;
    }

    public static String p(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String q(String str, int i) {
        return str + i;
    }

    public static String r(String str, ld0 ld0Var, String str2) {
        return str + ld0Var + str2;
    }

    public static String s(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String t(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String u(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String v(DecimalFormat decimalFormat, double d, StringBuilder sb, String str) {
        sb.append(decimalFormat.format(d));
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder w(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void x(aj1 aj1Var) {
        boolean isTerminated;
        if (aj1Var instanceof AutoCloseable) {
            aj1Var.close();
            return;
        }
        if (!(aj1Var instanceof ExecutorService)) {
            if (aj1Var instanceof TypedArray) {
                ((TypedArray) aj1Var).recycle();
                return;
            } else if (aj1Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) aj1Var).release();
                return;
            } else {
                if (!(aj1Var instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) aj1Var).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) aj1Var;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static String y(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ String z(int i) {
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "NONE";
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return "LEFT";
            case 3:
                return "TOP";
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return "BASELINE";
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case rt0.o /* 9 */:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
