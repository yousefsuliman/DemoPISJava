package com.example.demopisjava;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore.Video.Media;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.uni.pis.R.id;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0002J\"\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0015J\"\u0010!\u001a\u00020\u00192\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006*"},
        d2 = {"Lcom/uni/pis/Events/VideoInvitation;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/karumi/dexter/listener/multi/MultiplePermissionsListener;", "()V", "Frag", "Landroidx/fragment/app/Fragment;", "getFrag", "()Landroidx/fragment/app/Fragment;", "setFrag", "(Landroidx/fragment/app/Fragment;)V", "GALLERY", "", "VIDEO_CAPTURE", "mediaController", "Landroid/widget/MediaController;", "videoUri", "Landroid/net/Uri;", "getVideoUri", "()Landroid/net/Uri;", "setVideoUri", "(Landroid/net/Uri;)V", "getPath", "", "contUri", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPermissionRationaleShouldBeShown", "permissions", "", "Lcom/karumi/dexter/listener/PermissionRequest;", "token", "Lcom/karumi/dexter/PermissionToken;", "onPermissionsChecked", "report", "Lcom/karumi/dexter/MultiplePermissionsReport;", "app"}
)
public final class VideoInvitation extends AppCompatActivity implements MultiplePermissionsListener {
    private int GALLERY = 100;
    private final int VIDEO_CAPTURE = 101;
    private MediaController mediaController;
    @NotNull
    public Fragment Frag;
    @NotNull
    public Uri videoUri;
    private HashMap _$_findViewCache;

    @NotNull
    public final Fragment getFrag() {
        Fragment var10000 = this.Frag;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("Frag");
        }

        return var10000;
    }

    public final void setFrag(@NotNull Fragment var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.Frag = var1;
    }

    @NotNull
    public final Uri getVideoUri() {
        Uri var10000 = this.videoUri;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("videoUri");
        }

        return var10000;
    }

    public final void setVideoUri(@NotNull Uri var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.videoUri = var1;
    }

    @RequiresApi(17)
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300008);
        this.Frag = (Fragment)(new videoFrame());
        FragmentTransaction var10000 = this.getSupportFragmentManager().beginTransaction();
        Fragment var10002 = this.Frag;
        if (var10002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("Frag");
        }

        var10000.add(1000438, var10002).commit();
        final List permissions = CollectionsKt.listOf(new String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE"});
        ((Button)this._$_findCachedViewById(id.btn_pick_fromgallery)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent galleryIntent = new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI);
                VideoInvitation.this.startActivityForResult(galleryIntent, VideoInvitation.this.GALLERY);
            }
        }));
        ((Button)this._$_findCachedViewById(id.btn_record)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Dexter.withActivity((Activity)VideoInvitation.this).withPermissions((Collection)permissions).withListener((MultiplePermissionsListener)VideoInvitation.this).check();
            }
        }));
        ((Button)this._$_findCachedViewById(id.btn_linkVideoToEvent)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent intent = new Intent((Context)VideoInvitation.this, MyEventsUploadViedo.class);
                intent.putExtra("video", (Parcelable)VideoInvitation.this.getVideoUri());
                VideoInvitation.this.startActivity(intent);
            }
        }));
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        try {
            Fragment var7;
            VideoView var8;
            Button var9;
            MediaController var10000;
            Uri var10001;
            if (requestCode == this.GALLERY) {
                if (data != null) {
                    var10001 = data.getData();
                    if (var10001 == null) {
                        Intrinsics.throwNpe();
                    }

                    this.videoUri = var10001;
                    var10001 = this.videoUri;
                    if (var10001 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("videoUri");
                    }

                    String selectedVideoPath = this.getPath(var10001);
                    this.mediaController = new MediaController((Context)this);
                    var10000 = this.mediaController;
                    if (var10000 != null) {
                        var10000.setAnchorView((VideoView)this._$_findCachedViewById(id.viewVideo));
                    }

                    ((VideoView)this._$_findCachedViewById(id.viewVideo)).setMediaController(this.mediaController);
                    var7 = this.Frag;
                    if (var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("Frag");
                    }

                    var8 = (VideoView)var7.getView().findViewById(id.viewVideo);
                    var10001 = this.videoUri;
                    if (var10001 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("videoUri");
                    }

                    var8.setVideoURI(var10001);
                    var7 = this.Frag;
                    if (var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("Frag");
                    }

                    ((VideoView)var7.getView().findViewById(id.viewVideo)).requestFocus();
                    var7 = this.Frag;
                    if (var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("Frag");
                    }

                    ((VideoView)var7.getView().findViewById(id.viewVideo)).start();
                    var9 = (Button)this._$_findCachedViewById(id.btn_linkVideoToEvent);
                    Intrinsics.checkExpressionValueIsNotNull(var9, "btn_linkVideoToEvent");
                    var9.setEnabled(true);
                }
            } else if (requestCode == this.VIDEO_CAPTURE) {
                if (data == null) {
                    Intrinsics.throwNpe();
                }

                var10001 = data.getData();
                if (var10001 == null) {
                    Intrinsics.throwNpe();
                }

                this.videoUri = var10001;
                switch(resultCode) {
                    case -1:
                        Context var10 = (Context)this;
                        StringBuilder var11 = (new StringBuilder()).append("Video saved to:\n");
                        Uri var10002 = this.videoUri;
                        if (var10002 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("videoUri");
                        }

                        Toast.makeText(var10, (CharSequence)var11.append(var10002).toString(), 1).show();
                        this.mediaController = new MediaController((Context)this);
                        var10000 = this.mediaController;
                        if (var10000 != null) {
                            var10000.setAnchorView((VideoView)this._$_findCachedViewById(id.viewVideo));
                        }

                        ((VideoView)this._$_findCachedViewById(id.viewVideo)).setMediaController(this.mediaController);
                        var7 = this.Frag;
                        if (var7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("Frag");
                        }

                        var8 = (VideoView)var7.getView().findViewById(id.viewVideo);
                        var10001 = this.videoUri;
                        if (var10001 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("videoUri");
                        }

                        var8.setVideoURI(var10001);
                        var7 = this.Frag;
                        if (var7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("Frag");
                        }

                        ((VideoView)var7.getView().findViewById(id.viewVideo)).requestFocus();
                        var7 = this.Frag;
                        if (var7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("Frag");
                        }

                        ((VideoView)var7.getView().findViewById(id.viewVideo)).start();
                        var9 = (Button)this._$_findCachedViewById(id.btn_linkVideoToEvent);
                        Intrinsics.checkExpressionValueIsNotNull(var9, "btn_linkVideoToEvent");
                        var9.setEnabled(true);
                        break;
                    case 0:
                        Toast.makeText((Context)this, (CharSequence)"Cancelled", 1).show();
                        break;
                    default:
                        Toast.makeText((Context)this, (CharSequence)"Failed", 1).show();
                }
            }
        } catch (Exception var6) {
        }

    }

    private final String getPath(Uri contUri) {
        Object contentresolver = (ContentResolver)null;
        String[] var10000 = new String[]{"_data"};
        if (contUri != null) {
            boolean var6 = false;
            boolean var7 = false;
            int var9 = false;
            Cursor var10 = (Cursor)null;
        } else {
            var10000 = null;
        }

        return "";
    }

    public void onPermissionsChecked(@Nullable MultiplePermissionsReport report) {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        this.startActivityForResult(intent, this.VIDEO_CAPTURE);
    }

    public void onPermissionRationaleShouldBeShown(@Nullable List permissions, @Nullable PermissionToken token) {
        if (token == null) {
            Intrinsics.throwNpe();
        }

        token.continuePermissionRequest();
    }

    // $FF: synthetic method
    public static final void access$setGALLERY$p(VideoInvitation $this, int var1) {
        $this.GALLERY = var1;
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
