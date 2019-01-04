package com.example.fwallner.peppergotobookmarkcontainingexecute;

import com.aldebaran.qi.sdk.QiContext;
import com.aldebaran.qi.sdk.object.conversation.BaseQiChatExecutor;

import java.util.List;

public class EmptyExecutor extends BaseQiChatExecutor {
    protected EmptyExecutor(QiContext context) {
        super(context);
    }

    @Override
    public void runWith(List<String> params) {

    }

    @Override
    public void stop() {

    }
}
