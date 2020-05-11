package com.example.demopisjava;

import kotlin.Metadata;

// QrCodeGenerate.java
package com.uni.pis.Events;

        import android.content.Context;
        import android.content.Intent;
        import android.graphics.Bitmap;
        import android.graphics.Bitmap.Config;
        import android.os.Bundle;
        import android.os.Build.VERSION;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.Toast;
        import androidx.appcompat.app.AppCompatActivity;
        import com.google.firebase.auth.FirebaseAuth;
        import com.google.firebase.auth.FirebaseUser;
        import com.google.zxing.BarcodeFormat;
        import com.google.zxing.MultiFormatWriter;
        import com.google.zxing.common.BitMatrix;
        import com.uni.pis.R.id;
        import java.util.HashMap;
        import java.util.Map;
        import kotlin.Metadata;
        import kotlin.jvm.internal.Intrinsics;
        import org.jetbrains.annotations.NotNull;
        import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u0017J(\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\rJ\u0012\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J-\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u001c2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010&\u001a\u00020'H\u0016¢\u0006\u0002\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006)"},
        d2 = {"Lcom/uni/pis/Events/QrCodeGenerate;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "context", "Landroid/content/Context;", "mFirebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "getMFirebaseAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "setMFirebaseAuth", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "permissions", "", "", "[Ljava/lang/String;", "userID", "getUserID", "()Ljava/lang/String;", "setUserID", "(Ljava/lang/String;)V", "checkPermission", "", "permissionArray", "(Landroid/content/Context;[Ljava/lang/String;)Z", "encodeAsBitmap", "Landroid/graphics/Bitmap;", "str", "WIDTH", "", "HEIGHT", "ctx", "generateQRCode", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "grantResults", "", "(I[Ljava/lang/String;[I)V", "app"}
)
public final class QrCodeGenerate extends AppCompatActivity {
    private String[] permissions = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
    private Context context;
    @NotNull
    public String userID;
    @NotNull
    private FirebaseAuth mFirebaseAuth;
    private HashMap _$_findViewCache;

    @NotNull
    public final String getUserID() {
        String var10000 = this.userID;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userID");
        }

        return var10000;
    }

    public final void setUserID(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.userID = var1;
    }

    @NotNull
    public final FirebaseAuth getMFirebaseAuth() {
        return this.mFirebaseAuth;
    }

    public final void setMFirebaseAuth(@NotNull FirebaseAuth var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.mFirebaseAuth = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        FirebaseUser var10001 = this.mFirebaseAuth.getCurrentUser();
        if (var10001 == null) {
            Intrinsics.throwNpe();
        }

        Intrinsics.checkExpressionValueIsNotNull(var10001, "mFirebaseAuth.currentUser!!");
        String var2 = var10001.getUid();
        Intrinsics.checkExpressionValueIsNotNull(var2, "mFirebaseAuth.currentUser!!.uid");
        this.userID = var2;
        super.onCreate(savedInstanceState);
        if (this.getIntent().hasExtra("userID")) {
            Intent var3 = this.getIntent();
            Intrinsics.checkExpressionValueIsNotNull(var3, "intent");
            Bundle var4 = var3.getExtras();
            if (var4 == null) {
                Intrinsics.throwNpe();
            }

            this.userID = String.valueOf(var4.get("userID"));
            this.setContentView(1300020);
            this.context = (Context)this;
            if (VERSION.SDK_INT >= 23) {
                Context var5 = this.context;
                if (var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                }

                if (this.checkPermission(var5, this.permissions)) {
                    var2 = this.userID;
                    if (var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userID");
                    }

                    this.generateQRCode(var2);
                } else {
                    this.requestPermissions(this.permissions, 10);
                }
            } else {
                var2 = this.userID;
                if (var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userID");
                }

                this.generateQRCode(var2);
            }
        }

    }

    public final void generateQRCode(@NotNull String userID) {
        Intrinsics.checkParameterIsNotNull(userID, "userID");
        Context var10004 = this.context;
        if (var10004 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }

        Bitmap bitmap = this.encodeAsBitmap(userID, 300, 300, var10004);
        ((ImageView)this._$_findCachedViewById(id.iv_qr_code)).setImageBitmap(bitmap);
    }

    @Nullable
    public final Bitmap encodeAsBitmap(@NotNull String str, int WIDTH, int HEIGHT, @NotNull Context ctx) {
        Intrinsics.checkParameterIsNotNull(str, "str");
        Intrinsics.checkParameterIsNotNull(ctx, "ctx");
        BitMatrix result = null;

        try {
            BitMatrix var10000 = (new MultiFormatWriter()).encode(str, BarcodeFormat.QR_CODE, WIDTH, HEIGHT, (Map)null);
            Intrinsics.checkExpressionValueIsNotNull(var10000, "MultiFormatWriter().enco…ODE, WIDTH, HEIGHT, null)");
            result = var10000;
        } catch (IllegalArgumentException var14) {
            return null;
        }

        int width = result.getWidth();
        int height = result.getHeight();
        int[] pixels = new int[width * height];
        int y = 0;

        for(int var10 = height; y < var10; ++y) {
            int offset = y * width;
            int x = 0;

            for(int var13 = width; x < var13; ++x) {
                pixels[offset + x] = result.get(x, y) ? -16777216 : -1;
            }
        }

        Bitmap bitmap = Bitmap.createBitmap(width, height, Config.ARGB_8888);
        bitmap.setPixels(pixels, 0, width, 0, 0, width, height);
        return bitmap;
    }

    public final boolean checkPermission(@NotNull Context context, @NotNull String[] permissionArray) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(permissionArray, "permissionArray");
        boolean allSuccess = true;
        int i = 0;

        for(int var5 = permissionArray.length; i < var5; ++i) {
            if (this.checkCallingOrSelfPermission(permissionArray[i]) == -1) {
                allSuccess = false;
            }
        }

        return allSuccess;
    }

    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkParameterIsNotNull(permissions, "permissions");
        Intrinsics.checkParameterIsNotNull(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 10) {
            boolean allSuccess = true;
            int i = 0;

            for(int var6 = permissions.length; i < var6; ++i) {
                if (grantResults[i] == -1) {
                    allSuccess = false;
                    boolean requestAgain = VERSION.SDK_INT >= 23 && this.shouldShowRequestPermissionRationale(permissions[i]);
                    Context var10000;
                    if (requestAgain) {
                        var10000 = this.context;
                        if (var10000 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                        }

                        Toast.makeText(var10000, (CharSequence)"Permission denied", 0).show();
                    } else {
                        var10000 = this.context;
                        if (var10000 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("context");
                        }

                        Toast.makeText(var10000, (CharSequence)"Go to settings and enable the permission", 0).show();
                    }
                }
            }

            if (allSuccess) {
                String var10001 = this.userID;
                if (var10001 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userID");
                }

                this.generateQRCode(var10001);
            }
        }

    }

    public QrCodeGenerate() {
        FirebaseAuth var10001 = FirebaseAuth.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(var10001, "FirebaseAuth.getInstance()");
        this.mFirebaseAuth = var10001;
    }

    public View _$_findCachedViewById(int var1) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }

        View var2 = (View)this._$_findViewCache.get(var1);
        if (var2 == null) {
            var2 = this.findViewById(var1);
            this._$_findViewCache.put(var1, var2);
        }

        return var2;
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }

    }
}
