package com.example.demopisjava;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseUser;
import com.sendbird.android.AdminMessage;
import com.sendbird.android.BaseChannel;
import com.sendbird.android.BaseMessage;
import com.sendbird.android.FileMessage;
import com.sendbird.android.GroupChannel;
import com.sendbird.android.PreviousMessageListQuery;
import com.sendbird.android.SendBird;
import com.sendbird.android.SendBirdException;
import com.sendbird.android.Sender;
import com.sendbird.android.User;
import com.sendbird.android.UserMessage;
import com.sendbird.android.UserMessageParams;
import com.sendbird.android.BaseChannel.SendUserMessageHandler;
import com.sendbird.android.GroupChannel.GroupChannelGetHandler;
import com.sendbird.android.PreviousMessageListQuery.MessageListQueryResult;
import com.sendbird.android.SendBird.ChannelHandler;
import com.sendbird.android.SendBird.ConnectHandler;
import com.uni.pis.Adapter.EventsAdapter.MessageAdapter;
import com.uni.pis.Data.EventData.Message;
import com.uni.pis.Data.UserData.userData;
import com.uni.pis.R.id;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"},
        d2 = {"Lcom/uni/pis/Events/Chat;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "CHANNEL_URL", "", "SENDBIRDAPPID", "listViewMessages", "Landroid/widget/ListView;", "messageadapter", "Lcom/uni/pis/Adapter/EventsAdapter/MessageAdapter;", "msgText", "userid", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app"}
)
public final class Chat extends AppCompatActivity {
    private final String SENDBIRDAPPID = "C70ACBE6-0911-45D5-B02B-C56D3ADDF158";
    private String CHANNEL_URL = "";
    private MessageAdapter messageadapter;
    private ListView listViewMessages;
    private String msgText;
    private final String userid;
    private HashMap _$_findViewCache;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(1300096);
        this.messageadapter = new MessageAdapter((Context)this);
        View var10001 = this.findViewById(1000174);
        if (var10001 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.ListView");
        } else {
            this.listViewMessages = (ListView)var10001;
            ListView var10000 = this.listViewMessages;
            if (var10000 == null) {
                Intrinsics.throwNpe();
            }

            var10000.setAdapter((ListAdapter)this.messageadapter);
            SendBird.init(this.SENDBIRDAPPID, (Context)this);
            SendBird.connect(this.userid, (ConnectHandler)(new ConnectHandler() {
                public void onConnected(@Nullable User user, @Nullable SendBirdException e) {
                    if (e == null) {
                        ;
                    }
                }
            }));
            if (this.getIntent().hasExtra("ChannelUrl")) {
                Intent var2 = this.getIntent();
                Intrinsics.checkExpressionValueIsNotNull(var2, "intent");
                Bundle var3 = var2.getExtras();
                if (var3 == null) {
                    Intrinsics.throwNpe();
                }

                this.CHANNEL_URL = String.valueOf(var3.get("ChannelUrl"));
                GroupChannel.getChannel(this.CHANNEL_URL, (GroupChannelGetHandler)(new GroupChannelGetHandler() {
                    public void onResult(@NotNull GroupChannel groupChannel, @Nullable SendBirdException e) {
                        Intrinsics.checkParameterIsNotNull(groupChannel, "groupChannel");
                        if (e == null) {
                            PreviousMessageListQuery var10000 = groupChannel.createPreviousMessageListQuery();
                            Intrinsics.checkExpressionValueIsNotNull(var10000, "groupChannel.createPreviousMessageListQuery()");
                            PreviousMessageListQuery prevMessageListQuery = var10000;
                            prevMessageListQuery.setIncludeMetaArray(true);
                            prevMessageListQuery.setIncludeReactions(true);
                            prevMessageListQuery.load(30, false, (MessageListQueryResult)(new com.sendbird.android.MessageListQuery.MessageListQueryResult() {
                                public void onResult(@NotNull List messages, @Nullable SendBirdException e) {
                                    Intrinsics.checkParameterIsNotNull(messages, "messages");
                                    if (e == null) {
                                        boolean flag = false;

                                        ListView var9;
                                        ListView var10;
                                        for(Iterator var5 = messages.iterator(); var5.hasNext(); var9.setSelection(var10.getCount() - 1)) {
                                            BaseMessage x = (BaseMessage)var5.next();
                                            flag = false;
                                            Sender var10000 = x.getSender();
                                            Intrinsics.checkExpressionValueIsNotNull(var10000, "x.sender");
                                            String var7 = var10000.getUserId();
                                            User var10001 = SendBird.getCurrentUser();
                                            Intrinsics.checkExpressionValueIsNotNull(var10001, "SendBird.getCurrentUser()");
                                            if (Intrinsics.areEqual(var7, var10001.getUserId())) {
                                                flag = true;
                                            }

                                            String var10002 = x.getMessage();
                                            Intrinsics.checkExpressionValueIsNotNull(var10002, "x.message");
                                            String var10004 = x.getData();
                                            Intrinsics.checkExpressionValueIsNotNull(var10004, "x.data");
                                            Message msg = new Message(var10002, flag, var10004);
                                            MessageAdapter var8 = Chat.this.messageadapter;
                                            if (var8 == null) {
                                                Intrinsics.throwNpe();
                                            }

                                            var8.add(msg);
                                            var9 = Chat.this.listViewMessages;
                                            if (var9 == null) {
                                                Intrinsics.throwNpe();
                                            }

                                            var10 = Chat.this.listViewMessages;
                                            if (var10 == null) {
                                                Intrinsics.throwNpe();
                                            }
                                        }

                                    }
                                }
                            }));
                        }
                    }
                }));
                ((ImageButton)this._$_findCachedViewById(id.btn_send)).setOnClickListener((OnClickListener)(new OnClickListener() {
                    public final void onClick(View it) {
                        GroupChannel.getChannel(Chat.this.CHANNEL_URL, (GroupChannelGetHandler)(new GroupChannelGetHandler() {
                            public void onResult(@NotNull GroupChannel groupChannel, @Nullable SendBirdException e) {
                                Intrinsics.checkParameterIsNotNull(groupChannel, "groupChannel");
                                if (e == null) {
                                    Chat var10000 = Chat.this;
                                    EditText var10001 = (EditText)Chat.this._$_findCachedViewById(id.et_msg);
                                    Intrinsics.checkExpressionValueIsNotNull(var10001, "et_msg");
                                    var10000.msgText = var10001.getText().toString();
                                    UserMessageParams var4 = (new UserMessageParams()).setMessage(Chat.this.msgText).setData(userData.Companion.getFirst_name() + " " + userData.Companion.getLast_name());
                                    Intrinsics.checkExpressionValueIsNotNull(var4, "UserMessageParams()\n    …+\" \"+ userData.last_name)");
                                    UserMessageParams params = var4;
                                    groupChannel.sendUserMessage(params, (SendUserMessageHandler)(new SendUserMessageHandler() {
                                        public void onSent(@NotNull UserMessage userMessage, @Nullable SendBirdException e) {
                                            Intrinsics.checkParameterIsNotNull(userMessage, "userMessage");
                                            if (e == null) {
                                                Sender var10000 = userMessage.getSender();
                                                Intrinsics.checkExpressionValueIsNotNull(var10000, "userMessage.sender");
                                                boolean belongsToCurrentUser = Intrinsics.areEqual(var10000.getUserId(), Chat.this.userid);
                                                String var10002 = userMessage.getMessage();
                                                Intrinsics.checkExpressionValueIsNotNull(var10002, "userMessage.message");
                                                String var10004 = userMessage.getData();
                                                Intrinsics.checkExpressionValueIsNotNull(var10004, "userMessage.data");
                                                Message message = new Message(var10002, belongsToCurrentUser, var10004);
                                                MessageAdapter var5 = Chat.this.messageadapter;
                                                if (var5 == null) {
                                                    Intrinsics.throwNpe();
                                                }

                                                var5.add(message);
                                                ListView var6 = Chat.this.listViewMessages;
                                                if (var6 == null) {
                                                    Intrinsics.throwNpe();
                                                }

                                                ListView var10001 = Chat.this.listViewMessages;
                                                if (var10001 == null) {
                                                    Intrinsics.throwNpe();
                                                }

                                                var6.setSelection(var10001.getCount() - 1);
                                                EditText var7 = (EditText)Chat.this._$_findCachedViewById(id.et_msg);
                                                if (var7 == null) {
                                                    Intrinsics.throwNpe();
                                                }

                                                var7.getText().clear();
                                            }
                                        }
                                    }));
                                }
                            }
                        }));
                    }
                }));
                SendBird.addChannelHandler("CHANNEL_HANDLER_GROUP_CHANNEL_LIST", (ChannelHandler)(new ChannelHandler() {
                    public void onMessageReceived(@Nullable BaseChannel channel, @NotNull BaseMessage message) {
                        Intrinsics.checkParameterIsNotNull(message, "message");
                        if (message instanceof UserMessage) {
                            String var10002 = ((UserMessage)message).getMessage();
                            Intrinsics.checkExpressionValueIsNotNull(var10002, "message.message");
                            String var10004 = ((UserMessage)message).getData();
                            Intrinsics.checkExpressionValueIsNotNull(var10004, "message.data");
                            Message msg = new Message(var10002, false, var10004);
                            MessageAdapter var10000 = Chat.this.messageadapter;
                            if (var10000 == null) {
                                Intrinsics.throwNpe();
                            }

                            var10000.add(msg);
                            ListView var5 = Chat.this.listViewMessages;
                            if (var5 == null) {
                                Intrinsics.throwNpe();
                            }

                            ListView var10001 = Chat.this.listViewMessages;
                            if (var10001 == null) {
                                Intrinsics.throwNpe();
                            }

                            var5.setSelection(var10001.getCount() - 1);
                        } else if (!(message instanceof FileMessage) && message instanceof AdminMessage) {
                        }

                    }
                }));
            }

        }
    }

    public Chat() {
        FirebaseUser var10001 = Create_InvitationKt.getMFirebaseAuth().getCurrentUser();
        String var1 = var10001 != null ? var10001.getUid() : null;
        if (var1 == null) {
            Intrinsics.throwNpe();
        }

        Intrinsics.checkExpressionValueIsNotNull(var1, "mFirebaseAuth.currentUser?.uid!!");
        this.userid = var1;
    }

    // $FF: synthetic method
    public static final void access$setMessageadapter$p(Chat $this, MessageAdapter var1) {
        $this.messageadapter = var1;
    }

    // $FF: synthetic method
    public static final void access$setListViewMessages$p(Chat $this, ListView var1) {
        $this.listViewMessages = var1;
    }

    // $FF: synthetic method
    public static final void access$setCHANNEL_URL$p(Chat $this, String var1) {
        $this.CHANNEL_URL = var1;
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
