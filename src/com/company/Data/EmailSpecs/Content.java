package com.company.Data.EmailSpecs;
import com.company.Data.EmailSpecs.ContentEmail.Attachment;
import com.company.Data.Query;

public class Content extends Query {
    String body;
    Attachment attachments;

    public Content(String body, Attachment attachments){
        this.body = body;
        this.attachments = attachments;
    }

    public String getbody() {
        return body;
    }

    public void setbody(String body) {
        this.body = body;
    }

    public Attachment getattachments() {
        return attachments;
    }

    public void setAttachments(Attachment attachments) {
        this.attachments = attachments;
    }

}
