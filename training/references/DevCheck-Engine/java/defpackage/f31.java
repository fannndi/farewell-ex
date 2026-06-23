package defpackage;

import android.app.Notification;
import android.app.job.JobParameters;
import androidx.work.impl.background.systemjob.SystemJobService;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public abstract class f31 {
    public static int a(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        int i = SystemJobService.k;
        switch (stopReason) {
            case 0:
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
            case 3:
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
            case 5:
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
            case 8:
            case rt0.o /* 9 */:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static void b(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }
}
