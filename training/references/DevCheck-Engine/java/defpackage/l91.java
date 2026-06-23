package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class l91 extends File implements Parcelable {
    public static final Parcelable.Creator<l91> CREATOR = new i11(6);
    public final String g;

    public l91(Parcel parcel) {
        super(parcel.readString());
        this.g = parcel.readString();
    }

    public l91(String str) {
        super(str);
        this.g = a(str);
    }

    public static String a(String str) {
        StringBuilder sb;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (i51.b("prefRoot").booleanValue()) {
            try {
                String[] split = uz1.K(str).split(" ");
                StringBuilder sb2 = new StringBuilder();
                for (String str2 : split) {
                    sb2.append(str2);
                    sb2.append("\n");
                }
                return sb2.toString();
            } catch (NullPointerException unused) {
                return null;
            }
        }
        try {
            sb = new StringBuilder();
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = bufferedReader.readLine();
            String str3 = "";
            while (readLine != null) {
                sb.append(str3);
                sb.append(readLine);
                readLine = bufferedReader.readLine();
                str3 = "\n";
            }
            String sb3 = sb.toString();
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            return sb3;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.io.File
    public final long length() {
        return this.g.length();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getAbsolutePath());
        parcel.writeString(this.g);
    }
}
