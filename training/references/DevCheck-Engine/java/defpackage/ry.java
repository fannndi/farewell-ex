package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ry implements mg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f911a;
    public final List b;

    public ry(int i) {
        this.f911a = i;
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                this.b = Collections.unmodifiableList(Arrays.asList(new wg0(1), new wg0(0), new wg0(3), new wg0(2), new wg0(4)));
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                this.b = Collections.unmodifiableList(Arrays.asList(new gw0(1, 0), new gw0(1, 2), new gw0(1, 1), new fw0(1, 1), new gw0(2, 0), new gw0(2, 2), new gw0(2, 1), new fw0(2, 1)));
                break;
            default:
                this.b = Collections.unmodifiableList(Arrays.asList(new a3(1, 2), new a3(1, 3), new a3(1, 0), new a3(1, 4), new a3(1, 1), new a3(2, 2), new a3(2, 3), new a3(2, 0), new a3(2, 4), new a3(2, 1)));
                break;
        }
    }

    @Override // defpackage.mg
    public final String a() {
        switch (this.f911a) {
            case 0:
                return "CPU";
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "GPU";
            default:
                return "Memory";
        }
    }

    @Override // defpackage.mg
    public final List b() {
        switch (this.f911a) {
        }
        return this.b;
    }

    @Override // defpackage.mg
    public final String getId() {
        switch (this.f911a) {
            case 0:
                return "cpu";
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "gpu";
            default:
                return "memory";
        }
    }
}
