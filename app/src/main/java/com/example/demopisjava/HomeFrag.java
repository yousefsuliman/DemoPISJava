package com.example.demopisjava;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.uni.pis.Adapter.UsersAdapter.Home_Item_Adapter;
import com.uni.pis.BackgroundWorker.MyCallback;
import com.uni.pis.Data.LoginData.Home_Item;
import com.uni.pis.Data.UserData.userData;
import com.uni.pis.Events.EvenstList;
import com.uni.pis.R.id;
import com.uni.pis.homefrags.MainActivity;
import com.uni.pis.profile.FindFriend;
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.ArrayList;
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
        d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J0\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00142\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0017R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006("},
        d2 = {"Lcom/uni/pis/HomeFrag;", "Landroidx/fragment/app/Fragment;", "Landroid/widget/AdapterView$OnItemClickListener;", "Lcom/uni/pis/BackgroundWorker$MyCallback;", "()V", "GridViewHome", "Landroid/widget/GridView;", "HomeItemArrayList", "Ljava/util/ArrayList;", "Lcom/uni/pis/Data/LoginData/Home_Item;", "HomeItemArrayListAdapter", "Lcom/uni/pis/Adapter/UsersAdapter/Home_Item_Adapter;", "mStorageRef", "Lcom/google/firebase/storage/StorageReference;", "getMStorageRef", "()Lcom/google/firebase/storage/StorageReference;", "setMStorageRef", "(Lcom/google/firebase/storage/StorageReference;)V", "SetDataList", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "", "parent", "Landroid/widget/AdapterView;", "view", "position", "", "id", "", "onResult", "result", "", "onViewCreated", "app"}
)
public final class HomeFrag extends Fragment implements OnItemClickListener, MyCallback {
    private ArrayList HomeItemArrayList;
    private GridView GridViewHome;
    private Home_Item_Adapter HomeItemArrayListAdapter;
    @NotNull
    public StorageReference mStorageRef;
    private HashMap _$_findViewCache;

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

    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkParameterIsNotNull(inflater, "inflater");
        return inflater.inflate(1300109, container, false);
    }

    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.GridViewHome = (GridView)this._$_findCachedViewById(id.Gridview_home);
        this.HomeItemArrayList = new ArrayList();
        this.HomeItemArrayList = this.SetDataList();
        Home_Item_Adapter var10001 = new Home_Item_Adapter;
        Context var10003 = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(var10003, "view.context");
        ArrayList var10004 = this.HomeItemArrayList;
        if (var10004 == null) {
            Intrinsics.throwNpe();
        }

        var10001.<init>(var10003, var10004);
        this.HomeItemArrayListAdapter = var10001;
        GridView var10000 = this.GridViewHome;
        if (var10000 != null) {
            var10000.setAdapter((ListAdapter)this.HomeItemArrayListAdapter);
        }

        var10000 = this.GridViewHome;
        if (var10000 != null) {
            var10000.setOnItemClickListener((OnItemClickListener)this);
        }

        String var4 = StringsKt.replace$default(userData.Companion.getImage(), "\\", "", false, 4, (Object)null);
        boolean var5 = false;
        if (var4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        } else {
            String image = StringsKt.trim((CharSequence)var4).toString();

            try {
                StorageReference var9 = FirebaseStorage.getInstance().getReferenceFromUrl(image);
                Intrinsics.checkExpressionValueIsNotNull(var9, "FirebaseStorage.getInsta…etReferenceFromUrl(image)");
                this.mStorageRef = var9;
                StorageReference var7 = this.mStorageRef;
                if (var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mStorageRef");
                }

                var7.getBytes(Long.MAX_VALUE).addOnSuccessListener((OnSuccessListener)(new OnSuccessListener() {
                    // $FF: synthetic method
                    // $FF: bridge method
                    public void onSuccess(Object var1) {
                        this.onSuccess((byte[])var1);
                    }

                    public final void onSuccess(byte[] it) {
                        Bitmap bmp = BitmapFactory.decodeByteArray(it, 0, it.length);

                        try {
                            CircleImageView var10000 = (CircleImageView)HomeFrag.this._$_findCachedViewById(id.home_iv_profile);
                            CircleImageView var10002 = (CircleImageView)HomeFrag.this._$_findCachedViewById(id.home_iv_profile);
                            Intrinsics.checkExpressionValueIsNotNull(var10002, "home_iv_profile");
                            int var7 = var10002.getWidth();
                            CircleImageView var10003 = (CircleImageView)HomeFrag.this._$_findCachedViewById(id.home_iv_profile);
                            Intrinsics.checkExpressionValueIsNotNull(var10003, "home_iv_profile");
                            var10000.setImageBitmap(Bitmap.createScaledBitmap(bmp, var7, var10003.getHeight(), false));
                        } catch (IllegalStateException var4) {
                            Log.d("HomeFrag", "onError: " + var4.getMessage());
                        } catch (NullPointerException var5) {
                            Log.d("HomeFrag", "onError: " + var5.getMessage());
                        } catch (Exception var6) {
                            Log.d("HomeFrag", "onError: " + var6.getMessage());
                        }

                    }
                })).addOnFailureListener((OnFailureListener)(new OnFailureListener() {
                    public final void onFailure(@NotNull Exception it) {
                        Intrinsics.checkParameterIsNotNull(it, "it");
                        Toast.makeText(HomeFrag.this.getContext(), (CharSequence)it.getMessage(), 1).show();
                    }
                }));
            } catch (Exception var6) {
                Toast.makeText(this.getContext(), (CharSequence)var6.getMessage(), 1).show();
            }

            TextView var8 = (TextView)this._$_findCachedViewById(id.tv_homeName);
            Intrinsics.checkExpressionValueIsNotNull(var8, "tv_homeName");
            var8.setText((CharSequence)(userData.Companion.getFirst_name() + " " + userData.Companion.getLast_name()));
        }
    }

    private final ArrayList SetDataList() {
        ArrayList HomerArrayList = new ArrayList();
        HomerArrayList.add(new Home_Item(700183, this.getString(1900203)));
        HomerArrayList.add(new Home_Item(700136, this.getString(1900139)));
        HomerArrayList.add(new Home_Item(700143, this.getString(1900163)));
        HomerArrayList.add(new Home_Item(700037, this.getString(1900060)));
        HomerArrayList.add(new Home_Item(700144, this.getString(1900153)));
        return HomerArrayList;
    }

    public void onItemClick(@Nullable AdapterView parent, @Nullable View view, int position, long id) {
        ArrayList var10000 = this.HomeItemArrayList;
        if (var10000 == null) {
            Intrinsics.throwNpe();
        }

        var10000.get(position);
        Intent intent;
        switch(position) {
            case 0:
                intent = new Intent(this.getContext(), Notification.class);
                this.startActivity(intent);
                break;
            case 1:
                intent = new Intent(this.getContext(), EvenstList.class);
                this.startActivity(intent);
                break;
            case 2:
                MainActivity var7 = (MainActivity)this.getActivity();
                if (var7 == null) {
                    Intrinsics.throwNpe();
                }

                var7.trans(2);
                break;
            case 3:
                intent = new Intent(this.getContext(), FindFriend.class);
                this.startActivity(intent);
        }

    }

    public void onResult(@Nullable String result) {
    }

    public View _$_findCachedViewById(int var1) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }

        View var2 = (View)this._$_findViewCache.get(var1);
        if (var2 == null) {
            View var10000 = this.getView();
            if (var10000 == null) {
                return null;
            }

            var2 = var10000.findViewById(var1);
            this._$_findViewCache.put(var1, var2);
        }

        return var2;
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }

    }

    // $FF: synthetic method
    public void onDestroyView() {
        super.onDestroyView();
        this._$_clearFindViewByIdCache();
    }
}
