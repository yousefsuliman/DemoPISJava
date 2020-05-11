package com.example.demopisjava;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"},
        d2 = {"Lcom/uni/pis/Data/LoginData/Home_Item;", "", "icons", "", "name", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getIcons", "()Ljava/lang/Integer;", "setIcons", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "app"}
)
public final class Home_Item {
    @Nullable
    private Integer icons = 0;
    @Nullable
    private String name;

    @Nullable
    public final Integer getIcons() {
        return this.icons;
    }

    public final void setIcons(@Nullable Integer var1) {
        this.icons = var1;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setName(@Nullable String var1) {
        this.name = var1;
    }

    public Home_Item(@Nullable Integer icons, @Nullable String name) {
        this.icons = icons;
        this.name = name;
    }
}
