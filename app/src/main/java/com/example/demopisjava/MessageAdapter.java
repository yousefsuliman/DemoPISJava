package com.example.demopisjava;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.uni.pis.Data.EventData.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\"\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006!"},
        d2 = {"Lcom/uni/pis/Adapter/EventsAdapter/MessageAdapter;", "Landroid/widget/BaseAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "messages", "", "Lcom/uni/pis/Data/EventData/Message;", "getMessages", "()Ljava/util/List;", "setMessages", "(Ljava/util/List;)V", "add", "", "message", "getCount", "", "getItem", "", "position", "getItemId", "", "getRandomColor", "", "Name", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "app"}
)
public final class MessageAdapter extends BaseAdapter {
    @NotNull
    private List messages;
    @NotNull
    private Context context;

    @NotNull
    public final List getMessages() {
        return this.messages;
    }

    public final void setMessages(@NotNull List var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.messages = var1;
    }

    public final void add(@NotNull Message message) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        this.messages.add(message);
        this.notifyDataSetChanged();
    }

    public int getCount() {
        return this.messages.size();
    }

    @NotNull
    public Object getItem(int position) {
        return this.messages.get(position);
    }

    public long getItemId(int position) {
        return (long)position;
    }

    @NotNull
    public View getView(int position, @Nullable View convertView, @NotNull ViewGroup parent) {
        Intrinsics.checkParameterIsNotNull(parent, "parent");
        MessageViewHolder holder = new MessageViewHolder();
        Object var10000 = this.context.getSystemService("layout_inflater");
        if (var10000 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
        } else {
            LayoutInflater messageInflater = (LayoutInflater)var10000;
            Message message = (Message)this.messages.get(position);
            View convertView;
            TextView var9;
            View var10001;
            if (message.isBelongsToCurrentUser()) {
                convertView = messageInflater.inflate(1300055, (ViewGroup)null);
                var10001 = convertView.findViewById(1000238);
                if (var10001 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }

                holder.setMessageBody((TextView)var10001);
                Intrinsics.checkExpressionValueIsNotNull(convertView, "convertView");
                convertView.setTag(holder);
                var9 = holder.getMessageBody();
                if (var9 == null) {
                    Intrinsics.throwNpe();
                }

                var9.setText((CharSequence)message.getText());
            } else {
                convertView = messageInflater.inflate(1300130, (ViewGroup)null);
                var10001 = convertView.findViewById(1000350);
                if (var10001 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }

                holder.setName((TextView)var10001);
                var10001 = convertView.findViewById(1000214);
                if (var10001 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                }

                holder.setAvatar(var10001);
                var10001 = convertView.findViewById(1000238);
                if (var10001 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }

                holder.setMessageBody((TextView)var10001);
                Intrinsics.checkExpressionValueIsNotNull(convertView, "convertView");
                convertView.setTag(holder);
                var9 = holder.getName();
                if (var9 == null) {
                    Intrinsics.throwNpe();
                }

                var9.setText((CharSequence)message.getSenderName());
                var9 = holder.getMessageBody();
                if (var9 == null) {
                    Intrinsics.throwNpe();
                }

                var9.setText((CharSequence)message.getText());
                View var10 = holder.getAvatar();
                if (var10 == null) {
                    Intrinsics.throwNpe();
                }

                Drawable var11 = var10.getBackground();
                if (var11 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                }

                GradientDrawable drawable = (GradientDrawable)var11;
                drawable.setColor(Color.parseColor(this.getRandomColor(message.getSenderName())));
            }

            return convertView;
        }
    }

    private final String getRandomColor(String Name) {
        Random r = new Random();
        if (Intrinsics.areEqual(Name, "") ^ true) {
            r.setSeed((long)Name.charAt(0) + (long)Name.charAt(Name.length() - 1));
        }

        StringBuffer sb = new StringBuffer("#");

        while(sb.length() < 7) {
            sb.append(Integer.toHexString(r.nextInt()));
        }

        String var10000 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(var10000, "sb.toString()");
        String var4 = var10000;
        byte var5 = 0;
        byte var6 = 7;
        boolean var7 = false;
        if (var4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } else {
            var10000 = var4.substring(var5, var6);
            Intrinsics.checkExpressionValueIsNotNull(var10000, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return var10000;
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void setContext(@NotNull Context var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.context = var1;
    }

    public MessageAdapter(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        super();
        this.context = context;
        this.messages = (List)(new ArrayList());
    }
}
// MessageViewHolder.java
package com.uni.pis.Adapter.EventsAdapter;

        import android.view.View;
        import android.widget.TextView;
        import kotlin.Metadata;
        import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"},
        d2 = {"Lcom/uni/pis/Adapter/EventsAdapter/MessageViewHolder;", "", "()V", "avatar", "Landroid/view/View;", "getAvatar", "()Landroid/view/View;", "setAvatar", "(Landroid/view/View;)V", "messageBody", "Landroid/widget/TextView;", "getMessageBody", "()Landroid/widget/TextView;", "setMessageBody", "(Landroid/widget/TextView;)V", "name", "getName", "setName", "app"}
)
public final class MessageViewHolder {
    @Nullable
    private View avatar;
    @Nullable
    private TextView name;
    @Nullable
    private TextView messageBody;

    @Nullable
    public final View getAvatar() {
        return this.avatar;
    }

    public final void setAvatar(@Nullable View var1) {
        this.avatar = var1;
    }

    @Nullable
    public final TextView getName() {
        return this.name;
    }

    public final void setName(@Nullable TextView var1) {
        this.name = var1;
    }

    @Nullable
    public final TextView getMessageBody() {
        return this.messageBody;
    }

    public final void setMessageBody(@Nullable TextView var1) {
        this.messageBody = var1;
    }
}
