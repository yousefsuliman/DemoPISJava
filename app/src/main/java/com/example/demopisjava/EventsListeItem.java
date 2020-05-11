package com.example.demopisjava;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"},
        d2 = {"Lcom/uni/pis/Data/EventData/EventsListeItem;", "", "EventID", "", "name", "description", "Image", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventID", "()Ljava/lang/String;", "getImage", "getDescription", "getName", "app"}
)
public final class EventsListeItem {
    @NotNull
    private final String EventID;
    @NotNull
    private final String name;
    @NotNull
    private final String description;
    @NotNull
    private final String Image;

    @NotNull
    public final String getEventID() {
        return this.EventID;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getImage() {
        return this.Image;
    }

    public EventsListeItem(@NotNull String EventID, @NotNull String name, @NotNull String description, @NotNull String Image) {
        Intrinsics.checkParameterIsNotNull(EventID, "EventID");
        Intrinsics.checkParameterIsNotNull(name, "name");
        Intrinsics.checkParameterIsNotNull(description, "description");
        Intrinsics.checkParameterIsNotNull(Image, "Image");
        super();
        this.EventID = EventID;
        this.name = name;
        this.description = description;
        this.Image = Image;
    }
}
