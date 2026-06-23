package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class n6 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        uw uwVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                uwVar = new gm2(clipData, 3);
            } else {
                vw vwVar = new vw();
                vwVar.h = clipData;
                vwVar.i = 3;
                uwVar = vwVar;
            }
            y62.k(textView, uwVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        uw uwVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            uwVar = new gm2(clipData, 3);
        } else {
            vw vwVar = new vw();
            vwVar.h = clipData;
            vwVar.i = 3;
            uwVar = vwVar;
        }
        y62.k(view, uwVar.build());
        return true;
    }
}
