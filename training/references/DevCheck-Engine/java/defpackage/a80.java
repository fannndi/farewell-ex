package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a80 extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f15a;
    public final ai1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        ai1 ai1Var = new ai1();
        this.f15a = textView;
        this.b = ai1Var;
        if (u70.k != null) {
            u70 a2 = u70.a();
            if (a2.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            q70 q70Var = a2.e;
            q70Var.getClass();
            Bundle bundle = editorInfo.extras;
            lx0 lx0Var = (lx0) q70Var.c.h;
            int a3 = lx0Var.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a3 != 0 ? ((ByteBuffer) lx0Var.j).getInt(a3 + lx0Var.g) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f15a.getEditableText();
        this.b.getClass();
        return ai1.j(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f15a.getEditableText();
        this.b.getClass();
        return ai1.j(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
