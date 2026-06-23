package flar2.devcheck.utils;

import android.os.Process;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandomSpi;

/* loaded from: classes.dex */
public class AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandom extends SecureRandomSpi {
    public static final File h = new File("/dev/urandom");
    public static final Object i = new Object();
    public static DataInputStream j;
    public static FileOutputStream k;
    public boolean g;

    public static DataInputStream a() {
        DataInputStream dataInputStream;
        synchronized (i) {
            if (j == null) {
                try {
                    j = new DataInputStream(new FileInputStream(h));
                } catch (IOException e) {
                    throw new SecurityException("Failed to open /dev/urandom for reading", e);
                }
            }
            dataInputStream = j;
        }
        return dataInputStream;
    }

    @Override // java.security.SecureRandomSpi
    public final byte[] engineGenerateSeed(int i2) {
        byte[] bArr = new byte[i2];
        engineNextBytes(bArr);
        return bArr;
    }

    @Override // java.security.SecureRandomSpi
    public final void engineNextBytes(byte[] bArr) {
        DataInputStream a2;
        if (!this.g) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeLong(System.currentTimeMillis());
                dataOutputStream.writeLong(System.nanoTime());
                dataOutputStream.writeInt(Process.myPid());
                dataOutputStream.writeInt(Process.myUid());
                dataOutputStream.close();
                engineSetSeed(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                throw new SecurityException("Failed to generate seed", e);
            }
        }
        try {
            synchronized (i) {
                a2 = a();
            }
            synchronized (a2) {
                a2.readFully(bArr);
            }
        } catch (IOException e2) {
            throw new SecurityException("Failed to read from /dev/urandom", e2);
        }
    }

    @Override // java.security.SecureRandomSpi
    public final void engineSetSeed(byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            Object obj = i;
            synchronized (obj) {
                synchronized (obj) {
                    try {
                        if (k == null) {
                            k = new FileOutputStream(h);
                        }
                        fileOutputStream = k;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
            }
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
        } catch (IOException unused) {
        } finally {
            this.g = true;
        }
    }
}
