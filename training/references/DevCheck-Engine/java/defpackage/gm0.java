package defpackage;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* loaded from: classes.dex */
public final class gm0 extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p8 f344a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm0(InputConnection inputConnection, p8 p8Var) {
        super(inputConnection, false);
        this.f344a = p8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00bc  */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performPrivateCommand(java.lang.String r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r18
            r2 = r20
            p8 r3 = r1.f344a
            r5 = 0
            if (r2 != 0) goto Lf
        Lb:
            r17 = 1
            goto Lb9
        Lf:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r6 = android.text.TextUtils.equals(r6, r0)
            if (r6 == 0) goto L19
            r6 = r5
            goto L22
        L19:
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r6 = android.text.TextUtils.equals(r6, r0)
            if (r6 == 0) goto Lb
            r6 = 1
        L22:
            r7 = 0
            if (r6 == 0) goto L2c
            java.lang.String r8 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L2e
        L28:
            r0 = move-exception
            r8 = r7
            goto Lb3
        L2c:
            java.lang.String r8 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L2e:
            android.os.Parcelable r8 = r2.getParcelable(r8)     // Catch: java.lang.Throwable -> L28
            android.os.ResultReceiver r8 = (android.os.ResultReceiver) r8     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L3c
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L3f
        L39:
            r0 = move-exception
            goto Lb3
        L3c:
            r9 = 0
            java.lang.String r9 = flar2.devcheck.nativebridge.xm.oWuW.wbnhbutTlFbJa     // Catch: java.lang.Throwable -> L39
        L3f:
            android.os.Parcelable r9 = r2.getParcelable(r9)     // Catch: java.lang.Throwable -> L39
            r11 = r9
            android.net.Uri r11 = (android.net.Uri) r11     // Catch: java.lang.Throwable -> L39
            if (r6 == 0) goto L4b
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L4d
        L4b:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L4d:
            android.os.Parcelable r9 = r2.getParcelable(r9)     // Catch: java.lang.Throwable -> L39
            r12 = r9
            android.content.ClipDescription r12 = (android.content.ClipDescription) r12     // Catch: java.lang.Throwable -> L39
            if (r6 == 0) goto L59
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L5b
        L59:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L5b:
            android.os.Parcelable r9 = r2.getParcelable(r9)     // Catch: java.lang.Throwable -> L39
            r13 = r9
            android.net.Uri r13 = (android.net.Uri) r13     // Catch: java.lang.Throwable -> L39
            if (r6 == 0) goto L67
            java.lang.String r9 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L69
        L67:
            java.lang.String r9 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L69:
            int r9 = r2.getInt(r9)     // Catch: java.lang.Throwable -> L39
            if (r6 == 0) goto L72
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L74
        L72:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L74:
            android.os.Parcelable r6 = r2.getParcelable(r6)     // Catch: java.lang.Throwable -> L39
            android.os.Bundle r6 = (android.os.Bundle) r6     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto Lab
            if (r12 == 0) goto Lab
            h70 r10 = new h70     // Catch: java.lang.Throwable -> L39
            r10.<init>()     // Catch: java.lang.Throwable -> L39
            int r14 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L39
            r15 = 25
            if (r14 < r15) goto L94
            hm0 r14 = new hm0     // Catch: java.lang.Throwable -> L39
            r14.<init>(r11, r12, r13)     // Catch: java.lang.Throwable -> L39
            r10.g = r14     // Catch: java.lang.Throwable -> L39
            r4 = r10
            r17 = 1
            goto La6
        L94:
            r14 = r10
            fh r10 = new fh     // Catch: java.lang.Throwable -> L39
            r15 = r14
            r14 = 17
            r16 = r15
            r15 = 0
            r4 = r16
            r17 = 1
            r10.<init>(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L39
            r4.g = r10     // Catch: java.lang.Throwable -> L39
        La6:
            boolean r5 = r3.m(r4, r9, r6)     // Catch: java.lang.Throwable -> L39
            goto Lad
        Lab:
            r17 = 1
        Lad:
            if (r8 == 0) goto Lb9
            r8.send(r5, r7)
            goto Lb9
        Lb3:
            if (r8 == 0) goto Lb8
            r8.send(r5, r7)
        Lb8:
            throw r0
        Lb9:
            if (r5 == 0) goto Lbc
            return r17
        Lbc:
            boolean r0 = super.performPrivateCommand(r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm0.performPrivateCommand(java.lang.String, android.os.Bundle):boolean");
    }
}
