package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class jo extends ko {
    public final /* synthetic */ int b;
    public final /* synthetic */ CarouselLayoutManager c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1);
        this.b = i;
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                this.c = carouselLayoutManager;
                super(0);
                break;
            default:
                this.c = carouselLayoutManager;
                break;
        }
    }

    @Override // defpackage.ko
    public final int d() {
        int i = this.b;
        CarouselLayoutManager carouselLayoutManager = this.c;
        switch (i) {
            case 0:
                return carouselLayoutManager.o;
            default:
                return carouselLayoutManager.o - carouselLayoutManager.C();
        }
    }

    @Override // defpackage.ko
    public final int e() {
        switch (this.b) {
            case 0:
                return this.c.D();
            default:
                return 0;
        }
    }

    @Override // defpackage.ko
    public final int f() {
        int i = this.b;
        CarouselLayoutManager carouselLayoutManager = this.c;
        switch (i) {
            case 0:
                return carouselLayoutManager.n - carouselLayoutManager.E();
            default:
                return carouselLayoutManager.n;
        }
    }

    @Override // defpackage.ko
    public final int g() {
        switch (this.b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.c;
                if (carouselLayoutManager.H0()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    @Override // defpackage.ko
    public final int h() {
        switch (this.b) {
            case 0:
                return 0;
            default:
                return this.c.F();
        }
    }
}
