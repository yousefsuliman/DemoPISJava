package com.example.demopisjava;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"},
        d2 = {"Lcom/uni/pis/Data/EventData/Message;", "", "text", "", "isBelongsToCurrentUser", "", "SenderName", "(Ljava/lang/String;ZLjava/lang/String;)V", "getSenderName", "()Ljava/lang/String;", "()Z", "getText", "app"}
)
public final class Message {
    @NotNull
    private final String text;
    private final boolean isBelongsToCurrentUser;
    @NotNull
    private final String SenderName;

    @NotNull
    public final Object getText() {
        return this.text;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final boolean isBelongsToCurrentUser() {
        return this.isBelongsToCurrentUser;
    }

    @NotNull
    public final String getSenderName() {
        return this.SenderName;
    }

    public Message(@NotNull String text, boolean isBelongsToCurrentUser, @NotNull String SenderName) {
        Intrinsics.checkParameterIsNotNull(text, "text");
        Intrinsics.checkParameterIsNotNull(SenderName, "SenderName");
        super();
        this.text = text;
        this.isBelongsToCurrentUser = isBelongsToCurrentUser;
        this.SenderName = SenderName;
    }
}
