package com.example.demopisjava;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

// EventsAdapter.java
package com.uni.pis.Adapter.EventsAdapter;

        import android.content.Context;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.TextView;
        import android.widget.Toast;
        import androidx.core.content.ContextCompat;
        import androidx.recyclerview.widget.RecyclerView.Adapter;
        import com.uni.pis.Data.EventData.Events_Item;
        import com.uni.pis.Events.Create_Invitation;
        import com.uni.pis.Events.VideoInvitation;
        import com.uni.pis.R.id;
        import java.util.ArrayList;
        import kotlin.Metadata;
        import kotlin.jvm.internal.Intrinsics;
        import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"},
        d2 = {"Lcom/uni/pis/Adapter/EventsAdapter/EventsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/uni/pis/Adapter/EventsAdapter/EventsAdapter$ViewHolder;", "EventsTypeArrayList", "Ljava/util/ArrayList;", "Lcom/uni/pis/Data/EventData/Events_Item;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "getEventsTypeArrayList", "()Ljava/util/ArrayList;", "getContext", "()Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app"}
)
public final class EventsAdapter extends Adapter {
    @NotNull
    private final ArrayList EventsTypeArrayList;
    @NotNull
    private final Context context;

    @NotNull
    public EventsAdapter.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkParameterIsNotNull(parent, "parent");
        View v = LayoutInflater.from(parent.getContext()).inflate(1300016, parent, false);
        Intrinsics.checkExpressionValueIsNotNull(v, "v");
        return new EventsAdapter.ViewHolder(v);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
        return (androidx.recyclerview.widget.RecyclerView.ViewHolder)this.onCreateViewHolder(var1, var2);
    }

    public int getItemCount() {
        return this.EventsTypeArrayList.size();
    }

    public void onBindViewHolder(@NotNull final EventsAdapter.ViewHolder holder, final int position) {
        Intrinsics.checkParameterIsNotNull(holder, "holder");
        Object var10001 = this.EventsTypeArrayList.get(position);
        Intrinsics.checkExpressionValueIsNotNull(var10001, "EventsTypeArrayList[position]");
        holder.bindItems((Events_Item)var10001);
        final LinearLayout view = (LinearLayout)holder.itemView.findViewById(1000273);
        holder.itemView.setOnClickListener((OnClickListener)(new OnClickListener() {
            public final void onClick(View it) {
                switch(position) {
                    case 0:
                        LinearLayout var10000 = view;
                        Intrinsics.checkExpressionValueIsNotNull(var10000, "view");
                        var10000.setVisibility(0);
                        View var2 = holder.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(var2, "holder.itemView");
                        ((Button)var2.findViewById(id.btn_template)).setOnClickListener((OnClickListener)(new OnClickListener() {
                            public final void onClick(View it) {
                                Intent i = new Intent(EventsAdapter.this.getContext(), Create_Invitation.class);
                                ContextCompat.startActivity(EventsAdapter.this.getContext(), i, new Bundle());
                            }
                        }));
                        var2 = holder.itemView;
                        Intrinsics.checkExpressionValueIsNotNull(var2, "holder.itemView");
                        ((Button)var2.findViewById(id.btn_video)).setOnClickListener((OnClickListener)(new OnClickListener() {
                            public final void onClick(View it) {
                                Intent i = new Intent(EventsAdapter.this.getContext(), VideoInvitation.class);
                                ContextCompat.startActivity(EventsAdapter.this.getContext(), i, new Bundle());
                            }
                        }));
                        break;
                    case 1:
                        Toast.makeText(EventsAdapter.this.getContext(), (CharSequence)"yousef", 1).show();
                        break;
                    case 2:
                        Toast.makeText(EventsAdapter.this.getContext(), (CharSequence)"yousef", 1).show();
                }

            }
        }));
    }

    // $FF: synthetic method
    // $FF: bridge method
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder var1, int var2) {
        this.onBindViewHolder((EventsAdapter.ViewHolder)var1, var2);
    }

    @NotNull
    public final ArrayList getEventsTypeArrayList() {
        return this.EventsTypeArrayList;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public EventsAdapter(@NotNull ArrayList EventsTypeArrayList, @NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(EventsTypeArrayList, "EventsTypeArrayList");
        Intrinsics.checkParameterIsNotNull(context, "context");
        super();
        this.EventsTypeArrayList = EventsTypeArrayList;
        this.context = context;
    }

    @Metadata(
            mv = {1, 1, 16},
            bv = {1, 0, 3},
            k = 1,
            d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"},
            d2 = {"Lcom/uni/pis/Adapter/EventsAdapter/EventsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bindItems", "", "EventItem", "Lcom/uni/pis/Data/EventData/Events_Item;", "app"}
    )
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public final void bindItems(@NotNull Events_Item EventItem) {
            Intrinsics.checkParameterIsNotNull(EventItem, "EventItem");
            View var10000 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(var10000, "itemView");
            TextView var2 = (TextView)var10000.findViewById(id.tv_eventName);
            Intrinsics.checkExpressionValueIsNotNull(var2, "itemView.tv_eventName");
            var2.setText((CharSequence)EventItem.getTitle());
            var10000 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(var10000, "itemView");
            ((ImageView)var10000.findViewById(id.IV_events)).setImageResource(EventItem.getImage());
        }

        public ViewHolder(@NotNull View itemView) {
            Intrinsics.checkParameterIsNotNull(itemView, "itemView");
            super(itemView);
        }
    }
}
