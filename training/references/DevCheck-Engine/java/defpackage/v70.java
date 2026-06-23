package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* loaded from: classes.dex */
public final class v70 implements y10 {
    public final /* synthetic */ gq0 g;

    public v70(EmojiCompatInitializer emojiCompatInitializer, gq0 gq0Var) {
        this.g = gq0Var;
    }

    @Override // defpackage.y10
    public final void a() {
        (Build.VERSION.SDK_INT >= 28 ? gu.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new x70(0), 500L);
        this.g.f(this);
    }
}
