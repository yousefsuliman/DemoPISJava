package com.example.demopisjava;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"},
        d2 = {"Lcom/uni/pis/Data/EventData/Events_Item;", "", "title", "", "image", "", "(Ljava/lang/String;I)V", "getImage", "()I", "getTitle", "()Ljava/lang/String;", "app"}
)
public final class Events_Item {
    @NotNull
    private final String title;
    private final int image;

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getImage() {
        return this.image;
    }

    public Events_Item(@NotNull String title, int image) {
        Intrinsics.checkParameterIsNotNull(title, "title");
        super();
        this.title = title;
        this.image = image;
    }
}
