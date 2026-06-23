package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dy0 {

    /* renamed from: a, reason: collision with root package name */
    public final yo1 f212a = new yo1(0);
    public final yo1 b = new yo1(0);

    public static dy0 a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static dy0 b(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    public static dy0 c(ArrayList arrayList) {
        dy0 dy0Var = new dy0();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                rw.o("Animator must be an ObjectAnimator: ", animator);
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            dy0Var.g(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            ey0 ey0Var = new ey0();
            ey0Var.d = 0;
            ey0Var.e = 1;
            ey0Var.f253a = startDelay;
            ey0Var.b = duration;
            ey0Var.c = interpolator;
            ey0Var.d = objectAnimator.getRepeatCount();
            ey0Var.e = objectAnimator.getRepeatMode();
            dy0Var.f212a.put(propertyName, ey0Var);
        }
        return dy0Var;
    }

    public final ObjectAnimator d(String str, Object obj, Property property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, e(str));
        ofPropertyValuesHolder.setProperty(property);
        yo1 yo1Var = this.f212a;
        if (yo1Var.get(str) == null) {
            throw new IllegalArgumentException();
        }
        ey0 ey0Var = (ey0) yo1Var.get(str);
        ofPropertyValuesHolder.setStartDelay(ey0Var.f253a);
        ofPropertyValuesHolder.setDuration(ey0Var.b);
        ofPropertyValuesHolder.setInterpolator(ey0Var.a());
        ofPropertyValuesHolder.setRepeatCount(ey0Var.d);
        ofPropertyValuesHolder.setRepeatMode(ey0Var.e);
        return ofPropertyValuesHolder;
    }

    public final PropertyValuesHolder[] e(String str) {
        if (!f(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.b.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dy0) {
            return this.f212a.equals(((dy0) obj).f212a);
        }
        return false;
    }

    public final boolean f(String str) {
        return this.b.get(str) != null;
    }

    public final void g(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public final int hashCode() {
        return this.f212a.hashCode();
    }

    public final String toString() {
        return "\n" + dy0.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f212a + "}\n";
    }
}
