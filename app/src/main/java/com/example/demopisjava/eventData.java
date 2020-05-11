package com.example.demopisjava;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b-\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004Bu\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0002\u0010\u0014J\b\u00103\u001a\u000204H\u0016J\u0018\u00105\u001a\u0002062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00107\u001a\u000204H\u0016R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001a\u0010\u0013\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u001a\u0010\u0012\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0016\"\u0004\b2\u0010\u0018¨\u00069"},
        d2 = {"Lcom/uni/pis/Data/EventData/eventData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "Event_ID", "", "Inv_No", "Date", "Event_type", "StartTime", "EndTime", "InviterID", "firstinvitername", "secondinvitername", "Place_ID", "image", "Description", "channelUrl", "Video", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getEndTime", "setEndTime", "getEvent_ID", "setEvent_ID", "getEvent_type", "setEvent_type", "getInv_No", "setInv_No", "getInviterID", "setInviterID", "getPlace_ID", "setPlace_ID", "getStartTime", "setStartTime", "getVideo", "setVideo", "getChannelUrl", "setChannelUrl", "getFirstinvitername", "setFirstinvitername", "getImage", "setImage", "getSecondinvitername", "setSecondinvitername", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "app"}
)
@SuppressLint({"ParcelCreator"})
public final class eventData implements Parcelable {
    @NotNull
    private String Event_ID;
    @NotNull
    private String Inv_No;
    @NotNull
    private String Date;
    @NotNull
    private String Event_type;
    @NotNull
    private String StartTime;
    @NotNull
    private String EndTime;
    @NotNull
    private String InviterID;
    @NotNull
    private String firstinvitername;
    @NotNull
    private String secondinvitername;
    @NotNull
    private String Place_ID;
    @NotNull
    private String image;
    @NotNull
    private String Description;
    @NotNull
    private String channelUrl;
    @NotNull
    private String Video;
    public static final eventData.CREATOR CREATOR = new eventData.CREATOR((DefaultConstructorMarker)null);

    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.Event_ID);
        parcel.writeString(this.Inv_No);
        parcel.writeString(this.Date);
        parcel.writeString(this.Event_type);
        parcel.writeString(this.StartTime);
        parcel.writeString(this.EndTime);
        parcel.writeString(this.InviterID);
        parcel.writeString(this.firstinvitername);
        parcel.writeString(this.secondinvitername);
        parcel.writeString(this.Place_ID);
        parcel.writeString(this.image);
        parcel.writeString(this.Description);
        parcel.writeString(this.channelUrl);
        parcel.writeString(this.Video);
    }

    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String getEvent_ID() {
        return this.Event_ID;
    }

    public final void setEvent_ID(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.Event_ID = var1;
    }

    @NotNull
    public final String getInv_No() {
        return this.Inv_No;
    }

    public final void setInv_No(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.Inv_No = var1;
    }

    @NotNull
    public final String getDate() {
        return this.Date;
    }

    public final void setDate(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.Date = var1;
    }

    @NotNull
    public final String getEvent_type() {
        return this.Event_type;
    }

    public final void setEvent_type(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.Event_type = var1;
    }

    @NotNull
    public final String getStartTime() {
        return this.StartTime;
    }

    public final void setStartTime(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.StartTime = var1;
    }

    @NotNull
    public final String getEndTime() {
        return this.EndTime;
    }

    public final void setEndTime(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.EndTime = var1;
    }

    @NotNull
    public final String getInviterID() {
        return this.InviterID;
    }

    public final void setInviterID(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.InviterID = var1;
    }

    @NotNull
    public final String getFirstinvitername() {
        return this.firstinvitername;
    }

    public final void setFirstinvitername(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.firstinvitername = var1;
    }

    @NotNull
    public final String getSecondinvitername() {
        return this.secondinvitername;
    }

    public final void setSecondinvitername(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.secondinvitername = var1;
    }

    @NotNull
    public final String getPlace_ID() {
        return this.Place_ID;
    }

    public final void setPlace_ID(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.Place_ID = var1;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final void setImage(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.image = var1;
    }

    @NotNull
    public final String getDescription() {
        return this.Description;
    }

    public final void setDescription(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.Description = var1;
    }

    @NotNull
    public final String getChannelUrl() {
        return this.channelUrl;
    }

    public final void setChannelUrl(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.channelUrl = var1;
    }

    @NotNull
    public final String getVideo() {
        return this.Video;
    }

    public final void setVideo(@NotNull String var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.Video = var1;
    }

    public eventData(@NotNull String Event_ID, @NotNull String Inv_No, @NotNull String Date, @NotNull String Event_type, @NotNull String StartTime, @NotNull String EndTime, @NotNull String InviterID, @NotNull String firstinvitername, @NotNull String secondinvitername, @NotNull String Place_ID, @NotNull String image, @NotNull String Description, @NotNull String channelUrl, @NotNull String Video) {
        Intrinsics.checkParameterIsNotNull(Event_ID, "Event_ID");
        Intrinsics.checkParameterIsNotNull(Inv_No, "Inv_No");
        Intrinsics.checkParameterIsNotNull(Date, "Date");
        Intrinsics.checkParameterIsNotNull(Event_type, "Event_type");
        Intrinsics.checkParameterIsNotNull(StartTime, "StartTime");
        Intrinsics.checkParameterIsNotNull(EndTime, "EndTime");
        Intrinsics.checkParameterIsNotNull(InviterID, "InviterID");
        Intrinsics.checkParameterIsNotNull(firstinvitername, "firstinvitername");
        Intrinsics.checkParameterIsNotNull(secondinvitername, "secondinvitername");
        Intrinsics.checkParameterIsNotNull(Place_ID, "Place_ID");
        Intrinsics.checkParameterIsNotNull(image, "image");
        Intrinsics.checkParameterIsNotNull(Description, "Description");
        Intrinsics.checkParameterIsNotNull(channelUrl, "channelUrl");
        Intrinsics.checkParameterIsNotNull(Video, "Video");
        super();
        this.Event_ID = Event_ID;
        this.Inv_No = Inv_No;
        this.Date = Date;
        this.Event_type = Event_type;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.InviterID = InviterID;
        this.firstinvitername = firstinvitername;
        this.secondinvitername = secondinvitername;
        this.Place_ID = Place_ID;
        this.image = image;
        this.Description = Description;
        this.channelUrl = channelUrl;
        this.Video = Video;
    }

    public eventData(@NotNull Parcel parcel) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        this(String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()), String.valueOf(parcel.readString()));
    }

    @Metadata(
            mv = {1, 1, 16},
            bv = {1, 0, 3},
            k = 1,
            d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"},
            d2 = {"Lcom/uni/pis/Data/EventData/eventData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/uni/pis/Data/EventData/eventData;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/uni/pis/Data/EventData/eventData;", "app"}
    )
    public static final class CREATOR implements Creator {
        @NotNull
        public eventData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new eventData(parcel);
        }

        // $FF: synthetic method
        // $FF: bridge method
        public Object createFromParcel(Parcel var1) {
            return this.createFromParcel(var1);
        }

        @NotNull
        public eventData[] newArray(int size) {
            return new eventData[size];
        }

        // $FF: synthetic method
        // $FF: bridge method
        public Object[] newArray(int var1) {
            return this.newArray(var1);
        }

        private CREATOR() {
        }

        // $FF: synthetic method
        public CREATOR(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
