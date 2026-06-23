package defpackage;

/* loaded from: classes.dex */
public final class ky1 {

    /* renamed from: a, reason: collision with root package name */
    public String f558a;
    public float[] b = new float[7];

    public final float a() {
        float f = 0.0f;
        for (float f2 : this.b) {
            if (!Float.isNaN(f2) && f2 > 0.0f) {
                f = f2;
            }
        }
        return f;
    }
}
