package com.example.demopisjava;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0001\fBG\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000b¨\u0006\r"},
        d2 = {"Lcom/uni/pis/Data/UserData/userData;", "", "first_name", "", "last_name", "email", "phoneNumber", "gender", "city", "birthdate", "image", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "app"}
)
public final class userData {
    @NotNull
    private static String first_name = "test";
    @NotNull
    private static String last_name = "test";
    @NotNull
    private static String email = "";
    @NotNull
    private static String phoneNumber = "";
    @NotNull
    private static String gender = "";
    @NotNull
    private static String city = "test";
    @NotNull
    private static String birthdate = "";
    @NotNull
    private static String image = "";
    public static final userData.Companion Companion = new userData.Companion((DefaultConstructorMarker)null);

    public userData(@NotNull String first_name, @NotNull String last_name, @NotNull String email, @NotNull String phoneNumber, @NotNull String gender, @NotNull String city, @NotNull String birthdate, @NotNull String image) {
        Intrinsics.checkParameterIsNotNull(first_name, "first_name");
        Intrinsics.checkParameterIsNotNull(last_name, "last_name");
        Intrinsics.checkParameterIsNotNull(email, "email");
        Intrinsics.checkParameterIsNotNull(phoneNumber, "phoneNumber");
        Intrinsics.checkParameterIsNotNull(gender, "gender");
        Intrinsics.checkParameterIsNotNull(city, "city");
        Intrinsics.checkParameterIsNotNull(birthdate, "birthdate");
        Intrinsics.checkParameterIsNotNull(image, "image");
        super();
        userData.first_name = first_name;
        userData.last_name = last_name;
        userData.email = email;
        userData.phoneNumber = phoneNumber;
        userData.gender = gender;
        userData.city = city;
        userData.birthdate = birthdate;
        userData.image = image;
    }

    @Metadata(
            mv = {1, 1, 16},
            bv = {1, 0, 3},
            k = 1,
            d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001e"},
            d2 = {"Lcom/uni/pis/Data/UserData/userData$Companion;", "", "()V", "birthdate", "", "getBirthdate", "()Ljava/lang/String;", "setBirthdate", "(Ljava/lang/String;)V", "city", "getCity", "setCity", "email", "getEmail", "setEmail", "first_name", "getFirst_name", "setFirst_name", "gender", "getGender", "setGender", "image", "getImage", "setImage", "last_name", "getLast_name", "setLast_name", "phoneNumber", "getPhoneNumber", "setPhoneNumber", "app"}
    )
    public static final class Companion {
        @NotNull
        public final String getFirst_name() {
            return userData.first_name;
        }

        public final void setFirst_name(@NotNull String var1) {
            Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
            userData.first_name = var1;
        }

        @NotNull
        public final String getLast_name() {
            return userData.last_name;
        }

        public final void setLast_name(@NotNull String var1) {
            Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
            userData.last_name = var1;
        }

        @NotNull
        public final String getEmail() {
            return userData.email;
        }

        public final void setEmail(@NotNull String var1) {
            Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
            userData.email = var1;
        }

        @NotNull
        public final String getPhoneNumber() {
            return userData.phoneNumber;
        }

        public final void setPhoneNumber(@NotNull String var1) {
            Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
            userData.phoneNumber = var1;
        }

        @NotNull
        public final String getGender() {
            return userData.gender;
        }

        public final void setGender(@NotNull String var1) {
            Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
            userData.gender = var1;
        }

        @NotNull
        public final String getCity() {
            return userData.city;
        }

        public final void setCity(@NotNull String var1) {
            Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
            userData.city = var1;
        }

        @NotNull
        public final String getBirthdate() {
            return userData.birthdate;
        }

        public final void setBirthdate(@NotNull String var1) {
            Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
            userData.birthdate = var1;
        }

        @NotNull
        public final String getImage() {
            return userData.image;
        }

        public final void setImage(@NotNull String var1) {
            Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
            userData.image = var1;
        }

        private Companion() {
        }

        // $FF: synthetic method
        public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
