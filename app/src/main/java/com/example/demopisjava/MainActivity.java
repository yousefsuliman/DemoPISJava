package com.example.demopisjava;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.sendbird.android.SendBird;
import com.sendbird.android.SendBirdException;
import com.sendbird.android.User;
import com.sendbird.android.SendBird.ConnectHandler;
import com.sendbird.android.SendBird.SetChannelInvitationPreferenceHandler;
import com.uni.pis.BackgroundWorker;
import com.uni.pis.Events_Frag;
import com.uni.pis.HomeFrag;
import com.uni.pis.BackgroundWorker.MyCallback;
import com.uni.pis.Data.UserData.UserDataGoogle;
import com.uni.pis.Data.UserData.userData;
import com.uni.pis.R.id;
import com.uni.pis.profile.ProfilePagePersonalFrag;
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u0017J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083D¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"},
        d2 = {"Lcom/uni/pis/homefrags/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/uni/pis/BackgroundWorker$MyCallback;", "()V", "SENDBIRDAPPID", "", "UserDataGoogle", "Lcom/uni/pis/Data/UserData/UserDataGoogle;", "getUserDataGoogle", "()Lcom/uni/pis/Data/UserData/UserDataGoogle;", "setUserDataGoogle", "(Lcom/uni/pis/Data/UserData/UserDataGoogle;)V", "mFirebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "getMFirebaseAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "setMFirebaseAuth", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "mStorageRef", "Lcom/google/firebase/storage/StorageReference;", "getMStorageRef", "()Lcom/google/firebase/storage/StorageReference;", "setMStorageRef", "(Lcom/google/firebase/storage/StorageReference;)V", "viewpage_apdapter", "Lcom/uni/pis/homefrags/MyViewPagerAdapter;", "getViewpage_apdapter", "()Lcom/uni/pis/homefrags/MyViewPagerAdapter;", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResult", "result", "trans", "postion", "", "app"}
)
public final class MainActivity extends AppCompatActivity implements MyCallback {
    @RequiresApi(24)
    private final String SENDBIRDAPPID = "C70ACBE6-0911-45D5-B02B-C56D3ADDF158";
    @NotNull
    private FirebaseAuth mFirebaseAuth;
    @NotNull
    public StorageReference mStorageRef;
    @NotNull
    private final MyViewPagerAdapter viewpage_apdapter;
    @NotNull
    public UserDataGoogle UserDataGoogle;
    private HashMap _$_findViewCache;

    @NotNull
    public final FirebaseAuth getMFirebaseAuth() {
        return this.mFirebaseAuth;
    }

    public final void setMFirebaseAuth(@NotNull FirebaseAuth var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.mFirebaseAuth = var1;
    }

    @NotNull
    public final StorageReference getMStorageRef() {
        StorageReference var10000 = this.mStorageRef;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStorageRef");
        }

        return var10000;
    }

    public final void setMStorageRef(@NotNull StorageReference var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.mStorageRef = var1;
    }

    @NotNull
    public final MyViewPagerAdapter getViewpage_apdapter() {
        return this.viewpage_apdapter;
    }

    @NotNull
    public final UserDataGoogle getUserDataGoogle() {
        UserDataGoogle var10000 = this.UserDataGoogle;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("UserDataGoogle");
        }

        return var10000;
    }

    public final void setUserDataGoogle(@NotNull UserDataGoogle var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.UserDataGoogle = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300034);
        FirebaseUser var10000 = this.mFirebaseAuth.getCurrentUser();
        String var5 = var10000 != null ? var10000.getUid() : null;
        if (var5 == null) {
            Intrinsics.throwNpe();
        }

        Intrinsics.checkExpressionValueIsNotNull(var5, "mFirebaseAuth.currentUser?.uid!!");
        String userid = var5;

        try {
            BackgroundWorker data = new BackgroundWorker((Context)this);
            data.execute(new String[]{"login", userid});
        } catch (NullPointerException var4) {
            Toast.makeText((Context)this, (CharSequence)var4.getMessage(), 1).show();
        }

        FirebaseMessaging.getInstance().subscribeToTopic("FriendRequest" + userid);
        SendBird.init(this.SENDBIRDAPPID, (Context)this);
        SendBird.connect(userid, (ConnectHandler)(new ConnectHandler() {
            public void onConnected(@Nullable User user, @Nullable SendBirdException e) {
                if (e == null) {
                    ;
                }
            }
        }));
        SendBird.setChannelInvitationPreference(true, (SetChannelInvitationPreferenceHandler)(new SetChannelInvitationPreferenceHandler() {
            public void onResult(@Nullable SendBirdException e) {
                if (e == null) {
                    ;
                }
            }
        }));
        MyViewPagerAdapter var6 = this.viewpage_apdapter;
        Fragment var10001 = (Fragment)(new HomeFrag());
        String var10002 = this.getString(1900108);
        Intrinsics.checkExpressionValueIsNotNull(var10002, "getString( R.string.Home)");
        var6.addfragment(var10001, var10002);
        var6 = this.viewpage_apdapter;
        var10001 = (Fragment)(new Events_Frag());
        var10002 = this.getString(1900082);
        Intrinsics.checkExpressionValueIsNotNull(var10002, "getString( R.string.Create_Event)");
        var6.addfragment(var10001, var10002);
        var6 = this.viewpage_apdapter;
        var10001 = (Fragment)(new ProfilePagePersonalFrag());
        var10002 = this.getString(1900163);
        Intrinsics.checkExpressionValueIsNotNull(var10002, "getString(R.string.Profile )");
        var6.addfragment(var10001, var10002);
        ViewPager var7 = (ViewPager)this._$_findCachedViewById(id.view_pager);
        Intrinsics.checkExpressionValueIsNotNull(var7, "view_pager");
        var7.setAdapter((PagerAdapter)this.viewpage_apdapter);
        ((TabLayout)this._$_findCachedViewById(id.tabs)).setupWithViewPager((ViewPager)this._$_findCachedViewById(id.view_pager));
    }

    @SuppressLint({"SetTextI18n"})
    public void onResult(@Nullable String result) {
        String var3 = StringsKt.replace$default(userData.Companion.getImage(), "\\", "", false, 4, (Object)null);
        boolean var4 = false;
        if (var3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        } else {
            String image = StringsKt.trim((CharSequence)var3).toString();

            try {
                StorageReference var10001 = FirebaseStorage.getInstance().getReferenceFromUrl(image);
                Intrinsics.checkExpressionValueIsNotNull(var10001, "FirebaseStorage.getInsta…etReferenceFromUrl(image)");
                this.mStorageRef = var10001;
                StorageReference var10000 = this.mStorageRef;
                if (var10000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStorageRef");
                }

                var10000.getBytes(Long.MAX_VALUE).addOnSuccessListener((OnSuccessListener)(new OnSuccessListener() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public void onSuccess(Object var1) {
                        this.onSuccess((byte[])var1);
                    }

                    public final void onSuccess(byte[] it) {
                        Bitmap bmp = BitmapFactory.decodeByteArray(it, 0, it.length);

                        try {
                            CircleImageView var10000 = (CircleImageView)MainActivity.this._$_findCachedViewById(id.home_iv_profile);
                            CircleImageView var10002 = (CircleImageView)MainActivity.this._$_findCachedViewById(id.home_iv_profile);
                            Intrinsics.checkExpressionValueIsNotNull(var10002, "home_iv_profile");
                            int var7 = var10002.getWidth();
                            CircleImageView var10003 = (CircleImageView)MainActivity.this._$_findCachedViewById(id.home_iv_profile);
                            Intrinsics.checkExpressionValueIsNotNull(var10003, "home_iv_profile");
                            var10000.setImageBitmap(Bitmap.createScaledBitmap(bmp, var7, var10003.getHeight(), false));
                        } catch (IllegalStateException var4) {
                            Log.d("MainActivity", "onError: " + var4.getMessage());
                        } catch (NullPointerException var5) {
                            Log.d("MainActivity", "onError: " + var5.getMessage());
                        } catch (Exception var6) {
                            Log.d("MainActivity", "onError: " + var6.getMessage());
                        }

                    }
                })).addOnFailureListener((OnFailureListener)null.INSTANCE);
            } catch (Exception var5) {
                Log.d("MainActivity", "onError: " + var5.getMessage());
            }

            TextView var6 = (TextView)this._$_findCachedViewById(id.tv_homeName);
            Intrinsics.checkExpressionValueIsNotNull(var6, "tv_homeName");
            var6.setText((CharSequence)(userData.Companion.getFirst_name() + " " + userData.Companion.getLast_name()));
        }
    }

    public void onBackPressed() {
        ViewPager var10000 = (ViewPager)this._$_findCachedViewById(id.view_pager);
        Intrinsics.checkExpressionValueIsNotNull(var10000, "view_pager");
        if (var10000.getCurrentItem() == 0) {
            Builder builder = new Builder((Context)this);
            builder.setMessage((CharSequence)"Do you want to close Eventor?");
            builder.setPositiveButton((CharSequence)"Confirm", (OnClickListener)(new OnClickListener() {
                public final void onClick(DialogInterface $noName_0, int $noName_1) {
                    MainActivity.super.onBackPressed();
                }
            }));
            builder.setNegativeButton((CharSequence)"Cancel", (OnClickListener)(new OnClickListener() {
                public final void onClick(DialogInterface $noName_0, int $noName_1) {
                    Toast.makeText((Context)MainActivity.this, (CharSequence)"Cancelled.", 0).show();
                }
            }));
            builder.create().show();
        } else {
            var10000 = (ViewPager)this._$_findCachedViewById(id.view_pager);
            Intrinsics.checkExpressionValueIsNotNull(var10000, "view_pager");
            var10000.setCurrentItem(0);
        }

    }

    public final void trans(int postion) {
        ViewPager var10000 = (ViewPager)this._$_findCachedViewById(id.view_pager);
        Intrinsics.checkExpressionValueIsNotNull(var10000, "view_pager");
        var10000.setCurrentItem(postion);
    }

    public MainActivity() {
        FirebaseAuth var10001 = FirebaseAuth.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(var10001, "FirebaseAuth.getInstance()");
        this.mFirebaseAuth = var10001;
        FragmentManager var10003 = this.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(var10003, "supportFragmentManager");
        this.viewpage_apdapter = new MyViewPagerAdapter(var10003);
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
