package com.example.demopisjava;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.uni.pis.BackgroundWorker;
import com.uni.pis.BackgroundWorker.MyCallback;
import com.uni.pis.Data.EventData.FullscreenVideo;
import com.uni.pis.Data.EventData.eventData;
import com.uni.pis.Data.UserData.InviteeListData;
import com.uni.pis.Events.Invitee_List.userDataOrder;
import com.uni.pis.R.id;
import com.uni.pis.profile.Friends;
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.HashMap;
import java.util.List;
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
        d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010!\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006$"},
        d2 = {"Lcom/uni/pis/Events/MyCardInvitation;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/uni/pis/BackgroundWorker$MyCallback;", "()V", "EventData", "Lcom/uni/pis/Data/EventData/eventData;", "getEventData", "()Lcom/uni/pis/Data/EventData/eventData;", "setEventData", "(Lcom/uni/pis/Data/EventData/eventData;)V", "Fraginvitee", "Landroidx/fragment/app/Fragment;", "getFraginvitee", "()Landroidx/fragment/app/Fragment;", "setFraginvitee", "(Landroidx/fragment/app/Fragment;)V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResult", "result", "", "app"}
)
public final class MyCardInvitation extends AppCompatActivity implements MyCallback {
    @NotNull
    public eventData EventData;
    @NotNull
    public Fragment Fraginvitee;
    private HashMap _$_findViewCache;

    @NotNull
    public final eventData getEventData() {
        eventData var10000 = this.EventData;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("EventData");
        }

        return var10000;
    }

    public final void setEventData(@NotNull eventData var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.EventData = var1;
    }

    @NotNull
    public final Fragment getFraginvitee() {
        Fragment var10000 = this.Fraginvitee;
        if (var10000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("Fraginvitee");
        }

        return var10000;
    }

    public final void setFraginvitee(@NotNull Fragment var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.Fraginvitee = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300097);
        this.Fraginvitee = (Fragment)(new inviteeInfo());
        FragmentTransaction var10000 = this.getSupportFragmentManager().beginTransaction();
        Fragment var10002 = this.Fraginvitee;
        if (var10002 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("Fraginvitee");
        }

        var10000.add(1000116, var10002).commit();
        Bundle bundle = this.getIntent().getBundleExtra("Bundle");
        final eventData Eventdata = (eventData)bundle.getParcelable("eventdata");
        if (Eventdata != null) {
            this.EventData = Eventdata;
        }

        if (Eventdata == null) {
            Intrinsics.throwNpe();
        }

        if (Intrinsics.areEqual(Eventdata.getImage(), "") ^ true) {
            StorageReference var4 = FirebaseStorage.getInstance().getReferenceFromUrl(Eventdata.getImage());
            Intrinsics.checkExpressionValueIsNotNull(var4, "FirebaseStorage.getInsta…eFromUrl(Eventdata.image)");
            Create_InvitationKt.setMStorageRef(var4);
            Create_InvitationKt.getMStorageRef().getBytes(Long.MAX_VALUE).addOnSuccessListener((OnSuccessListener)(new OnSuccessListener() {
                // $FF: synthetic method
                // $FF: bridge method
                public void onSuccess(Object var1) {
                    this.onSuccess((byte[])var1);
                }

                public final void onSuccess(byte[] it) {
                    Bitmap bmp = BitmapFactory.decodeByteArray(it, 0, it.length);
                    ImageView var10000 = (ImageView)MyCardInvitation.this._$_findCachedViewById(id.event_img);
                    ImageView var10002 = (ImageView)MyCardInvitation.this._$_findCachedViewById(id.event_img);
                    Intrinsics.checkExpressionValueIsNotNull(var10002, "event_img");
                    int var3 = var10002.getWidth();
                    ImageView var10003 = (ImageView)MyCardInvitation.this._$_findCachedViewById(id.event_img);
                    Intrinsics.checkExpressionValueIsNotNull(var10003, "event_img");
                    var10000.setImageBitmap(Bitmap.createScaledBitmap(bmp, var3, var10003.getHeight(), false));
                }
            })).addOnFailureListener((OnFailureListener)null.INSTANCE);
        }

        TextView var5 = (TextView)this._$_findCachedViewById(id.tv_finviter);
        Intrinsics.checkExpressionValueIsNotNull(var5, "tv_finviter");
        var5.setText((CharSequence)Eventdata.getFirstinvitername());
        var5 = (TextView)this._$_findCachedViewById(id.tv_sinviter);
        Intrinsics.checkExpressionValueIsNotNull(var5, "tv_sinviter");
        var5.setText((CharSequence)Eventdata.getSecondinvitername());
        var5 = (TextView)this._$_findCachedViewById(id.tv_eventdate);
        Intrinsics.checkExpressionValueIsNotNull(var5, "tv_eventdate");
        var5.setText((CharSequence)Eventdata.getDate());
        var5 = (TextView)this._$_findCachedViewById(id.tv_starttime);
        Intrinsics.checkExpressionValueIsNotNull(var5, "tv_starttime");
        var5.setText((CharSequence)Eventdata.getStartTime());
        var5 = (TextView)this._$_findCachedViewById(id.tv_endtime);
        Intrinsics.checkExpressionValueIsNotNull(var5, "tv_endtime");
        var5.setText((CharSequence)Eventdata.getEndTime());
        var5 = (TextView)this._$_findCachedViewById(id.tv_description);
        Intrinsics.checkExpressionValueIsNotNull(var5, "tv_description");
        var5.setText((CharSequence)Eventdata.getDescription());
        ((Button)this._$_findCachedViewById(id.btn_location)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                List loc = StringsKt.split$default((CharSequence)Eventdata.getPlace_ID(), new char[]{'&'}, false, 0, 6, (Object)null);
                String lat = StringsKt.substringAfter$default((String)loc.get(0), "=", (String)null, 2, (Object)null);
                String lot = (String)loc.get(1);
                Intent i = new Intent();
                i.setAction("android.intent.action.VIEW");
                i.setData(Uri.parse("google.navigation:q=" + lat + "," + lot));
                MyCardInvitation.this.startActivity(i);
            }
        }));
        ((Button)this._$_findCachedViewById(id.btn_invite)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent intent = new Intent((Context)MyCardInvitation.this, Friends.class);
                intent.putExtra("EventId", Eventdata.getEvent_ID());
                intent.putExtra("InviteeNumber", Eventdata.getInv_No());
                intent.putExtra("channelUrl", Eventdata.getChannelUrl());
                MyCardInvitation.this.startActivity(intent);
            }
        }));
        ((Button)this._$_findCachedViewById(id.btn_groupchat)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent intent = new Intent((Context)MyCardInvitation.this, Chat.class);
                intent.putExtra("ChannelUrl", Eventdata.getChannelUrl());
                MyCardInvitation.this.startActivity(intent);
            }
        }));
        ((Button)this._$_findCachedViewById(id.btn_attendance)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                Intent intent = new Intent((Context)MyCardInvitation.this, Invitee_List.class);
                intent.putExtra("eventID", Eventdata.getEvent_ID());
                MyCardInvitation.this.startActivity(intent);
            }
        }));
        ((Button)this._$_findCachedViewById(id.btn_scan)).setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                IntentIntegrator scanner = new IntentIntegrator((Activity)MyCardInvitation.this);
                scanner.setDesiredBarcodeFormats(new String[]{"QR_CODE"});
                scanner.setBeepEnabled(false);
                scanner.initiateScan();
            }
        }));
        if (Intrinsics.areEqual(Eventdata.getVideo(), "0") ^ true) {
            Button var6 = (Button)this._$_findCachedViewById(id.btn_video);
            Intrinsics.checkExpressionValueIsNotNull(var6, "btn_video");
            var6.setVisibility(0);
            ((Button)this._$_findCachedViewById(id.btn_video)).setOnClickListener((OnClickListener)(new OnClickListener() {
                public final void onClick(View it) {
                    Intent intent = new Intent((Context)MyCardInvitation.this, FullscreenVideo.class);
                    intent.putExtra("videourl", Eventdata.getVideo());
                    MyCardInvitation.this.startActivity(intent);
                }
            }));
        }

    }

    public boolean onCreateOptionsMenu(@Nullable Menu menu) {
        this.getMenuInflater().inflate(1400000, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkParameterIsNotNull(item, "item");
        int id = item.getItemId();
        if (id == 1000358) {
            eventData var10000 = this.EventData;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("EventData");
            }

            eventData image = var10000;
            Intent i = new Intent((Context)this, EditEvent.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("eventdata", (Parcelable)image);
            i.putExtra("Bundle", bundle);
            ContextCompat.startActivity((Context)this, i, new Bundle());
        }

        return super.onOptionsItemSelected(item);
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode == -1) {
            IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
            if (result != null) {
                if (result.getContents() == null) {
                    Toast.makeText((Context)this, (CharSequence)"Cancelled", 1).show();
                } else {
                    BackgroundWorker data = new BackgroundWorker((Context)this);
                    String[] var10001 = new String[]{"checkID", null, null};
                    eventData var10004 = this.EventData;
                    if (var10004 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("EventData");
                    }

                    var10001[1] = var10004.getEvent_ID();
                    var10001[2] = result.getContents();
                    data.execute(var10001);
                }
            } else {
                super.onActivityResult(requestCode, resultCode, data);
            }
        }

    }

    public void onResult(@Nullable String result) {
        if (result == null) {
            Intrinsics.throwNpe();
        }

        List friend = StringsKt.split$default((CharSequence)result, new String[]{"!&"}, false, 0, 6, (Object)null);
        LottieAnimationView var10000;
        if (friend.size() > 1) {
            String UserID = StringsKt.substringAfter$default((String)friend.get(userDataOrder.UserID.getIndex()), "=", (String)null, 2, (Object)null);
            String firstname = StringsKt.substringAfter$default((String)friend.get(userDataOrder.firstName.getIndex()), "=", (String)null, 2, (Object)null);
            String lastname = StringsKt.substringAfter$default((String)friend.get(userDataOrder.lastName.getIndex()), "=", (String)null, 2, (Object)null);
            String attendence = StringsKt.replace$default(StringsKt.substringAfter$default((String)friend.get(userDataOrder.Image.getIndex()), "=", (String)null, 2, (Object)null), "\\", "", false, 4, (Object)null);
            boolean var8 = false;
            if (attendence == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }

            String image = StringsKt.trim((CharSequence)attendence).toString();
            attendence = StringsKt.substringAfter$default((String)friend.get(userDataOrder.attendace.getIndex()), "=", (String)null, 2, (Object)null);
            String permission = StringsKt.substringAfter$default((String)friend.get(userDataOrder.permission.getIndex()), "=", (String)null, 2, (Object)null);
            String inviteenumber = StringsKt.substringAfter$default((String)friend.get(userDataOrder.inviteenumber.getIndex()), "=", (String)null, 2, (Object)null);
            InviteeListData inviteeData = new InviteeListData(UserID, firstname + "  " + lastname, image, attendence, permission, inviteenumber);
            var10000 = (LottieAnimationView)this._$_findCachedViewById(id.img_complete);
            Intrinsics.checkExpressionValueIsNotNull(var10000, "img_complete");
            var10000.setVisibility(0);
            Fragment var15 = this.Fraginvitee;
            if (var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("Fraginvitee");
            }

            TextView var16 = (TextView)var15.getView().findViewById(id.tv_friendname);
            Intrinsics.checkExpressionValueIsNotNull(var16, "Fraginvitee.tv_friendname");
            var16.setText((CharSequence)inviteeData.getName());
            var15 = this.Fraginvitee;
            if (var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("Fraginvitee");
            }

            var16 = (TextView)var15.getView().findViewById(id.tv_personInviteeNumer);
            Intrinsics.checkExpressionValueIsNotNull(var16, "Fraginvitee.tv_personInviteeNumer");
            var16.setText((CharSequence)inviteeData.getInviteenumber());
            StorageReference var17 = FirebaseStorage.getInstance().getReferenceFromUrl(inviteeData.getImage());
            Intrinsics.checkExpressionValueIsNotNull(var17, "FirebaseStorage.getInsta…romUrl(inviteeData.image)");
            Create_InvitationKt.setMStorageRef(var17);
            Create_InvitationKt.getMStorageRef().getBytes(Long.MAX_VALUE).addOnSuccessListener((OnSuccessListener)(new OnSuccessListener() {
                // $FF: synthetic method
                // $FF: bridge method
                public void onSuccess(Object var1) {
                    this.onSuccess((byte[])var1);
                }

                public final void onSuccess(byte[] it) {
                    Bitmap bmp = BitmapFactory.decodeByteArray(it, 0, it.length);
                    CircleImageView var10000 = (CircleImageView)MyCardInvitation.this.getFraginvitee().getView().findViewById(id.iv_friend);
                    CircleImageView var10002 = (CircleImageView)MyCardInvitation.this._$_findCachedViewById(id.iv_friend);
                    Intrinsics.checkExpressionValueIsNotNull(var10002, "iv_friend");
                    int var3 = var10002.getWidth();
                    CircleImageView var10003 = (CircleImageView)MyCardInvitation.this._$_findCachedViewById(id.iv_friend);
                    Intrinsics.checkExpressionValueIsNotNull(var10003, "iv_friend");
                    var10000.setImageBitmap(Bitmap.createScaledBitmap(bmp, var3, var10003.getHeight(), false));
                }
            })).addOnFailureListener((OnFailureListener)null.INSTANCE);
            String var11 = inviteeData.getAttendace();
            ImageButton var18;
            switch(var11.hashCode()) {
                case 48:
                    if (var11.equals("0")) {
                        var15 = this.Fraginvitee;
                        if (var15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("Fraginvitee");
                        }

                        var18 = (ImageButton)var15.getView().findViewById(id.ib_reject);
                        Intrinsics.checkExpressionValueIsNotNull(var18, "Fraginvitee.ib_reject");
                        var18.setVisibility(0);
                        var15 = this.Fraginvitee;
                        if (var15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("Fraginvitee");
                        }

                        var16 = (TextView)var15.getView().findViewById(id.tv_status);
                        Intrinsics.checkExpressionValueIsNotNull(var16, "Fraginvitee.tv_status");
                        var16.setText((CharSequence)"Reject");
                    }
                    break;
                case 49:
                    if (var11.equals("1")) {
                        var15 = this.Fraginvitee;
                        if (var15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("Fraginvitee");
                        }

                        var18 = (ImageButton)var15.getView().findViewById(id.ib_maybe);
                        Intrinsics.checkExpressionValueIsNotNull(var18, "Fraginvitee.ib_maybe");
                        var18.setVisibility(0);
                        var15 = this.Fraginvitee;
                        if (var15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("Fraginvitee");
                        }

                        var16 = (TextView)var15.getView().findViewById(id.tv_status);
                        Intrinsics.checkExpressionValueIsNotNull(var16, "Fraginvitee.tv_status");
                        var16.setText((CharSequence)"Maybe");
                    }
                    break;
                case 50:
                    if (var11.equals("2")) {
                        var15 = this.Fraginvitee;
                        if (var15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("Fraginvitee");
                        }

                        var18 = (ImageButton)var15.getView().findViewById(id.ib_accpet);
                        Intrinsics.checkExpressionValueIsNotNull(var18, "Fraginvitee.ib_accpet");
                        var18.setVisibility(0);
                        var15 = this.Fraginvitee;
                        if (var15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("Fraginvitee");
                        }

                        var16 = (TextView)var15.getView().findViewById(id.tv_status);
                        Intrinsics.checkExpressionValueIsNotNull(var16, "Fraginvitee.tv_status");
                        var16.setText((CharSequence)"Accept");
                    }
            }

            FrameLayout var19 = (FrameLayout)this._$_findCachedViewById(id.inviteeInfoFramecontine);
            Intrinsics.checkExpressionValueIsNotNull(var19, "inviteeInfoFramecontine");
            var19.setVisibility(0);
            Handler handler = new Handler();
            handler.postDelayed((Runnable)(new Runnable() {
                public final void run() {
                    LottieAnimationView var10000 = (LottieAnimationView)MyCardInvitation.this._$_findCachedViewById(id.img_complete);
                    Intrinsics.checkExpressionValueIsNotNull(var10000, "img_complete");
                    var10000.setVisibility(8);
                }
            }), 4000L);
            ((FrameLayout)this._$_findCachedViewById(id.inviteeInfoFramecontine)).setOnClickListener((OnClickListener)(new OnClickListener() {
                public final void onClick(View it) {
                    FrameLayout var10000 = (FrameLayout)MyCardInvitation.this._$_findCachedViewById(id.inviteeInfoFramecontine);
                    Intrinsics.checkExpressionValueIsNotNull(var10000, "inviteeInfoFramecontine");
                    var10000.setVisibility(8);
                }
            }));
        } else {
            var10000 = (LottieAnimationView)this._$_findCachedViewById(id.img_cancelled);
            Intrinsics.checkExpressionValueIsNotNull(var10000, "img_cancelled");
            var10000.setVisibility(0);
            Handler handler = new Handler();
            handler.postDelayed((Runnable)(new Runnable() {
                public final void run() {
                    LottieAnimationView var10000 = (LottieAnimationView)MyCardInvitation.this._$_findCachedViewById(id.img_cancelled);
                    Intrinsics.checkExpressionValueIsNotNull(var10000, "img_cancelled");
                    var10000.setVisibility(8);
                }
            }), 2500L);
        }

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
