package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g80 extends c3 {
    public final TextView j;
    public final c80 k;
    public boolean l = true;

    public g80(TextView textView) {
        this.j = textView;
        this.k = new c80(textView);
    }

    @Override // defpackage.c3
    public final void L(boolean z) {
        if (z) {
            TextView textView = this.j;
            textView.setTransformationMethod(R(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.c3
    public final void N(boolean z) {
        this.l = z;
        TextView textView = this.j;
        textView.setTransformationMethod(R(textView.getTransformationMethod()));
        textView.setFilters(r(textView.getFilters()));
    }

    @Override // defpackage.c3
    public final TransformationMethod R(TransformationMethod transformationMethod) {
        return this.l ? ((transformationMethod instanceof k80) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new k80(transformationMethod) : transformationMethod instanceof k80 ? ((k80) transformationMethod).g : transformationMethod;
    }

    @Override // defpackage.c3
    public final InputFilter[] r(InputFilter[] inputFilterArr) {
        if (!this.l) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof c80) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            c80 c80Var = this.k;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c80Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c80Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.c3
    public final boolean t() {
        return this.l;
    }
}
