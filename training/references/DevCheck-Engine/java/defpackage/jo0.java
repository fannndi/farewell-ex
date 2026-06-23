package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class jo0 implements o52 {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f490a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f490a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // defpackage.t80
    public final void a(Object obj, Object obj2) {
        ((p52) obj2).b(f490a.format((Date) obj));
    }
}
